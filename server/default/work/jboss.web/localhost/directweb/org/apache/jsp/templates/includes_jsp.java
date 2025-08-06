package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.constants.Constants;

public final class includes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(Constants.CONTEXT_PATH);
      out.print(request.getParameter("globalcss"));
      out.write("\" media=\"screen, projection\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(Constants.CONTEXT_PATH);
      out.print(request.getParameter("templatecss"));
      out.write("\" media=\"screen, projection\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(Constants.CONTEXT_PATH);
      out.write("javascript/templates/common/admin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(Constants.CONTEXT_PATH);
      out.write("javascript/jquery-1.3.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(Constants.CONTEXT_PATH);
      out.write("javascript/templates/templates.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(Constants.CONTEXT_PATH);
      out.write("javascript/templates/common/admin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(Constants.CONTEXT_PATH);
      out.write("javascript/templates/common/ddaccordion.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(Constants.CONTEXT_PATH);
      out.write("javascript/templates/common/menu.js\"></script>");
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
