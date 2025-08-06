package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.helper.TemplateParamReference;
import com.hd.directweb.service.constants.TemplateConstants;
import com.hd.directweb.db.Menu;
import com.hd.directweb.db.SubMenu;
import com.hd.directweb.db.base.BaseMenuDAO;
import com.hd.directweb.db.base.BaseSubMenuDAO;

public final class breadCrumb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
TemplateParamReference templateParam = null;
String menuName = null;
String subMenuName = null;
Menu menu = null;
SubMenu subMenu = null;
if(request.getAttribute(TemplateConstants.BREAD_CRUMB_FLAG) != null){
String breadCrumbFlag = (String)request.getAttribute(TemplateConstants.BREAD_CRUMB_FLAG);
if(request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE) != null && breadCrumbFlag.equals(TemplateConstants.BREAD_CRUMB_ENABLED)){
	templateParam = (TemplateParamReference)request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE);
if(templateParam != null){
	if(templateParam.getMenuId() != 0){
		menu = BaseMenuDAO.getInstance().get(templateParam.getMenuId());
		menuName = menu.getMenuName();
	}
	if(menu != null && templateParam.getSubMenuId() != 0){
		subMenu = BaseSubMenuDAO.getInstance().get(templateParam.getSubMenuId());
		subMenuName = subMenu.getSubMenuName();
}
}
}
}
if(menuName != null){
      out.write("\r\n");
      out.write("\t<div id=\"breadCrumb_menu_link\">\r\n");
      out.write("\t<a onclick=\"javascript:loadTemplate('");
      out.print(templateParam.getMenuId());
      out.write("', '0', '");
      out.print(menu.getTemplateId());
      out.write("', '0')\"> ");
      out.print(menuName );
      out.write("</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
}
if(menuName != null && subMenuName != null){
      out.write("\r\n");
      out.write("\t<div id=\"breadCrumb_submenu_link\">\r\n");
      out.write("\t<a onclick=\"javascript:loadTemplate('");
      out.print(templateParam.getMenuId());
      out.write("', '");
      out.print(templateParam.getSubMenuId());
      out.write("', '");
      out.print(subMenu.getTemplateId());
      out.write("', '0')\"> > ");
      out.print(subMenuName );
      out.write("</a>\r\n");
      out.write("\t</div>\r\n");
}
      out.write("\r\n");
      out.write("<title>");
if(menuName!=null)out.println(menuName);if(subMenuName!=null)out.println(" - "+subMenuName); 
      out.write("</title>");
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
