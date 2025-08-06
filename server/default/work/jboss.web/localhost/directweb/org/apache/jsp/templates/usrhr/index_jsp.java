package org.apache.jsp.templates.usrhr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.constants.TemplateConstants;
import java.util.Map;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.db.SharedSubMenu;
import com.hd.directweb.db.dao.SharedSubMenuDAO;
import com.hd.directweb.db.SubMenu;
import java.util.Iterator;
import java.util.Set;
import com.hd.directweb.db.Menu;
import com.hd.directweb.service.constants.TemplateConstants;
import com.hd.directweb.service.RememberCookie;
import com.hd.directweb.service.constants.Constants;
import com.hd.ldap.User;
import java.util.Map;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/templates/usrhr/menu.jsp");
    _jspx_dependants.add("/templates/adminmenu.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--  -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\r\n");
      out.write("\t<div id=\"main_wrapper\">\r\n");
      out.write("\t\t<div id=\"main_inner_wrapper\">\r\n");
      out.write("\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div id=\"sidebar_top\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Welcome to USR HR</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"sidebar_middle\">\r\n");
      out.write("\t\t\t\t\t\t");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write(" \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/templates/usrhr/usrhr_menu.css\" media=\"screen, projection\" /> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/templates/common/ddaccordion.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/templates/common/menu.js\"></script>\r\n");

	String cookieUserName = "";
	String cookiePassword = "";		  							
	String cookieName = null;
	Cookie cookie[] = request.getCookies();
	if(cookie !=null && cookie.length > 0) {
		for(int i=0;i<cookie.length;i++) {
			cookieName = cookie[i].getName();
	        if(cookieName.equals("cookieUserName")) {
	        	cookieUserName = cookie[i].getValue();
	        }
	        if(cookieName.equals("cookiePassword")) {
	        	cookiePassword = cookie[i].getValue();
	        }		  							      	
		}
	}					

      out.write("\r\n");
      out.write("\r\n");

Set<Menu> menusBasedOnGroup = null;
Set<Menu> sharedMenusBasedOnGroup = null;
if(request.getAttribute(TemplateConstants.MENUS_BASED_ON_GROUP) != null) {
	menusBasedOnGroup = (Set<Menu>) request.getAttribute(TemplateConstants.MENUS_BASED_ON_GROUP);
}
if(request.getAttribute(TemplateConstants.SHARED_MENUS_BASED_ON_GROUP) != null) {
	sharedMenusBasedOnGroup = (Set<Menu>) request.getAttribute(TemplateConstants.SHARED_MENUS_BASED_ON_GROUP);
}

      out.write("\r\n");
      out.write("<div class=\"glossymenu\">\r\n");
      out.write("\r\n");
