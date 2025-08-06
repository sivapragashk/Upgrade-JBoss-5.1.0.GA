package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.db.base.BaseMenuDAO;
import com.hd.directweb.db.base.BaseSubMenuDAO;
import net.fckeditor.*;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.ArrayList;
import com.hd.directweb.db.SharedContent;
import java.util.Set;
import com.hd.directweb.service.serviceImpl.GroupService;
import com.hd.directweb.db.Group;
import com.hd.directweb.db.base.BaseGroupDAO;
import com.hd.directweb.db.ContentReference;
import java.util.Map;
import com.hd.directweb.db.Content;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.ParamUtils;
import com.hd.directweb.service.constants.Constants;
import java.util.Iterator;
import com.hd.directweb.service.constants.TemplateConstants;
import com.hd.directweb.service.helper.ParamReference;
import com.hd.directweb.db.TemplateItems;
import com.hd.directweb.db.SubMenu;
import com.hd.directweb.db.Menu;
import com.hd.directweb.db.base.BaseSharedSubMenuDAO;
import com.hd.directweb.db.base.BaseSharedMenuDAO;
import com.hd.directweb.db.SharedSubMenu;
import com.hd.directweb.db.SharedMenu;
import java.util.List;
import com.hd.directweb.service.AdminIcons;
import com.hd.directweb.service.constants.PageConstants;
import com.hd.directweb.service.TextUtils;
import java.util.List;
import com.hd.directweb.service.constants.Constants;

public final class manageContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/admin/header.jsp");
    _jspx_dependants.add("/admin/adminMenu.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/FCKeditor.tld");
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tlds/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tlds/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fvalue_005finstanceName_005fheight_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fvalue_005finstanceName_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage.release();
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fvalue_005finstanceName_005fheight_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

List<TemplateItems> itemList = null;
List<Content> contentlist = null;
Content content = null;
ParamReference paramReference = null;
Map<String, ContentReference> contentmap = null;
Set<SharedContent> sharedContentSet = null;
List<Integer> sharedcontentListFormDB = null;
List<String> accessLevelsFromDB = null;
Integer groupId = 0;
Integer menuId = 0;
Integer subMenuId = 0;
Map<String, String> groupsMap = null;
List<String> accessLevelList = null;
List<SharedSubMenu> sharedSubMenuListFromDB = null;
List<SharedMenu> sharedMenuListFromDB = null;
List<Integer> sharedGroupList = null;
boolean editmode = false;
if(request.getAttribute(TemplateConstants.TEMPLATE_ITEMS) != null){
	itemList = (List) request.getAttribute(TemplateConstants.TEMPLATE_ITEMS);
}
if(request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE) != null){
	paramReference = (ParamReference)request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE);
}
if(request.getAttribute(TemplateConstants.CONTENT) != null){
	contentlist = (List)request.getAttribute(TemplateConstants.CONTENT);
	editmode = true;
	if(contentlist != null && contentlist.size() > 0){
		content = (Content) contentlist.get(0);
		contentmap = content.getContentItemValues();
		sharedContentSet = content.getSharedContent();
		String accesslevels = content.getAccessLevel();
		if(accesslevels != null){
			accessLevelsFromDB = Arrays.asList(accesslevels.split(","));
		}
		if(sharedContentSet != null && sharedContentSet.size() > 0){
			sharedcontentListFormDB =  new ArrayList<Integer>();
			Iterator<SharedContent> sharedContentIterator = sharedContentSet.iterator();
			while(sharedContentIterator.hasNext()){
				sharedcontentListFormDB.add(sharedContentIterator.next().getGroupId());
			}
		}
	}
	
}
if(session.getAttribute(Constants.SESSION_VALUES) != null){
	Map sessionValuesMap = (Map) session.getAttribute(Constants.SESSION_VALUES);
	groupId = Integer.valueOf(sessionValuesMap.get(Constants.GROUP_ID).toString());
	groupsMap = (Map<String, String>) sessionValuesMap.get(Constants.GROUPS);
}	

