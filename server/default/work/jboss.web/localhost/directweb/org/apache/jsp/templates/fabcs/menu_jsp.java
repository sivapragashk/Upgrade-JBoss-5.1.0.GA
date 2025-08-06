package org.apache.jsp.templates.fabcs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.db.SharedSubMenu;
import com.hd.directweb.db.dao.SharedSubMenuDAO;
import com.hd.directweb.db.SubMenu;
import java.util.Iterator;
import java.util.Set;
import com.hd.directweb.db.Menu;
import com.hd.directweb.service.constants.TemplateConstants;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write(" \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/fabcs/menuDesignCSS.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");

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

      out.write('\r');
      out.write('\n');

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
if(session.getAttribute(Constants.SESSION_VALUES) != null){
	Map<String, Object> sessionValuesMap = (Map) session.getAttribute(Constants.SESSION_VALUES);
	if(!sessionValuesMap.containsKey(Constants.LOGGED_IN_USER)){
	session.removeAttribute(Constants.LOGIN_MODE);
      out.write("\r\n");
      out.write("\t<div id=\"content-login\">\r\n");
      out.write("\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t<tr><td colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/messages.jsp", out, false);
      out.write("</td></tr>\r\n");
      out.write("\t\t\t<tr><td>\r\n");
      out.write("\t\t\t\tUsername:</td><td><input type=\"text\" id=\"username\" name=\"username\" value=\"");
      out.print(cookieUserName );
      out.write("\" size=\"19\" tabindex=\"1\" maxlength=\"20\" style=\"height: 12px;\" />\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t\t<tr><td>\r\n");
      out.write("\t\t\t\tPassword:</td><td><input type=\"password\" id=\"password\" name=\"password\" value=\"");
      out.print(cookiePassword );
      out.write("\" size=\"19\" tabindex=\"2\" style=\"height: 12px;\" onkeypress=\"return submitForm()\" />\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t\t<tr><td></td><td align=\"right\">\r\n");
      out.write("\t\t\t\t<img border=\"0\" src=\"/DirectWeb/images/templates/login.gif\" width=\"45\" height=\"18\" style=\"cursor: pointer;\" onclick=\"javascript:login()\" />\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t\t<tr><td colspan=\"2\" align=\"right\"><img src=\"/DirectWeb/images/spacer.gif\" width=\"85\" height=\"0\"/><input type=\"checkbox\" name=\"rememberme\" ");
if(cookieUserName != null && cookieUserName != "" && cookiePassword != null && cookiePassword != ""){
      out.write(" checked = \"checked\"");
} 
      out.write(" />&nbsp;Remember me</td></tr>\r\n");
      out.write("\t\t\t<tr><td colspan=\"2\"><a href=\"javascript:newUserRegistration()\" class=\"welcomeTextUser\">New User? Register Here</a></td></tr> \r\n");
      out.write("\t\t\t<tr><td colspan=\"2\"><a href=\"javascript:forgotPassword()\" class=\"welcomeText\">Forgot Password?</a> </td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<img src=\"/DirectWeb/images/templates/fabcs/menu_sep.png\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
}
}
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/adminmenu.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
if(menusBasedOnGroup != null && menusBasedOnGroup.size() > 0) {
	Iterator<Menu> menuItr = menusBasedOnGroup.iterator();
	while(menuItr.hasNext()){
		String menustatus = "submenuheader";
		Menu menuObj = (Menu) menuItr.next();
		if(menuObj != null && menuObj.getMenuName().length() > 0){ 
			Set<SubMenu> subMenu = menuObj.getFilteredSubMenus();
      out.write("\r\n");
      out.write("\t\t");
if(subMenu != null && subMenu.size() > 0) {
		  Iterator<SubMenu> subMenuItr = subMenu.iterator();
      out.write("\r\n");
      out.write("\t\t  <a href=\"#\" class=\"menuitem ");
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
					  	//System.out.println("Menu Name Along with Sub Menu -> "+menuObj.getMenuName()+" -> Sub Menu Name -> "+subMenuObj.getSubMenuName());
					  	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" onclick=\"javascript:loadTemplate('");
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
        	//System.out.println("Only Menu Name -> "+menuObj.getMenuName());
        	
      out.write("\r\n");
      out.write("        \t<a href=\"#\" class=\"menuitem\" onclick=\"ddaccordion.collapseallandgo('submenuheader','");
      out.print(menuObj.getMenuId());
      out.write("', '0', '");
      out.print(menuObj.getTemplateId());
      out.write("', '0');\">");
      out.print(menuObj.getMenuName());
      out.write("</a>\r\n");
      out.write("        ");
} 
	    }
	}		
  }
      out.write('\r');
      out.write('\n');
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
      out.write("\t\t\t\t<a href=\"#\" class=\"menuitem ");
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
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" onclick=\"javascript:loadTemplate('");
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
      out.write("\t\t  ");
} else {
			sharedmenustatus = "activemenu";
      out.write("\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"menuitem\" onclick=\"ddaccordion.collapseallandgo('submenuheader','");
      out.print(sharedMenuObj.getMenuId() );
      out.write("', '0', '");
      out.print(sharedMenuObj.getTemplateId());
      out.write("', '");
      out.print(sharedMenuObj.getGroupId());
      out.write("')\">");
      out.print(sharedMenuObj.getMenuName());
      out.write("</a>\r\n");
      out.write("     \t  ");
}
		}
	}		
  }
      out.write("\r\n");
      out.write("</div>");
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
