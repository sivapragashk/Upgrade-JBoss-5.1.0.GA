package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.db.SharedSubMenu;
import com.hd.directweb.db.dao.SharedSubMenuDAO;
import com.hd.directweb.db.SubMenu;
import java.util.Iterator;
import java.util.Set;
import com.hd.directweb.db.Menu;
import com.hd.directweb.service.constants.TemplateConstants;

public final class siteMap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/siteMap.css\" media=\"screen, projection\" />\r\n");
      out.write("\r\n");
      out.write("\t\r\n");

Set<Menu> menusBasedOnGroup = null;
Set<Menu> sharedMenusBasedOnGroup = null;
if(request.getAttribute(TemplateConstants.MENUS_BASED_ON_GROUP) != null) {
	menusBasedOnGroup = (Set<Menu>) request.getAttribute(TemplateConstants.MENUS_BASED_ON_GROUP);
}
if(request.getAttribute(TemplateConstants.SHARED_MENUS_BASED_ON_GROUP) != null) {
	sharedMenusBasedOnGroup = (Set<Menu>) request.getAttribute(TemplateConstants.SHARED_MENUS_BASED_ON_GROUP);
}

      out.write('\r');
      out.write('\n');
if(menusBasedOnGroup != null && menusBasedOnGroup.size() > 0){
	Menu menuObj = null;
	Set<SubMenu> subMenu = null;
	int count = 0;
	int firstHalf = 0;
	int actualCount = 0;
	for(int i=0;i<menusBasedOnGroup.size();i++){
		count ++;
	}		
	firstHalf = (count/2)+1;
	Iterator<Menu> menuItr = menusBasedOnGroup.iterator();	
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("<div id=\"content-left\">\r\n");
      out.write("\t");
while(menuItr.hasNext()){
		menuObj = (Menu) menuItr.next();
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- javascript:loadTemplate(menuId, subMenuId, templateId, groupId) -->\r\n");
      out.write("\t\t\t<!-- groupId refers to Shared Group Id -->\r\n");
      out.write("\t\t\t<a onclick=\"javascript:loadTemplate('");
      out.print(menuObj.getMenuId() );
      out.write("', '0', '");
      out.print(menuObj.getTemplateId());
      out.write("', '0')\">");
      out.print(menuObj.getMenuName());
      out.write("</a><br>\r\n");
      out.write("\t\t\t");
actualCount++;
			
      out.write("<br>\r\n");
      out.write("\t\t\t");
if(menuObj != null && menuObj.getMenuName().length() > 0){
				//subMenu = menuObj.getSubMenus(); 
				  subMenu = menuObj.getFilteredSubMenus();
					if(subMenu != null && subMenu.size() > 0){
						Iterator<SubMenu> subMenuItr = subMenu.iterator();
						while(subMenuItr.hasNext()){
							SubMenu subMenuObj = (SubMenu) subMenuItr.next(); 
							if(subMenuObj != null && subMenuObj.getSubMenuName().length() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp; - &nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:loadTemplate('");
      out.print(subMenuObj.getMenuId());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(subMenuObj.getSubMenuId() );
      out.write("', '");
      out.print(subMenuObj.getTemplateId());
      out.write("', '0')\">");
      out.print(subMenuObj.getSubMenuName());
      out.write("</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							}							
						}						
					} 
      out.write("\r\n");
      out.write("\t\t");
if(actualCount == firstHalf){
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"content-right\">\r\n");
      out.write("\t\t");
}
		}
	}
	
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<!-- Shared Group -->\r\n");
if(sharedMenusBasedOnGroup != null && sharedMenusBasedOnGroup.size() > 0){
	Menu sharedMenuObj = null;
	Set<SubMenu> sharedSubMenu = null;
	int count = 0;
	int firstHalf = 0;
	int actualCount = 0;
	for(int i=0;i<sharedMenusBasedOnGroup.size();i++){
		count ++;
	}		
	firstHalf = (count/2)+1;	
	Iterator<Menu> sharedMenuItr = sharedMenusBasedOnGroup.iterator();	
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
while(sharedMenuItr.hasNext()){
		sharedMenuObj = (Menu) sharedMenuItr.next();
      out.write("\r\n");
      out.write("\t\t\r\n");
if(actualCount == 0){ 
      out.write("\r\n");
      out.write("\t<div id=\"content-left\">\r\n");
      out.write("\t");
}
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- javascript:loadTemplate(menuId, subMenuId, templateId, groupId) -->\r\n");
      out.write("\t\t\t<!-- groupId refers to Shared Group Id -->\r\n");
      out.write("\t\t\t<a onclick=\"javascript:loadTemplate('");
      out.print(sharedMenuObj.getMenuId() );
      out.write("', '0', '");
      out.print(sharedMenuObj.getTemplateId());
      out.write("', '");
      out.print(sharedMenuObj.getGroupId());
      out.write("')\">");
      out.print(sharedMenuObj.getMenuName());
      out.write("</a><br>\r\n");
      out.write("\t\t\t");
actualCount++;
			
      out.write("<br>\r\n");
      out.write("\t\t\t");
if(sharedMenuObj != null && sharedMenuObj.getMenuName().length() > 0){
				sharedSubMenu = sharedMenuObj.getSubMenus(); 
					if(sharedSubMenu != null && sharedSubMenu.size() > 0){
						Iterator<SubMenu> sharedSubMenuItr = sharedSubMenu.iterator();
						while(sharedSubMenuItr.hasNext()){
							SubMenu sharedSubMenuObj = (SubMenu) sharedSubMenuItr.next(); 
							if(sharedSubMenuObj != null && sharedSubMenuObj.getSubMenuName().length() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - &nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:loadTemplate('");
      out.print(sharedSubMenuObj.getMenuId());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(sharedSubMenuObj.getSubMenuId() );
      out.write("', '");
      out.print(sharedSubMenuObj.getTemplateId());
      out.write("', '");
      out.print(sharedSubMenuObj.getGroupId());
      out.write("')\">");
      out.print(sharedSubMenuObj.getSubMenuName());
      out.write("</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							}							
						}						
					}		
				}
			}
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
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
