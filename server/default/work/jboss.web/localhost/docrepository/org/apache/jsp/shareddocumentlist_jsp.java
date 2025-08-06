package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.groups.*;
import com.hd.docrepository.documenttypes.*;
import com.hd.docrepository.repository.*;
import com.hd.docrepository.documentaccess.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.login.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.groups.*;
import com.hd.docrepository.documents.*;
import com.hd.docrepository.documentaccess.*;
import java.util.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.groups.*;
import com.hd.docrepository.documents.*;
import com.hd.docrepository.documentaccess.*;
import java.util.*;

public final class shareddocumentlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/message.jsp");
    _jspx_dependants.add("/shareddocuments.jsp");
    _jspx_dependants.add("/rejecteddocuments.jsp");
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
int groupid = 0;
int repositoryid = 0;
int doctypeid = 0;
if(request.getAttribute(Constants.ADMIN_GROUP_LIST) != null)
	admingrouplist = (GroupDO[])request.getAttribute(Constants.ADMIN_GROUP_LIST);
if(request.getAttribute(Constants.GROUP_ID) != null)
	groupid = Integer.parseInt(request.getAttribute(Constants.GROUP_ID).toString());
if(request.getAttribute(Constants.REPOSITORY_LIST) != null)
	repositories = (RepositoryDO[])request.getAttribute(Constants.REPOSITORY_LIST);
if(request.getAttribute(Constants.DOCUMENT_TYPE_LIST) != null)
	documenttypes = (DocumentTypeDO[])request.getAttribute(Constants.DOCUMENT_TYPE_LIST);
if(request.getAttribute(Constants.REPOSITORY_ID) != null)
	repositoryid = Integer.parseInt(request.getAttribute(Constants.REPOSITORY_ID).toString());
