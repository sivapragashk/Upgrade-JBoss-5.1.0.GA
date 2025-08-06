<!DOCTYPE html>
<html lang="en-US">
<head>
	<link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz' >
	<link rel="stylesheet" type="text/css" media="all" href="stylesheets/style.css" />
	<link rel="stylesheet" type="text/css" media="all" href="stylesheets/jkmegamenu.css" />
	<link rel="stylesheet" type="text/css" media="all" href="stylesheets/products_template.css" />
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
<body>
<form name="somform" action="" id="somform" method="post">
	<div id="container">
		<%@include file="includes/header.jsp"%>
		<ul id="nav">
			<%@include file="includes/menu.jsp"%>
		</ul>
		<%@include file="templates/templates.jsp"%>
		<input type="hidden" name="controlleraction" id="controlleraction" value=""/>
		<input type="hidden" name="menuId" id="menuId" value=""/>
		<input type="hidden" name="subMenuId" id="subMenuId" value=""/>
	</div>
</form>
</body>
</html>