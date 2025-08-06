package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- DATE     : 07/20/02   -->\r\n");
      out.write("<!-- AUTHOR   : Nirmala .K -->\r\n");
      out.write("<!-- PURPOSE  : Order Status - Home Page  -->\r\n");
      out.write("<!-- COMPANY  : GAVS Information Services Pvt Ltd, India  -->\r\n");
      out.write("<!-- MODIFIED :   -->\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Order Status - Home</TITLE>\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("function logoutUser() {\r\n");
      out.write("   document.location.href=\"logout.jsp\";\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("</HEAD>\r\n");
      out.write("\t<FRAMESET rows=\"5%,*\" border=0 frameSpacing=0 frameborder=\"0\">\r\n");
      out.write("            <FRAME name=main_left  scrolling=no src=\"menu.jsp?groupid=");
      out.print(request.getParameter("groupid"));
      out.write("\" target=\"main_right\">\r\n");
      out.write("            <FRAME name=main_right src=\"searchorders.jsp\">\r\n");
      out.write("\t</FRAMESET>\r\n");
      out.write("</HTML>\r\n");
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
