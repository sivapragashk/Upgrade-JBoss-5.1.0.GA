package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.es.tools.Constants;
import com.hd.es.db.base.Category;
import com.hd.es.helper.*;
import com.hd.es.db.base.Templates;
import com.hd.es.tools.*;
import com.hd.es.config.Config;
import com.hd.es.tools.Constants;
import com.hd.es.db.base.Category;
import com.hd.es.db.base.SubCategory;
import com.hd.es.tools.Constants;

public final class manageCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/adminMenu.jsp");
    _jspx_dependants.add("/messages.jsp");
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
      out.write("\r\n");
      out.write("<html>\r\n");

String mode = "";
Templates[] templateList = null;
Templates template = null;

if(session.getAttribute(Constants.MODE) != null)
	mode = session.getAttribute(Constants.MODE).toString();
if(request.getAttribute(Constants.TEMPLATE_DETAILS)!=null)	
	templateList = (Templates[])request.getAttribute(Constants.TEMPLATE_DETAILS);

      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title> Enlightened Style </title>\r\n");
      out.write("\t\t<script type=\"text/JavaScript\" language=\"JavaScript\" src=\"javascript/jquery-1.4.2.min.js\"></script> \r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/admin.css\" >\r\n");
      out.write("\t\t <link href=\"stylesheets/jquery-ui-1.8.2.custom.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/es_global.css\" media=\"screen, projection\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascript/ddaccordion.js\"></script>\r\n");
      out.write("\t\t<script src=\"javascript/jquery-ui-1.8.2.custom.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascript/menu.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascript/admin.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction validateForm(){\r\n");
      out.write("\t\t\t\tif($(\"#categoryName\").val() == ''){\r\n");
      out.write("\t\t\t\t\talert(\"Please enter Menu Name to continue\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#categoryDescription\").val() == ''){\r\n");
      out.write("\t\t\t\t\talert(\"Please enter Description to continue\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.esfrm.action = 'category';\r\n");
      out.write("\t\t\t\t$(\"#esfrm\").submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction displayCategoryDetails(){\r\n");
      out.write("\t\t\t\tvar Action = \"getCategoryDetails\";\r\n");
      out.write("\t\t\t\tvar categoryid = $(\"#categoryId\").val();\r\n");
      out.write("\t\t\t\tunCheckBoxes();\r\n");
      out.write("\t\t\t\tif(categoryid > 0){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"delete\").style.visibility = 'visible';\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t        type: \"GET\",\r\n");
      out.write("\t\t\t\t        url: \"category?Action=\"+Action+\"&categoryId=\"+categoryid,\r\n");
      out.write("\t\t\t\t        async: true,\r\n");
      out.write("\t\t\t\t        dataType: 'xml', \r\n");
      out.write("\t\t\t\t        success : parseResults\r\n");
      out.write("\t\t\t\t \t});\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#categoryName\").val('');\r\n");
      out.write("\t\t\t\t\t$(\"#categoryDescription\").val('');\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"delete\").style.visibility = 'hidden';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t \tfunction parseResults(xml)\r\n");
      out.write("\t\t\t \t{\r\n");
      out.write("\t\t\t \t\tvar categoryNameField = document.getElementById('categoryName');\r\n");
      out.write("\t\t\t\t\tvar categoryDescriptionField = document.getElementById('categoryDescription');\r\n");
      out.write("\t\t\t\t\tvar accessTypeField = document.getElementById('esfrm').accessType;\r\n");
      out.write("\t\t\t\t\tvar accessType;\r\n");
      out.write("\t\t\t\t\t$(xml).find('categories').each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t$(this).find('category').each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\tcategoryNameField.value = $(this).find(\"categoryName\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\tcategoryDescriptionField.value = $(this).find(\"categoryDescription\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\taccessType = $(this).find(\"accessType\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\t/* if(accessType.indexOf(\",\") != -1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\taccessLevel = accessType.split(\",\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(var i=0;i<accessLevelField.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(accessLevelField[i].value == accessLevel[i])\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taccessLevelField[i].checked = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{*/\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(var i=0;i<accessTypeField.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(accessTypeField[i].value == accessType)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taccessTypeField[i].checked = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t \t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction deleteCategory()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar categoryId = $(\"#categoryId\").val();\r\n");
      out.write("\t\t\t\tif(categoryId > 0){\r\n");
      out.write("\t\t\t\t\tif (confirm(\"Deleting a Menu will also delete all Sub-Menus and Content assigned to it, Do you want to continue?\")) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#Action\").val('");
      out.print(Constants.DELETE_CATEGORY);
      out.write("');\r\n");
      out.write("\t\t\t\t\t\tdocument.esfrm.action = 'category';\r\n");
      out.write("\t\t\t\t\t\t$(\"#esfrm\").submit();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction unCheckBoxes()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar accessLevelField = document.getElementById('esfrm').accessType;\r\n");
      out.write("\t\t\t\tfor (var i = 0; i < accessLevelField.length; i++)\r\n");
      out.write("\t\t\t\t\taccessLevelField[i].checked = false ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction sort()\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t// Hard coded the contextpath for testing purpose, later we need to add the context path \r\n");
      out.write("\t\t\t \tvar sortWin=window.open(\"category?action=sortCategory\",'SortCategories','toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=no,width=600,height=350,top=200,left=100');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction showTemplate(index)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t   var selectedIndex = document.esfrm.template.selectedIndex;\r\n");
      out.write("\t\t\t   var selectedText = document.esfrm.template.options[selectedIndex].text;\r\n");
      out.write("\t\t\t   var imagePath = \"");
      out.print(Config.getString(Constants.PREVIEW_TEMPLATES_DIR));
      out.write("\";\r\n");
      out.write("\t\t\t    if(index > 0){\r\n");
      out.write("\t\t\t        imagePath = imagePath + selectedText +\".JPG\";\r\n");
      out.write("\t\t\t        document.getElementById('previewTemplate').style.visibility='visible';\r\n");
      out.write("\t\t\t\t    document.getElementById('templateImage').src=imagePath;\r\n");
      out.write("\t\t\t    }else{\r\n");
      out.write("\t\t\t    \tdocument.getElementById('previewTemplate').style.visibility='hidden';\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction enableSubMenuDiv(){\r\n");
      out.write("\t\t\t\tvar submenuRequiredField = document.getElementById('esfrm').submenuRequired;\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<submenuRequiredField.length;i++){\r\n");
      out.write("\t\t\t\t\t\tif(submenuRequiredField[i].checked == true && submenuRequiredField[i].value == '4')\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"defaultSubMenuDiv\").style.visibility = 'hidden';\r\n");
      out.write("\t\t\t\t\t\t\t document.getElementById('previewTemplate').style.visibility='hidden';\t\r\n");
      out.write("\t\t\t\t\t\t}else if(submenuRequiredField[i].checked == true && submenuRequiredField[i].value == '5'){\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"defaultSubMenuDiv\").style.visibility = 'visible';\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t document.getElementById('previewTemplate').style.visibility='visible';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("       </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body  bgcolor=\"#C3C7C8\" topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div id=\"header\"></div>\r\n");
      out.write("\t<div id=\"main\">\t\t\r\n");
      out.write("\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t");
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
      out.write("<div class=\"glossymenu\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<a class=\"menuitem submenuheader\" href=\"#\">ADMINISTRATION</a>\r\n");
      out.write("\t<div class=\"submenu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"category?Action=managemenu\">Manage Menu</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"subcategory?Action=managesubmenu\">Manage Sub-Menu</a></li>\r\n");
      out.write("\t\t\t");
