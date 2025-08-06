package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.db.base.BaseTemplateDetailsDAO;
import org.hibernate.criterion.Order;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.db.base.BaseTemplatesDAO;
import java.util.*;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.constants.DynamicAdminPGConstants;
import com.hd.directweb.db.*;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.DynamicFields;
import com.hd.directweb.service.AdminIcons;
import com.hd.directweb.service.constants.PageConstants;
import com.hd.directweb.service.TextUtils;
import java.util.List;
import com.hd.directweb.service.constants.Constants;

public final class DynamicFieldsMapping_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/admin/header.jsp");
    _jspx_dependants.add("/admin/adminMenu.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tlds/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tlds/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody;

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
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage.release();
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.release();
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

List<AdminPagesMaster> adminPagesList = null;
int selectedPage = 0;
int templateId = 0;
int detailId = 0;
Map<String, String> dynamicValuesMap = null;
if(session.getAttribute(Constants.ADMIN_PAGE_LIST) != null){
	adminPagesList = (List<AdminPagesMaster>) session.getAttribute(Constants.ADMIN_PAGE_LIST);
}
if(request.getAttribute(Constants.SELECTED_PAGE) != null){
	selectedPage = Integer.valueOf(request.getAttribute(Constants.SELECTED_PAGE).toString());
}
if(request.getAttribute(Constants.TEMPLATE_ID) != null && request.getAttribute(Constants.TEMPLATE_ID).toString().length() > 0){
	templateId = Integer.valueOf(request.getAttribute(Constants.TEMPLATE_ID).toString());
}
if(request.getAttribute(Constants.TEMPLATE_DETAIL_ID) != null && request.getAttribute(Constants.TEMPLATE_DETAIL_ID).toString().length() > 0){
	detailId = Integer.valueOf(request.getAttribute(Constants.TEMPLATE_DETAIL_ID).toString());
}
if(session.getAttribute(Constants.DYNAMIC_FIELDS_VALUES_MAP) != null){
	dynamicValuesMap = (Map<String, String>)session.getAttribute(Constants.DYNAMIC_FIELDS_VALUES_MAP);
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>Dynamic Fields Mapping</title>\r\n");
      out.write("<head>\r\n");
      out.write("  \t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("  \t<link href=\"stylesheets/admin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/rounded.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction edit(){\r\n");
      out.write("\t\t\tdocument.getElementById(\"SelectedPage\").value = document.getElementById(\"PageType\").value;\r\n");
      out.write("\t\t\tdocument.getElementById(\"mode\").value = 'getDynamicFieldsValue';\r\n");
      out.write("\t\t\tdocument.getElementById(\"dynamicFieldsFrm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction loadPageDetails(){\r\n");
      out.write("\t\t\tif(document.getElementById(\"PageType\").value == 0){\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.getElementById(\"SelectedPage\").value = document.getElementById(\"PageType\").value;\r\n");
      out.write("\t\t\tdocument.getElementById(\"mode\").value = 'setDynamicPageParams';\r\n");
      out.write("\t\t\tdocument.getElementById(\"dynamicFieldsFrm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction getChildElements(page, name){\r\n");
      out.write("\t\t\tif(page == '");
      out.print(DynamicAdminPGConstants.PG_TEMPLATE_ITEMS);
      out.write("' &&  name == 'Templates'){\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"TemplateId\").value = (eval(\"document.getElementById('\"+name+\"').value\"));\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"mode\").value = 'setDynamicPageParams';\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"dynamicFieldsFrm\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction save(){\r\n");
      out.write("\t\t\tdocument.getElementById(\"mode\").value = 'save';\r\n");
      out.write("\t\t\tdocument.getElementById(\"dynamicFieldsFrm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction textCounter(field, countfield, maxlimit) {\r\n");
      out.write("\t\t\t  if (field.value.length > maxlimit) // if too long...trim it!\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t\t  field.value = field.value.substring(0, maxlimit);\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\t  // otherwise, update 'characters left' counter\r\n");
      out.write("\t\t\t  else if(countfield != null){\r\n");
      out.write("\t\t\t\t  countfield.value = maxlimit - field.value.length;\r\n");
      out.write("\t\t\t\t  }  \r\n");
      out.write("\t\t\t  }\r\n");
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
      out.write("\t<div class=\"pagetitle\"><h2>Manage Design</h2></div>\r\n");
      out.write("\t<div class=\"clr\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"element-box\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fenctype_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /admin/DynamicFieldsMapping.jsp(86,2) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("dynamicFieldsFrm");
      // /admin/DynamicFieldsMapping.jsp(86,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/dynamicFields.do");
      // /admin/DynamicFieldsMapping.jsp(86,2) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          // /admin/DynamicFieldsMapping.jsp(88,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
              // /admin/DynamicFieldsMapping.jsp(89,5) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fmessages_005f0.setId("messages");
              // /admin/DynamicFieldsMapping.jsp(89,5) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fmessages_005f0.setMessage("true");
              // /admin/DynamicFieldsMapping.jsp(89,5) name = header type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_html_005fmessages_005f0.setHeader("error.header");
              // /admin/DynamicFieldsMapping.jsp(89,5) name = footer type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
if(adminPagesList != null && adminPagesList.size() > 0){
          out.write("\r\n");
          out.write("\t\t\t<div class=\"width-60 fltlft\">\r\n");
          out.write("\t\t\t\t<fieldset class=\"adminform\">\r\n");
          out.write("\t\t\t\t\t<legend>Design Details</legend>\r\n");
          out.write("\t\t\t\t\t\t<ul class=\"adminformlist\">\r\n");
          out.write("\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t<label>Select a Page:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t<select name=\"");
          out.print(Constants.PAGE_TYPE);
          out.write("\" id=\"");
          out.print(Constants.PAGE_TYPE);
          out.write("\" onchange=\"loadPageDetails()\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a page type</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
for(int i=0;i<adminPagesList.size();i++){
										AdminPagesMaster adminpages = (AdminPagesMaster) adminPagesList.get(i);
										String selected="";
										if(adminpages.getId() ==  selectedPage)
											selected = "selected";
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(adminpages.getId());
          out.write('"');
          out.write(' ');
          out.print(selected);
          out.write('>');
          out.print(adminpages.getName());
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t</li>\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
int count=0;
							for(int i=0;i<adminPagesList.size();i++){
								AdminPagesMaster adminpages = (AdminPagesMaster) adminPagesList.get(i);
								if(adminpages.getId() == selectedPage){
									Set<DynamicFieldsMapping> dynamicFieldSet = adminpages.getPageSpecificFields();
									Iterator dynamicFieldsItr = dynamicFieldSet.iterator();
									while(dynamicFieldsItr.hasNext()){
										DynamicFieldsMapping dynamicFields = (DynamicFieldsMapping) dynamicFieldsItr.next();
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label>");
          out.print(dynamicFields.getFieldName());
          out.write("</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
if(dynamicFields.getFieldType().equals(Constants.FLD_TEXT)){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");
          out.print(dynamicFields.getFieldName());
          out.write("\" value=\"");
          out.print(TextUtils.getValue(dynamicValuesMap, dynamicFields.getFieldName()));
          out.write("\" size=\"40\" maxlength=\"25\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
}else if(dynamicFields.getFieldType().equals(Constants.FLD_TEXTAREA)){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"");
          out.print(dynamicFields.getFieldName());
          out.write("\" rows=\"5\" cols=\"40\" onkeydown=\"textCounter(this.form.");
          out.print(dynamicFields.getFieldName());
          out.write(",this.form.remLen,100);\" onkeyup=\"textCounter(this.form.");
          out.print(dynamicFields.getFieldName());
          out.write(",this.form.remLen,100);\">");
          out.print(TextUtils.getValue(dynamicValuesMap, dynamicFields.getFieldName()));
          out.write("</textarea>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
}else if(dynamicFields.getFieldType().equals(Constants.FLD_FILE)){
												count++;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"uploads[");
          out.print(count);
          out.write("]\" size=\"40\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"TEMP_uploads[");
          out.print(count);
          out.write("]\" value=\"");
          out.print(dynamicFields.getFieldName());
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
}else if(dynamicFields.getFieldType().equals(Constants.FLD_SELECT)){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"");
          out.print(dynamicFields.getFieldName());
          out.write("\" id=\"");
          out.print(dynamicFields.getFieldName());
          out.write("\" onchange=\"getChildElements('");
          out.print(selectedPage);
          out.write("', '");
          out.print(dynamicFields.getFieldName());
          out.write("')\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a value</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(dynamicFields.getQuery() != null && dynamicFields.getQuery().length() > 0){
														List valuesList = null;
														boolean templates = false;
														if(dynamicFields.getFieldName().equals(Constants.TEMPLATES)){
															templates = true;
															valuesList = BaseTemplatesDAO.getInstance().findAll(Order.asc("name"));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else if(dynamicFields.getFieldName().equals(Constants.SECTIONS)){
															valuesList = BaseTemplateDetailsDAO.getInstance().getSectionsSpecificToTemplate(dynamicFields.getQuery().replace("?",""+templateId));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
														for(int j=0;j<valuesList.size();j++){
															DynamicFields dynamicValues = (DynamicFields) valuesList.get(j);
															String selected = "";
															if(templates && (dynamicValues.getId() == templateId)){
																selected = "selected";
															}else if(dynamicValues.getId() == detailId){
																selected = "selected";
															}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(dynamicValues.getId());
          out.write('"');
          out.write(' ');
          out.print(selected);
          out.write('>');
          out.print(dynamicValues.getName());
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
													}else if (dynamicFields.getFieldData() != null && dynamicFields.getFieldData().length() > 0){
														String[] values = dynamicFields.getFieldData().split(",");
														for(int j=0;j<values.length;j++){
															String selected = "";
															String value = TextUtils.getValue(dynamicValuesMap, dynamicFields.getFieldName()); 
															if(value != null && value.equals(values[j])){
																selected = "selected";
															}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(values[j]);
          out.write('"');
          out.write(' ');
          out.print(selected);
          out.write('>');
          out.print(values[j]);
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
													}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
}else {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
								}
							}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t</fieldset>\r\n");
          out.write("\t\t\t</div>\t\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.SELECTED_PAGE);
          out.write("\" id=\"");
          out.print(Constants.SELECTED_PAGE);
          out.write("\" value=\"");
          out.print(selectedPage);
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.TEMPLATE_ID);
          out.write("\" id=\"");
          out.print(Constants.TEMPLATE_ID);
          out.write("\" value=\"");
          out.print(templateId );
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.MODE);
          out.write("\" id=\"");
          out.print(Constants.MODE);
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(DynamicAdminPGConstants.ID);
          out.write("\" id=\"");
          out.print(DynamicAdminPGConstants.ID);
          out.write("\" value=\"");
          out.print(TextUtils.getValue(dynamicValuesMap, DynamicAdminPGConstants.ID));
          out.write("\"/>\r\n");
          out.write("\t\t");
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
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("<div id=\"border-bottom\"></div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p class=\"copyright\" style=\"float: none;\">\r\n");
      out.write("\t\tCopyright © 2011 HunterDouglas. All Rights Reserved.<br/>\r\n");
      out.write("\t\tHunterDouglas DirectWeb 2.0 \r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div>&nbsp;</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
    // /admin/DynamicFieldsMapping.jsp(90,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
