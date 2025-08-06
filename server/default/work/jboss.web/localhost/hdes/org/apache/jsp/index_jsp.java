package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.es.tools.Constants;
import com.hd.es.helper.*;
import com.hd.es.tools.*;
import com.hd.es.tools.Constants;
import com.hd.es.db.base.Category;
import com.hd.es.db.base.SubCategory;
import com.hd.es.tools.Constants;
import com.hd.es.helper.*;
import com.hd.es.tools.*;
import java.util.*;
import com.hd.es.db.base.*;
import com.hd.es.helper.*;
import com.hd.es.tools.*;
import java.util.*;
import com.hd.es.db.base.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/adminMenu.jsp");
    _jspx_dependants.add("/templates.jsp");
    _jspx_dependants.add("/templates/admin/ESCollection.jsp");
    _jspx_dependants.add("/templates/ESCollection.jsp");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html> \r\n");
      out.write("\r\n");

String mode = "";
ParamReference paramReference = null;
if(session.getAttribute(Constants.MODE) != null)
	mode = session.getAttribute(Constants.MODE).toString();
if(request.getAttribute(Constants.PARAM_REFERENCE) != null)
	paramReference = (ParamReference)request.getAttribute(Constants.PARAM_REFERENCE);

      out.write("\r\n");
      out.write("<head> \r\n");
      out.write("\t<title>Enlightened Style</title> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/es_global.css\" media=\"screen, projection\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(ParamUtils.getRenderingStyle(paramReference));
      out.write("\" media=\"screen, projection\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/ddaccordion.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/menu.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/admin.js\"></script>\r\n");
      out.write("</head> \r\n");
      out.write("<body  bgcolor=\"#C3C7C8\" topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<form name=\"esfrm\" method=\"post\">\r\n");
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
      out.write("\t\t\t<div id=\"contentcontainer\">\r\n");
      out.write("\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t<!-- Main content goes here -->\r\n");
      out.write("\t\t\t\t\t");
if(ParamUtils.getRenderingTemplate(paramReference).equals(Constants.TEMPLATE_ES_COLLECTION) && mode.equals(Constants.MODE_EDIT)){
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");

String imagepath = application.getInitParameter("IMAGE_URL")+"/"+ParamUtils.getCategoryId(paramReference)+"/"+ParamUtils.getSubCategoryId(paramReference)+"/";
Map contentmap = null;
if(request.getAttribute(Constants.TEMPLATE_CONTENT) != null)
	contentmap = (HashMap)request.getAttribute(Constants.TEMPLATE_CONTENT);
if(contentmap != null && contentmap.size() > 0){
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
if(contentmap.get(TemplateConstants.MAIN_HEADER) != null){
			List contentlist = (LinkedList) contentmap.get(TemplateConstants.MAIN_HEADER);
			  if(contentlist!=null && contentlist.size() > 0){	
				Content content = (Content) contentlist.get(0);
				SerializedContentObj serializedContentObj = content.getContent();
				if(serializedContentObj !=null && serializedContentObj.getContentMap() != null && serializedContentObj.getContentMap().size() > 0){
					Map lcl_contentmap = serializedContentObj.getContentMap();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"templateheader\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.HEADER)));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:edit('");
      out.print(content.getContentId());
      out.write("', '10', '");
      out.print(Constants.GET_SECTION_CONTENT);
      out.write("')\" id=\"admintemplate_editdelete_links\">Edit</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:deletecontent('");
      out.print(content.getContentId());
      out.write("', '");
      out.print(Constants.GET_SECTION_CONTENT);
      out.write("')\" id=\"admintemplate_editdelete_links\">Delete</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
}
			}else{
      out.write("\t\r\n");
      out.write("\t\t\t\t<div id=\"admintemplateheader\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:insert('10', '");
      out.print(Constants.GET_ITEM_DETAILS);
      out.write("')\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
}
		}
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
if(contentmap.get(TemplateConstants.MAIN_HEADER_CONTENT) != null){
			List contentlist = (LinkedList) contentmap.get(TemplateConstants.MAIN_HEADER_CONTENT);
			if(contentlist!=null && contentlist.size() > 0){	
				Content content = (Content) contentlist.get(0);
				SerializedContentObj serializedContentObj = content.getContent();
				if(serializedContentObj !=null && serializedContentObj.getContentMap() != null && serializedContentObj.getContentMap().size() > 0){
					Map lcl_contentmap = serializedContentObj.getContentMap();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"escollection_header_content_main\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"escollection_header_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.HEADER_CONTENT)));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:edit('");
      out.print(content.getContentId());
      out.write("', '11', '");
      out.print(Constants.GET_SECTION_CONTENT);
      out.write("')\" id=\"admintemplate_editdelete_links\">Edit</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:deletecontent('");
      out.print(content.getContentId());
      out.write("', '");
      out.print(Constants.GET_SECTION_CONTENT);
      out.write("')\" id=\"admintemplate_editdelete_links\">Delete</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t");
String image = "background:url(" + imagepath + lcl_contentmap.get(TemplateConstants.HEADER_IMAGE) + ") no-repeat;";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"escollection_header_image\" style=\"");
      out.print(image);
      out.write("\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t");
}
			}else{
      out.write("\t\r\n");
      out.write("\t\t\t\t<div id=\"escollection_admin_template_header_content_main\">\r\n");
      out.write("\t\t\t\t\t<div id=\"escollection_admin_admin_header_content\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:insert('11', '");
      out.print(Constants.GET_ITEM_DETAILS);
      out.write("')\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
}
		}
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"escollection_body_content_container\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
if(contentmap.get(TemplateConstants.BODY_CONTENT) != null){ 
				List contentlist = (LinkedList) contentmap.get(TemplateConstants.BODY_CONTENT);
					if(contentlist!=null && contentlist.size() > 0){	
						for(int i=0;i<contentlist.size();i++){
						Content content = (Content) contentlist.get(i);
						SerializedContentObj serializedContentObj = content.getContent();
						if(serializedContentObj !=null && serializedContentObj.getContentMap() != null && serializedContentObj.getContentMap().size() > 0){
							Map lcl_contentmap = serializedContentObj.getContentMap();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"escollection_body_header_main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"escollection_body_header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.HEADER)));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"escollection_body_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.CONTENT)) );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:edit('");
      out.print(content.getContentId());
      out.write("', '12', '");
      out.print(Constants.GET_SECTION_CONTENT);
      out.write("')\" id=\"admintemplate_editdelete_links\">Edit</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:deletecontent('");
      out.print(content.getContentId());
      out.write("', '");
      out.print(Constants.GET_SECTION_CONTENT);
      out.write("')\" id=\"admintemplate_editdelete_links\">Delete</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
}
						}
					}
			}
      out.write("\r\n");
      out.write("\t\t\t<div id=\"escollection_admin_template_body_content\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:insert('12', '");
      out.print(Constants.GET_ITEM_DETAILS);
      out.write("')\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
}
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.RENDERING_TEMPLATE);
      out.write("\" value=\"");
      out.print(Constants.TEMPLATE_ES_COLLECTION);
      out.write("\" />\t\t");
      out.write('\r');
      out.write('\n');
}else{
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

String imagepath = application.getInitParameter("IMAGE_URL")+"/"+ParamUtils.getCategoryId(paramReference)+"/"+ParamUtils.getSubCategoryId(paramReference)+"/";
Map contentmap = null;
if(request.getAttribute(Constants.TEMPLATE_CONTENT) != null)
	contentmap = (HashMap)request.getAttribute(Constants.TEMPLATE_CONTENT);
if(contentmap != null && contentmap.size() > 0){
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t");
if(contentmap.get(TemplateConstants.MAIN_HEADER) != null){
			List contentlist = (LinkedList) contentmap.get(TemplateConstants.MAIN_HEADER);
			if(contentlist!=null && contentlist.size() > 0){	
				Content content = (Content) contentlist.get(0);
				SerializedContentObj serializedContentObj = content.getContent();
				if(serializedContentObj !=null && serializedContentObj.getContentMap() != null && serializedContentObj.getContentMap().size() > 0){
					Map lcl_contentmap = serializedContentObj.getContentMap();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"templateheader\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.HEADER)));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
}
			}
		}
      out.write("\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
if(contentmap.get(TemplateConstants.MAIN_HEADER_CONTENT) != null){
			List contentlist = (LinkedList) contentmap.get(TemplateConstants.MAIN_HEADER_CONTENT);
			if(contentlist!=null && contentlist.size() > 0){	
				Content content = (Content) contentlist.get(0);
				SerializedContentObj serializedContentObj = content.getContent();
				if(serializedContentObj !=null && serializedContentObj.getContentMap() != null && serializedContentObj.getContentMap().size() > 0){
					Map lcl_contentmap = serializedContentObj.getContentMap();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=escollection_header_content_main>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"escollection_header_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.HEADER_CONTENT)));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t");
String image = "background:url(" + imagepath + lcl_contentmap.get(TemplateConstants.HEADER_IMAGE) + ") no-repeat;";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"escollection_header_image\" style=\"");
      out.print(image);
      out.write("\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t");
}
			}
		}
      out.write("\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"escollection_body_content_container\">\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
if(contentmap.get(TemplateConstants.BODY_CONTENT) != null){ 
					List contentlist = (LinkedList) contentmap.get(TemplateConstants.BODY_CONTENT);
							if(contentlist!=null && contentlist.size() > 0){	
								for(int i=0;i<contentlist.size();i++){
									Content content = (Content) contentlist.get(i);
									SerializedContentObj serializedContentObj = content.getContent();
									if(serializedContentObj !=null && serializedContentObj.getContentMap() != null && serializedContentObj.getContentMap().size() > 0){
										Map lcl_contentmap = serializedContentObj.getContentMap();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"escollection_body_header_main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"escollection_body_header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.HEADER)));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"escollection_body_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getText(lcl_contentmap.get(TemplateConstants.CONTENT)) );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
								}
							}
				}
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
}
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(Constants.RENDERING_TEMPLATE);
      out.write("\" value=\"");
      out.print(Constants.TEMPLATE_ES_COLLECTION);
      out.write("\" />");
      out.write('\r');
      out.write('\n');
}
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><br/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.PERFORM_ACTION);
      out.write("\" />\t\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.CATEGORY_ID);
      out.write("\" id=\"");
      out.print(Constants.CATEGORY_ID);
      out.write("\" value=\"");
      out.print(ParamUtils.getCategoryId(paramReference));
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.SUB_CATEGORY_ID);
      out.write("\" id=\"");
      out.print(Constants.SUB_CATEGORY_ID);
      out.write("\" value=\"");
      out.print(ParamUtils.getSubCategoryId(paramReference));
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"");
      out.print(Constants.CONTENT_ID);
      out.write("\" value=\"");
      out.print(ParamUtils.getContentId(paramReference));
      out.write("\"/>\r\n");
      out.write("\t\t\r\n");
      out.write(" \t</div>\r\n");
      out.write(" \t</form>\r\n");
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
