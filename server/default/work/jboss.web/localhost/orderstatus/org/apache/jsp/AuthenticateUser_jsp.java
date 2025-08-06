package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.orderstatus.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public final class AuthenticateUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
//Redirects the user to the login page, if he try to access this JSP directly.
			if (request.getParameter("username") == null) {
				response.sendRedirect("index.html");
			} else {
				String clientIP = request.getRemoteAddr();
				//String clientIP = request.getHeader("WL-Proxy-Client-IP");
				//System.out.println("Client IP:" + clientIP);
				String sendUrl = "login.jsp";
				//response.setContentType("text/html");
				AdministratorBean adminBean = new AdministratorBean(request
						.getParameter("username"), request
						.getParameter("password"), clientIP);
				try {
					if (adminBean.isUserAvailable(request)) {
						session.setMaxInactiveInterval(1800);
						session.setAttribute("PROFILE", adminBean.getProfile());
						sendUrl = "login_index.jsp?groupid="
								+ adminBean.getgroupID();
					} else {
						sendUrl = sendUrl
								+ "?strMsg=Invalid User name and Password try again..&attempts="
								+ request.getParameter("attempts")
								+ "&username="
								+ request.getParameter("username");
					}
				} catch (Exception ex) {
					sendUrl = sendUrl + "?strMsg=Could not connect to database";
					System.out.println("Exception in Database Access" + ex);
				} finally {
					response.sendRedirect(sendUrl);
				}
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
