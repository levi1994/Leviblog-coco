$(document).ready(function(){
	$('#mainpage').fullpage({
		sectionsColor: ['#1bbc9b', '#4BBFC3', '#7BAABE', '#f90', '#4BBFC3'],
		navigation: true,
		anchors: ['first','it', 'life', 'download', 'contact'],
		menu: '#menu',
		css3: true
	});

	init();

	//添加留言事件
   $('#leavemes').click(function(){
		/*
	     *服务端接收三个参数，id,password,identity
	     */
		//获取数据
		var mes_theme = $("#mes_theme").val();
		var mes_name = $("#mes_name").val();
		var mes_connect = $("#mes_connect").val();
		var mes_content = jQuery("#textarea").val();
		$.post("message",{"message.mes_theme":mes_theme,"message.mes_name":mes_name,"message.mes_connect":mes_connect,"message.mes_content":mes_content},function(data){
		   if(data==1){
		   	 alert("留言成功");
		   }else if(data==0){
		   	  alert("留言错误");
		   }
	});
   });
   
   $("#search").click(function(){
	   
	   window.location.href = 'search?keyword='+$("#key").val()+'';
	   
   });
   
});


/*
*@author 李春 2015-10-5
*/

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
		$('.left').css("width","66%");
		$('.right').css("width","33%");
		$('#banner').show();
	}
}

function viewAllArticles(){
	window.location.href = "archive/all.html";
}
