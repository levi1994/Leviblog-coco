<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"
	xmlns:wb="http://open.weibo.com/wb">
<head>
<meta charset="UTF-8">
	<title>李春的个人博客</title>
	</head>
<body>
  <h2>出错了</h2>
  	<s:iterator var="error" value="#errorStack"  status="st">
  	        ${error}
  	</s:iterator>
</body>
</html>