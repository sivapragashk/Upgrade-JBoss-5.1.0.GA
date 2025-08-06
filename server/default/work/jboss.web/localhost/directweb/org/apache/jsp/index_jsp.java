package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.helper.SessionValidationHelper;
import com.hd.directweb.service.SimpleProperty;
import com.hd.directweb.search.utils.SearchConstants;
import com.hd.directweb.service.ParamUtils;
import com.hd.directweb.service.helper.ParamReference;
import com.hd.directweb.service.helper.SectionReference;
import com.hd.directweb.service.serviceImpl.GroupDesignService;
import com.hd.directweb.db.GroupDesignDetails;
import com.hd.directweb.db.Templates;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.hd.directweb.service.serviceImpl.TemplateDetailsService;
import com.hd.directweb.service.serviceImpl.TemplateService;
import com.hd.directweb.service.serviceImpl.GroupService;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.constants.TemplateConstants;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
if(request.getAttribute(Constants.SESSION_VALIDATION_FLAG) == null && !SessionValidationHelper.validateSession(session)){
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "validateSession.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
return;
}
ParamReference paramReference = null;
if(request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE) != null){
	paramReference = (ParamReference)request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE);
}
String baseDirectory = "default";
boolean editmode = false;
boolean approvalmode = false;
if(request.getAttribute(Constants.GROUP_DESIGN_INFO) != null){
	baseDirectory = ((GroupDesignDetails) request.getAttribute(Constants.GROUP_DESIGN_INFO)).getGroupDirectory();
	approvalmode = true;
}else if(session.getAttribute(Constants.GROUP_DESIGN_INFO) != null){
	baseDirectory = ((GroupDesignDetails) session.getAttribute(Constants.GROUP_DESIGN_INFO)).getGroupDirectory();
	editmode = true;
}

if(session.getAttribute(Constants.ENABLE_EDIT_MODE) == null){
	editmode = false;
	approvalmode = false;
}
SimpleProperty property = new SimpleProperty(application.getInitParameter(Constants.PROPERTY_FILE));
String basePreviewPath = property.getProperty(Constants.BASE_PREVIEW_PATH);
String customtemplateid = property.getProperty(Constants.CUSTOM_TEMPLATE_REFERENCE);

int menuid = ParamUtils.getMenuId(paramReference);
int submenuid = ParamUtils.getSubMenuId(paramReference);
int templateid = ParamUtils.getTemplateId(paramReference);
SectionReference.getInstance().loadSections(templateid);

Templates template = TemplateService.getServiceInstance().getTemplateDetails(templateid);

String templatecss = "";
String templatename = "";
String templatejs = "";

String globalcss = "stylesheets/templates/"+baseDirectory+"/global.css";
String baseindex = "/templates/"+baseDirectory+"/index.jsp";
if(template != null){
	templatecss = "stylesheets/templates/"+baseDirectory+"/"+template.getcSSFilename();
	if(TextUtils.getValue(template.getTemplateReference()).length() > 0){
		templatename = "/templates/"+baseDirectory+"/"+template.getTemplateReference();
	}else{
		templatename = "/templates/"+template.getGlobalTemplateReference();
	}

	templatejs = "javascript/"+baseDirectory+"/"+template.getjSFilename();
}
System.out.println("Base--->"+baseDirectory+"---->"+templateid +"---> "+templateid+" -> templatecss -> "+templatecss+" -> templatejs -> "+templatejs);
if(request.getAttribute(SearchConstants.SEARCH_RESULTS) != null){
	if(TextUtils.getValue(session.getAttribute(SearchConstants.SEARCH_TYPE)).equals(SearchConstants.SEARCH_DOCUMENT)){
		templatename = "/templates/documentSearchResults.jsp";
	}else{
		templatename = "/templates/directWebSearchResults.jsp";
	}
}

