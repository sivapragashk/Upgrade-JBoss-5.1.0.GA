package org.apache.jsp.templates.fabcs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.search.utils.SearchConstants;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.constants.TemplateConstants;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.db.dao.HeaderDesignAdminDAO;
import com.hd.directweb.db.HeaderDesignAdmin;
import com.hd.directweb.service.SimpleProperty;
import com.hd.directweb.db.base.BaseHeaderDesignAdminDAO;
import java.util.List;
import java.util.Map;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

SimpleProperty property = new SimpleProperty(application.getInitParameter(Constants.PROPERTY_FILE));
String siteMapId = property.getProperty(TemplateConstants.SITE_MAP_REFERENCE);

      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"logout\" style=\"background: #2977AA url(");
      out.print(request.getParameter(Constants.PATH));
      out.print(request.getParameter(Constants.HEADER_DETAILS_2));
      out.write(");background-repeat: repeat-x;\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/switchGroup.jsp" + (("/templates/switchGroup.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("IncludeSpacerImage", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("TRUE", request.getCharacterEncoding()), out, true);
      out.write("\t\r\n");
      out.write("\t\t<a href=\"#\" class=\"log-in-out\" onclick=\"javascript:logout();\">LOGOUT</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"search\">\r\n");
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
      out.write("\" style=\"border-width: 0px;\" checked><label for=\"documentSearchID\">Documents</label><br />\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"");
      out.print(SearchConstants.SEARCH_TYPE);
      out.write("\" id=\"contentSearchID\" value=\"");
      out.print(SearchConstants.SEARCH_DIRECTWEB);
      out.write("\" style=\"border-width: 0px;\"  ");
      out.print(checked);
      out.write("><label for=\"contentSearchID\">DirectWeb</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"left_search\">\r\n");
      out.write("\t\t\t");
String query = TextUtils.getValue(session.getAttribute(Constants.QUERY_STRING)); 
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"query\" name=\"query\" size=\"20\" onkeypress=\"submitSearch()\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" class=\"go\" value=\"go&nbsp;&nbsp;\" onclick=\"validateSearch()\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<ul id=\"nav\">\r\n");
      out.write("\t\t<li><a href=\"/DirectWeb/group.do?mode=goToDefaultHomePage\" target=\"_self\">Home</a></li>\r\n");
      out.write("\t\t<li><img src=\"/DirectWeb/images/templates/fabcs/sep.png\"></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadTemplate('0','0','");
      out.print(siteMapId);
      out.write("','0')\" target=\"_self\">Site Map</a></li> \r\n");
      out.write("\t\t<li><img src=\"/DirectWeb/images/templates/fabcs/sep.png\"></li>\r\n");
      out.write("\t\t<!-- Menu(Enhancements/Suggestions) - SubMenu(Enhancements/Information) - Template(Enhancement Form) -->\r\n");
      out.write("\t\t<li><a href=\"javascript:loadTemplate('72', '138', '110', '0')\">CONTACT US</a></li>\r\n");
      out.write("\t\t<li><img src=\"/DirectWeb/images/templates/fabcs/sep.png\"></li>\r\n");
      out.write("\t\t<li><p>Search:</p></li>\r\n");
      out.write("\t</ul>\r\n");
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
