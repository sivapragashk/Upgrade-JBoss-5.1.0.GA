package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.es.tools.Constants;
import com.hd.es.db.base.Category;
import com.hd.es.db.base.SubCategory;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/adminMenu.jsp");
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html> \r\n");
      out.write("<head> \r\n");
      out.write("\t<title>Hunter Douglas ES</title> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/es_global.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/ddaccordion.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/menu.js\"></script>\r\n");
      out.write("</head> \r\n");
      out.write("<body  bgcolor=\"#C3C7C8\" topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div id=\"header\"></div>\r\n");
      out.write("\t\t<div id=\"main\">\t\t\r\n");
      out.write("\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");

Category[] categoryDOList = null;
Category categoryDO = null;
SubCategory[] subCategoryList = null;
SubCategory subCategoryDO = null;

if(session.getAttribute(Constants.MENU_DETAILS)!=null)
	categoryDOList = (Category[])session.getAttribute(Constants.MENU_DETAILS);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"glossymenu\">\r\n");
      out.write("\t");
      out.write("<div>\r\n");
      out.write("\t<a class=\"menuitem submenuheader\" href=\"#\">ADMINISTRATION</a>\r\n");
      out.write("\t<div class=\"submenu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"/es/category?action=managemenu\">Manage Menu</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/es/subcategory?action=managesubmenu\">Manage Sub-Menu</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');
      out.write('	');
if(categoryDOList !=null && categoryDOList.length > 0){
		for(int i=0;i<categoryDOList.length;i++){
			categoryDO = categoryDOList[i];
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"menuitem ");
if(categoryDO.getSubCategory().length > 0){
      out.write("submenuheader");
}
      out.write("\" href=\"#\">");
      out.print(categoryDO.getCategoryName());
      out.write("</a>\r\n");
      out.write("\t\t\t\t");
System.out.println("length-->"+categoryDO.getSubCategory().length);
				if(categoryDO.getSubCategory() !=null && categoryDO.getSubCategory().length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t");
subCategoryList = (SubCategory[])categoryDO.getSubCategory();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
for(int j=0;j<subCategoryList.length;j++){
									subCategoryDO = subCategoryList[j];
									System.out.println("subCategory in menu.jsp"+subCategoryDO.getSubCategoryName());
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">");
      out.print(subCategoryDO.getSubCategoryName());
      out.write("</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
}
      out.write('\r');
      out.write('\n');
      out.write('	');
}
	}
      out.write("\r\n");
      out.write("\t<a class=\"loginmenuitem submenuheader\" href=\"http://www.cssdrive.com\">DEALER LOG IN</a>\r\n");
      out.write("\t<div class=\"submenu\">\r\n");
      out.write("\t\t<div class=\"loginbackground\">\r\n");
      out.write("\t\t\t\t<div class=\"login\">ACCOUNT ID:<div class=\"loginboxdiv\"><input type=\"text\" name=\"login\" class=\"loginbox\"></input></div></div>\r\n");
      out.write("\t\t\t\t<div class=\"login\">USER ID:<div class=\"loginboxdiv\"><input type=\"text\" name=\"login\" class=\"loginbox\"></input></div></div>\r\n");
      out.write("\t\t\t\t<div class=\"login\">PASSWORD:<div class=\"loginboxdiv\"><input type=\"text\" name=\"login\" class=\"loginbox\"></input></div></div>\r\n");
      out.write("\t\t\t\t<div class=\"login\"><img src=\"images/login.gif\" border=\"0\"></img></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"contentcontainer\">\r\n");
      out.write("\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write(" \t</div>\r\n");
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
}
