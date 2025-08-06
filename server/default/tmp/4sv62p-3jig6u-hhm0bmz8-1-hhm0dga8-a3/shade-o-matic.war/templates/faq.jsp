<%@page import="com.hd.som.utils.HTMLUtils"%>
<%@page import="com.hd.som.utils.TextUtils"%>
<%@page import="com.hd.som.utils.Constants"%>
<%@page import="java.util.*"%>
<%!
	private static final int BODY_CONTENT = 5;
%>
<%
boolean editmode = new Boolean(request.getParameter("editmode"));
Map<Integer, Map<Integer, Map<String, String>>> sectionmap = null;
if(request.getAttribute(Constants.CONTENT) != null){
	sectionmap=(HashMap)request.getAttribute(Constants.CONTENT);
}%>

<div id="maincontent">
	<div id="faq_container">
		<%if(sectionmap != null && sectionmap.get(BODY_CONTENT) != null){
			Map<Integer, Map<String, String>> contentmap = sectionmap.get(BODY_CONTENT);
			if(contentmap!=null && contentmap.size() > 0){
				for(int contentid : contentmap.keySet()){
					Map<String, String> referencemap = contentmap.get(contentid);%>
						<div id="faq_content_holder">
							<div id="faq_question">
								Q:&nbsp;<%=TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER)%>	
							</div>
							<div id="faq_answer">
								A:&nbsp;<%=TextUtils.getMapValue(referencemap, Constants.ITEM_CONTENT)%> 
							</div>
							<div id="faq_edit_delete_links">
								<%=HTMLUtils.generateLinks(contentid, BODY_CONTENT, editmode, false)%>
							</div>	
						</div>		
				<%}
			}
		}if(editmode){%>
			<div id="admin_faq">
				<a href="javascript:insert('<%=BODY_CONTENT%>')" id="admin_template_insert_link">Insert Content</a>
			</div>
		<%}%>
	</div>
</div>