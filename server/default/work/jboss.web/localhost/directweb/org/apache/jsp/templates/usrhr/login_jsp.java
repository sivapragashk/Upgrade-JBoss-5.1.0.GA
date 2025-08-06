package org.apache.jsp.templates.usrhr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../stylesheets/templates/usrhr/global.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../stylesheets/templates/usrhr/login.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../javascript/templates/templates.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
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
      out.write("\t\t\tdocument.getElementById(\"usrhrFrm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\t<!-- <html:form styleId=\"usrhrFrm\" action=\"/login.do\"> -->\r\n");
      out.write("\t<form name=\"usrhrFrm\" method=\"post\" action=\"/DirectWeb/login.do\" id=\"usrhrFrm\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/usrhr/header.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t<div id=\"main_wrapper\">\r\n");
      out.write("\t\t\t<div id=\"main_inner_wrapper\">\r\n");
      out.write("\t\t\t\t<div id=\"login_main\">\r\n");
      out.write("\t\t\t\t\t<div id=\"content-login\">\r\n");
      out.write("\t\t\t\t\t\t<logic:messagesPresent message=\"true\">   \r\n");
      out.write("\t\t\t\t\t\t\t<html:messages id=\"message\" message=\"true\" header=\"error.header\" footer=\"error.footer\">   \r\n");
      out.write("\t\t\t\t\t\t\t\t<bean:write name=\"message\" />   \r\n");
      out.write("\t\t\t\t\t\t\t</html:messages>   \r\n");
      out.write("\t\t\t\t\t\t</logic:messagesPresent> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logincolumn\">Username </div><div id=\"logincolumn\"><input type=\"text\" id=\"username\" name=\"username\" class=\"textbox\" size=\"25\" maxlength=\"20\"/></div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logincolumn\">Password </div><div id=\"logincolumn\"><input type=\"password\" id=\"password\" name=\"password\" class=\"textbox\" size=\"25\" onkeypress=\"return submitForm()\" /></div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logincolumn\">&nbsp;</div><div id=\"logincolumn\" style=\"text-align: left;\"><input type=\"button\" value=\"Login\" onclick=\"javascript:login()\"/> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/usrhr/footer.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"mode\" name=\"mode\" />\r\n");
      out.write("\t</form>\t\r\n");
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
