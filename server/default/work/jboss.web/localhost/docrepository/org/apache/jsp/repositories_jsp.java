package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.groups.*;
import com.hd.docrepository.repository.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.login.*;
import com.hd.docrepository.utils.*;

public final class repositories_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/message.jsp");
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
      out.write("<head>\r\n");
      out.write("<title>Document Repository</title>\r\n");
      out.write("<link href=\"stylesheets/repository.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/jquery-1.3.2.js\"></script>\r\n");
      out.write("<script type=\"text/JavaScript\" src=\"javascript/repository.js\"></script>\r\n");
      out.write("<script type=\"text/JavaScript\" src=\"javascript/docrepo.js\"></script>\r\n");
      out.write("<script type=\"text/JavaScript\">\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

int groupid = 0;
GroupDO[] groups = null;
GroupDO[] admingrouplist = null;
RepositoryDO[] repositories = null;
if(request.getAttribute(Constants.GROUP_LIST) != null)
	groups = (GroupDO[])request.getAttribute(Constants.GROUP_LIST);
if(request.getAttribute(Constants.ADMIN_GROUP_LIST) != null)
	admingrouplist = (GroupDO[])request.getAttribute(Constants.ADMIN_GROUP_LIST);
if(request.getAttribute(Constants.REPOSITORY_LIST) != null)
	repositories = (RepositoryDO[])request.getAttribute(Constants.REPOSITORY_LIST);
if(request.getAttribute(Constants.GROUP_ID) != null)
	groupid = Integer.parseInt(request.getAttribute(Constants.GROUP_ID).toString());

      out.write("\r\n");
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
      out.write("\t <p id=\"heading\"><b>Manage Repositories</b></p>\r\n");
      out.write("\t <table border=\"0\" cellpadding=\"3\" cellspacing=\"5\" width=\"80%\">\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td align=\"left\">\r\n");
      out.write("\t\t \t\t <p><span class=\"required\">* - Required fields.</span></p>\r\n");
      out.write("\t\t \t</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>\r\n");
      out.write(" \t\t\t\t<form name=\"repositoryform\" action=\"repository\" method=\"post\">\r\n");
      out.write("\t\t\t\t <table border=\"0\" cellpadding=\"2\" cellspacing=\"3\" width=\"86%\" id=\"tablenobackground\">\r\n");
      out.write("\t\t\t\t\t <tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t ");
      out.write('\r');
      out.write('\n');
String message = (String) request.getAttribute(Constants.MESSAGES);
if ( message != null )
{
      out.write("\r\n");
      out.write("   <tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\" height=\"20\" valign=\"middle\" class=\"msg\">");
      out.print(message);
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td  width=\"29%\" align=\"right\" class=\"textBold\">Owner</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"group\" name=\"group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(admingrouplist != null && admingrouplist.length > 0){
									if(admingrouplist.length > 1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a Group</option>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
									for(int i=0;i<admingrouplist.length;i++){
									String selected = "";
										if(admingrouplist[i].getGroupId() == groupid)
											selected = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(admingrouplist[i].getGroupId());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(admingrouplist[i].getGroupName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
								 }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</select>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:sortRepositories()\">Sort Repositories</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Repository</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"repositoryid\" name=\"repositoryid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"0\">Add a new repository</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(repositories != null && repositories.length > 0){
									for(int i=0;i<repositories.length;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(repositories[i].getRepositoryId());
      out.write('"');
      out.write('>');
      out.print(repositories[i].getRepositoryName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
								 }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Name</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" id=\"repository\" name=\"repository\" value=\"\" size=\"35\" maxlength=\"50\"/>&nbsp;<span class=\"required\">*</span></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Description</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><textarea id=\"description\" name=\"description\" cols=\"40\" rows=\"5\" onkeypress=\"return textCounter(this,500, 'Description')\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Tags</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><textarea id=\"tags\" name=\"tags\" cols=\"40\" rows=\"5\" onkeypress=\"return textCounter(this,500, 'Description')\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Show in Repository Search?</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"checkbox\" id=\"showincatalog\" name=\"showincatalog\" value=\"Y\" style=\"border: none;\"/></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Display Modified Date?</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"checkbox\" id=\"showmodifieddate\" name=\"showmodifieddate\" value=\"Y\" style=\"border: none;\"/></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Requests to share document type controlled by:</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"doctyperequestcontroller\" name=\"doctyperequestcontroller\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"O\">Owner</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"C\">Contributor</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"B\">Both</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Repository Display Mode</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\" class=\"textBold\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"displaymodecollapse\" name=\"displaymode\" value=\"collapse\" style=\"border: none;\" checked/>Collapse&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"displaymodeexpand\" name=\"displaymode\" value=\"expand\" style=\"border: none;\"/>Expand\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Access Rights</td>\r\n");
      out.write("\t\t\t\t\t \t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t <div style=\"border-color: #0065A4; border-style: solid; border-width: 1px; width: 530px; height: 100px; overflow: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td>\r\n");
      out.write("\t\t\t\t\t \t\t\t");
if(groups != null && groups.length > 0){
									for(int i=0;i<groups.length;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\t\t\t<span class=\"textStyle\" style=\"font-size: 7.5pt;height:30px;width:260px;border-bottom:1px solid #0065A4;border-right:1px solid #0065A4\">\r\n");
      out.write("\t\t\t\t\t \t\t\t\t\t&nbsp;");
      out.print(groups[i].getGroupName());
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\t\t\t\t&nbsp;<select id=\"");
      out.print(groups[i].getGroupId());
      out.write("\" name=\"SHARED_REPOSITORIES_");
      out.print(groups[i].getGroupId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t \t\t\t\t\t\t<option value=\"");
      out.print(Constants.NO_ACCESS);
      out.write("\">No Access</option>\r\n");
      out.write("\t\t\t\t\t \t\t\t\t\t\t<option value=\"");
      out.print(Constants.READ_ONLY);
      out.write("\">Read Only</option>\r\n");
      out.write("\t\t\t\t\t \t\t\t\t\t\t<option value=\"");
      out.print(Constants.ADD_DOCUMENTS);
      out.write("\">Add Documents</option>\r\n");
      out.write("\t\t\t\t\t \t\t\t\t\t\t<option value=\"");
      out.print(Constants.FULL_ACCESS);
      out.write("\">Full Access</option>\r\n");
      out.write("\t\t\t\t\t \t\t\t\t\t</select>\t\r\n");
      out.write("\t\t\t\t\t \t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t \t\t\t\t");
}
					 			}
      out.write("\r\n");
      out.write("\t\t \t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t \t\t\t\t\t</table>\r\n");
      out.write("\t\t \t\t\t\t</div>\t\r\n");
      out.write("\t \t\t\t\t\t</td>\r\n");
      out.write("\t \t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" id=\"savechanges\" value=\"Save Changes\" class=\"buttonStyle\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" id=\"deleterepository\" value=\"Delete\" class=\"buttonStyle\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
