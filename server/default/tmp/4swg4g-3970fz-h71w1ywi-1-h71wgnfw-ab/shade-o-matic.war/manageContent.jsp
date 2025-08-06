<%@page import="com.hd.som.utils.TextUtils"%>
<%@page import="com.hd.som.model.Items"%>
<%@page import="com.hd.som.utils.Constants"%>
<%@ page import="java.util.*" %>
<%
List<Items> itemList = null;

if(request.getAttribute(Constants.ITEM_LIST) != null)
	itemList = (List) request.getAttribute(Constants.ITEM_LIST);
%>

<html>
<head>
	<title>Shade-O-Matic</title> 
	<meta content="text/html; charset=utf-8" http-equiv="content-type" />
	<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
	<script src="ckeditor/sample.js" type="text/javascript"></script>
	<link href="ckeditor/sample.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="stylesheets/style.css" />
	<script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
	<script>
	jQuery(document).ready(function($){
		$("#savecontent").click(function(){
			$('#htm_controlleraction').attr('value', 'savecontent');
			$('#managecontentfrm').submit();
		});
	});
	</script>
</head>
<body style="background-color: #ffffff;">
  <form name="managecontentfrm" id="managecontentfrm" method="post" action="content" enctype="multipart/form-data">
	<div id="popupwindow">
		<div id="closewindow"><a href="javascript:window.close()" class="linkstyle">Close Window</a></div>
		
		<%if(itemList != null && itemList.size() > 0){
			Iterator<Items> iterator = itemList.iterator();
			while(iterator.hasNext()){
				Items item = iterator.next();
				if(item.getType().equals(Constants.TEXT_BOX)){%>
					<div id="popuplabel"><%=item.getName()%> </div> <input type="text" name="<%=item.getName()%>" class="popuptextbox" size="40" value="">
					<div id="popuplabel"></div>	<div id="popuptext"><%=TextUtils.getItemSummary(item)%></div>
				<%}else if(item.getType().equals(Constants.FILE)){%>
					<div id="popuplabel"><%=item.getName()%> </div> <input type="file" name="<%=item.getName()%>" class="popuptextbox" size="40">
					<div id="popuplabel"></div>	<div id="popuptext"><%=TextUtils.getItemSummary(item)%></div>
					<input type="hidden" name="TEMP_<%=item.getName()%>" value="">
				<%}else{%>
					<div id="popuplabel"><%=item.getName()%> </div> 
					<div id="ckeditor">
						<textarea cols="50" id="editor1" name="<%=item.getName()%>" rows="2"></textarea>
						<script type="text/javascript">CKEDITOR.replace( '<%=item.getName()%>' );</script>
					</div>
					<div id="popuplabel"></div>	<div id="popuptext"></div>
				<%}
			}%>
					
					<div id="popuplabel"></div><div id="popupbuttons">
						<input type="button" value="submit" id="savecontent">&nbsp;&nbsp;
						<input type="button" value="Cancel" onclick="javascript:window.close();">
					</div>
		<%}%>
		
	</div>
	<input type="hidden" name="<%=Constants.CONTROLLER_ACTION%>" id="<%=Constants.CONTROLLER_ACTION%>" value=""/>
	<input type="hidden" name="<%=Constants.MENU_ID%>" id="<%=Constants.MENU_ID%>" value="<%=TextUtils.getText(request.getAttribute(Constants.MENU_ID))%>"/>
	<input type="hidden" name="<%=Constants.SUBMENU_ID%>" id="<%=Constants.SUBMENU_ID%>" value="<%=TextUtils.getText(request.getAttribute(Constants.SUBMENU_ID))%>"/>
	<input type="hidden" name="<%=Constants.SECTION_ID%>" id="<%=Constants.SECTION_ID%>" value="<%=TextUtils.getText(request.getAttribute(Constants.SECTION_ID))%>"/>
  </form>		
</body>
</html>	