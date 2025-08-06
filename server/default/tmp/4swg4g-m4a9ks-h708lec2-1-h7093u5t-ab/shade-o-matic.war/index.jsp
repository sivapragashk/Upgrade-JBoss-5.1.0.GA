<!DOCTYPE html>
<%@page import="com.hd.som.utils.Constants"%>
<html lang="en-US">
<head>
	<link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz' >
	<link rel="stylesheet" type="text/css" media="all" href="stylesheets/style.css" />
	<link rel="stylesheet" type="text/css" media="all" href="stylesheets/jkmegamenu.css" />
	<link rel="stylesheet" type="text/css" media="all" href="stylesheets/products.css" />
	<script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
	<script type="text/javascript" src="js/jkmegamenu.js"></script>
	<script type="text/javascript" src="js/shade-o-matic.js"></script>
	<script type="text/javascript">
		jkmegamenu.definemenu("admin", "adminsm", "click")
		jkmegamenu.definemenu("company", "megamenus", "click")
		jkmegamenu.definemenu("news", "megamenus1", "click")
		jkmegamenu.definemenu("reward", "megamenu1", "click")
		jkmegamenu.definemenu("products", "productssm", "click")
		jkmegamenu.definemenu("support", "megamenu2", "click")
		jkmegamenu.definemenu("mediacenter", "mediacentersm", "click")
		jkmegamenu.definemenu("epic", "epicsm", "click")
	</script>
</head>
<%
String editmode = "false";
System.out.println("mode.jsp");
if(session.getAttribute(Constants.APPLICATION_MODE) != null){
	editmode = String.valueOf(session.getAttribute(Constants.APPLICATION_MODE));
	System.out.println("mode.jsp-->"+editmode);
}%>
<body>
<form name="somform" action="" id="somform" method="post">
	<div id="container">
		<%@include file="includes/header.jsp"%>
		<ul id="nav">
			<jsp:include page="includes/menu.jsp" flush="true" >
				<jsp:param name="editmode" value="<%=editmode%>" />
			</jsp:include>
		</ul>
		<jsp:include page="templates/templates.jsp" flush="true" >
			<jsp:param name="editmode" value="<%=editmode%>" />
		</jsp:include>
		
		<input type="hidden" name="controlleraction" id="controlleraction" value=""/>
		<input type="hidden" name="menuId" id="menuId" value=""/>
		<input type="hidden" name="subMenuId" id="subMenuId" value=""/>
	</div>
</form>
</body>
</html>