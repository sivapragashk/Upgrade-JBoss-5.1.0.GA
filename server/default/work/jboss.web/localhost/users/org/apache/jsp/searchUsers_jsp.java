package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.usermanagement.utils.*;
import com.hd.usermanagement.user.*;

public final class searchUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String searchText = "";
String userId = "";
if(request.getAttribute(Constants.SEARCH_TEXT)!=null){
	searchText = request.getAttribute(Constants.SEARCH_TEXT).toString();
}
if(session.getAttribute(Constants.LOGGEDIN_USER_ID)!=null){
	userId = session.getAttribute(Constants.LOGGEDIN_USER_ID).toString();
}


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>User Management</title>\r\n");
      out.write("<head>\r\n");
      out.write("<!--[if IE]>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("ul.fdtablePaginater {display:inline-block;}\r\n");
      out.write("ul.fdtablePaginater {display:inline;}\r\n");
      out.write("ul.fdtablePaginater li {float:left;}\r\n");
      out.write("ul.fdtablePaginater {text-align:center;}\r\n");
      out.write("table { border-bottom:1px solid #C1DAD7; }\r\n");
      out.write("</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/users.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/jquery.autocomplete.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/paginate_sort.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.js\"></script>\r\n");
      out.write("<script type='text/javascript' src='js/jquery.autocomplete.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/tablesort.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/paginate.js\"></script>\r\n");
      out.write("<script type=\"text/JavaScript\" src=\"js/user.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function selectItem(li) {\r\n");
      out.write("\tvar searchUsers = '");
      out.print(Constants.SEARCH_USERS);
      out.write("';\r\n");
      out.write("   findValue(li);\r\n");
      out.write("   submitform(searchUsers);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function formatItem(row) {\r\n");
      out.write("   return row[0] + \" (\" + row[1] + \")\";\r\n");
      out.write("}\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("   $(\"#searchText\").autocomplete(\r\n");
      out.write("       \"searchuser.do\",\r\n");
      out.write("       {\r\n");
      out.write("       \t   delay:5,\r\n");
      out.write("           minChars:1,\r\n");
      out.write("           matchSubset:1,\r\n");
      out.write("           matchContains:1,\r\n");
      out.write("           cacheLength:10,\r\n");
      out.write("           onItemSelect:selectItem,\r\n");
      out.write("           onFindValue:findValue,\r\n");
      out.write("           formatItem:formatItem,\r\n");
      out.write("           autoFill:true,\r\n");
      out.write("           width:255\r\n");
      out.write("        }\r\n");
      out.write("   );\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form name=\"userForm\" action=\"user\" method=\"post\">\r\n");
      out.write("\t <table border=\"0\" cellpadding=\"1\" cellspacing=\"2\" width=\"100%\" class=\"tableNoBorder\" style=\"width: 600pt;\">\r\n");
      out.write("\t\t <tr><td class=\"columnNoBorder\">&nbsp;</td></tr>\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td width=\"75%\" align=\"left\" class=\"columnHeader columnNoBorder\">Please enter Firstname or Lastname\r\n");
      out.write("\t\t \t\t<input type=\"text\" id=\"searchText\" name=\"searchText\" value=\"");
      out.print(searchText);
      out.write("\" size=\"40\" onkeypress=\"searchUsers()\">\r\n");
      out.write("\t\t \t\t<input type=\"button\" value=\"Go\" onclick=\"submitform('");
      out.print(Constants.SEARCH_USERS);
      out.write("')\" class=\"buttonStyle\">\r\n");
      out.write("\t\t \t</td>\t\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t");
String message = (String) request.getAttribute(Constants.MESSAGE);
	if ( message != null )
	{
      out.write("\r\n");
      out.write("\t\t<table width=\"90%\" class=\"tableNoBorder\">\r\n");
      out.write("   \t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"msg columnNoBorder\">");
      out.print(message);
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t");
}
      out.write('\r');
      out.write('\n');
      out.write('	');
if(request.getAttribute(Constants.USER_LIST)!= null){
		UserDO[] user = (UserDO[])request.getAttribute(Constants.USER_LIST);
		if(user.length > 0){
      out.write("\r\n");
      out.write("\t\t\t<table id=\"searchTable\" cellpadding=\"0\" cellspacing=\"0\" \r\n");
      out.write("\t\t \t\tclass=\"sortable-onload-2 no-arrow rowstyle-alt colstyle-alt paginate-10 max-pages-10 \r\n");
      out.write("\t\t \t\tpaginationcallback-callbackTest-displayTextInfo\" style=\"width: 600pt;\">\r\n");
      out.write("\t\t \t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"sortable-text\">Username</th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"sortable-text\">Firstname</th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"sortable-text\">Lastname</th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"sortable-text\">Email</th>\r\n");
      out.write("\t\t\t\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");
for(int i=0;i<user.length;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(user[i].getUserName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(user[i].getFirstName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(user[i].getLastName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(user[i].getEmail());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"javascript:editUser('");
      out.print(user[i].getUserId());
      out.write("', '");
      out.print(Constants.GET_USER_DETAILS);
      out.write("')\">Edit</a> | <a href=\"javascript:deleteUser('");
      out.print(user[i].getUserId());
      out.write("', '");
      out.print(Constants.DELETE_USER);
      out.write("')\">Delete</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t   ");
}else{
      out.write("\r\n");
      out.write("\t \t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" class=\"tableNoBorder\">\r\n");
      out.write("\t \t\t\t<tr>\r\n");
      out.write("\t \t\t\t\t<td class=\"msg columnNoBorder\">\r\n");
      out.write("\t \t\t\t\t\tNo user(s) found for the given search criteria.\r\n");
      out.write("\t \t\t\t\t</td>\r\n");
      out.write("\t \t\t\t</tr>\t\r\n");
      out.write("\t \t\t</table>\r\n");
      out.write("\t   ");
}
	}
      out.write("\r\n");
      out.write("\t<table align=\"center\" width=\"90%\" class=\"tableNoBorder\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"columnNoBorder\"><input type=\"button\" value=\"Back\" onclick=\"backToManageUsers('userForm')\" class=\"buttonStyle\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(userId);
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"userId\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
