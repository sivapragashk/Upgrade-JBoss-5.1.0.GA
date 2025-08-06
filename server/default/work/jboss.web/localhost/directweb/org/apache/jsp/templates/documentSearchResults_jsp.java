package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.SimpleProperty;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.search.utils.SearchConstants;
import com.hd.directweb.search.Document;

public final class documentSearchResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String queryString = TextUtils.getValue(session.getAttribute(Constants.QUERY_STRING));
Document[] documents = null;
int selectedPage = 0;
SimpleProperty sp = new SimpleProperty(getServletContext().getInitParameter(Constants.PROPERTY_FILE));
String repositoryURL = sp.getProperty(SearchConstants.DOC_REPO_REPOSITORY_URL);

if(session.getAttribute(SearchConstants.SEARCH_RESULTS)!=null) {
	documents = (Document[]) session.getAttribute(SearchConstants.SEARCH_RESULTS);
}
if(session.getAttribute(SearchConstants.SELECTED_PAGE)!=null) {
	selectedPage = Integer.parseInt(session.getAttribute(SearchConstants.SELECTED_PAGE).toString());
}

if(documents != null && documents.length > 0){
	int totalNoOfRecords = documents.length;
	int totalNoOfSets = totalNoOfRecords / 10;
	if (totalNoOfRecords % 10 > 0){
		totalNoOfSets++;
	}
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t&nbsp;&nbsp;\r\n");
      out.write("\t<table  align=\"center\" style=\"font-family: verdana;\tfont-size: 10px;\">\r\n");
      out.write("\t\t");

		int startIndex = selectedPage * 10;
		int endIndex = startIndex + 10;
		for(int i=startIndex;i<endIndex && i<totalNoOfRecords;i++){
			Document document = documents[i];
			if(document == null || document.getUrl() == null || document.getUrl().length() == 0){
				  	continue;
			}	  	
			if(document.getTitle() == null || document.getTitle().length() == 0){
				document.setTitle(document.getUrl());
			}
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"2%\" style=\"padding-left: 10px;\"><b>");
      out.print((i+1));
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t<td width=\"96%\" valign=\"top\" align=\"left\" style=\"WORD-BREAK:BREAK-ALL;line-height: 13px;\">\r\n");
      out.write("\t\t\t\t\t<b>&nbsp;<a href=\"");
      out.print(document.getUrl());
      out.write("\" target=\"_blank\" >");
      out.print(document.getTitle());
      out.write("</a></b><br>\r\n");
      out.write("\t\t\t\t\t");
if(document.getSummary() != null && document.getSummary().length() > 0)
      out.write("\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(document.getSummary().replaceAll("(?i)"+queryString, "<b>"+queryString+"</b>"));
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;<b>From:</b>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(repositoryURL + document.getRepositoryId());
      out.write("\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(document.getRepository());
      out.write("&nbsp;--&gt;&nbsp;");
      out.print(document.getDocumentType());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"2%\">&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"2%\">&nbsp;</td>\r\n");
      out.write("\t\t\t<td style=\"text-align: right; font-weight: bold;padding-right: 40px;\" >\r\n");
      out.write("\t\t\t\t");
if(selectedPage > 0) {
      out.write("\r\n");
      out.write("                  <a href=\"search.do?mode=browse&action=previous&start=");
      out.print(selectedPage);
      out.write("\">&laquo;Previous</a>&nbsp;\r\n");
      out.write("              \t ");
}
				 for (int i=0; i<totalNoOfSets; i++){
                     if (i == selectedPage){
      out.write("\r\n");
      out.write("                     \t");
      out.print( i + 1 );
      out.write("&nbsp;\r\n");
      out.write("                \t ");
}else{
      out.write("\r\n");
      out.write("                     \t<a href=\"search.do?mode=browse&start=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i+1);
      out.write("</a>&nbsp;\r\n");
      out.write("             \t\t ");
}
                 }
                 if((selectedPage+1) < totalNoOfSets) {
      out.write("\r\n");
      out.write("                  &nbsp;<a href=\"search.do?mode=browse&action=next&start=");
      out.print(selectedPage);
      out.write("\">Next&raquo;</a>\r\n");
      out.write("              ");
 } 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"2%\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
}else{
      out.write("\r\n");
      out.write("\t<table align=\"center\" style=\"font-family: verdana;\tfont-size: 10px;\">\r\n");
      out.write("\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\tNo results found for the given search criteria.\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\t\r\n");
}
      out.write('\r');
      out.write('\n');
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
