package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.ehs.tools.*;
import java.util.*;
import com.hd.ehs.form.*;

public final class JHAAnalysisCreation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tlds/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tlds/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage.release();
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction.release();
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
      out.write("<html>\r\n");
      out.write("<title>EHS</title>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"stylesheets/jha.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"stylesheets/ppe_assessment.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction nextpage(pagenumber){\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.PageNumber.value = (pagenumber+1);\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.JHAMappingId.value = (pagenumber+1);\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.mode.value = 'jhaAnalysisCreation';\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction addMultipleValues(pagenumber){\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.PageNumber.value = pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.JHAMappingId.value = ++pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.mode.value = 'jhaAnalysisCreation';\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction previouspage(pagenumber, isLastPage){\r\n");
      out.write("\t\t\tif(pagenumber > 1){\r\n");
      out.write("\t\t\t\tdocument.jhaAnalysisCreationform.mode.value = 'jhaAnalysisCreation';\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tdocument.jhaAnalysisCreationform.mode.value = 'jhaGeneralInformationCreation';\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t\t//if(isLastPage == 'True'){\r\n");
      out.write("\t\t\t\tdocument.jhaAnalysisCreationform.JHAMappingId.value = (pagenumber+1);\r\n");
      out.write("\t\t\t//}else{\r\n");
      out.write("\t\t\t//\tdocument.jhaAnalysisCreationform.JHAMappingId.value = pagenumber;\r\n");
      out.write("\t\t\t//}\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.PageNumber.value = --pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction editInternalData(key, pagenumber){\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.PageNumber.value = pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.JHAMappingId.value = ++pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.JHAInternalRecordKey.value = key;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.mode.value = 'jhaAnalysisCreationEditObject';\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction deleteInternalData(key, pagenumber){\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.PageNumber.value = pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.JHAMappingId.value = ++pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.JHAInternalRecordKey.value = key;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.mode.value = 'jhaAnalysisCreationDeleteObject';\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction saveAnalysisCreationDetails(pagenumber){\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.JHAMappingId.value = ++pagenumber;\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.mode.value = 'saveJHAAnalysisCreationDetails';\r\n");
      out.write("\t\t\tdocument.jhaAnalysisCreationform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

boolean addMultipleValues = false;
List<Object> jhaAnalysisCategoryMasterList = null;
Map<String, Map> jhaAnalysisCreationMasterResultMap = null;
Map<String, Map> jhaAnalysisCreationInternalResultMap = null;
Map<String, String> jhaAnalysisCreationEditMap = null;
int pagenumber = Integer.parseInt(request.getAttribute(Constants.PAGE_NUMBER).toString());
if(request.getAttribute(Constants.JHA_ANALYSIS_CATEGORY_MASTER_DATA) != null){
	jhaAnalysisCategoryMasterList = (List) request.getAttribute(Constants.JHA_ANALYSIS_CATEGORY_MASTER_DATA);
}
if(request.getAttribute(Constants.JHA_ADD_MULTIPLE_VALUES) != null && request.getAttribute(Constants.JHA_ADD_MULTIPLE_VALUES).equals(Constants.TRUE)){
	addMultipleValues = true;
}

if(session.getAttribute(Constants.JHA_ANALYSIS_CREATION_RESULT) != null){
	jhaAnalysisCreationMasterResultMap = (Map)session.getAttribute(Constants.JHA_ANALYSIS_CREATION_RESULT);
	jhaAnalysisCreationInternalResultMap = (Map)jhaAnalysisCreationMasterResultMap.get(""+(pagenumber+1));	
	
}	
if(request.getAttribute(Constants.JHA_ANALYSIS_CREATION_EDIT_OBJECT) != null){
	jhaAnalysisCreationEditMap = (Map) request.getAttribute(Constants.JHA_ANALYSIS_CREATION_EDIT_OBJECT);
}

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<TABLE style=\"BORDER-COLLAPSE: collapse\" cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("\t  <TBODY>\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t     <TD align=right>\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\"><IMG src=\"images/logo.gif\"  border=0></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr height=\"7\"><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/ehs/adminAction.do?mode=getMasterDetails\" class=\"menulink\">General Information</a>|\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/ehs/ppeAssessment.do?mode=loadPPEHazard\" class=\"menulink\">PPE Hazard Assessment</a>|\r\n");
      out.write("\t\t\t\t\t\t\t<!--<a href=\"/ehs/newAssessment.do?mode=loadGeneralInformation\" class=\"menulink\">New PPE Assessment Creation</a>| -->\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/ehs/newAssessment.do?mode=loadPPEAssessmentModule\" class=\"menulink\">PPE Assessments</a>|\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/ehs/jhaAnalysis.do?mode=loadJHAAnalysisModule\" class=\"menulink\">JHA Analysis</a>|\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- The below link is used for JHA Assesment -->\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/ehs/jhaAssessment.do?mode=loadJHAAssessmentModule\" class=\"menulink\">JHA Assessments</a>|\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--  The below link is used for JHA Admin -->\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/ehs/jhaAdminAction.do?mode=getJhaMasterDetails\" class=\"menulink\">JHA General Information</a>|\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:window.close()\" class=\"menulink\">Close</a>&nbsp;\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE class=hd-main cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t  <TR valign=\"top\">\r\n");
      out.write("\t    <TD class=hd-titleareaframe colSpan=\"2\">\r\n");
      out.write("\t\t    <DIV id=\"pagetitle\">\r\n");
      out.write("\t\t      <TABLE class=hd-titleareaframe cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t\t\t        <TR>\r\n");
      out.write("\t\t\t          <TD style=\"PADDING-BOTTOM: 2px\">\r\n");
      out.write("\t\t\t            <TABLE style=\"PADDING-LEFT: 0px; PADDING-TOP: 0px\" cellSpacing=0 cellPadding=0 border=0 height=\"10\">\r\n");
      out.write("\t\t\t              <TBODY>\r\n");
      out.write("           \t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t                <TD style=\"PADDING-TOP: 4px\" noWrap align=middle width=108 height=\"10\">&nbsp;</TD>\r\n");
      out.write("\t\t\t\t               \r\n");
      out.write("\t\t\t\t                <TD style=\"PADDING-TOP: 0px\" noWrap height=\"10\"></TD>\r\n");
      out.write("\t\t\t\t                <TD valign=\"right\"></TD>\r\n");
      out.write("\t\t\t\t            </TR>\r\n");
      out.write("\t\t\t\t          </TBODY>\r\n");
      out.write("\t\t\t\t         </table> \r\n");
      out.write("\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t </TABLE>\r\n");
      out.write("\t\t\t</DIV>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>");
      out.write("\r\n");
      out.write("\t<div id=\"jhaheader\">EHS Tool Box - JHA Module</div>\r\n");
      out.write("\t<div>&nbsp;</div>\r\n");
      out.write("\t");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_005fmessagesPresent_005f0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _005fjspx_005ftagPool_005flogic_005fmessagesPresent_0026_005fmessage.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_005fmessagesPresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fmessagesPresent_005f0.setParent(null);
      // /JHAAnalysisCreation.jsp(86,1) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fmessagesPresent_005f0.setMessage("true");
      int _jspx_eval_logic_005fmessagesPresent_005f0 = _jspx_th_logic_005fmessagesPresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fmessagesPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("   \r\n");
          out.write("\t\t");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_005fmessages_005f0 = (org.apache.struts.taglib.html.MessagesTag) _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid_005fheader_005ffooter.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_005fmessages_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fmessages_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fmessagesPresent_005f0);
          // /JHAAnalysisCreation.jsp(87,2) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fmessages_005f0.setId("messages");
          // /JHAAnalysisCreation.jsp(87,2) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fmessages_005f0.setMessage("true");
          // /JHAAnalysisCreation.jsp(87,2) name = header type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fmessages_005f0.setHeader("error.header");
          // /JHAAnalysisCreation.jsp(87,2) name = footer type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
              out.write("\t\t");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_html_005fmessages_005f0, _jspx_page_context))
                return;
              out.write("   \r\n");
              out.write("\t\t");
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
          out.write("\t");
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
      out.write("\t<div>\r\n");
      out.write("\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /JHAAnalysisCreation.jsp(92,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/jhaAnalysis.do");
      // /JHAAnalysisCreation.jsp(92,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setMethod("post");
      // /JHAAnalysisCreation.jsp(92,2) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("jhaAnalysisCreationform");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div>\r\n");
          out.write("\t\t\t\t<table border=\"0\" width=\"90%\" align=\"left\" id=\"tablenobackground\">\r\n");
          out.write("\t\t\t\t");
