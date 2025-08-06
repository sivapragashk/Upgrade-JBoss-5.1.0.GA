package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.release();
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
      out.write("<html> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head> \r\n");
      out.write("\t<title>Hunter Douglas DirectWeb</title> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/DirectWeb/stylesheets/templates/default/global.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<style>\r\n");
      out.write("\t#logincontainer{\r\n");
      out.write("\twidth:400px;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 175px;\r\n");
      out.write("\tmin-height: 400px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#logincolumn{\r\n");
      out.write("\t\twidth:140px;\r\n");
      out.write("\t\ttext-align: right;\r\n");
      out.write("\t\tfont: bold 12/15px verdana;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\tmargin-right: 20px;\r\n");
      out.write("\t\tmargin-top: 15px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.textbox{\r\n");
      out.write("\t\tborder: 1px solid #616366;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
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
      out.write("\t\t\tdocument.getElementById(\"esfrm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head> \r\n");
      out.write("<body  bgcolor=\"#C3C7C8\" topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    // /login.jsp(52,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setStyleId("esfrm");
    // /login.jsp(52,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setAction("login.do");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<div class=\"container\">\r\n");
        out.write("\t<div id=\"main\">\t\t\r\n");
        out.write("\t\t<div id=\"logincontainer\">\r\n");
        out.write("\t\t\t<div id=\"logincolumn\">Username </div><div id=\"logincolumn\"><input type=\"text\" id=\"username\" name=\"username\" class=\"textbox\" size=\"25\" maxlength=\"20\"/></div>\r\n");
        out.write("\t\t\t<div id=\"logincolumn\">Password </div><div id=\"logincolumn\"><input type=\"password\" id=\"password\" name=\"password\" class=\"textbox\" size=\"25\" onkeypress=\"return submitForm()\" /></div>\r\n");
        out.write("\t\t\t<div id=\"logincolumn\">&nbsp;</div><div id=\"logincolumn\" style=\"text-align: left;\"><input type=\"button\" value=\"Login\" onclick=\"javascript:login()\"/> </div>\r\n");
        out.write("\t\t</div>\r\n");
        out.write(" \t</div>\r\n");
        out.write(" \t <input type=\"hidden\" name=\"mode\" id=\"mode\"/>\r\n");
        out.write(" </div>\t\r\n");
        out.write("\r\n");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }
}
