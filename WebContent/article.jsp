<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"
	xmlns:wb="http://open.weibo.com/wb">
<head>
<meta charset="UTF-8">
	<title>李春的个人博客</title>
	<link href="css/index.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/jquery.fullPage.css">
				<link rel="stylesheet" href="css/main.css">
					<script src="js/jquery-1.11.0.js"></script>
					<script src="js/jquery.fullPage.min.js"></script>
					<script src="js/main.js"></script>
					<script src="js/bootstrap.min.js"></script>
	</head>
<body>
	<div class="maincontainer">
		<!--top begin-->
		<div class="top">
			<div class="banner" id="banner">
				<div class="ph1">
					<img src="img/photograph.jpg" alt="" class="photograph1">
				</div>
				<div class="fenge"></div>
				<div class="head-title1">虽然过去不能改变，未来可以</div>
				<div class="fenge"></div>
			</div>
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar" style="padding: 0;">
					<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"
					style="color: white; background: #009900">李春的博客</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse"
				style="height: 1px; background: white;">
				<ul class="nav navbar-nav">
					<li><a href="category?art_type=技术">技术</a></li>
					<li><a href="category?art_type=生活">生活</a></li>
					<li><a href="category?art_type=下载">下载</a></li>
					<li><a href="index#contact">联系我</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<!--top end-->
	<!--left begin-->
	<div class="left" id="left">
		<div class="articlecon">
			<!-- 文章开始 -->
			<div class="arti">
				<div class="art-title">${art.article.art_title}</div>
				<!-- 使用input存储文章id,便于js取值 -->
				<input id="art_id"   style="display:none;" value="${art.article.art_id}"/>
				<div class="date">
					<span>${art.article.art_datetime} </span>
				</div>
				<div class="art-des">
					<p>${art.article.art_des}</p>
				</div>
				<!-- 暂时修改 -->
				<div class="art-content">${art.article.art_content}</div>
				<!-- 分享 -->
				<div class="share">
					<span>分享到：</span>
					<div class="bdsharebuttonbox">
						<a href="#" class="bds_more" data-cmd="more"></a><a href="#"
							class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a><a
							href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a><a
							href="#" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a><a
							href="#" class="bds_renren" data-cmd="renren" title="分享到人人网"></a><a
							href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a>
					</div>
					<script>
						window._bd_share_config = {
							"common" : {
								"bdSnsKey" : {},
								"bdText" : "${art.article.art_des}",
								"bdMini" : "2",
								"bdMiniList" : false,
								"bdPic" : "${art.article.art_img}",
								"bdStyle" : "1",
								"bdSize" : "24"
							},
							"share" : {},
							"image" : {
								"viewList" : [ "qzone", "tsina", "tqq",
										"renren", "weixin" ],
								"viewText" : "分享到：",
								"viewSize" : "16"
							},
							"selectShare" : {
								"bdContainerClass" : null,
								"bdSelectMiniList" : [ "qzone", "tsina", "tqq",
										"renren", "weixin" ]
							}
						};
						with (document)
							0[(getElementsByTagName('head')[0] || body)
									.appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='
									+ ~(-new Date() / 36e5)];
					</script>
				</div>
			</div>
			<!-- 文章结束 -->

			<!-- 评论开始 -->
			<div class="comment">
				<textarea class="form-control" rows="2" id="textarea"
					placeholder="请输入内容" ></textarea>
				<div class="row" id="nicheng" style="display: inline-block;float:right;">
				    <!--消除浮動  -->
					<div style="clear:both;"></div> 
					<input type="text" placeholder="请输入昵称" sytle="boder-radius:2px;" id="name">
					<button id="submitcom">提交</button>
				</div>
				<div class="fenge"
					style="background: grey !important; width: 100%;margin-top: 50px;"></div>
				<!-- 评论显示开始 -->
				<div class="commentview">
					<s:iterator var="cList" value="#art.commentList">
					<div class="comcon">
					<!--消除浮動  -->
					<div style="clear:both;"></div> 
					<div style="height:10px;"></div> 
					<div class="com-left">
						<img id="user-img" src="http://i13.tietuku.com/4b36611a3031358d.jpg" alt="头像"
							style="float: left;">
					</div>
					<div class="com-right">
						<!-- 遍历所有评论 -->
							<div class="commentblock" style="display: inline-block;">
								<div id="cons" >
									<span style="color: blue;">${cList[0].com_name}</span> <span
										style="font-size: 5px; color: grey; margin-left: 5px;">${cList[0].com_datetime}</span>
										<div class="content" style="margin-top:5px;">${cList[0].com_content}</div>
									<s:iterator var="comment" value="cList"  status="st">
									          <!-- 如果是第一个的话就什么也不输出 -->
									          <s:if test="#st.first"> 
                                             </s:if> 
                                             <s:else>
											<div class="return">
												<span class="name">${comment.com_name}</span>&nbsp;回复&nbsp;<span class="name">${comment.com_toname}&nbsp;:</span> ${comment.com_content}&nbsp;<span
										style="font-size: 5px; color: grey; margin-left: 5px;">${comment.com_datetime}</span>
											</div>
											</s:else>
									</s:iterator>
								</div>
							</div>
						
					</div>
					</div>
</s:iterator>
				</div>
				<!-- 评论显示结束 -->
			</div>
			<!-- 评论结束 -->

		</div>
	</div>
	<!--left end-->
	<!--right begin-->
	<div class="right">
		<div class="right-banner">
			<div id="banner-top">
				<span style="padding: 8px;">最新文章</span>
			</div>
			<div id="banner-content">
				<s:iterator var="newList" value="#art.newList">
					<p>
						<a href=""><s:property value="art_title" /></a>
					</p>
				</s:iterator>
			</div>
		</div>
	</div>
	<!--right end-->

	</div>
	<div class="boot">
		<div>
			<p>
				QQ:1219571443&nbsp;&nbsp;&nbsp;&nbsp;Email:&nbsp;<a
					href="mailto:1219571443@qq.com">1219571443@qq.com</a>
			</p>
		</div>
		<div>
			<p>Copyright&nbsp;@&nbsp;2015-2016&nbsp;&nbsp;Levi
				Lee&nbsp;&nbsp;All Rights Reserved&nbsp;&nbsp;&nbsp;&nbsp;Powered by
				Levi Lee</p>
		</div>
	</div>
</body>
</html>