if(jhaAnalysisCategoryMasterList != null && jhaAnalysisCategoryMasterList.size() > 0){
					JHAAnalysisCategoryMaster jhaAnalysisCategoryMaster = (JHAAnalysisCategoryMaster) jhaAnalysisCategoryMasterList.get(pagenumber-1);
					if(jhaAnalysisCreationInternalResultMap != null && jhaAnalysisCreationInternalResultMap.size() == 1 && !addMultipleValues
								&& !jhaAnalysisCategoryMaster.getAddMultipleValues().equals(Constants.JHA_ADD_MULTIPLE_VALUES))
						jhaAnalysisCreationEditMap = 	jhaAnalysisCreationInternalResultMap.get(Constants.PRIMARY_DATA);
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td align=\"center\" id=\"jhaanalysisheader\">\r\n");
          out.write("\t\t\t\t\t\t\tNEW JHA ANALYSIS CREATION<br/><br/>\r\n");
          out.write("\t\t\t\t\t\t\t");
          out.print(jhaAnalysisCategoryMaster.getCategoryName());
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t<table border=\"0\" width=\"100%\" align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
          out.write("\t\t\t\t\t\t\t<td width=\"45%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<table border=\"0\" width=\"100%\" align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
Set jhaAnalysisCreationMasterDetails = jhaAnalysisCategoryMaster.getAnalysisCreationMasterDetails();
								Iterator jhaAnalysisCreationIterator = jhaAnalysisCreationMasterDetails.iterator();
								while(jhaAnalysisCreationIterator.hasNext()){
									JHAAnalysisCreationMaster jhaAnalysisCreationMaster = (JHAAnalysisCreationMaster)jhaAnalysisCreationIterator.next();
									if(jhaAnalysisCreationMaster != null){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
if(jhaAnalysisCreationMaster.getAnalysisCreationType().equals(Constants.EHS_TEXT)){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"columnlabel\">");
          out.print(jhaAnalysisCreationMaster.getAnalysisCreationKey());
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" size=\"45\" name=\"");
          out.print(Constants.FLD_JHA_ANALYSIS_CREATION+"_"+jhaAnalysisCreationMaster.getAnalysisCreationKey()+"_"+jhaAnalysisCategoryMaster.getId()+"_"+jhaAnalysisCreationMaster.getId());
          out.write("\" \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   value=\"");
          out.print(TextUtils.getTextFieldValue(jhaAnalysisCreationMaster.getAnalysisCreationKey()+"_"+jhaAnalysisCategoryMaster.getId()+"_"+jhaAnalysisCreationMaster.getId(), jhaAnalysisCreationEditMap) );
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}else if(jhaAnalysisCreationMaster.getAnalysisCreationType().equals(Constants.EHS_SELECT)){
          out.write("\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"columnlabel\">");
          out.print(jhaAnalysisCreationMaster.getAnalysisCreationKey());
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"");
          out.print(Constants.FLD_JHA_ANALYSIS_CREATION+"_"+jhaAnalysisCreationMaster.getAnalysisCreationKey()+"_"+jhaAnalysisCategoryMaster.getId()+"_"+jhaAnalysisCreationMaster.getId());
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a value</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(jhaAnalysisCreationMaster.getAnalysisCreationValue() != null && 
															jhaAnalysisCreationMaster.getAnalysisCreationValue().length() > 0){
															String[] options = jhaAnalysisCreationMaster.getAnalysisCreationValue().split(",");
															for(int i=0;i<options.length;i++){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(options[i]);
          out.write('"');
          out.write(' ');
          out.print(TextUtils.getSelectFieldValue(jhaAnalysisCreationMaster.getAnalysisCreationKey()+"_"+jhaAnalysisCategoryMaster.getId()+"_"+jhaAnalysisCreationMaster.getId(), jhaAnalysisCreationEditMap, options[i]));
          out.write('>');
          out.print(options[i]);
          out.write("</option>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
													  }
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  </select>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"columnlabel\">");
          out.print(jhaAnalysisCreationMaster.getAnalysisCreationKey());
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(jhaAnalysisCreationMaster.getAnalysisCreationValue() != null && 
															jhaAnalysisCreationMaster.getAnalysisCreationValue().length() > 0){
															String[] options = jhaAnalysisCreationMaster.getAnalysisCreationValue().split(",");
														for(int i=0;i<options.length;i++){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");
          out.print(Constants.FLD_JHA_ANALYSIS_CREATION_CHECK+"_"+jhaAnalysisCreationMaster.getAnalysisCreationKey()+"_"+jhaAnalysisCategoryMaster.getId()+"_"+jhaAnalysisCreationMaster.getId());
          out.write("\" \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   value=\"");
          out.print(options[i]);
          out.write('"');
          out.write(' ');
          out.print(TextUtils.getCheckFieldValue(jhaAnalysisCreationMaster.getAnalysisCreationKey()+"_"+jhaAnalysisCategoryMaster.getId()+"_"+jhaAnalysisCreationMaster.getId(), jhaAnalysisCreationEditMap, options[i]));
          out.write('/');
          out.write('>');
          out.print(options[i]);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
													 }
												}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t  \t");
}
							  	 }
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t  \t <tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
if(jhaAnalysisCategoryMaster.getAddMultipleValues().equals(Constants.JHA_ADD_MULTIPLE_VALUES)){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"");
          out.print(jhaAnalysisCategoryMaster.getAddMultipleButtonLabel());
          out.write("\" onclick=\"javascript:addMultipleValues(");
          out.print(pagenumber);
          out.write(")\" class=\"jhabuttonstyle\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.JHA_ADD_MULTIPLE_VALUES);
          out.write("\" value=\"");
          out.print(Constants.TRUE);
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
if(jhaAnalysisCategoryMasterList!=null && pagenumber < jhaAnalysisCategoryMasterList.size()){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Back\" onclick=\"javascript:previouspage(");
          out.print(pagenumber);
          out.write(")\" class=\"jhabuttonstyle\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Next\" onclick=\"javascript:nextpage(");
          out.print(pagenumber);
          out.write(")\" class=\"jhabuttonstyle\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Back\" onclick=\"javascript:previouspage(");
          out.print(pagenumber);
          out.write(',');
          out.write('\'');
          out.print(Constants.TRUE);
          out.write("')\" class=\"jhabuttonstyle\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Save\" onclick=\"javascript:saveAnalysisCreationDetails(");
          out.print(pagenumber);
          out.write(")\" class=\"jhabuttonstyle\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t\t\t   \t </table>\r\n");
          out.write("\t\t\t\t\t\t\t</td> \t \r\n");
          out.write("\t\t\t\t\t\t\t<td align=\"left\" width=\"55%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
if(jhaAnalysisCategoryMaster.getAddMultipleValues().equals(Constants.JHA_ADD_MULTIPLE_VALUES)){
									if(jhaAnalysisCreationInternalResultMap != null){
										 Iterator jhaAnalysisCreationInternalResultIterator = jhaAnalysisCreationInternalResultMap.keySet().iterator();
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t <table border=\"0\" width=\"90%\" align=\"left\" id=\"tableborder\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t ");
while(jhaAnalysisCreationInternalResultIterator.hasNext()){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t <tr valign=\"top\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t \t");
String internalKey = jhaAnalysisCreationInternalResultIterator.next().toString();
											 	Map<String, String> jhaAnalysisCreationResultMap = (Map)jhaAnalysisCreationInternalResultMap.get(internalKey);
											 	Iterator jhaAnalysisCreationResultIterator = jhaAnalysisCreationResultMap.keySet().iterator();
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t \t<td width=\"80%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t \t");
while(jhaAnalysisCreationResultIterator.hasNext()){
												 		String  key = jhaAnalysisCreationResultIterator.next().toString();
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t \t\t");
          out.print(jhaAnalysisCreationResultMap.get(key));
          out.write("<br/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t \t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t \t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t \t<td><a href=\"javascript:editInternalData(");
          out.print(internalKey);
          out.write(',');
          out.write(' ');
          out.print(pagenumber);
          out.write(")\">Edit</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t \t<td><a href=\"javascript:deleteInternalData(");
          out.print(internalKey);
          out.write(',');
          out.write(' ');
          out.print(pagenumber);
          out.write(")\">Delete</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t </tr>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t <tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t ");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t </table>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
								}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</td>\t\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t</table>\t\t\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t");
}
          out.write("\t\t\r\n");
          out.write("\t\t\t\t<tr><td>&nbsp;</td></tr>\t\r\n");
          out.write("\t\t\t</table>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.PAGE_NUMBER);
          out.write("\" value=\"");
          out.print(pagenumber);
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.MODE);
          out.write("\" />\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.JHA_MAPPING_ID);
          out.write("\" />\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.JHA_INTERNAL_RECORD_KEY);
          out.write("\" />\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.JHA_ANALYSIS_CREATION_EDIT_FLAG);
          out.write("\" value=\"");
          out.print(request.getAttribute(Constants.JHA_ANALYSIS_CREATION_EDIT_FLAG) );
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.JHA_ANALYSIS_CREATION_EDIT_ID);
          out.write("\" value=\"");
          out.print(request.getAttribute(Constants.JHA_ANALYSIS_CREATION_EDIT_ID) );
          out.write("\"/>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      out.write("\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fmessages_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fmessages_005f0);
    // /JHAAnalysisCreation.jsp(88,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
