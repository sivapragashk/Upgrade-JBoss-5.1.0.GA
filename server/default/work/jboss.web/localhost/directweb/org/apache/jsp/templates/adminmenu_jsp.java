package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.constants.Constants;
import com.hd.ldap.User;
import java.util.Map;

public final class adminmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
Map<String, Object> lcl_sessionValuesMap = (Map) session.getAttribute(Constants.SESSION_VALUES);
if(lcl_sessionValuesMap.get(Constants.LOGGED_IN_USER) != null){
	if(Integer.valueOf(lcl_sessionValuesMap.get(Constants.USER_TYPE).toString()) <= Constants.ADMINISTRATOR){
		User user = (User) lcl_sessionValuesMap.get(Constants.LOGGED_IN_USER);
      out.write("\r\n");
      out.write("\t\t<a href=\"#\" class=\"menuitem submenuheader\">ADMINISTRATION</a>\r\n");
      out.write("\t\t<div class=\"submenu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:manageUserDetails('");
      out.print(user.getUserid());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(Constants.APPLICATION_ID_DIRECTWEB);
      out.write("', '");
      out.print(request.getServerName());
      out.write("')\"> - Manage Users</a> </li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:loadAdministration()\"> - Site Design</a> </li>\r\n");
      out.write("\t\t\t\t<li>");
if(session.getAttribute(Constants.ENABLE_EDIT_MODE) == null){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:setmode(1)\" target=\"_self\"> - Enable Edit Mode</a>\r\n");
      out.write("\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:setmode(0)\" target=\"_self\"> - Disable Edit Mode</a>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
}
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
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
