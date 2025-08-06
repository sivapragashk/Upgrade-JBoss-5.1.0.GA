package org.apache.jsp.templates.mrtc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.constants.Constants;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

public static final int MRTC_PRODUCTION_GROUP_ID = 304;
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Marketing Resource and Training Center</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../stylesheets/templates/mrtc/global.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../stylesheets/templates/mrtc/home.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../stylesheets/templates/mrtc/login.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../javascript/templates/templates.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction submitForm() {\r\n");
      out.write("\t\t  if (window.event && window.event.keyCode == 13)\r\n");
      out.write("\t\t    login()\r\n");
      out.write("\t\t  else\r\n");
      out.write("\t\t    return true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction login(){\r\n");
      out.write("\t\t\tif(document.getElementById(\"username\").value == ''){\r\n");
      out.write("\t\t\t\talert('Please enter Username');\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}else if(document.getElementById(\"password\").value == ''){\r\n");
      out.write("\t\t\t\talert('Please enter Password');\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.getElementById(\"mode\").value='login';\r\n");
      out.write("\t\t\tdocument.getElementById(\"mrtcForm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write(' ');
      out.write('\r');
      out.write('\n');
session.setAttribute(Constants.GROUP_ID, MRTC_PRODUCTION_GROUP_ID); 
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"mrtcForm\" method=\"post\" action=\"/DirectWeb/login.do\" id=\"mrtcForm\">\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<div id=\"login\">\r\n");
      out.write("\t\t\t\t<div id=\"loginbox\">\r\n");
      out.write("\t\t\t\t\t<div>Username: <input type=\"text\" name=\"username\" id=\"username\" class=\"text\" /></div>\r\n");
      out.write("\t\t\t\t\t<div>Password: &nbsp;<input type=\"password\" name=\"password\" id=\"password\" class=\"text\" /></div>\r\n");
      out.write("\t\t\t\t\t<div><input type=\"button\" value=\"Login\" onclick=\"javascript:login()\"/></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"mode\" id=\"mode\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
