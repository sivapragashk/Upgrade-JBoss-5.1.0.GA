<%@page import="com.hd.som.utils.Constants"%>
<%String message = (String) request.getAttribute(Constants.MESSAGES);
if ( message != null )
{%>
   <div id="messages"><%=message%></div>
<%}%>