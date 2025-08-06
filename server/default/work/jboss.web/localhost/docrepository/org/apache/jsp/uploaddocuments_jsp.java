package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.groups.*;
import com.hd.docrepository.repository.*;
import com.hd.docrepository.documenttypes.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.login.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.groups.*;
import java.util.*;

public final class uploaddocuments_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/message.jsp");
    _jspx_dependants.add("/sharedgroups.jsp");
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
      out.write("<script type=\"text/JavaScript\" src=\"javascript/docrepo.js\"></script>\r\n");
      out.write("<script type=\"text/JavaScript\" src=\"javascript/document.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/date-picker.js\"></script>\r\n");
      out.write("<script type=\"text/JavaScript\">\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

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
      out.write("\t <table border=\"0\" cellpadding=\"3\" cellspacing=\"5\" width=\"75%\">\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td align=\"left\">\r\n");
      out.write("\t\t \t\t <p><span class=\"required\">* - Required fields.</span></p>\r\n");
      out.write("\t\t \t</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>\r\n");
      out.write("\t\t\t\t<form name=\"documentform\" action=\"document\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t <table border=\"0\" cellpadding=\"2\" cellspacing=\"3\" id=\"tablenobackground\" width=\"90%\">\r\n");
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
      out.write("\t\t\t\t\t \t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t \t<td>\r\n");
      out.write("\t\t\t\t\t\t \t<a href=\"javascript:submitdocumentform('");
      out.print(Constants.MODIFY_DELETE_DOCUMENTS);
      out.write("')\">Modify/Delete Documents</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t \t<a href=\"javascript:sortDocuments()\">Sort Documents</a>\r\n");
      out.write("\t\t\t\t\t\t </td>\t\r\n");
      out.write("\t\t\t\t\t</tr>\t \r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" width=\"20%\" class=\"textBold\">Owner</td>\r\n");
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
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Repository</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"repositoryid\" name=\"repositoryid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(repositories != null && repositories.length > 0){
									if(repositories.length > 1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a repository</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
									for(int i=0;i<repositories.length;i++){
										String selected = "";
										if(repositories[i].getRepositoryId() == repositoryid)
											selected = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(repositories[i].getRepositoryId());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(repositories[i].getRepositoryName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
								 }else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t \t<option value=\"0\">Select a repository</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Document Types</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"documenttypeid\" name=\"documenttypeid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(documenttypes != null && documenttypes.length > 0){
									if(documenttypes.length > 1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a document type</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
									for(int i=0;i<documenttypes.length;i++){
										String selected = "";
										if(documenttypes[i].getDocumentTypeId() == doctypeid)
											selected = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(documenttypes[i].getDocumentTypeId());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(documenttypes[i].getDocumentType());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
								 }else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t \t<option value=\"0\">Select a document type</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Name</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"documenttitle\" name=\"documenttitle\" value=\"\" size=\"40\" maxlength=\"50\"/>&nbsp;<span class=\"required\">*</span>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Document</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"file\" id=\"document\" name=\"document\">\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Document Summary</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><textarea id=\"documentsummary\" name=\"documentsummary\" cols=\"50\" rows=\"5\" onkeypress=\"return textCounter(this,500, 'Document Summary')\"></textarea>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Expiry Date</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"expirydate\" name=\"expirydate\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<A href=\"javascript:show_calendar('documentform.expirydate');\"><IMG alt=\"Calendar\" src=\"images/calendar.gif\" style=\"border:0px solid\"></A>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Include In Weekly Updates?</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"checkbox\" id=\"sendnotifications\" name=\"sendnotifications\" value=\"Y\" style=\"border: none;\" /></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\" class=\"textBold\">Access Rights</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"border-color: #0065A4; border-style: solid; border-width: 1px; width: 500px; height: 100px; overflow: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");

GroupDO[] groupsandgroupaccess = null;
GroupDO ownergroupdetails = null;
List<String> docowneradmingrouplist = null;
if(request.getAttribute(Constants.GROUP_GROUPACCESS_LIST) != null)
	groupsandgroupaccess = (GroupDO[])request.getAttribute(Constants.GROUP_GROUPACCESS_LIST);
if(request.getAttribute(Constants.OWNER_GROUP_AND_GROUP_ACCESS) != null)
	ownergroupdetails = (GroupDO)request.getAttribute(Constants.OWNER_GROUP_AND_GROUP_ACCESS);
if(request.getAttribute(Constants.DOC_OWNER_ADMIN_GROUP_LIST) != null)
	docowneradmingrouplist = (ArrayList)request.getAttribute(Constants.DOC_OWNER_ADMIN_GROUP_LIST);
List<String> alreadySharedGroupList = null;
List<String> alreadySharedGroupAccessList = null;
List<String> alreadyOwnedGroupAccessList = null;
if(request.getAttribute(Constants.ALREADY_SHARED_GROUP_LIST) != null)
	alreadySharedGroupList = (ArrayList)request.getAttribute(Constants.ALREADY_SHARED_GROUP_LIST);
if(request.getAttribute(Constants.ALREADY_OWNED_GROUP_ACCESS_LIST) != null)
	alreadyOwnedGroupAccessList = (ArrayList)request.getAttribute(Constants.ALREADY_OWNED_GROUP_ACCESS_LIST);



      out.write("\r\n");
      out.write("\r\n");
      out.write("<table cellpadding=\"1\" cellspacing=\"1\" id=\"sharedgroupsection\">\r\n");
      out.write("\t<tr valign=\"top\">\r\n");
      out.write("\t");
if(ownergroupdetails != null){
      out.write("\r\n");
      out.write("\t\t");
GroupUserTypeDO[] groupaccess = ownergroupdetails.getGroupUserTypes();
      out.write("\r\n");
      out.write("\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr valign=\"top\"  style=\"border-bottom: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\" valign=\"top\"  style=\"border-bottom: 1px solid #0065A4;border-right: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"padding-top: 7px;\" ><b>&nbsp;");
      out.print(ownergroupdetails.getGroupName());
      out.write("&nbsp;</b></p>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\" valign=\"top\" style=\"border-right: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"OWNEDGROUPACCESS\" value=\"-1\" style=\"border: 0px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(alreadyOwnedGroupAccessList != null && alreadyOwnedGroupAccessList.contains("-1")){
      out.write("checked");
}
      out.write(">Public&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
if(groupaccess!=null && groupaccess.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
for(int k=0;k<groupaccess.length;k++){
							String access = "";
								if(alreadyOwnedGroupAccessList != null && alreadyOwnedGroupAccessList.contains(""+groupaccess[k].getGroupUserTypeId()))
									access = "checked";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableText\" valign=\"top\" style=\"border-right: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"OWNEDGROUPACCESS\" value=\"");
      out.print(groupaccess[k].getGroupUserTypeId());
      out.write("\" style=\"border: 0px;\" ");
      out.print(access);
      out.write('>');
      out.print(groupaccess[k].getGroupUserType());
      out.write("&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t");
}
	if(groupsandgroupaccess != null && groupsandgroupaccess.length > 0){
      out.write("\r\n");
      out.write("\t\t");
for(int j=0;j<groupsandgroupaccess.length;j++){
			alreadySharedGroupAccessList = groupsandgroupaccess[j].getAlreadySharedGroupAccessList();
			GroupUserTypeDO[] groupaccess = groupsandgroupaccess[j].getGroupUserTypes();
      out.write("\r\n");
      out.write("\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr valign=\"top\"  style=\"border-bottom: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tableText\" valign=\"top\"  style=\"border-bottom: 1px solid #0065A4;border-right: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t");
String checked = "";
						  if(alreadySharedGroupList != null && alreadySharedGroupList.contains(""+groupsandgroupaccess[j].getGroupId()))
							checked = "checked"; 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<b><input type=\"checkbox\" name=\"SHAREDGROUPS\" style=\"border: 0px; margin: 0 0 0 0; \" value=\"");
      out.print(groupsandgroupaccess[j].getGroupId());
      out.write('"');
      out.write(' ');
      out.print(checked);
      out.write('>');
      out.print(groupsandgroupaccess[j].getGroupName());
      out.write("&nbsp;</b>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
if(docowneradmingrouplist!=null && docowneradmingrouplist.contains(""+groupsandgroupaccess[j].getGroupId())){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableText\" valign=\"top\" style=\"border-right: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"SHAREDGROUPACCESS\" value=\"-1\" style=\"border: 0px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(alreadySharedGroupAccessList != null && alreadySharedGroupAccessList.contains(groupsandgroupaccess[j].getGroupId() + "-1")){
      out.write("checked");
}
      out.write(">Public&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}
					if(groupaccess!=null && groupaccess.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
for(int k=0;k<groupaccess.length;k++){
						String access = "";
						if(alreadySharedGroupAccessList != null && alreadySharedGroupAccessList.contains(""+groupaccess[k].getGroupUserTypeId()))
							access = "checked";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"tableText\" valign=\"top\" style=\"border-right: 1px solid #0065A4;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"SHAREDGROUPACCESS\" value=\"");
      out.print(groupaccess[k].getGroupUserTypeId());
      out.write("\" style=\"border: 0px;\" ");
      out.print(access);
      out.write('>');
      out.print(groupaccess[k].getGroupUserType());
      out.write("&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t");
}
		}
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" id=\"savechanges\" value=\"Save Changes\" class=\"buttonStyle\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"documentid\" value=\"0\">\r\n");
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