System.out.println("TemplateName---->"+templatename);


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction sortcontent(sectionId){\r\n");
      out.write("\t\t\tvar url = '/DirectWeb/content.do?sectionId='+sectionId+'&mode=loadSortContent';\r\n");
      out.write("\t\t\tvar  menuid = document.getElementById(\"menuId\").value;\r\n");
      out.write("\t\t\tvar  submenuid = document.getElementById(\"subMenuId\").value;\r\n");
      out.write("\t\t\tif(submenuid > 0)\r\n");
      out.write("\t\t\t\turl += '&menuId='+menuid+'&subMenuId='+submenuid;\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\turl += '&menuId='+menuid;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar left = (screen.width/2)-(1200/2);\r\n");
      out.write("\t\t\tvar top = (screen.height/2)-(750/2);\r\n");
      out.write("\t\t\twindow.open (url, 'DirectWeb', 'toolbar=0, location=0, directories=0, status=1, scrollbars=1, resizable=0, width=1200, height=750, top='+top+', left='+left);\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/includes.jsp" + (("/templates/includes.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("globalcss", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(globalcss), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("templatecss", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(templatecss), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /index.jsp(99,1) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("directwebFrm");
      // /index.jsp(99,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("template.do");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, baseindex + ((baseindex).indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("TemplateName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(templatename), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("templateId", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(templateid), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menuId", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(menuid), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("subMenuId", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(submenuid), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("basePreviewPath", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(basePreviewPath), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("APPROVAL_MODE", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(approvalmode), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("EDIT_MODE", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(editmode), request.getCharacterEncoding()), out, true);
          out.write("\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.MODE);
          out.write("\" name=\"");
          out.print(Constants.MODE);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.APPLICATION_MODE);
          out.write("\" name=\"");
          out.print(Constants.APPLICATION_MODE);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.TEMPLATE_ID);
          out.write("\" name=\"");
          out.print(Constants.TEMPLATE_ID);
          out.write("\" value=\"");
          out.print(templateid);
          out.write("\"/>\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.MENU_ID);
          out.write("\" name=\"");
          out.print(TemplateConstants.MENU_ID);
          out.write("\" value=\"");
          out.print(menuid);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.SUB_MENU_ID);
          out.write("\" name=\"");
          out.print(TemplateConstants.SUB_MENU_ID);
          out.write("\" value=\"");
          out.print(submenuid);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.CONTENT_ID);
          out.write("\" name=\"");
          out.print(TemplateConstants.CONTENT_ID);
          out.write("\" value=\"\"/>\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.GROUP_ID);
          out.write("\" name=\"");
          out.print(Constants.GROUP_ID);
          out.write("\" value=\"");
          out.print(TextUtils.getIntValue(((Map)session.getAttribute(Constants.SESSION_VALUES)).get(Constants.GROUP_ID)));
          out.write("\"/>\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.SHARED_GROUP_ID);
          out.write("\" name=\"");
          out.print(Constants.SHARED_GROUP_ID);
          out.write("\" value=\"");
          out.print(ParamUtils.getSharedGroupId(paramReference));
          out.write("\"/>\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.SHARED_ITEM_STATUS);
          out.write("\" name=\"");
          out.print(TemplateConstants.SHARED_ITEM_STATUS);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.BREAD_CRUMB_FLAG);
          out.write("\" name=\"");
          out.print(TemplateConstants.BREAD_CRUMB_FLAG);
          out.write("\" value=\"");
          out.print(request.getAttribute(TemplateConstants.BREAD_CRUMB_FLAG));
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.CUSTOM_TEMPLATE_ID);
          out.write("\" name=\"");
          out.print(Constants.CUSTOM_TEMPLATE_ID);
          out.write("\" value=\"");
          out.print(customtemplateid);
          out.write("\"/>\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(Constants.ENABLE_EDIT_MODE);
          out.write("\" name=\"");
          out.print(Constants.ENABLE_EDIT_MODE);
          out.write("\" value=\"");
          out.print(editmode);
          out.write("\"/>\r\n");
          out.write("\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.reuse(_jspx_th_html_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.reuse(_jspx_th_html_005fform_005f0);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var _gaq = _gaq || [];\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-21088467-1']);\r\n");
      out.write("  _gaq.push(['_setDomainName', 'none']);\r\n");
      out.write("  _gaq.push(['_setAllowLinker', true]);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  (function() {\r\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n");
      out.write("  })();\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