if(request.getAttribute(Constants.DOCUMENT_TYPE_ID) != null)
	doctypeid = Integer.parseInt(request.getAttribute(Constants.DOCUMENT_TYPE_ID).toString());

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>Document Repository</title>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"stylesheets/repository.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/jquery-1.3.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/shareddocuments.js\"></script>\r\n");
      out.write("<script type=\"text/Javascript\"> \r\n");
      out.write("\tfunction viewDocument(documentid)\r\n");
      out.write("\t{\r\n");
      out.write("\t  \tdocument.shareddocumentsform.DocId.value = documentid;\r\n");
      out.write("\t  \tdocument.shareddocumentsform.target='_blank';\r\n");
      out.write("\t  \tdocument.shareddocumentsform.Action.value='ViewDocument';\r\n");
      out.write("\t  \tdocument.shareddocumentsform.action = 'documentdisplay';\r\n");
      out.write("\t\tdocument.shareddocumentsform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction viewTDSDocument(documentid)\r\n");
      out.write("\t{\r\n");
      out.write("\t  \tdocument.shareddocumentsform.DocId.value = documentid;\r\n");
      out.write("\t  \tdocument.shareddocumentsform.target='_blank';\r\n");
      out.write("\t  \tdocument.shareddocumentsform.Action.value='ViewTDSDocument';\r\n");
      out.write("\t  \tdocument.shareddocumentsform.action = 'documentdisplay';\r\n");
      out.write("\t\tdocument.shareddocumentsform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
      out.write("\t  <p id=\"heading\"><b>Shared Documents</b></p>\r\n");
      out.write("\t<form name=\"shareddocumentsform\" action=\"shareddocuments\" method=\"post\" style=\"width: 650px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t <table border=\"0\" cellpadding=\"1\" cellspacing=\"2\" width=\"100%\" style=\"width: 690pt;\">\r\n");
      out.write("\t\t ");
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
      out.write("\t\t <tr>\r\n");
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
      out.write("\t\t \t\t<input type=\"button\" id=\"listshareddocuments\" value=\"Go\" class=\"buttonStyle\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
if(request.getAttribute(Constants.DOCUMENT_LIST)!= null){
		DocumentAccessDO documentaccess = (DocumentAccessDO)request.getAttribute(Constants.DOCUMENT_LIST);
		if(documentaccess != null){
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\t\r\n");
      out.write("\t");
GroupDO shareddocs_ownergroupdetails = null;
	if(request.getAttribute(Constants.OWNER_GROUP_AND_GROUP_ACCESS) != null)
		shareddocs_ownergroupdetails = (GroupDO)request.getAttribute(Constants.OWNER_GROUP_AND_GROUP_ACCESS);
	
	DocumentAccessDO shareddocs_documentaccess = (DocumentAccessDO)request.getAttribute(Constants.DOCUMENT_LIST);
	DocumentDO[] shareddocuments  = shareddocs_documentaccess.getDocumentsSharedToAGroup();
	if(shareddocuments != null && shareddocuments.length > 0){
      out.write("\r\n");
      out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" style=\"width: 725pt;\">\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"textBold\">Documents shared to the selected group.</td>\r\n");
      out.write("\t\t</tr>\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"GROUPACCESS\" value=\"-1\" style=\"border: 0px;\">Public&nbsp;\r\n");
      out.write("\t\t\t\t");
if(shareddocs_ownergroupdetails!=null){
					GroupUserTypeDO[] groupaccess = shareddocs_ownergroupdetails.getGroupUserTypes();
					if(groupaccess != null){
						for(int k=0;k<groupaccess.length;k++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"GROUPACCESS\" value=\"");
      out.print(groupaccess[k].getGroupUserTypeId());
      out.write("\" style=\"border: 0px;\">");
      out.print(groupaccess[k].getGroupUserType());
      out.write("&nbsp;\r\n");
      out.write("\t\t\t\t\t\t");
}
					}	
				}else{
      out.write("\r\n");
      out.write("\t\t\t\t\tN/A\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Accept All\" onclick=\"updateMultipleDocumentStatus('");
      out.print(Constants.ACCPETED);
      out.write("')\" class=\"buttonStyle\" style=\"width: 80px;\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Reject All\" onclick=\"updateMultipleDocumentStatus('");
      out.print(Constants.REJECTED);
      out.write("')\" class=\"buttonStyle\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Reject & Remove All\" onclick=\"updateMultipleDocumentStatus('");
      out.print(Constants.INACTIVE);
      out.write("')\" class=\"buttonStyle\" style=\"width: 140px;\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table align=\"center\" border=\"1\" bordercolor=\"#0065A4\" style=\"BORDER-COLLAPSE: collapse;\" cellpadding=\"2\" cellspacing=\"2\" style=\"width: 735pt;\" id=\"tablenobackgroundnoborder\">\r\n");
      out.write("\t \t\t<tr class=\"tableHeaderBackground\">\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"4%\">No.</th>\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"25%\">Document Title</th>\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"28%\">Group Access</th>\r\n");
      out.write("\t\t\t\t");
if(shareddocs_documentaccess.isShowallshareddocs()){
      out.write("\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" width=\"13%\">Document Type</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" width=\"13%\">Repository</th>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"20%\">&nbsp;</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t");
for(int i=0;i<shareddocuments.length;i++){
					List<String> alreadySharedGroupAccessList = shareddocuments[i].getAlreadySharedGroupAccessList();
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" class=\"tableText\">");
      out.print((i+1));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\">\r\n");
      out.write("\t\t\t\t\t\t\t");
if(Utilities.formatNullString(shareddocuments[i].getTDSInstructionID()).length() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    <a href=\"javascript:viewTDSDocument('");
      out.print(shareddocuments[i].getTDSInstructionID());
      out.write("')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(Utilities.formatNullString(shareddocuments[i].getDocumentTitle()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:viewDocument(");
      out.print(shareddocuments[i].getDocumentId());
      out.write(")\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(Utilities.formatNullString(shareddocuments[i].getDocumentTitle()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"GROUPACCESS_");
      out.print(shareddocuments[i].getDocumentId());
      out.write("\" value=\"-1\" style=\"border: 0px;\" \r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(alreadySharedGroupAccessList != null && alreadySharedGroupAccessList.contains("-1")){
      out.write("checked");
}
      out.write(">Public\r\n");
      out.write("\t\t\t\t\t\t\t");
if(shareddocs_ownergroupdetails!=null){
								GroupUserTypeDO[] groupaccess = shareddocs_ownergroupdetails.getGroupUserTypes();
								if(groupaccess != null){
									for(int k=0;k<groupaccess.length;k++){
									String checked = "";
										if(alreadySharedGroupAccessList != null && alreadySharedGroupAccessList.contains(""+groupaccess[k].getGroupUserTypeId()))
											checked = "checked";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"GROUPACCESS_");
      out.print(shareddocuments[i].getDocumentId());
      out.write("\" value=\"");
      out.print(groupaccess[k].getGroupUserTypeId());
      out.write("\" style=\"border: 0px;\" ");
      out.print(checked);
      out.write('>');
      out.print(groupaccess[k].getGroupUserType());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
								}	
							}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tN/A\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t");
if(shareddocs_documentaccess.isShowallshareddocs()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableText\">");
      out.print(shareddocuments[i].getDocumentType());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableText\">");
      out.print(shareddocuments[i].getRepository());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\">\r\n");
      out.write("\t\t\t\t\t\t\t");
if(shareddocuments[i].getStatus().equals(Constants.ASSIGNED)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Accept & Display\" onclick=\"updateDocumentStatus(");
      out.print(shareddocuments[i].getDocumentId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(Constants.ACCPETED);
      out.write("')\" class=\"buttonStyle\" style=\"width: 105px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Reject\" onclick=\"updateDocumentStatus(");
      out.print(shareddocuments[i].getDocumentId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(Constants.REJECTED);
      out.write("')\" class=\"buttonStyle\" style=\"width: 48px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Reject & Remove\" onclick=\"updateDocumentStatus(");
      out.print(shareddocuments[i].getDocumentId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(Constants.INACTIVE);
      out.write("')\" class=\"buttonStyle\" style=\"width: 105px;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
}else if(shareddocuments[i].getStatus().equals(Constants.ACCPETED)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Update\" onclick=\"updateDocumentStatus(");
      out.print(shareddocuments[i].getDocumentId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(Constants.ACCPETED);
      out.write("')\" class=\"buttonStyle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Remove From Display\" onclick=\"updateDocumentStatus(");
      out.print(shareddocuments[i].getDocumentId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(Constants.REJECTED);
      out.write("')\" class=\"buttonStyle\" style=\"width: 135px;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t");
}else{
      out.write("\t\r\n");
      out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"msg\">\r\n");
      out.write("\t\t\t\t\tDocuments to be reviewed: Nil\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t");
      out.write("\t\r\n");
      out.write("\t");

	GroupDO rejecteddocs_ownergroupdetails = null;
	
	if(request.getAttribute(Constants.OWNER_GROUP_AND_GROUP_ACCESS) != null)
		rejecteddocs_ownergroupdetails = (GroupDO)request.getAttribute(Constants.OWNER_GROUP_AND_GROUP_ACCESS);
	DocumentAccessDO rejecteddocs_documentaccess = (DocumentAccessDO)request.getAttribute(Constants.DOCUMENT_LIST);
	DocumentDO[] rejecteddocuments  = rejecteddocs_documentaccess.getRejectedDocuments();
	if(rejecteddocuments != null && rejecteddocuments.length > 0){
      out.write("\r\n");
      out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"textBold\">Rejected documents.</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t</table><br>\r\n");
      out.write("\t\t<table align=\"center\" border=\"1\" bordercolor=\"#0065A4\" style=\"BORDER-COLLAPSE: collapse;\" cellpadding=\"2\" cellspacing=\"2\" style=\"width: 735pt;\" id=\"tablenobackgroundnoborder\">\r\n");
      out.write("\t \t\t<tr class=\"tableHeaderBackground\">\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"4%\">No.</th>\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"25%\">Document Title</th>\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"28%\">Group Access</th>\r\n");
      out.write("\t\t\t\t");
if(rejecteddocs_documentaccess.isShowallshareddocs()){
      out.write("\r\n");
      out.write("\t\t\t\t \t<th align=\"center\" width=\"13%\">Document Type</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" width=\"13%\">Repository</th>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t<th align=\"center\" width=\"20%\">&nbsp;</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t");
for(int i=0;i<rejecteddocuments.length;i++){
				List<String> alreadySharedGroupAccessList = rejecteddocuments[i].getAlreadySharedGroupAccessList();
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" class=\"tableText\">");
      out.print((i+1));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\">\r\n");
      out.write("\t\t\t\t\t\t\t");
if(Utilities.formatNullString(rejecteddocuments[i].getTDSInstructionID()).length() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    <a href=\"javascript:viewTDSDocument('");
      out.print(rejecteddocuments[i].getTDSInstructionID());
      out.write("')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(Utilities.formatNullString(rejecteddocuments[i].getDocumentTitle()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:viewDocument(");
      out.print(rejecteddocuments[i].getDocumentId());
      out.write(")\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(Utilities.formatNullString(rejecteddocuments[i].getDocumentTitle()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"GROUPACCESS_");
      out.print(rejecteddocuments[i].getDocumentId());
      out.write("\" value=\"-1\" style=\"border: 0px;\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if(alreadySharedGroupAccessList != null && alreadySharedGroupAccessList.contains("-1")){
      out.write("checked");
}
      out.write(">Public\r\n");
      out.write("\t\t\t\t\t\t\t");
if(rejecteddocs_ownergroupdetails!=null){
								GroupUserTypeDO[] groupaccess = rejecteddocs_ownergroupdetails.getGroupUserTypes();
								if(groupaccess != null){
									for(int k=0;k<groupaccess.length;k++){
									String checked = "";
										if(alreadySharedGroupAccessList != null && alreadySharedGroupAccessList.contains(""+groupaccess[k].getGroupUserTypeId()))
											checked = "checked";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"GROUPACCESS_");
      out.print(rejecteddocuments[i].getDocumentId());
      out.write("\" value=\"");
      out.print(groupaccess[k].getGroupUserTypeId());
      out.write("\" style=\"border: 0px;\" ");
      out.print(checked);
      out.write('>');
      out.print(groupaccess[k].getGroupUserType());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
								}	
							}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tN/A\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t");
if(rejecteddocs_documentaccess.isShowallshareddocs()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableText\">");
      out.print(rejecteddocuments[i].getDocumentType());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableText\">");
      out.print(rejecteddocuments[i].getRepository());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"Accept & Display\" onclick=\"updateDocumentStatus(");
      out.print(rejecteddocuments[i].getDocumentId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(Constants.ACCPETED);
      out.write("')\" class=\"buttonStyle\" style=\"width: 115px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"Remove From List\" onclick=\"updateDocumentStatus(");
      out.print(rejecteddocuments[i].getDocumentId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(Constants.INACTIVE);
      out.write("')\" class=\"buttonStyle\" style=\"width: 115px;\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t");
}else{
      out.write("\t\r\n");
      out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"msg\">\r\n");
      out.write("\t\t\t\t\tRejected documents: Nil\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("\t\t \t\t\t<tr>\r\n");
      out.write("\t\t \t\t\t\t<td class=\"msg\">\r\n");
      out.write("\t\t \t\t\t\t\tNo document(s) found for the given search criteria.\r\n");
      out.write("\t\t \t\t\t\t</td>\r\n");
      out.write("\t\t \t\t\t</tr>\t\r\n");
      out.write("\t\t \t\t</table>\r\n");
      out.write("\t\t");
}
	}
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"status\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"documentid\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"RepositoryId\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"DocumentTypeId\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"Filename\" value=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"DocId\" value=\"\">\r\n");
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
