<%@page import="com.hd.som.model.Template"%>
<%
Template template = null;
if(request.getAttribute("template") != null){
	template = (Template) request.getAttribute("template");
}
if(template != null && template.getFilename() != null && template.getFilename().length() > 0){
	String templatename = "templates/"+template.getFilename()+".jsp";%>
	<jsp:include page="<%=templatename%>" flush="true" />
<%}else{%>
	<jsp:include page="templates/home.jsp" flush="true" />
<%}%>