// To get the subMenu Based Access Level
if (paramReference != null){
	subMenuId = ParamUtils.getSubMenuId(paramReference);
	if(subMenuId != 0){
		SubMenu subMenu = BaseSubMenuDAO.getInstance().get(subMenuId);		
		sharedSubMenuListFromDB = BaseSharedSubMenuDAO.getInstance().getSharedSubMenuBasedOnGroup(subMenuId);
		if(subMenu != null){
			String accesslevels = subMenu.getAccessLevel();
			if(accesslevels != null){
				accessLevelList = Arrays.asList(accesslevels.split(","));				
			}
		}
		if(sharedSubMenuListFromDB != null){
			sharedGroupList =  new ArrayList<Integer>();
			for(int i=0;i<sharedSubMenuListFromDB.size();i++){
				SharedSubMenu sharedSubMenu = (SharedSubMenu)sharedSubMenuListFromDB.get(i);
				sharedGroupList.add(sharedSubMenu.getGroupId());
			}			
		}
	}
	else{
		menuId = ParamUtils.getMenuId(paramReference);
		Menu menu = BaseMenuDAO.getInstance().get(menuId);
		sharedMenuListFromDB = BaseSharedMenuDAO.getInstance().getSharedGroupForMenu(menuId);
		if(menu != null){
			String accesslevels = menu.getAccessLevel();
			if(accesslevels != null){
				accessLevelList = Arrays.asList(accesslevels.split(","));
			}
		}
		if(sharedMenuListFromDB != null){
			sharedGroupList =  new ArrayList<Integer>();
			for(int i=0;i<sharedMenuListFromDB.size();i++){
				SharedMenu sharedMenu = (SharedMenu)sharedMenuListFromDB.get(i);
				sharedGroupList.add(sharedMenu.getGroupId());
			}
		}
	}
}
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Direct Web</title> \r\n");
      out.write("\t<meta content=\"text/html; charset=utf-8\" http-equiv=\"content-type\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/templates/templates.js\"></script>\r\n");
      out.write("\t<link href=\"ckeditor/sample.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("\t<link href=\"fckeditor/sample.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"stylesheets/admin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/rounded.css\" />\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction insertContent(){\r\n");
      out.write("\t\t\tdocument.getElementById(\"manageContentFrm\").mode.value = 'save';\r\n");
      out.write("\t\t\tdocument.getElementById(\"manageContentFrm\").submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction FCKeditor_OnComplete(editorInstance) {\r\n");
      out.write("\t\t\twindow.status = editorInstance.Description;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"minwidth-body\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"border-top\" class=\"h_blue\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<span class=\"title\">Administration</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("<div id=\"header-box\">\r\n");
      out.write("\t<div id=\"module-menu\">\r\n");
      out.write("\t\t<ul id=\"menu\" class=\"disabled\">\r\n");
      out.write("\t\t\t<li class=\"enabled\"><a href=\"dynamicFields.do?mode=getDynamicPageDetails\">Site Design</a></li>\r\n");
      out.write("\t\t\t<li class=\"enabled\"><a href=\"menu.do?mode=getAllDetailsForMenu\">Menus</a></li>\r\n");
      out.write("\t\t\t<li class=\"enabled\"><a href=\"subMenu.do?mode=getAllDetailsForSubMenu\">Sub Menus</a></li>\r\n");
      out.write("\t\t\t<li class=\"enabled\"><a href=\"#\">Content</a></li>\r\n");
      out.write("\t\t\t<li class=\"enabled\"><a href=\"sharedItems.do?mode=loadSharedMenus\">Shared Menus</a></li>\r\n");
      out.write("\t\t\t<li class=\"enabled\"><a href=\"sharedItems.do?mode=loadSharedSubMenus\">Shared Sub Menus</a></li>\r\n");
      out.write("\t\t\t<li class=\"disabled\"><a>Help</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clr\"></div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t<div id=\"content-box\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div class=\"padding\">\r\n");
      out.write("\t\t\t\t<div id=\"toolbar-box\">\r\n");
      out.write("\t\t\t\t<div class=\"t\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t");

				List<String> iconlist = null;
				String currentpage = null;
				if(request.getAttribute(Constants.PAGE) != null && request.getAttribute(Constants.PAGE).toString().length() > 0) {
					currentpage = request.getAttribute(Constants.PAGE).toString();
					iconlist = AdminIcons.getIconsToBeDisplayed(currentpage);
				}
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"toolbar-list\" id=\"toolbar\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t");
if(TextUtils.containsValue(iconlist, PageConstants.SAVE)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"button\" id=\"toolbar-apply\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:save()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-32-save\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\tSave\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t");
}if(TextUtils.containsValue(iconlist, PageConstants.EDIT)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"button\" id=\"toolbar-apply\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:edit()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-32-edit\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\tEdit\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");
}if(TextUtils.containsValue(iconlist, PageConstants.DELETE)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"button\" id=\"toolbar-apply\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:deleteRecord()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-32-delete\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\tDelete\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");
}if(TextUtils.containsValue(iconlist, PageConstants.SORT)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"button\" id=\"toolbar-apply\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:sort()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-32-sort\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\tSort\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");
}if(TextUtils.containsValue(iconlist, PageConstants.BACK)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"button\" id=\"toolbar-apply\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:back()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-32-back\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\tBack\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"button\" id=\"toolbar-cancel\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"javascript:window.close()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-32-cancel\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\tClose\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>");
      out.write("\r\n");
      out.write("\t<div class=\"pagetitle\"><h2>Manage Content</h2></div>\r\n");
      out.write("\t<div class=\"clr\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"element-box\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /admin/manageContent.jsp(158,2) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("manageContentFrm");
      // /admin/manageContent.jsp(158,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/content.do");
      // /admin/manageContent.jsp(158,2) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setEnctype("multipart/form-data");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div style=\"padding-left: 15px;\">  \r\n");
          out.write("\t\t\t\t");
          //  logic:messagesPresent
          org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_005fmessagesPresent_005f0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
          _jspx_th_logic_005fmessagesPresent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fmessagesPresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          // /admin/manageContent.jsp(160,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fmessagesPresent_005f0.setMessage("true");
          int _jspx_eval_logic_005fmessagesPresent_005f0 = _jspx_th_logic_005fmessagesPresent_005f0.doStartTag();
          if (_jspx_eval_logic_005fmessagesPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("   \r\n");
              out.write("\t\t\t\t\t");
              //  html:messages
              org.apache.struts.taglib.html.MessagesTag _jspx_th_html_005fmessages_005f0 = (org.apache.struts.taglib.html.MessagesTag) _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter.get(org.apache.struts.taglib.html.MessagesTag.class);
              _jspx_th_html_005fmessages_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fmessages_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fmessagesPresent_005f0);
              // /admin/manageContent.jsp(161,5) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fmessages_005f0.setId("messages");
              // /admin/manageContent.jsp(161,5) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fmessages_005f0.setMessage("true");
              // /admin/manageContent.jsp(161,5) name = header type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fmessages_005f0.setHeader("error.header");
              // /admin/manageContent.jsp(161,5) name = footer type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fmessages_005f0.setFooter("error.footer");
              int _jspx_eval_html_005fmessages_005f0 = _jspx_th_html_005fmessages_005f0.doStartTag();
              if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.String messages = null;
                if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fmessages_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fmessages_005f0.doInitBody();
                }
                messages = (java.lang.String) _jspx_page_context.findAttribute("messages");
                do {
                  out.write("   \r\n");
                  out.write("\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_html_005fmessages_005f0, _jspx_page_context))
                    return;
                  out.write("   \r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_005fmessages_005f0.doAfterBody();
                  messages = (java.lang.String) _jspx_page_context.findAttribute("messages");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fmessages_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter.reuse(_jspx_th_html_005fmessages_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter.reuse(_jspx_th_html_005fmessages_005f0);
              out.write("   \r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fmessagesPresent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fmessagesPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage.reuse(_jspx_th_logic_005fmessagesPresent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage.reuse(_jspx_th_logic_005fmessagesPresent_005f0);
          out.write(" \r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t");
if(itemList != null && itemList.size() > 0){
			int count=0;
          out.write("\r\n");
          out.write("\t\t\t<div class=\"width-60 fltlft\" style=\"width: 90%;\">\r\n");
          out.write("\t\t\t\t<fieldset class=\"adminform\">\r\n");
          out.write("\t\t\t\t\t<legend>Content Details</legend>\r\n");
          out.write("\t\t\t\t\t\t<ul class=\"adminformlist\">\r\n");
          out.write("\t\t\t\t\t\t\t");
Iterator iterator = itemList.iterator();
								while(iterator.hasNext()){
									TemplateItems  item = (TemplateItems) iterator.next();
									if(item.getItemType().equals(Constants.FLD_TEXT)){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label>");
          out.print(item.getItemName());
          out.write(" </label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");
          out.print(item.getItemName());
          out.write("\" class=\"popuptextbox\" size=\"40\" value=\"");
          out.print(TextUtils.getItemValue(contentmap, item.getItemName()));
          out.write("\" onkeypress=\"return validateEnterKey()\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          out.print(TextUtils.getItemSummary(item));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}else if(item.getItemType().equals(Constants.FLD_FILE)){
										count++;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label>");
          out.print(item.getItemName());
          out.write(" </label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"uploads[");
          out.print(count);
          out.write("]\" size=\"40\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"TEMP_uploads[");
          out.print(count);
          out.write("]\" value=\"");
          out.print(item.getItemName());
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
          out.print(item.getItemName());
          out.write("\" value=\"");
          out.print(TextUtils.getItemValue(contentmap, item.getItemName()));
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          out.print(TextUtils.getItemSummary(item));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label>");
          out.print(item.getItemName());
          out.write(" </label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"ckeditor\" style=\"height: 310px;\"> \r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          //  FCK:editor
          net.fckeditor.tags.EditorTag _jspx_th_FCK_005feditor_005f0 = (net.fckeditor.tags.EditorTag) _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fvalue_005finstanceName_005fheight_005fnobody.get(net.fckeditor.tags.EditorTag.class);
          _jspx_th_FCK_005feditor_005f0.setPageContext(_jspx_page_context);
          _jspx_th_FCK_005feditor_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          // /admin/manageContent.jsp(195,12) name = instanceName type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_FCK_005feditor_005f0.setInstanceName(item.getItemName());
          // /admin/manageContent.jsp(195,12) name = height type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_FCK_005feditor_005f0.setHeight("300px");
          // /admin/manageContent.jsp(195,12) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_FCK_005feditor_005f0.setValue(TextUtils.getItemValue(contentmap, item.getItemName()));
          int _jspx_eval_FCK_005feditor_005f0 = _jspx_th_FCK_005feditor_005f0.doStartTag();
          if (_jspx_th_FCK_005feditor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fvalue_005finstanceName_005fheight_005fnobody.reuse(_jspx_th_FCK_005feditor_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fvalue_005finstanceName_005fheight_005fnobody.reuse(_jspx_th_FCK_005feditor_005f0);
          out.write(" \r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
								}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");

								Group group = BaseGroupDAO.getInstance().get(groupId);
								if(group != null){
									Map<Integer, String> groupAccessLevels = group.getGroupAccessLevels(); 
									groupAccessLevels.put(-1,Constants.PUBLIC_ACCESS);
									if(groupAccessLevels != null && groupAccessLevels.size() > 0){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<label><br/>Permissions</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"no-border\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<br/>\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
Iterator groupAccessIterator = groupAccessLevels.keySet().iterator(); 
											while(groupAccessIterator.hasNext()){
											Integer key = Integer.valueOf(groupAccessIterator.next().toString());
											String checked="";
											if(accessLevelList != null && accessLevelList.contains(""+key)){
												if(!editmode || (accessLevelsFromDB != null && accessLevelsFromDB.contains(""+key))){
													checked="checked";
												}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");
          out.print(Constants.GROUP_ACCESS_LEVELS);
          out.write('_');
          out.print(key);
          out.write("\" value=\"");
          out.print(key);
          out.write("\" class=\"checkbox-nostyle\" ");
          out.print(checked );
          out.write('/');
          out.write('>');
          out.print(groupAccessLevels.get(key));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
}else {
												continue; 
											}
										}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
								}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
Map<Integer, String> groupCollectionMap = GroupService.getServiceInstance().getGroupCollection(groupId, groupsMap);
								if(groupCollectionMap != null && groupCollectionMap.size() > 0){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<label><br/>Share Content</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"auto-overflow-left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
Iterator<Integer> groupCollectionIterator = groupCollectionMap.keySet().iterator();
											while(groupCollectionIterator.hasNext()){
												Integer key = Integer.valueOf(groupCollectionIterator.next().toString());
												String checked="";
												if(sharedGroupList != null && sharedGroupList.contains(key)){
												if(sharedcontentListFormDB == null || sharedcontentListFormDB.contains(key)){
													checked="checked";
												}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");
          out.print(Constants.GROUP_SHARING);
          out.write('_');
          out.print(key);
          out.write("\" value=\"");
          out.print(key);
          out.write("\" class=\"checkbox-nostyle\" ");
          out.print(checked);
          out.write('/');
          out.write('>');
          out.print(groupCollectionMap.get(key));
          out.write("\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
}else {
												continue;
												}
											}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</li>\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t</ul>\t\r\n");
          out.write("\t\t\t\t</fieldset>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t");
}
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.MODE);
          out.write("\" name=\"");
          out.print(Constants.MODE);
          out.write("\" />\r\n");
          out.write("\t\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.CONTENT_ID);
          out.write("\" name=\"");
          out.print(TemplateConstants.CONTENT_ID);
          out.write("\" value=\"");
          out.print(content==null?0:content.getContentId());
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.TEMPLATE_ID);
          out.write("\" name=\"");
          out.print(Constants.TEMPLATE_ID);
          out.write("\" value=\"");
          out.print(ParamUtils.getTemplateId(paramReference));
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.MENU_ID);
          out.write("\" name=\"");
          out.print(TemplateConstants.MENU_ID);
          out.write("\" value=\"");
          out.print(ParamUtils.getMenuId(paramReference));
          out.write("\" />\r\n");
          out.write("\t\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.SUB_MENU_ID);
          out.write("\" name=\"");
          out.print(TemplateConstants.SUB_MENU_ID);
          out.write("\" value=\"");
          out.print(ParamUtils.getSubMenuId(paramReference));
          out.write("\" />\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(TemplateConstants.SECTION_ID);
          out.write("\" value=\"");
          out.print(ParamUtils.getSectionId(paramReference));
          out.write("\"/>\r\n");
          out.write("\t  ");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
      out.write("\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  ");
      out.write("<div id=\"border-bottom\"></div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p class=\"copyright\" style=\"float: none;\">\r\n");
      out.write("\t\tCopyright © 2011 HunterDouglas. All Rights Reserved.<br/>\r\n");
      out.write("\t\tHunterDouglas DirectWeb 2.0 \r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div>&nbsp;</div>\r\n");
      out.write("</div>");
      out.write("\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fmessages_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fmessages_005f0);
    // /admin/manageContent.jsp(162,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setName("messages");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }
}
