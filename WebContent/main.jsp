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
				   <img src="img/meng.jpg" alt=""  class="photograph1">
				</div>
				<div class="fenge"></div>
				<div class="head-title1" style="font-family: 'SimHei';">我只是想安静的卖个萌好么</div>
			    <div class="fenge"></div>
			</div>
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" 
				data-target="#navbar" style="padding: 0;">
				<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#" style="color: white;background:#009900">李春的博客</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse" style="height: 1px;background:  white;" >
			<ul class="nav navbar-nav" >
				<li><a href="category?art_type=技术" >技术</a></li>
				<li><a href="category?art_type=生活" >生活</a></li>
				<li><a href="category?art_type=下载" >下载</a></li>
				<li><a href="index#contact" >联系我</a></li>
			</ul>
		</div><!--/.nav-collapse -->
	</div>
</div>
<!--top end-->
<!--left begin-->
<div class="left">
    <s:iterator var="articleList" value="#main.articleList" >
	<div class="article">
		<div class="title">
			<a href="article?art_id=${art_id}" ><s:property value="art_title" /></a>
		</div>
		<div class="date">
		    <span><s:property value="art_datetime" /> • <s:property value="art_type" /> • 1 条评论 • <s:property value="art_author" /></span>
			<span style="float: right;margin-right: 10px;">
				<a class="glyphicon glyphicon-heart" aria-hidden="true"></a>
				<a>&nbsp;<s:property value="art_like" /></a>
			</span>
		</div>
		<div class="sumary"><s:property value="art_des" /></div>
		<div class="continue">
			<a href="article?art_id=${art_id}">继续阅读>></a>
		</div>
	</div>
	</s:iterator>
	<nav>
	<div style="margin:0 auto;">
      <ul class="pagination" style="margin:0 auto;">
       <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
  </div>
</nav>
</div>
<!--left end-->
<!--right begin-->
<div class="right">
	<div class="right-banner">
		<div id="banner-top"><span style="padding: 8px;">最新文章</span></div>
        <div id="banner-content">
           <s:iterator var="articleList" value="#main.newList" > 
            <p>
        	<a href="article?art_id=${art_id}"><s:property value="art_title" /></a>
        	</p>
        	</s:iterator>
        </div>
	</div>
	<div class="right-banner">
		<div id="banner-top"><span style="padding: 8px;">文章分类</span></div>
        <div id="banner-content">
            <p>
        	<a href="category?art_type=生活">生活</a>
        	</p>
        	<p>
        	<a href="category?art_type=技术">技术</a>
        	</p>
        	<p>
        	<a href="category?art_type=文学">文学</a>
        	</p>
        	<p>
        	<a href="category?art_type=下载">下载</a>
        	</p>
        </div>
	</div>
</div>
<!--right end-->
<!-- 滚动 -->
	<div class="scroll" id="scroll" style="display: block;">
		︿
	</div>
	<!--滚动结束  -->
</div>
<div class="boot">
    	<div><p>QQ:1219571443&nbsp;&nbsp;&nbsp;&nbsp;Email:&nbsp;<a href="mailto:1219571443@qq.com">1219571443@qq.com</a></p></div>
    	<div><p>Copyright&nbsp;@&nbsp;2015-2016&nbsp;&nbsp;Levi Lee&nbsp;&nbsp;All Rights Reserved&nbsp;&nbsp;&nbsp;&nbsp;Powered by Levi Lee</p></div>
</div>

</body>
</html>