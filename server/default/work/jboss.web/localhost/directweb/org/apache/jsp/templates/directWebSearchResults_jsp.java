package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.VO.DirectWebSearchResult;
import com.hd.directweb.db.base.BaseContentDAO;
import com.hd.directweb.db.SubMenu;
import com.hd.directweb.db.Menu;
import com.hd.directweb.service.serviceImpl.SubMenuServiceImpl;
import com.hd.directweb.service.serviceImpl.MenuServiceImpl;
import com.hd.directweb.db.base.BaseGroupDAO;
import com.hd.directweb.db.Group;
import java.util.Map;
import java.util.Iterator;
import com.hd.directweb.db.ContentReference;
import java.util.Set;
import com.hd.directweb.db.Content;
import java.util.List;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.search.utils.SearchConstants;

public final class directWebSearchResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String queryString = TextUtils.getValue(session.getAttribute(Constants.QUERY_STRING));
DirectWebSearchResult[] searchResult = null;
int selectedPage = 0;
Map<Integer, Menu> menus = MenuServiceImpl.getMenuServiceInstance().getMenus();
Map<Integer, SubMenu> subMenus = SubMenuServiceImpl.getServiceInstance().getSubMenus(); 
if(session.getAttribute(SearchConstants.SEARCH_RESULTS)!=null) {
	searchResult = (DirectWebSearchResult[]) session.getAttribute(SearchConstants.SEARCH_RESULTS);
}
if(session.getAttribute(SearchConstants.SELECTED_PAGE)!=null) {
	selectedPage = Integer.parseInt(session.getAttribute(SearchConstants.SELECTED_PAGE).toString());
}
if(searchResult != null && searchResult.length > 0){
	int totalNoOfRecords = searchResult.length;
	int totalNoOfSets = totalNoOfRecords / 10;
	if (totalNoOfRecords % 10 > 0){
		totalNoOfSets++;
	}
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t&nbsp;&nbsp;\r\n");
      out.write("\t<table align=\"center\" style=\"font-family: verdana;\tfont-size: 10px;\">\r\n");
      out.write("\t\t");
int startIndex = selectedPage * 10;
		int endIndex = startIndex + 10;
		for(int i=startIndex;i<endIndex && i<totalNoOfRecords;i++){
			DirectWebSearchResult directWebSearchResult = searchResult[i];
      out.write("\r\n");
      out.write("\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t<td width=\"2%\" style=\"padding-left: 10px;\"><b>");
      out.print((i+1));
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t<td width=\"96%\" valign=\"top\" align=\"left\" style=\"WORD-BREAK:BREAK-ALL;line-height: 13px; padding-left: 7px;\">\r\n");
      out.write("\t\t\t\t<b><a href=\"javascript:loadTemplate('");
      out.print(directWebSearchResult.getMenuId());
      out.write("', '");
      out.print(directWebSearchResult.getSubMenuId());
      out.write("', '");
      out.print(directWebSearchResult.getTemplateId());
      out.write("', '0')\" >\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(directWebSearchResult.getMenu());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if(directWebSearchResult.getSubMenuId() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&raquo;&nbsp;");
      out.print(directWebSearchResult.getSubMenu());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</b><br>\r\n");
      out.write("\t\t\t\t");
      out.print(TextUtils.getValue(directWebSearchResult.getContent()).replaceAll("(?i)"+queryString, "<b>"+queryString+"</b>"));
      out.write("<br/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"2%\">&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
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
