<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"
xmlns:wb="http://open.weibo.com/wb">
<head>
	<meta charset="UTF-8">
	<title>李春的个人博客</title> <!-- css -->

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/jquery.fullPage.css">
	<link href="css/index.css" rel="stylesheet" type="text/css">

	<!-- js -->
	<script src="js/jquery-1.11.0.js"></script>
	<script src="js/index.js"></script>
	<script src="js/jquery.fullPage.min.js"></script>

	<!-- 这是新浪接口 -->
	<script src="http://tjs.sjs.sinajs.cn/open/api/js/wb.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<!-- 主体开始 -->
	<div class="minecontainer" style="">
		<!--top begin-->
		<div class="top">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navbar">
				<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">李春的博客</a>
		</div>
		<div id="navbar"
		class="navbar-collapse collapse navbar navbar-default navbar-fixed-top"
		style="height: 1px; background: white;">
		<div class="navbar-header">
			<a class="navbar-brand" href="#first">李春的博客</a>
		</div>
		<ul class="nav navbar-nav" id="menu">
			<li><a href="#it">技术</a></li>
			<li><a href="#life">生活</a></li>
			<li><a href="#download">下载</a></li>
			<li><a href="#contact">联系我</a></li>
			<li><a href="main.html">点这里查看下一个页面</a></li>
		</ul>
		<div class="search" style="float: right; margin-top: 8px;">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="快速搜索" id="key">
				<span class="input-group-btn">
					<button class="btn btn-default" type="button" id="search">搜索</button>
				</span>
			</div>
			<!-- /input-group -->
		</div>
		<!-- /.col-lg-6 -->
	</div>
	<!--/.nav-collapse -->
</div>
<!-- 主页面开始 -->
<div id="mainpage">
	<!-- 第一屏开始 -->
	<div class="section" id="section1">
		<div class="wraper" id="wraper">
			<div class="main">
				<img src="img/photograph.jpg" alt="" class="img-circle photograph">
				<div class="line"></div>
				<div class="info" id="info">
					<p>你好，欢迎来到李春的个人主页</p>
					<p>
						我来自湖南长沙，是一名程序猿，主要从事网站建设、web开发、软件开发、行业IT解决方案等IT方面相关工作,你可以
						<wb:follow-button uid="5061669386" type="red_2" width="136"
						height="24"></wb:follow-button>
					</p>
				</div>
				<div class="line"></div>
			</div>
			<div class="foot" id="foot">
				<a href="#java"> <img src="img/java.png" class="img-circle"
					alt="java软件开发工程师"></a> <a href="#struts2"> <img
					src="img/struts2.jpg" class="img-circle" alt="php web开发工程师"></a>
					<a href="#hibernate"> <img src="img/hibernate.png"
						class="img-circle" alt="android软件开发技术"></a> <a href="#spring">
						<img src="img/spring.jpg" class="img-circle" alt="mysql数据库">
					</a>
				</div>
			</div>
		</div>
		<!-- 第一屏结束 -->
		<div class="section">
			<div class="slide">
				<div class="subtitle">
					<h3>分类：技术</h3>
				</div>
				<ul class="clearfix" id="ul1">
					<s:iterator var="article" value="#index.articleList[0]" >
					<li id="li1"><a href="article?art_id=${art_id}">  <img  src=' <s:property value="art_img" />'	alt="" class="class-img">
						<h5 id="title">
							<span><s:property value="art_title" /></span>
						</h5>
						<div class="tips">
							<span class="l"><s:property value="art_datetime" /></span> <span class="r">共有<s:property value="art_readtime" />人阅读</span>
						</div></a></li>
					</s:iterator>
				</ul>
			</div>
			<div class="next">
				<span clss="glyphicon glyphicon-menu-left"></span>
			</div>
		</div>

		<div class="section">
			<div class="slide">
				<div class="subtitle">
					<h3>分类：生活</h3>
				</div>
				<ul class="clearfix" id="ul1">
					<s:iterator var="article" value="#index.articleList[1]" >
					<li id="li1"><a href="article?art_id=${art_id}"> <img  src=' <s:property value="art_img" />'	alt="" class="class-img">
						<h5 id="title">
							<span><s:property value="art_title" /></span>
						</h5>
						<div class="tips">
							<span class="l"><s:property value="art_datetime" /></span> <span class="r">共有<s:property value="art_readtime" />人阅读</span>
						</div></a></li>
					</s:iterator>
				</ul>
			</div>
			<div class="next">
				<span clss="glyphicon glyphicon-menu-left"></span>
			</div>
		</div>

		<div class="section">
			<div class="slide">
				<h3>第四屏:下载</h3>
			</div>
			<ul class="clearfix" id="ul1">
				<s:iterator var="article" value="#index.articleList[2]" >
				<li id="li1"><a href="article?art_id=${art_id}">  <img  src=' <s:property value="art_img" />'	alt="" class="class-img">
					<h5 id="title">
						<span><s:property value="art_title" /></span>
					</h5>
					<div class="tips">
						<span class="l">更新完毕</span> <span class="r">共有<s:property value="art_like" />人喜爱</span>
					</div></a></li>
				</s:iterator>
			</ul>
		</div>
		<div class="section">

			<div class="slide">
				<h3>第五屏:联系</h3>
				<div class="message" id="message">
					<form class="form-horizontal" id="mes-form">
						<div class="form-group">
							<label for="mes_theme" class="col-sm-2 control-label">主题</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="mes_theme"
								placeholder="主题">
							</div>
						</div>
						<div class="form-group">
							<label for="mes_name" class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="mes_name"
								placeholder="姓名">
							</div>
						</div>
						<div class="form-group">
							<label for="mes_connect" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="mes_connect"
								placeholder="邮箱">
							</div>
						</div>

							<!-- <div class="form-group">
      								<label for="inputEmail3" class="col-sm-2 control-label">内容</label>
      								<div class="textarea">
      									<textarea type="" class=""> </textarea>
      								</div>
      							
      							</div> -->
      							<div class="form-group">
      								<textarea class="form-control" rows="3" id="textarea"
      								placeholder="请输入内容"></textarea>
      							</div>

      							<div class="form-group">
      								<div>
      									<button  class="btn btn-success"
      									style="width: 20%;" id="leavemes">留言</button>
      								</div>

      							</div>
      						</form>
      					</div>
      				</div>
      			</div>
      		</div>
      	</div>
      </div>
      <!-- 主页面结束 -->
      <!-- 页脚开始 -->
      <div class="footer"></div>
      页脚结束

      <div class="nav"></div>

  </div>
  <a href="http://www.dowebok.com/" style="display: none;">dowebok</a>
<a href="http://www.dowebok.com/77.html" style="display: none;">jQuery全屏滚动插件fullPage.js</a>
</body>
</html>