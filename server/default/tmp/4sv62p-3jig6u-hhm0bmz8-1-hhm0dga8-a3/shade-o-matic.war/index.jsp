<!DOCTYPE html>
<%@page import="com.hd.som.model.Template"%>
<%@page import="com.hd.som.utils.TextUtils"%>
<%@page import="com.hd.som.utils.Constants"%>
<%
String editmode = "false";
if(session.getAttribute(Constants.APPLICATION_MODE) != null){
	editmode = String.valueOf(session.getAttribute(Constants.APPLICATION_MODE));
}
String templatename = new String();
if(request.getAttribute(Constants.TEMPLATE) != null){
	Template template = (Template) request.getAttribute(Constants.TEMPLATE);
	if(template != null && template.getFilename() != null && template.getFilename().length() > 0){
		templatename = template.getFilename();
	}
}
%>
<html lang="en-US">
<head>
	<link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz' >
	<link rel="stylesheet" type="text/css" media="all" href="/shade-o-matic/stylesheets/style.css" />
	<link rel="stylesheet" type="text/css" media="all" href="/shade-o-matic/stylesheets/jkmegamenu.css" />
	<link rel="stylesheet" type="text/css" media="all" href="/shade-o-matic/stylesheets/<%=templatename%>.css" />
	<script type="text/javascript" src="/shade-o-matic/js/jquery-1.4.2.min.js" ></script>
	<script type="text/javascript" src="/shade-o-matic/js/jkmegamenu.js"></script>
	<script type="text/javascript" src="/shade-o-matic/js/shade-o-matic.js"></script>
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
			<jsp:param name="template" value="<%=templatename%>" />
		</jsp:include>
		
		<input type="hidden" name="<%=Constants.CONTROLLER_ACTION%>" id="<%=Constants.CONTROLLER_ACTION%>" value=""/>
		<input type="hidden" name="<%=Constants.CONTENT_ID%>" id="<%=Constants.CONTENT_ID%>" value=""/>
		<input type="hidden" name="<%=Constants.MENU_ID%>" id="<%=Constants.MENU_ID%>" value="<%=TextUtils.getText(request.getAttribute(Constants.MENU_ID))%>"/>
		<input type="hidden" name="<%=Constants.SUBMENU_ID%>" id="<%=Constants.SUBMENU_ID%>" value="<%=TextUtils.getText(request.getAttribute(Constants.SUBMENU_ID))%>"/>
		<input type="hidden" name="<%=Constants.SECTION_ID%>" id="<%=Constants.SECTION_ID%>" value="<%=TextUtils.getText(request.getAttribute(Constants.SECTION_ID))%>"/>
	</div>
</form>
</body>
</html>