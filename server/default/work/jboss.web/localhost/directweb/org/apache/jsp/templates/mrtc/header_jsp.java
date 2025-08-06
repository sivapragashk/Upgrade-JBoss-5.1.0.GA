package org.apache.jsp.templates.mrtc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.search.utils.SearchConstants;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.constants.TemplateConstants;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"header\"></div>\r\n");
      out.write("<div id=\"search\">\r\n");
      out.write("\t<div id=\"multiGroup\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/switchGroup.jsp", out, true);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"separator\"></div>\r\n");
      out.write("\t<div id=\"searchbox\">\r\n");
      out.write("\t\tSEARCH&nbsp;&nbsp;\r\n");
      out.write("\t\t");
String query = TextUtils.getValue(session.getAttribute(Constants.QUERY_STRING)); 
      out.write("\r\n");
      out.write("\t\t<input type=\"text\" id=\"query\" name=\"query\" class=\"text\" value=\"");
      out.print(query);
      out.write("\" onkeypress=\"return submitSearch()\"/>&nbsp;\r\n");
      out.write("\t\t<input type=\"submit\" class=\"go\" value=\"go&nbsp;&nbsp;\" onclick=\"validateSearch()\" />\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(SearchConstants.SEARCH_TYPE);
      out.write("\" id=\"documentSearchID\" value=\"");
      out.print(SearchConstants.SEARCH_DIRECTWEB);
      out.write("\"> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"separator\"></div>\r\n");
      out.write("\t<!-- <div id=\"homeicon\"><a href=\"javascript:loadTemplate('3', '0', '16', '0')\" target=\"_self\">HOME</a></div>  -->\r\n");
      out.write("\t<div id=\"homeicon\"><a href=\"/DirectWeb/group.do?mode=goToDefaultHomePage\" target=\"_self\">HOME</a></div>\r\n");
      out.write("\t<div id=\"separator\"></div>\r\n");
      out.write("\t<div id=\"siteMap\"><a href=\"javascript:loadTemplate('0','0','");
      out.print(TemplateConstants.SITE_MAP_ID);
      out.write("','0')\" target=\"_self\">SITE MAP</a></div>\r\n");
      out.write("</div>");
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