if(mode.equals(Constants.MODE_EDIT)){
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:editmode('");
      out.print(Constants.SET_EDIT_MODE);
      out.write("')\">Disable Edit Mode</a></li>\r\n");
      out.write("\t\t\t");
}else{
      out.write("\t\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:editmode('");
      out.print(Constants.SET_EDIT_MODE);
      out.write("')\">Enable Edit Mode</a></li>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:loadtemplate(");
      out.print(categoryDO.getCategoryId());
      out.write(',');
      out.print(subCategoryDO.getSubCategoryId());
      out.write(')');
      out.write('"');
      out.write('>');
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
      out.write("\t<a class=\"menuitem\" href=\"javascript:loadtemplate(1,1)\">About Us</a>\r\n");
      out.write("\t<!-- <a class=\"menuitem submenuheader\" href=\"#\">ES Collection</a>\r\n");
      out.write("\t<div class=\"submenu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(5,4)\">Honeycomb Shades</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div> -->\r\n");
      out.write("\t<a class=\"menuitem submenuheader\" href=\"#\" >Products</a>\r\n");
      out.write("\t<div class=\"submenu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,1)\">Honeycomb Shades</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,2)\">Window Shadings</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,3)\">Roller Shades</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,4)\">Wood &amp; Faux Wood</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,5)\">Woven Woods</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,6)\">Vertical Blinds</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,7)\">Aluminium Blinds</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:loadtemplate(1,8)\">Shutters</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<a class=\"loginmenuitem submenuheader\" href=\"#\">DEALER LOG IN</a>\r\n");
      out.write("\t<div class=\"submenu\">\r\n");
      out.write("\t<div class=\"loginbackground\">\r\n");
      out.write("\t\t\t\t<div class=\"login\">ACCOUNT ID:<div class=\"loginboxdiv\"><input type=\"text\" name=\"login\" class=\"loginbox\"></input></div></div>\r\n");
      out.write("\t\t\t\t<div class=\"login\">USER ID:<div class=\"loginboxdiv\"><input type=\"text\" name=\"login\" class=\"loginbox\"></input></div></div>\r\n");
      out.write("\t\t\t\t<div class=\"login\">PASSWORD:<div class=\"loginboxdiv\"><input type=\"text\" name=\"login\" class=\"loginbox\"></input></div></div>\r\n");
      out.write("\t\t\t\t<div class=\"login\"><img src=\"images/login.gif\" border=\"0\"></img></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"contentcontainer\">\r\n");
      out.write("\t\t\t<div id=\"admintemplateheader\">\r\n");
      out.write("\t\t\t\t<span class=\"bodyHeader\">Manage Menu</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"admin_content\" style=\"min-height:450px;\">\r\n");
      out.write("\t\t\t\t<div id=\"admin_body_content_container_wrapper\">\r\n");
      out.write("\t\t\t\t\t<div id=\"admin_messages\">\r\n");
      out.write("\t\t\t\t\t\t");
String message = (String) request.getAttribute(Constants.MESSAGES);
if ( message != null )
{
      out.write("\r\n");
      out.write("   <div id=\"messages\">");
      out.print(message);
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"admin_body_content_container\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"ins\" name=\"esfrm\" id=\"esfrm\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<legend><span class=\"textOnBorder\">Menus</span></legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\">Menu: </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"categoryId\" id=\"categoryId\" onchange=\"displayCategoryDetails()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Add Menu</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
if(request.getAttribute(Constants.CATEGORY_LIST)!=null){
												Category[] categoryList = (Category[])request.getAttribute(Constants.CATEGORY_LIST);
												Category category = null;
												if(categoryList !=null && categoryList.length > 0){
													for(int i=0;i<categoryList.length;i++){
														category = categoryList[i];
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(Integer.toString(category.getCategoryId()));
      out.write('"');
      out.write('>');
      out.print(category.getCategoryName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
		}
												}
											}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>&nbsp;<a href=\"javascript:deleteCategory()\" id=\"delete\" style=\"visibility:hidden;\"><span class=\"hyperlink\" id=\"delete\">Delete</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <a href=\"javascript:sort()\"><span class=\"hyperlink\" id=\"sort\">Sort</span></a></span> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_textbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"categoryName\" id=\"categoryName\" size=\"40\" maxlength=\"50\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_textarea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\">Description:&nbsp;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"categoryDescription\" id=\"categoryDescription\" cols=\"50\" rows=\"5\" value=\"\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\"> Access level:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"accessType\" id=\"accessType\" value=\"");
      out.print(Constants.PUBLIC_CONTENT);
      out.write("\" checked =\"true\" style=\"border: none;\" />Public\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"accessType\" id=\"accessType\" value=\"");
      out.print(Constants.PRIVTE_CONTENT);
      out.write("\" style=\"border: none;\" />Private\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"accessType\" id=\"accessType\" value=\"");
      out.print(Constants.PRIVATE_AND_PUBLIC_CONTENT );
      out.write("\" style=\"border:none;\" />Public And Private\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_radio_subMenuRequired\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_radio_text\"><span  class=\"columnLabel\"> Is submenu required for this menu? </span></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"submenuRequired\" id=\"submenuRequired\" value=\"");
      out.print(Constants.SUBMENU_REQUIRED_YES);
      out.write("\" checked =\"true\" style=\"border: none;\" onclick=\"enableSubMenuDiv()\"/>Yes\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"submenuRequired\" id=\"submenuRequired\" value=\"");
      out.print(Constants.SUBMENU_REQUIRED_NO);
      out.write("\" style=\"border: none;\" onclick=\"enableSubMenuDiv()\" />No\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"defaultSubMenuDiv\" style=\"visibility:hidden;width:400px;\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_select_template_submenu\" style=\"width:280px;padding-left:3px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\">Template: </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select name=\"template\" id=\"template\" onchange=\"showTemplate(this.options.selectedIndex)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a Template</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(templateList!=null && templateList.length > 0){
														for(int j=0;j<templateList.length;j++){
															template = templateList[j];
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(Integer.toString(template.getTemplateId()));
      out.write('"');
      out.write('>');
      out.print(template.getTemplateFileName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
													}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"previewTemplate\" style=\"visibility:hidden; width:400px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <img  align=\"top\" id=\"templateImage\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_checkbox_page\" style=\"padding-left:18px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\"> isHomePage:</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"isHomePage\" id=\"isHomePage\" style=\"border: none;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"admin_body_content_button\" style=\"width:280px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"Save\" id=\"Save\" value=\"Save Changes\" onclick=\"validateForm()\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"Action\" id=\"Action\" value=\"");
      out.print(Constants.MANAGE_CATEGORY);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.PERFORM_ACTION);
      out.write("\" />\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.CATEGORY_ID);
      out.write("\" id=\"");
      out.print(Constants.CATEGORY_ID);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.SUB_CATEGORY_ID);
      out.write("\" id=\"");
      out.print(Constants.SUB_CATEGORY_ID);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.CONTENT_ID);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
