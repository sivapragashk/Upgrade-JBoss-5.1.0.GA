package org.apache.jsp.templates.fabcs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.SimpleProperty;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.TextUtils;
import java.util.Map;
import java.util.List;
import com.hd.directweb.db.MenuDesignAdmin;
import com.hd.directweb.service.helper.DesignLoader;

public final class menuDesignCSS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Start Code to get MenuDesignDetails from DB-->\r\n");

SimpleProperty simpleProperty1 = new SimpleProperty(getServletContext().getInitParameter(Constants.PROPERTY_FILE));
String basepath = simpleProperty1.getProperty(Constants.BASE_HEADER_FOOTER_PATH);
int groupid1 = TextUtils.getIntValue(((Map)session.getAttribute(Constants.SESSION_VALUES)).get(Constants.GROUP_ID));
basepath = basepath+groupid1+"/"+Constants.MENU+"/";
MenuDesignAdmin menuDesignAdmin = null;
String menuFont = "";
String menuTextColor = "";
String menuImage = "";
String menuHoverTextColor = "";
String subMenuFont = "";
String subMenuTextColor = "";
String subMenuHoverTextColor = "";
List menuDetailsList = DesignLoader.getInstance().loadMenuDesign(groupid1);
if(menuDetailsList != null && menuDetailsList.size() > 0){
		menuDesignAdmin = (MenuDesignAdmin)menuDetailsList.get(0);
		menuFont = menuDesignAdmin.getMenuFont()== null ? "" :  menuDesignAdmin.getMenuFont();
		menuTextColor = menuDesignAdmin.getMenuTextColor() == null ? "" : menuDesignAdmin.getMenuTextColor() ;
		menuImage = menuDesignAdmin.getMenuImage() == null ? "" :  basepath+menuDesignAdmin.getMenuImage();
		menuHoverTextColor = menuDesignAdmin.getMenuHoverTextColor() == null ? "" : menuDesignAdmin.getMenuHoverTextColor();
		subMenuFont = menuDesignAdmin.getSubMenuFont() == null ? "" : menuDesignAdmin.getSubMenuFont();
		subMenuTextColor = menuDesignAdmin.getSubMenuTextColor() == null ? "" : menuDesignAdmin.getSubMenuTextColor();
		subMenuHoverTextColor = menuDesignAdmin.getSubMenuHoverTextColor() == null ? "" : menuDesignAdmin.getSubMenuHoverTextColor();
}

      out.write("\r\n");
      out.write("<!-- End Code to get MenuDesignDetails from DB -->\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* Stylesheet form main menu - Begin*/\r\n");
      out.write("html, body {height: 100%;}\r\n");
      out.write("\r\n");
      out.write(".glossymenu{\r\n");
      out.write("margin: 5px 0;\r\n");
      out.write("padding: 0;\r\n");
      out.write("width: 203px; /*width of menu*/\r\n");
      out.write("border-bottom-width: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu a.menuitem{\r\n");
      out.write("/*background: url(/DirectWeb/images/templates/default/menu_bg.gif) repeat-x bottom left; */ \r\n");
      out.write("/*font: 11px Verdana;*/\r\n");
      out.write("font: ");
      out.print(menuFont);
      out.write(";\r\n");
      out.write("display: block;\r\n");
      out.write("/*color: #1669A0;*/\r\n");
      out.write("color: ");
      out.print(menuTextColor);
      out.write(";\r\n");
      out.write("position: relative; /*To help in the anchoring of the \".statusicon\" icon image*/\r\n");
      out.write("width: auto;\r\n");
      out.write("padding-left: 15px;\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("line-height: 33px;\r\n");
      out.write("height: 33px;\r\n");
      out.write("text-align: left;\r\n");
      out.write("/*background-image:url(/DirectWeb/images/templates/fabcs/menu_sep.png);*/\r\n");
      out.write("background-image:url(");
      out.print(menuImage);
      out.write(");\r\n");
      out.write("background-repeat: no-repeat;\r\n");
      out.write("background-position: bottom; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu a.activemenu{\r\n");
      out.write("\r\n");
      out.write("font-weight: normal;\r\n");
      out.write("color: #1669A0;\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("cursor: hand;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu a.menuitem:hover{\r\n");
      out.write("background: #1669A0;\r\n");
      out.write("font-weight: normal;\r\n");
      out.write("/*color: #E2E1DD;*/\r\n");
      out.write("color: ");
      out.print(menuHoverTextColor);
      out.write(";\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("cursor: hand;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu a.menuitem .statusicon{ /*CSS for icon image that gets dynamically added to headers*/\r\n");
      out.write("position: absolute;\r\n");
      out.write("top: 10px;\r\n");
      out.write("right: 5px;\r\n");
      out.write("border: none;\r\n");
      out.write("display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu div.submenu{ /*DIV that contains each sub menu*/\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu div.submenu ul{ /*UL of each sub menu*/\r\n");
      out.write("list-style-type: none;\r\n");
      out.write("margin: 0;\r\n");
      out.write("padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu div.submenu ul li{\r\n");
      out.write("list-style-type: none;\r\n");
      out.write("display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu div.submenu ul li a{\r\n");
      out.write("display: block;\r\n");
      out.write("/*font: 11px Verdana ;*/\r\n");
      out.write("font: ");
      out.print(subMenuFont);
      out.write(";\r\n");
      out.write("/*color: #1669A0;*/\r\n");
      out.write("color: ");
      out.print(subMenuTextColor);
      out.write(";\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("padding-left: 30px;\r\n");
      out.write("line-height: 23px;\r\n");
      out.write("text-align: left;\r\n");
      out.write("cursor: hand;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".glossymenu div.submenu ul li a:hover,.glossymenu div.submenu ul li a.activesubmenu{\r\n");
      out.write("/*background-image: url(/DirectWeb/images/templates/default/submenu_over.gif); */\r\n");
      out.write("background: #1669A0;\r\n");
      out.write("font-weight: normal;\r\n");
      out.write("/*color: #E2E1DD;*/\r\n");
      out.write("color: ");
      out.print(subMenuHoverTextColor);
      out.write(";\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Stylesheet form main menu - End*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>");
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
