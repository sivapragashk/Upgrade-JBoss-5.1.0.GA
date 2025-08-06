package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Arrays;
import com.hd.directweb.service.ParamUtils;
import com.hd.directweb.service.constants.TemplateConstants;
import com.hd.directweb.service.helper.ParamReference;
import java.util.Iterator;
import com.hd.directweb.db.Group;
import com.hd.directweb.db.base.BaseGroupDAO;
import java.util.Map;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.constants.Constants;

public final class accessLevelsPopUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

ParamReference paramReference = null;
String accesslevels = null;
if(request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE) != null){
	paramReference = (ParamReference)request.getAttribute(TemplateConstants.TEMPLATE_PARAM_REFERENCE);
	accesslevels = paramReference.getAccessLevels();
}
int groupid = TextUtils.getIntValue(((Map)session.getAttribute(Constants.SESSION_VALUES)).get(Constants.GROUP_ID));
Group group = BaseGroupDAO.getInstance().load(groupid);
Map<Integer, String> groupAccessLevels = group.getGroupAccessLevels();
groupAccessLevels.put(Constants.PUBLIC, Constants.PUBLIC_ACCESS);
 
      out.write("\r\n");
      out.write(" <html>\r\n");
      out.write(" <head>\r\n");
      out.write(" <link href=\"stylesheets/admin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/templates/templates.js\"></script>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write("\t ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /admin/accessLevelsPopUp.jsp(31,2) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("contentFrm");
      // /admin/accessLevelsPopUp.jsp(31,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/content.do");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t <table border=\"0\" style=\"border: 0px;\">\r\n");
          out.write("\t\t \t ");
StringBuffer values = new StringBuffer();
		 	 if(request.getAttribute(Constants.MESSAGES) != null){
		 		 values.append("<tr><td>");
		 		 values.append("<font color=\"red\">"+request.getAttribute(Constants.MESSAGES)+"</font>");
		         values.append("</tr></td>");
		 	 }
		 	 if(groupAccessLevels != null && groupAccessLevels.size() > 0){
		 		List<String> accessLevelsList = null;
		 		 if(accesslevels != null){
		 			accessLevelsList = Arrays.asList(accesslevels.split(","));	 
		 		 }
				Iterator<Integer> groupAccessIterator = groupAccessLevels.keySet().iterator(); 
				values.append("<tr>");
				while(groupAccessIterator.hasNext()){
					Integer key = groupAccessIterator.next();
					String checked="";
					if(accessLevelsList != null && accessLevelsList.contains(""+key)){
						checked = "checked";
					}
					values.append("<td>");
					values.append("<input type=\"checkbox\" name=\""+Constants.GROUP_ACCESS_LEVELS+"\""); 
						  values.append(" value=\""+key+"\"");
						  values.append(" class=\"checkbox-nostyle\""+ checked +" />");
						  values.append(groupAccessLevels.get(key));
					values.append("</td>");
				}
				values.append("</tr>");
				values.append("<tr>");
				values.append("<td colspan=\"2\">");
					values.append("<input type=\"button\" value=\"SAVE\" onclick=\"javascript:saveAcceptedContent('"+Constants.ACCEPTED+"')\"/>");
					values.append("<input type=\"button\" value=\"CANCEL\" />");
				values.append("</td>");
				values.append("</tr>");
			}
          out.write("\r\n");
          out.write("\t\t\t");
          out.print(values);
          out.write("\r\n");
          out.write("\t\t</table>\t\t\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"");
          out.print(TemplateConstants.CONTENT_ID);
          out.write("\" id=\"");
          out.print(TemplateConstants.CONTENT_ID);
          out.write("\" value=\"");
          out.print(ParamUtils.getContentId(paramReference));
          out.write("\"/>\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.GROUP_ID);
          out.write("\" id=\"");
          out.print(Constants.GROUP_ID);
          out.write("\" value=\"");
          out.print(groupid);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.MODE);
          out.write("\" id=\"");
          out.print(Constants.MODE);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.print(TemplateConstants.SHARED_ITEM_STATUS);
          out.write("\" name=\"");
          out.print(TemplateConstants.SHARED_ITEM_STATUS);
          out.write("\" />\r\n");
          out.write("\t ");
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
      out.write("  </body>\r\n");
      out.write(" </html>");
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
