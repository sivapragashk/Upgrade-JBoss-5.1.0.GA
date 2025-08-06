<%@page import="com.hd.som.utils.Constants"%>
<%@page import="com.hd.som.model.Template"%>
<%
Template template = null;
if(request.getAttribute(Constants.TEMPLATE) != null){
	template = (Template) request.getAttribute(Constants.TEMPLATE);
}

if(template != null && template.getFilename() != null && template.getFilename().length() > 0){
	String templatename = template.getFilename()+".jsp";%>
	<jsp:include page="<%=templatename%>" flush="true" />
<%}else{%>
	<jsp:include page="home.jsp" flush="true" />
<%}%>
