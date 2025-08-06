<%boolean editmode = new Boolean(request.getParameter("editmode"));
System.out.println("mode-->"+editmode);%>
<div id="maincontent">
	<%if(editmode){%>
		<div id="admin_templateheader">
			<a href="javascript:loadItems();" id="admin_template_insert_link">Insert Content</a>
		</div>
	<%}%>		
	
	<%if(editmode){%>
		<div id="admin_product_header_content">
			<a href="javascript:loadItems();" id="admin_template_insert_link">Insert Content</a>
		</div>
	<%}%>
	
	<%if(editmode){%>
		<div id="product_main">
			<br/><div id="admin_product_main_header">
				<a href="javascript:loadItems();" id="admin_template_insert_link">Insert Content</a>
			</div>
			<div id="admin_product_main_content_item">
				<a href="javascript:loadItems();" id="admin_template_insert_link">Insert Content</a>
			</div>
		</div>	
	<%}%>
</div>