if(session.getAttribute(Constants.PUBLIC_CONTENT_FLAG) != null){
      out.write("\r\n");
      out.write("\t<div id=\"content-login\">\r\n");
      out.write("\t\tUsername:<input type=\"text\" id=\"username\" name=\"username\" value=\"");
      out.print(cookieUserName );
      out.write("\" size=\"20\" tabindex=\"1\" maxlength=\"20\">\r\n");
      out.write("\t\tPassword:<input type=\"password\" id=\"password\" name=\"password\" value=\"");
      out.print(cookiePassword );
      out.write("\" size=\"20\" tabindex=\"2\" onkeypress=\"return submitForm()\">\r\n");
      out.write("\t\t<img border=\"0\" src=\"images/templates/usrhr/login.gif\" width=\"45\" height=\"17\" style=\"cursor: pointer;\" onclick=\"javascript:login()\">\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"rememberme\" ");
if(cookieUserName != null && cookieUserName != "" && cookiePassword != null && cookiePassword != ""){
      out.write(" checked = \"checked\"");
} 
      out.write(">&nbsp;Remember me<br/>\r\n");
      out.write("\t\t<a href=\"javascript:newUserRegistration()\" class=\"welcomeText\">New User? Register Here</a><br/> \r\n");
      out.write("\t\t<a href=\"javascript:forgotPassword()\" class=\"welcomeText\">Forgot Password?</a> <br/>\r\n");
      out.write("\t</div>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
Map<String, Object> sessionValuesMap = (Map) session.getAttribute(Constants.SESSION_VALUES);
if(sessionValuesMap.get(Constants.LOGGED_IN_USER) != null){
	if(Integer.valueOf(sessionValuesMap.get(Constants.USER_TYPE).toString()) <= Constants.ADMINISTRATOR){
		User user = (User) sessionValuesMap.get(Constants.LOGGED_IN_USER);
      out.write("\r\n");
      out.write("\t\t<a class=\"menuitem submenuheader\">ADMINISTRATION</a>\r\n");
      out.write("\t\t<div class=\"submenu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a onclick=\"javascript:manageUserDetails('");
      out.print(user.getUserid());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(Constants.APPLICATION_ID_DIRECTWEB);
      out.write("', '");
      out.print(request.getServerName());
      out.write("')\"> - Manage Users</a> </li>\r\n");
      out.write("\t\t\t\t<li><a onclick=\"javascript:loadAdministration()\"> - Site Design</a> </li>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
if(menusBasedOnGroup != null && menusBasedOnGroup.size() > 0) {
	Iterator<Menu> menuItr = menusBasedOnGroup.iterator();
	while(menuItr.hasNext()){
		String menustatus = "submenuheader";
		Menu menuObj = (Menu) menuItr.next();
		if(menuObj != null && menuObj.getMenuName().length() > 0){ 
			//Set<SubMenu> subMenu = menuObj.getSubMenus(); 
			Set<SubMenu> subMenu = menuObj.getFilteredSubMenus();
      out.write("\r\n");
      out.write("\t\t");
if(subMenu != null && subMenu.size() > 0) {
		  Iterator<SubMenu> subMenuItr = subMenu.iterator();
      out.write("\r\n");
      out.write("\t\t  <a class=\"menuitem ");
      out.print(menustatus);
      out.write("\" onclick=\"javascript:loadTemplate('");
      out.print(menuObj.getMenuId() );
      out.write("', '0', '");
      out.print(menuObj.getTemplateId());
      out.write("', '0')\">");
      out.print(menuObj.getMenuName());
      out.write("</a>\r\n");
      out.write("\t  \t\t<div class=\"submenu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t  ");
while(subMenuItr.hasNext()){
					SubMenu subMenuObj = (SubMenu) subMenuItr.next(); 
					  	if(subMenuObj != null && subMenuObj.getSubMenuName() != null &&subMenuObj.getSubMenuName().length() > 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a onclick=\"javascript:loadTemplate('");
      out.print(menuObj.getMenuId() );
      out.write("', '");
      out.print(subMenuObj.getSubMenuId());
      out.write("', '");
      out.print(subMenuObj.getTemplateId());
      out.write("', '0')\" class=\"\"> - ");
      out.print(subMenuObj.getSubMenuName());
      out.write("</a> </li>\r\n");
      out.write("\t\t\t\t\t  ");
}
			  		}
      out.write("\r\n");
      out.write("\t\t  \t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        ");
} else {
        	menustatus = "activemenu";
      out.write("\r\n");
      out.write("        \t<a class=\"menuitem ");
      out.print(menustatus);
      out.write("\" onclick=\"ddaccordion.collapseallandgo('submenuheader','");
      out.print(menuObj.getMenuId());
      out.write("', '0', '");
      out.print(menuObj.getTemplateId());
      out.write("', '0');\">");
      out.print(menuObj.getMenuName());
      out.write("</a>\r\n");
      out.write("        ");
} 
      out.write("\t\t\t\r\n");
      out.write("      ");
}
	}		
}
if(sharedMenusBasedOnGroup != null && sharedMenusBasedOnGroup.size() > 0) {
	Iterator<Menu> sharedMenuItr = sharedMenusBasedOnGroup.iterator();
	while(sharedMenuItr.hasNext()){
		String sharedmenustatus = "submenuheader";
		Menu sharedMenuObj = (Menu) sharedMenuItr.next();
		if(sharedMenuObj != null && sharedMenuObj.getMenuName().length() > 0){ 
      out.write("\r\n");
      out.write("\t\t  ");
Set<SubMenu> sharedSubMenu = sharedMenuObj.getSubMenus();
			if(sharedSubMenu != null && sharedSubMenu.size() > 0) {
				Iterator<SubMenu> sharedSubMenuItr = sharedSubMenu.iterator(); 
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"menuitem ");
      out.print(sharedmenustatus);
      out.write("\" onclick=\"javascript:loadTemplate('");
      out.print(sharedMenuObj.getMenuId() );
      out.write("', '0', '");
      out.print(sharedMenuObj.getTemplateId());
      out.write("', '");
      out.print(sharedMenuObj.getGroupId());
      out.write("')\">");
      out.print(sharedMenuObj.getMenuName());
      out.write("</a>\r\n");
      out.write("\t\t\t\t<div class=\"submenu\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t");
while(sharedSubMenuItr.hasNext()){
							SubMenu sharedSubMenuObj = (SubMenu) sharedSubMenuItr.next(); 
						  	if(sharedSubMenuObj != null && sharedSubMenuObj.getSubMenuName() != null && sharedSubMenuObj.getSubMenuName().length() > 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a onclick=\"javascript:loadTemplate('");
      out.print(sharedMenuObj.getMenuId() );
      out.write("', '");
      out.print(sharedSubMenuObj.getSubMenuId());
      out.write("', '");
      out.print(sharedSubMenuObj.getTemplateId());
      out.write("', '");
      out.print(sharedMenuObj.getGroupId());
      out.write("')\" class=\"\">");
      out.print(sharedSubMenuObj.getSubMenuName());
      out.write("</a> </li>\r\n");
      out.write("\t\t\t\t\t\t  ");
}
						 }
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t");
} else {
			sharedmenustatus = "activemenu";
      out.write("\r\n");
      out.write("\t\t\t<a class=\"menuitem ");
      out.print(sharedmenustatus);
      out.write("\" onclick=\"ddaccordion.collapseallandgo('submenuheader','");
      out.print(sharedMenuObj.getMenuId() );
      out.write("', '0', '");
      out.print(sharedMenuObj.getTemplateId());
      out.write("', '");
      out.print(sharedMenuObj.getGroupId());
      out.write("')\">");
      out.print(sharedMenuObj.getMenuName());
      out.write("</a>\r\n");
      out.write("     \t");
}
		}
	}		
  }
      out.write("\r\n");
      out.write("</div>\r\n");
if(session.getAttribute(Constants.PUBLIC_CONTENT_FLAG) == null){
      out.write("\r\n");
      out.write("\t<a href=\"#\" class=\"log-in-out\" onclick=\"javascript:logout();\">Log Out</a>\r\n");
}
      out.write('\r');
      out.write('\n');
if(cookieUserName != null && cookieUserName.length() > 0 && cookiePassword != null && cookiePassword.length() > 0){ 
      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"");
      out.print(Constants.MODE);
      out.write("\" name=\"");
      out.print(Constants.MODE);
      out.write("\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("login();\r\n");
      out.write("</script>\r\n");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"sidebar_bottom\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/breadCrumb.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/templates.jsp" + (("/templates/templates.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("TemplateName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(request.getParameter(TemplateConstants.TEMPLATE_NAME)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menuId", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(request.getParameter(TemplateConstants.MENU_ID)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("subMenuId", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(request.getParameter(TemplateConstants.SUB_MENU_ID)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("TEMPLATE_IMAGES", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(request.getParameter(Constants.TEMPLATE_IMAGES)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("APPROVAL_MODE", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(request.getParameter(TemplateConstants.APPROVAL_MODE)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("EDIT_MODE", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(request.getParameter(TemplateConstants.EDIT_MODE)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("templateId", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(request.getParameter(Constants.TEMPLATE_ID)), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--  -->\r\n");
      out.write("\t\r\n");
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
