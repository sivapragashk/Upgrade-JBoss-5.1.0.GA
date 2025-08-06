<%@page import="com.hd.som.utils.Constants"%>
<%@page import="com.hd.som.model.Template"%>
<%
String template = request.getParameter("template");
if(template != null && template.length() > 0){
	String filename = template+".jsp";%>
	<jsp:include page="<%=filename%>" flush="true" />
<%}else{%>
	<jsp:include page="home.jsp" flush="true" />
<%}%>
