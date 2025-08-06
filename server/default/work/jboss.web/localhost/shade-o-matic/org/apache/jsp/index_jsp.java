package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.som.model.Template;
import com.hd.som.utils.TextUtils;
import com.hd.som.utils.Constants;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/includes/header.jsp");
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String editmode = "false";
if(session.getAttribute(Constants.APPLICATION_MODE) != null){
	editmode = String.valueOf(session.getAttribute(Constants.APPLICATION_MODE));
}
String templatename = new String();
if(request.getAttribute(Constants.TEMPLATE) != null){
	Template template = (Template) request.getAttribute(Constants.TEMPLATE);
	if(template != null && template.getFilename() != null && template.getFilename().length() > 0){
		templatename = template.getFilename();
	}
}

      out.write("\r\n");
      out.write("<html lang=\"en-US\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz' >\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"/shade-o-matic/stylesheets/style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"/shade-o-matic/stylesheets/jkmegamenu.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"/shade-o-matic/stylesheets/");
      out.print(templatename);
      out.write(".css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/shade-o-matic/js/jquery-1.4.2.min.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/shade-o-matic/js/jkmegamenu.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/shade-o-matic/js/shade-o-matic.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"admin\", \"adminsm\", \"click\")\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"company\", \"megamenus\", \"click\")\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"news\", \"megamenus1\", \"click\")\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"reward\", \"megamenu1\", \"click\")\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"products\", \"productssm\", \"click\")\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"support\", \"megamenu2\", \"click\")\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"mediacenter\", \"mediacentersm\", \"click\")\r\n");
      out.write("\t\tjkmegamenu.definemenu(\"epic\", \"epicsm\", \"click\")\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"somform\" action=\"\" id=\"somform\" method=\"post\">\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t");
      out.write("<div id=\"header\" align=\"center\">\r\n");
      out.write("    <div id=\"logo30year\">\r\n");
      out.write("\t\t<img src=\"/shade-o-matic/images/30-year-logo.png\" border=\"0\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<a href=\"#\"><img src=\"/shade-o-matic/images/ShadeomaticHomeLogo.png\" border=\"0\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"epicLogin\">\r\n");
      out.write("\t\t<a href=\"#\"><img src=\"/shade-o-matic/images/ShadeomaticEpic.jpg\" border=\"0\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/menu.jsp" + (("includes/menu.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("editmode", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(editmode), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/templates.jsp" + (("templates/templates.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("editmode", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(editmode), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("template", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(templatename), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.CONTROLLER_ACTION);
      out.write("\" id=\"");
      out.print(Constants.CONTROLLER_ACTION);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.MENU_ID);
      out.write("\" id=\"");
      out.print(Constants.MENU_ID);
      out.write("\" value=\"");
      out.print(TextUtils.getText(request.getAttribute(Constants.MENU_ID)));
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.SUBMENU_ID);
      out.write("\" id=\"");
      out.print(Constants.SUBMENU_ID);
      out.write("\" value=\"");
      out.print(TextUtils.getText(request.getAttribute(Constants.SUBMENU_ID)));
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.SECTION_ID);
      out.write("\" id=\"");
      out.print(Constants.SECTION_ID);
      out.write("\" value=\"");
      out.print(TextUtils.getText(request.getAttribute(Constants.SECTION_ID)));
      out.write("\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
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
