package org.apache.jsp.templates.usrhr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Map;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.constants.TemplateConstants;
import com.hd.directweb.search.utils.SearchConstants;
import com.hd.directweb.service.TextUtils;

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
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<h1><a href=\"#\">Hunter Douglas Corporate HR</a></h1>\t\r\n");
      out.write("\t<div id=\"search\">\r\n");
      out.write("\t\t<div id=\"left_search\">\r\n");
      out.write("\t\t\t<label>Search</label>\r\n");
      out.write("\t\t\t\t");
String query = TextUtils.getValue(session.getAttribute(Constants.QUERY_STRING)); 
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"query\" name=\"query\" class=\"text\" value=\"");
      out.print(query);
      out.write("\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"submit\" class=\"go\" value=\"go\" onclick=\"validateSearch()\" />\r\n");
      out.write("\t\t<div id=\"right_search\">\r\n");
      out.write("\t\t\t");
String searchtype = TextUtils.getValue(session.getAttribute(SearchConstants.SEARCH_TYPE));
			String checked = "";
				if(searchtype.equals(SearchConstants.SEARCH_DIRECTWEB)){
					checked = "checked";
			}
      out.write("\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"");
      out.print(SearchConstants.SEARCH_TYPE);
      out.write("\" id=\"documentSearchID\" value=\"");
      out.print(SearchConstants.SEARCH_DOCUMENT);
      out.write("\" style=\"border-width: 0px;\" checked ><label for=\"documents\">Documents</label><br />\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"");
      out.print(SearchConstants.SEARCH_TYPE);
      out.write("\" id=\"contentSearchID\" value=\"");
      out.print(SearchConstants.SEARCH_DIRECTWEB);
      out.write("\" style=\"border-width: 0px;\" ");
      out.print(checked);
      out.write(" ><label for=\"directweb\">DirectWeb</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/switchGroup.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li><a href=\"\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:loadTemplate('0','0','");
      out.print(TemplateConstants.SITE_MAP_ID);
      out.write("','0')\" target=\"_self\">Site Map</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("</div>\r\n");
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
