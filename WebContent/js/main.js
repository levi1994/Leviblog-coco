
/*
*@author 李春 2015-10-5
*/

$(function(){
	init();
	
    //上滑组件函数
	$(function(){
		showScroll();
		function showScroll(){
			$(window).scroll( function() { 
				var scrollValue=$(window).scrollTop();
				scrollValue > 500 ? $('div[class=scroll]').fadeIn():$('div[class=scroll]').fadeOut();
			} );	
			$('#scroll').click(function(){
				$("html,body").animate({scrollTop:0},200);	
			});	
		}
	})
	
     //提交評論
	$("#submitcom").click(function(){
	    //获得评论内容
		var com_content = $("#textarea").val();
	    //获得昵称
		var com_name =  $("#name").val();
	    //获得文章id
		var com_article_id = $("#art_id").val();
		alert(com_article_id);
		var com_depth = 1;
		var com_parent=-1;
		
		$.post("comment",{"comment.com_content":com_content,"comment.com_name":com_name,"comment.com_article_id":com_article_id,"comment.com_depth":com_depth,"comment.com_parent":com_parent},function(data){
			   if(data==1){
			   	 alert("评论成功");
			   }else if(data==0){
			   	  alert("评论错误");
			   }
		});
		
	});
	
	
	
	
	//回覆評論
	
});

/**
 *打开窗口时的初始化
 */
function init(){
	//先让各个组件适应窗口大小
	changePosition();
	
	//绑定resize事件，每改变一次大小就重新适应窗口
	$(window).resize(function(e) {
        changePosition();
    });
}
/**
 * resize时浏览器判断客户区宽度，调整left和right两个div的位置，并把banner隐藏，以适应可移动设备的屏幕
 */
function changePosition(){
	var clientWidth = $(window).innerWidth();
	if(clientWidth < 765){
		$('.left').css("width","100%");
		$('.right').css("width","100%");
		$('#banner').hide();
	} else {
		$('.left').css("width","70%");
		$('.right').css("width","30%");
		$('#banner').show();
	}
}

function viewAllArticles(){
	window.location.href = "archive/all.html";
}
