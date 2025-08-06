package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.repository.*;
import com.hd.docrepository.documenttypes.*;
import com.hd.docrepository.documents.*;
import com.hd.docrepository.utils.*;
import com.hd.docrepository.login.*;

public final class displaydocuments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tfunction toggleblocks (postid) { \r\n");
      out.write("\t\tvar whichpost = document.getElementById(postid); \r\n");
      out.write("\t\tvar imgId = \"img_\"+postid;\r\n");
      out.write("\t\tif (whichpost.className==\"expand\") { \r\n");
      out.write("\t\t\twhichpost.className=\"collapse\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    var imgSrc = document.getElementById(imgId);\r\n");
      out.write("\t\t\timgSrc.src = \"../docrepository/images/close.gif\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\telse { \r\n");
      out.write("\t\t\twhichpost.className=\"expand\"; \r\n");
      out.write("\t\t\tvar imgSrc     = document.getElementById(imgId);\r\n");
      out.write("\t\t\timgSrc.src = \"../docrepository/images/open.gif\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t} \r\n");
      out.write("\t} \r\n");
      out.write("\tfunction viewDocument(documentid)\r\n");
      out.write("\t{\r\n");
      out.write("\t  \tdocument.documentdisplayform.DocId.value = documentid;\r\n");
      out.write("\t  \tdocument.documentdisplayform.target='_blank';\r\n");
      out.write("\t  \tdocument.documentdisplayform.Action.value='ViewDocument';\r\n");
      out.write("\t\tdocument.documentdisplayform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction viewTDSDocument(documentid)\r\n");
      out.write("\t{\r\n");
      out.write("\t  \tdocument.documentdisplayform.DocId.value = documentid;\r\n");
      out.write("\t  \tdocument.documentdisplayform.target='_blank';\r\n");
      out.write("\t  \tdocument.documentdisplayform.Action.value='ViewTDSDocument';\r\n");
      out.write("\t\tdocument.documentdisplayform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\t\r\n");
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
      out.write("\t<form name=\"documentdisplayform\" action=\"documentdisplay\" method=\"post\" style=\"width: 720pt;\">\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
if(request.getAttribute(Constants.DOCUMENT_LIST)!= null){
		RepositoryDO repository = (RepositoryDO)request.getAttribute(Constants.DOCUMENT_LIST);
		DocumentTypeDO[] documenttypes = repository.getDocumenttypes();
		if(repository != null){
      out.write("\r\n");
      out.write("\t\t\t<table width=\"95%\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tr><td width=\"3%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td><span id=\"heading\"><b>");
      out.print(repository.getRepositoryName());
      out.write("</b></span><br><br>\r\n");
      out.write("\t\t\t\t\t\t");
if(documenttypes != null && documenttypes.length > 0){
							for(int i=0;i<documenttypes.length;i++){
								DocumentDO[] documents = documenttypes[i].getDocuments();
								if(documents != null && documents.length >0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=hd-banner> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:toggleblocks('");
      out.print(i);
      out.write("');\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img id=\"img_");
      out.print(i);
      out.write("\" src=\"../docrepository/images/close.gif\" style=\"border: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<b>");
      out.print(documenttypes[i].getDocumentType());
      out.write("</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"documentList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=");
      out.print(i);
      out.write("  class=\"");
      out.print(repository.getRepositoryDisplayMode());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" cellpadding=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"tableHeaderBackground\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"4%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"textBold\" align=\"center\" width=\"70%\">Filename</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"textBold\" align=\"center\" width=\"19%\">Modified Date</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"7%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
for(int j=0;j<documents.length;j++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(j+1);
      out.write("&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(Utilities.formatNullString(documents[j].getTDSInstructionID()).length() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <a href=\"javascript:viewTDSDocument('");
      out.print(documents[j].getTDSInstructionID());
      out.write("')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(Utilities.formatNullString(documents[j].getDocumentTitle()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:viewDocument(");
      out.print(documents[j].getDocumentId());
      out.write(")\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(Utilities.formatNullString(documents[j].getDocumentTitle()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
String image = Utilities.getImage(documents[j].getFilename());
															if(image.length() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;<img src=\"images/");
      out.print(Utilities.getImage(documents[j].getFilename()));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
															String documentsummary = Utilities.formatNullString(documents[j].getDocumentSummary());
															if(documentsummary.length() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<br><span style=\"font-size: 7.5pt;\">Summary:&nbsp;");
      out.print(Utilities.formatNullString(documents[j].getDocumentSummary()));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(repository.getShowModifiedDate().equals("Y")){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;");
      out.print(Utilities.formatNullString(documents[j].getDateModified()));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"docstatus\" align=\"center\">");
      out.print(Utilities.checkExpiryDate(documents[j].getExpiryDate()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
							}
						}
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\t\t\r\n");
      out.write("\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("\t \t\t\t<tr>\r\n");
      out.write("\t \t\t\t\t<td class=\"msg\">\r\n");
      out.write("\t \t\t\t\t\tNo document(s) available to display.\r\n");
      out.write("\t \t\t\t\t</td>\r\n");
      out.write("\t \t\t\t</tr>\t\r\n");
      out.write("\t \t\t</table>\r\n");
      out.write("\t\t");
}
	}
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
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
