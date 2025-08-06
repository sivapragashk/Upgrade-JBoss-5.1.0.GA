package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.es.tools.Constants;
import com.hd.es.db.base.Category;
import com.hd.es.db.base.Templates;
import com.hd.es.config.Config;
import com.hd.es.tools.Constants;
import com.hd.es.db.base.Category;
import com.hd.es.db.base.SubCategory;
import com.hd.es.tools.Constants;

public final class manageSubCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
 
Category[] categoryList = null;
Category category = null;
Templates[] templateList = null;
Templates template = null;
String mode = "";
if(session.getAttribute(Constants.MODE) != null)
	mode = session.getAttribute(Constants.MODE).toString();

if(request.getAttribute(Constants.CATEGORY_LIST)!=null)
	categoryList = (Category[])request.getAttribute(Constants.CATEGORY_LIST);
	
if(request.getAttribute(Constants.TEMPLATE_DETAILS)!=null)	
	templateList = (Templates[])request.getAttribute(Constants.TEMPLATE_DETAILS);
	
	
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Enlightened Style</title>\r\n");
      out.write("\t\t<script type=\"text/JavaScript\" language=\"JavaScript\" src=\"javascript/jquery-1.4.2.min.js\"></script> \r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/admin.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/es_global.css\" media=\"screen, projection\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascript/ddaccordion.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascript/menu.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascript/admin.js\"></script>\r\n");
      out.write("\t\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction validateForm(){\r\n");
      out.write("\t\t\t\tif($(\"#categoryId\").val() == 0){\r\n");
      out.write("\t\t\t\t\talert('Please select Menu to continue');\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#subCategoryName\").val() == ''){\r\n");
      out.write("\t\t\t\t\talert('Please select Sub Menu to continue');\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#subCategoryDescription\").val() == ''){\r\n");
      out.write("\t\t\t\t\talert('Please enter Description to continue');\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#template\").val() == 0){\r\n");
      out.write("\t\t\t\t\talert('Please select a template to continue');\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.esfrm.action = 'subcategory';\r\n");
      out.write("\t\t\t\t$(\"#esfrm\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction hideDisplayTemplates() {\r\n");
      out.write("\t\t\tif(document.getElementById('previewTemplate') != null) {\r\n");
      out.write(" \t\t\t\tdocument.getElementById('previewTemplate').style.visibility='hidden';\r\n");
      out.write(" \t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction displaySubCategoryDetails(){\r\n");
      out.write("\t\t\t\tvar Action = \"getSubCategoryDetails\";\r\n");
      out.write("\t\t\t\tvar categoryid = $(\"#categoryId\").val();\r\n");
      out.write("\t\t\t\tvar template = document.getElementById(\"template\");\r\n");
      out.write("\t\t\t\thideDisplayTemplates();\r\n");
      out.write("\t\t\t\tif(categoryid > 0){\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t        type: \"GET\",\r\n");
      out.write("\t\t\t\t        url: \"subcategory?Action=\"+Action+\"&categoryId=\"+categoryid,\r\n");
      out.write("\t\t\t\t        async: true,\r\n");
      out.write("\t\t\t\t        dataType: 'xml', \r\n");
      out.write("\t\t\t\t        success : parseSubCategoryResults\r\n");
      out.write("\t\t\t\t \t});\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#subCategoryName\").val('');\r\n");
      out.write("\t\t\t\t\t$(\"#subCategoryDescription\").val('');\r\n");
      out.write("\t\t\t\t\ttemplate.options.value = 0;\r\n");
      out.write("\t\t\t\t\tunCheckBoxes();\r\n");
      out.write("\t\t\t\t\tdocument.esfrm.isHomePage.checked = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tfunction parseSubCategoryResults(xml){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar subCategoryFieldName = document.getElementById(\"subCategoryId\");\r\n");
      out.write("\t\t\t\t\tvar count=0;\r\n");
      out.write("\t\t\t\t\t$(xml).find('subCategories').each(function(){\r\n");
      out.write("\t\t\t\t\t\t\tvar length = $(this).find('length').text();\r\n");
      out.write("                        if(length >0){\r\n");
      out.write("                                subCategoryFieldName.length=0;\r\n");
      out.write("                                subCategoryFieldName.options[count++]=new Option(\"Add Sub Menu \",0);\r\n");
      out.write("                                $(this).find('subCategory').each(function(){\r\n");
      out.write("                                        var subCategoryId=$(this).find(\"subCategoryId\").text();\r\n");
      out.write("                                        var subCategoryName =$(this).find(\"subCategoryName\").text();\r\n");
      out.write("                                        subCategoryFieldName.options[count++] = new Option(subCategoryName,subCategoryId);\r\n");
      out.write("                                });\r\n");
      out.write("                        }else{\r\n");
      out.write("                                alert('No sub menu for the selected menu');\r\n");
      out.write("                                subCategoryFieldName.options[count++]=new Option(\"Add Sub Menu\",0);\r\n");
      out.write("                        }\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction getSubCategoryDetails(){\r\n");
      out.write("\t\t\t\tvar Action = \"getSubCategoryDetailsBasedOnCategory\";\r\n");
      out.write("\t\t\t\tvar categoryid = $(\"#categoryId\").val();\r\n");
      out.write("\t\t\t\tvar subCategoryid = $(\"#subCategoryId\").val();\r\n");
      out.write("\t\t\t\tunCheckBoxes();\r\n");
      out.write("\t\t\t\thideDisplayTemplates();\r\n");
      out.write("\t\t\t\tif(subCategoryid > 0){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"delete\").style.visibility = 'visible';\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t        type: \"GET\",\r\n");
      out.write("\t\t\t\t        url: \"subcategory?Action=\"+Action+\"&categoryId=\"+categoryid+\"&subCategoryId=\"+subCategoryid,\r\n");
      out.write("\t\t\t\t        async: true,\r\n");
      out.write("\t\t\t\t        dataType: 'xml', \r\n");
      out.write("\t\t\t\t        success : parseSubCategoryDetailsResults\r\n");
      out.write("\t\t\t\t \t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t \tfunction parseSubCategoryDetailsResults(xml)\r\n");
      out.write("\t\t\t \t{\r\n");
      out.write("\t\t\t \t\tvar subCategoryNameField = document.getElementById(\"subCategoryName\");\r\n");
      out.write("\t\t\t\t\tvar subCategoryDescriptionField = document.getElementById(\"subCategoryDescription\");\r\n");
      out.write("\t\t\t\t\tvar template = document.getElementById(\"template\");\r\n");
      out.write("\t\t\t\t\tvar accessTypeField = document.getElementById(\"esfrm\").accessType;\r\n");
      out.write("\t\t\t\t\tvar isHomePage = document.getElementById(\"esfrm\").isHomePage;\r\n");
      out.write("\t\t\t\t\tvar accessType;\r\n");
      out.write("\t\t\t\t\tvar selectedTemplate;\r\n");
      out.write("\t\t\t\t\tvar selectedHomePage;\r\n");
      out.write("\t\t\t\t\t$(xml).find('subCategories').each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t$(this).find('subCategory').each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\tsubCategoryNameField.value = $(this).find(\"subCategoryName\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\tsubCategoryDescriptionField.value = $(this).find(\"subCategoryDescription\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\tselectedTemplate = $(this).find(\"templateId\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\tfor(var j=0;j<template.length;j++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(template.options[j].value == selectedTemplate){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttemplate.options[j].selected = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tselectedHomePage = $(this).find(\"isHomePage\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\taccessType = $(this).find(\"accessType\").text();\r\n");
      out.write("\t\t\t\t\t\t\t\tfor(var i=0;i<accessTypeField.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(accessTypeField[i].value == accessType)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taccessTypeField[i].checked = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tif(selectedHomePage == 'Y')\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tisHomePage.checked = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tisHomePage.checked = false;\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t \t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
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
      out.write("\t\t\tfunction deleteSubCategory()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar categoryid = $(\"#categoryId\").val();\r\n");
      out.write("\t\t\t\tvar subCategoryid = $(\"#subCategoryId\").val();\r\n");
      out.write("\t\t\t\tif(subCategoryid > 0){\r\n");
      out.write("\t\t\t\t\tif (confirm(\"Are you sure that you want to delete this menu?\")) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#Action\").val('");
      out.print(Constants.DELETE_SUB_CATEGORY);
      out.write("');\r\n");
      out.write("\t\t\t\t\t\tdocument.esfrm.action = 'subcategory';\r\n");
      out.write("\t\t\t\t\t\t$(\"#esfrm\").submit();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction unCheckBoxes()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar accessTypeField = document.getElementById('esfrm').accessType;\r\n");
      out.write("\t\t\t\tfor (var i = 0; i < accessTypeField; i++)\r\n");
      out.write("\t\t\t\t\taccessTypeField[i].checked = false ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction sort()\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t// Hard coded the contextpath for testing purpose, later we need to add the context path \r\n");
      out.write("\t\t\t \tvar sortWin=window.open(\"subcategory?action=sortSubCategory\",'SortCategories','toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=no,width=600,height=350,top=200,left=100');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("       </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("<body bgcolor=\"#C3C7C8\" topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div id=\"header\"></div>\r\n");
      out.write("\t<div id=\"main\">\t\t\r\n");
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
      out.write("\t\t\t</div>\r\n");
      out.write("\t<div id=\"contentcontainer\">\r\n");
      out.write("\t\t<div id=\"admintemplateheader\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"bodyHeader\">Manage Sub-Menus</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"admin_content\">\r\n");
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
      out.write("\t\t\t\t\t\t<form class=\"ins\" id=\"esfrm\" name=\"esfrm\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<legend><span class=\"textOnBorder\">Sub-Menus</span></legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_select_submenu\">\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\">  Menu: </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"categoryId\" id=\"categoryId\" onchange=\"displaySubCategoryDetails()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select Menu</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(categoryList !=null && categoryList.length > 0){
												for(int i=0;i<categoryList.length;i++){
													category = categoryList[i];
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(Integer.toString(category.getCategoryId()));
      out.write('"');
      out.write('>');
      out.print(category.getCategoryName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
		}
										}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_subselect_submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\">Sub Menu: </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"subCategoryId\" id=\"subCategoryId\" onchange=\"getSubCategoryDetails()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\"> Add Sub Menu </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>&nbsp;<a id=\"delete\" style=\"visibility:hidden;\" href=\"javascript:deleteSubCategory()\"><span class=\"hyperlink\" id=\"delete\">Delete</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <a href=\"#\"><span class=\"hyperlink\" id=\"sort\">Sort</span></a> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_text_submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"subCategoryName\" id=\"subCategoryName\" size=\"40\" maxlength=\"48\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_textarea_submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\"> Description: &nbsp;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"subCategoryDescription\" id=\"subCategoryDescription\" cols=\"50\" rows=\"5\" value=\"\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_select_template_submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\">Template: </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"template\" id=\"template\" onchange=\"showTemplate(this.options.selectedIndex)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a Template</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
if(templateList!=null && templateList.length > 0){
												for(int j=0;j<templateList.length;j++){
													template = templateList[j];
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(Integer.toString(template.getTemplateId()));
      out.write('"');
      out.write('>');
      out.print(template.getTemplateFileName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
											}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_radio_submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\"> Access level:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"accessType\" id=\"accessType\" value=\"");
      out.print(Constants.PUBLIC_CONTENT);
      out.write("\" checked =\"true\" style=\"border: none;\" />Public\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"accessType\" id=\"accessType\" value=\"");
      out.print(Constants.PRIVTE_CONTENT);
      out.write("\" style=\"border: none;\" />Private\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"accessType\" id=\"accessType\" value=\"");
      out.print(Constants.PRIVATE_AND_PUBLIC_CONTENT );
      out.write("\" style=\"border:none;\" />Public And Private\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_checkbox_page\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span  class=\"columnLabel\"> isHomePage:</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"isHomePage\" id=\"isHomePage\" style=\"border: none;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"admin_body_content_button_submenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"Save\" value=\"Save Changes\" onclick=\"validateForm()\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"previewTemplate\" style=\"visibility: hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t   <img  align=\"top\" id=\"templateImage\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"Action\" id=\"Action\" value=\"");
      out.print(Constants.MANAGE_SUB_CATEGORY);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.PERFORM_ACTION);
      out.write("\" />\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.CATEGORY_ID);
      out.write("\" id=\"");
      out.print(Constants.CATEGORY_ID);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.SUB_CATEGORY_ID);
      out.write("\" id=\"");
      out.print(Constants.SUB_CATEGORY_ID);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.CONTENT_ID);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
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
