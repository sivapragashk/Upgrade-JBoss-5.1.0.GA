package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.repository.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.login.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/menu.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>Document Repository</title>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"stylesheets/repository.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("<script type=\"text/Javascript\"> \r\n");
      out.write("\tfunction getdocumentlist(repositoryid)\r\n");
      out.write("\t{\r\n");
      out.write("\t  \tdocument.homeform.repository.value = repositoryid;\r\n");
      out.write("\t  \tdocument.homeform.Action.value='");
      out.print(Constants.DOCUMENT_LIST);
      out.write("';\r\n");
      out.write("\t\tdocument.homeform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction submitform(target)\r\n");
      out.write("\t{\r\n");
      out.write("\t  \tdocument.homeform.Action.value='");
      out.print(Constants.CATALOG_REQUEST);
      out.write("';\r\n");
      out.write("\t  \tdocument.homeform.action = 'catalog';\r\n");
      out.write("\t\tdocument.homeform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\t\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("\r\n");
UserDO user = (UserDO) session.getAttribute(Constants.LOGGED_USER);
      out.write("\r\n");
      out.write("<TABLE style=\"BORDER-COLLAPSE: collapse\" cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("\t  <TBODY>\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t     <TD align=right>\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\"><IMG src=\"images/logo.gif\"  border=0></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"applicationHeader\" align=\"right\">Document Repository&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr height=\"7\"><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t");
if(user != null){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"documentdisplay?Action=Home\" class=\"menulink\">Home</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(user.getUserType() <= Constants.ADMINISTRATOR){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"repository\" class=\"menulink\">Repositories</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"doctypes\" class=\"menulink\">Document Types</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"document\" class=\"menulink\">Documents</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"documentaccess\" class=\"menulink\">Document Access</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"shareddocuments\" class=\"menulink\">Shared Documents</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"catalog\" class=\"menulink\">Search Repositories</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"catalog?Action=CatalogRequest\" class=\"menulink\">Repository Requests</a>&nbsp;|\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"notify\" class=\"menulink\">Notify Updates</a>&nbsp;|\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
								if(session.getAttribute(Constants.CLOSE_WINDOW) == null){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"authenticate?Action=logout\" class=\"menulink\">Logout</a>&nbsp;\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}else{
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:window.close()\" class=\"menulink\">Close</a>&nbsp;\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:window.close()\" class=\"menulink\">Close</a>&nbsp;\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t  </TBODY>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("    <TABLE class=hd-main cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t  <TR valign=\"top\">\r\n");
      out.write("\t    <TD class=hd-titleareaframe colSpan=\"2\">\r\n");
      out.write("\t\t    <DIV id=\"pagetitle\">\r\n");
      out.write("\t\t      <TABLE class=hd-titleareaframe cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t\t\t        <TR>\r\n");
      out.write("\t\t\t          <TD style=\"PADDING-BOTTOM: 2px\">\r\n");
      out.write("\t\t\t            <TABLE style=\"PADDING-LEFT: 0px; PADDING-TOP: 0px\" cellSpacing=0 cellPadding=0 border=0 height=\"10\">\r\n");
      out.write("\t\t\t              <TBODY>\r\n");
      out.write("           \t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t                <TD style=\"PADDING-TOP: 4px\" noWrap align=middle width=108 height=\"10\">&nbsp;</TD>\r\n");
      out.write("\t\t\t\t                <TD height=\"10\"><IMG height=1 src=\"blank.gif\" width=22></TD>\r\n");
      out.write("\t\t\t\t                <TD style=\"PADDING-TOP: 0px\" noWrap height=\"10\"></TD>\r\n");
      out.write("\t\t\t\t                <TD valign=\"right\"></TD>\r\n");
      out.write("\t\t\t\t            </TR>\r\n");
      out.write("\t\t\t\t          </TBODY>\r\n");
      out.write("\t\t\t\t         </table> \r\n");
      out.write("\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t </TABLE>\r\n");
      out.write("\t\t\t</DIV>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t<form name=\"homeform\" action=\"documentdisplay\" method=\"post\" style=\"width: 720pt;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table width=\"80%\" border=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t");
if(request.getAttribute(Constants.REPOSITORY_ACCESS_REQUEST_COUNT)!= null){
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" onclick=\"javascript:submitform()\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"notificationmsg\">Pending repository access requests: ");
      out.print( request.getAttribute(Constants.REPOSITORY_ACCESS_REQUEST_COUNT));
      out.write("</span><br><br>\r\n");
      out.write("\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t");
if(request.getAttribute(Constants.DOCTYPE_ACCESS_REQUEST_COUNT)!= null){
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" onclick=\"javascript:submitform()\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"notificationmsg\">Pending document type access requests: ");
      out.print( request.getAttribute(Constants.DOCTYPE_ACCESS_REQUEST_COUNT));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\t\r\n");
      out.write("\t");
if(request.getAttribute(Constants.REPOSITORY_LIST)!= null){
		RepositoryDO[] repositories = (RepositoryDO[])request.getAttribute(Constants.REPOSITORY_LIST);
		if(repositories != null && repositories.length > 0){
      out.write("\r\n");
      out.write("\t\t\t<table width=\"80%\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tr><td width=\"15%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"heading\"><b>Repository List</b></td>\r\n");
      out.write("\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t<tr><td width=\"15%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"docList\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t");
for(int i=0;i<repositories.length;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"linkstyle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:getdocumentlist('");
      out.print(repositories[i].getRepositoryId());
      out.write("')\">");
      out.print(repositories[i].getRepositoryName());
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t</table>\t\t\r\n");
      out.write("\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("\t \t\t\t<tr>\r\n");
      out.write("\t \t\t\t\t<td class=\"msg\">\r\n");
      out.write("\t \t\t\t\t\tYou are not authorized to view any Repository, please contact administrator for further assiatance.\r\n");
      out.write("\t \t\t\t\t</td>\r\n");
      out.write("\t \t\t\t</tr>\t\r\n");
      out.write("\t \t\t</table>\r\n");
      out.write("\t\t");
}
	}
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"repository\" value=\"\">\r\n");
      out.write("\t\r\n");
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
