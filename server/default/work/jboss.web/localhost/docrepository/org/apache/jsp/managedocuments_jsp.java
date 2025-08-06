package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.groups.*;
import com.hd.docrepository.documents.*;
import com.hd.docrepository.repository.*;
import com.hd.docrepository.documenttypes.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.login.*;
import com.hd.docrepository.utils.*;

public final class managedocuments_jsp extends org.apache.jasper.runtime.HttpJspBase
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

GroupDO[] admingrouplist = null;
RepositoryDO[] repositories = null;
DocumentTypeDO[] documenttypes = null;
int repositoryid = 0;
int groupid = 0;
int doctypeid = 0;
if(request.getAttribute(Constants.ADMIN_GROUP_LIST) != null)
	admingrouplist = (GroupDO[])request.getAttribute(Constants.ADMIN_GROUP_LIST);
if(request.getAttribute(Constants.REPOSITORY_LIST) != null)
	repositories = (RepositoryDO[])request.getAttribute(Constants.REPOSITORY_LIST);
if(request.getAttribute(Constants.DOCUMENT_TYPE_LIST) != null)
	documenttypes = (DocumentTypeDO[])request.getAttribute(Constants.DOCUMENT_TYPE_LIST);
if(request.getAttribute(Constants.REPOSITORY_ID) != null)
	repositoryid = Integer.parseInt(request.getAttribute(Constants.REPOSITORY_ID).toString());
if(request.getAttribute(Constants.DOCUMENT_TYPE_ID) != null)
	doctypeid = Integer.parseInt(request.getAttribute(Constants.DOCUMENT_TYPE_ID).toString());
if(request.getAttribute(Constants.GROUP_ID) != null)
	groupid = Integer.parseInt(request.getAttribute(Constants.GROUP_ID).toString());

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>Document Repository</title>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"stylesheets/repository.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/jquery-1.3.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/document.js\"></script>\r\n");
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
      out.write("\t <p id=\"heading\"><b>Manage Documents</b></p>\r\n");
      out.write("\t<form name=\"documentform\" action=\"document\" method=\"post\" style=\"width: 650px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t <table border=\"0\" cellpadding=\"1\" cellspacing=\"2\" width=\"100%\" style=\"width: 720pt;\">\r\n");
      out.write("\t \t ");
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
      out.write("\t \t <tr>\r\n");
      out.write("\t\t \t<td align=\"left\" class=\"textBold\">Groups\r\n");
      out.write("\t\t \t\t<select id=\"group\" name=\"group\">\r\n");
      out.write("\t\t\t\t\t");
if(admingrouplist != null && admingrouplist.length > 0){
						if(admingrouplist.length > 1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">Select a Group</option>\t\t\r\n");
      out.write("\t\t\t\t\t\t");
}
						for(int i=0;i<admingrouplist.length;i++){
						String selected = "";
							if(admingrouplist[i].getGroupId() == groupid)
								selected = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(admingrouplist[i].getGroupId());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(admingrouplist[i].getGroupName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t");
}
					 }
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td class=\"textBold\">\t\r\n");
      out.write("\t\t \t\tRepository\r\n");
      out.write("\t\t\t\t<select id=\"repositoryid\" name=\"repositoryid\">\r\n");
      out.write("\t\t\t\t\t");
if(repositories != null && repositories.length > 0){
						if(repositories.length > 1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">Select a repository</option>\r\n");
      out.write("\t\t\t\t\t\t");
}
						for(int i=0;i<repositories.length;i++){
							String selected = "";
							if(repositories[i].getRepositoryId() == repositoryid)
								selected = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(repositories[i].getRepositoryId());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(repositories[i].getRepositoryName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t");
}
					 }else{
      out.write("\r\n");
      out.write("\t\t\t\t\t \t<option value=\"0\">Select a repository</option>\r\n");
      out.write("\t\t\t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td class=\"textBold\">\t\r\n");
      out.write("\t\t \t\tDocument Types\r\n");
      out.write("\t\t\t\t<select id=\"documenttypeid\" name=\"documenttypeid\">\r\n");
      out.write("\t\t\t\t\t");
if(documenttypes != null && documenttypes.length > 0){
						if(documenttypes.length > 1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">Select a document type</option>\r\n");
      out.write("\t\t\t\t\t\t");
}
						for(int i=0;i<documenttypes.length;i++){
							String selected = "";
							if(documenttypes[i].getDocumentTypeId() == doctypeid)
								selected = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(documenttypes[i].getDocumentTypeId());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(documenttypes[i].getDocumentType());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t");
}
					 }else{
      out.write("\r\n");
      out.write("\t\t\t\t\t \t<option value=\"0\">Select a document type</option>\r\n");
      out.write("\t\t\t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t\t\t</select>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Go\" onclick=\"submitdocumentform('");
      out.print(Constants.MODIFY_DELETE_DOCUMENTS);
      out.write("')\" class=\"buttonStyle\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t");
if(request.getAttribute(Constants.DOCUMENT_LIST)!= null){
		DocumentDO[] documents = (DocumentDO[])request.getAttribute(Constants.DOCUMENT_LIST);
		if(documents != null && documents.length > 0){
      out.write("\r\n");
      out.write("\t\t\t<table align=\"center\" border=\"1\" bordercolor=\"#0065A4\" style=\"BORDER-COLLAPSE: collapse;\" cellpadding=\"2\" cellspacing=\"2\" style=\"width: 725pt;\" id=\"tablenobackgroundnoborder\">\r\n");
      out.write("\t\t \t\t<tr class=\"tableHeaderBackground\">\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" width=\"4%\">No.</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\">Document Title</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\">Filename</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" width=\"17%\">Date Created</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" width=\"17%\">Date modified</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" width=\"10%\">Expiry Date</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"8%\">&nbsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");
for(int i=0;i<documents.length;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" class=\"tableStyle\">");
      out.print((i+1));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableStyle\">");
      out.print(Utilities.formatNullString(documents[i].getDocumentTitle()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableStyle\">");
      out.print(documents[i].getFilename());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableStyle\" align=\"center\">");
      out.print(documents[i].getDateCreated());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableStyle\" align=\"center\">");
      out.print(Utilities.formatNullString(documents[i].getDateModified()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableStyle\" align=\"center\">");
      out.print(Utilities.formatNullString(documents[i].getExpiryDate()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableStyle\"><a href=\"javascript:editdocument('");
      out.print(documents[i].getDocumentId());
      out.write("', '");
      out.print(Constants.GET_DOCUMENT_DETAILS);
      out.write("')\">Edit</a> | <a href=\"#\" onclick=\"javascript:checkifdocumentshared('");
      out.print(documents[i].getDocumentId());
      out.write("', '");
      out.print(Constants.DELETE_DOCUMENT);
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
      out.write("\t \t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("\t \t\t\t<tr>\r\n");
      out.write("\t \t\t\t\t<td class=\"msg\">\r\n");
      out.write("\t \t\t\t\t\tNo document(s) found for the given search criteria.\r\n");
      out.write("\t \t\t\t\t</td>\r\n");
      out.write("\t \t\t\t</tr>\t\r\n");
      out.write("\t \t\t</table>\r\n");
      out.write("\t   ");
}
	}
      out.write("\r\n");
      out.write("\t<div id=\"sharedgroupsection\"></div>\r\n");
      out.write("\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"documentid\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"page\" value=\"");
      out.print(Constants.JSP_MANAGE_DOCUMENTS);
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"groupname\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"repositoryname\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"doctypename\" value=\"\">\r\n");
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
