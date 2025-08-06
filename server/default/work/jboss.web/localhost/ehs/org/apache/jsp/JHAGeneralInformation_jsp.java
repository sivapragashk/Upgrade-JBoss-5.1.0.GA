package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.ehs.tools.*;
import java.util.*;
import com.hd.ehs.form.*;

public final class JHAGeneralInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\tfunction nextpage(target){\r\n");
      out.write("\t\t\tdocument.jhaGeneralInformationform.mode.value = target;\r\n");
      out.write("\t\t\tdocument.jhaGeneralInformationform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

String assessmentNo = "";
int pagenumber = 0;
if(request.getAttribute(Constants.PAGE_NUMBER) != null)
	pagenumber = Integer.parseInt(request.getAttribute(Constants.PAGE_NUMBER).toString());
if(session.getAttribute(Constants.ASSESSMENT_NO) != null)
	assessmentNo = session.getAttribute(Constants.ASSESSMENT_NO).toString();
Map<String, Map> jhaAnalysisCreationMasterResultMap = null;
Map<String, Map> jhaAnalysisCreationInternalResultMap = null;
Map<String, String> jhaAnalysisCreationEditMap = null; 
if(session.getAttribute(Constants.JHA_ANALYSIS_CREATION_RESULT) != null){
	jhaAnalysisCreationMasterResultMap = (Map)session.getAttribute(Constants.JHA_ANALYSIS_CREATION_RESULT);
	jhaAnalysisCreationInternalResultMap = (Map)jhaAnalysisCreationMasterResultMap.get(""+(pagenumber+1));	
	if(jhaAnalysisCreationInternalResultMap != null && jhaAnalysisCreationInternalResultMap.size() == 1){
		jhaAnalysisCreationEditMap = 	jhaAnalysisCreationInternalResultMap.get(Constants.PRIMARY_DATA);
	}
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
      // /JHAGeneralInformation.jsp(41,1) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          // /JHAGeneralInformation.jsp(42,2) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fmessages_005f0.setId("messages");
          // /JHAGeneralInformation.jsp(42,2) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fmessages_005f0.setMessage("true");
          // /JHAGeneralInformation.jsp(42,2) name = header type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fmessages_005f0.setHeader("error.header");
          // /JHAGeneralInformation.jsp(42,2) name = footer type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /JHAGeneralInformation.jsp(47,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/jhaAnalysis.do");
      // /JHAGeneralInformation.jsp(47,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setMethod("post");
      // /JHAGeneralInformation.jsp(47,2) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("jhaGeneralInformationform");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div>\r\n");
          out.write("\t\t\t\t<table border=\"0\" width=\"75%\" align=\"left\" id=\"tablenobackground\">\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td align=\"center\" id=\"jhaanalysisheader\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\tNEW JHA ANALYSIS CREATION<br/><br/>\r\n");
          out.write("\t\t\t\t\t\tGeneral Information\t\t\t\t\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td width=\"50%\">\r\n");
          out.write("\t\t\t\t\t\t<div id=\"columnlabel\">JHA Assessment No.</div>\r\n");
          out.write("\t\t\t\t\t\t<input type=\"text\" size=\"30\" name=\"");
          out.print(Constants.ASSESSMENT_NO);
          out.write("\" value=\"");
          out.print(assessmentNo);
          out.write("\" readonly>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t");
if(request.getAttribute(Constants.JHA_GENERAL_INFORMATION_MASTER_DATA) != null){
					List<Object> jhaGeneralInformationlist = (List)request.getAttribute(Constants.JHA_GENERAL_INFORMATION_MASTER_DATA);
					if(jhaGeneralInformationlist != null){
						for(int i=0;i<jhaGeneralInformationlist.size();i++){
							EHSMaster ehsMaster = (EHSMaster)jhaGeneralInformationlist.get(i);
							if(i%2==0){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<td width=\"50%\"><div id=\"columnlabel\">");
          out.print(ehsMaster.getParentName());
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
if(ehsMaster.getFieldType().equals(Constants.EHS_TEXT)){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" size=\"30\" name=\"");
          out.print(Constants.JHA_GENERAL_INFORMATION+"_"+ehsMaster.getParentName());
          out.write("\" value=\"");
          out.print(TextUtils.getTextFieldValue(ehsMaster.getParentName(), jhaAnalysisCreationEditMap) );
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t");
}else if(ehsMaster.getFieldType().equals(Constants.EHS_SELECT)){
									Set details = ehsMaster.getEHSMasterDetails();
									Iterator detailsitr = details.iterator();
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<select name=\"");
          out.print(Constants.JHA_GENERAL_INFORMATION+"_"+ehsMaster.getParentName());
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select a value</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
while(detailsitr.hasNext()){
											EHSDetailsDO ehsdetails = (EHSDetailsDO) detailsitr.next();
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print(ehsdetails.getShortText());
          out.write('"');
          out.write(' ');
          out.print(TextUtils.getSelectFieldValue(ehsMaster.getParentName(), jhaAnalysisCreationEditMap, ehsdetails.getShortText()));
          out.write('>');
          out.print(ehsdetails.getShortText());
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
}else if(ehsMaster.getFieldType().equals(Constants.EHS_CHECK)){
									Set details = ehsMaster.getEHSMasterDetails();
									Iterator detailsitr = details.iterator();
									while(detailsitr.hasNext()){
									EHSDetailsDO ehsdetails = (EHSDetailsDO) detailsitr.next();
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");
          out.print(Constants.JHA_GENERAL_INFORMATION+"_"+ehsMaster.getParentName());
          out.write("\" \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.print(ehsdetails.getShortText());
          out.write('"');
          out.write(' ');
          out.print(TextUtils.getCheckFieldValue(ehsMaster.getParentName(), jhaAnalysisCreationEditMap, ehsdetails.getShortText()));
          out.write('/');
          out.write('>');
          out.print(ehsdetails.getShortText());
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
          out.write("\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t");
if(i==(jhaGeneralInformationlist.size()-1) || (i%2)!=0){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\t\r\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Next\" onclick=\"javascript:nextpage('jhaAnalysisCreation')\" class=\"jhabuttonstyle\">\r\n");
          out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t</td>\t\r\n");
          out.write("\t\t\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t\t");
}
				}
          out.write("\r\n");
          out.write("\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t</table>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.PAGE_NUMBER);
          out.write("\" value=\"");
          out.print(Constants.JHA_GENERAL_INFORMATION_PAGE);
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.JHA_MAPPING_ID);
          out.write("\" value=\"");
          out.print(Constants.JHA_GENERAL_INFORMATION_PAGE);
          out.write("\"/>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"");
          out.print(Constants.MODE);
          out.write("\" />\r\n");
          out.write("\t\t\t\r\n");
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
    // /JHAGeneralInformation.jsp(43,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
