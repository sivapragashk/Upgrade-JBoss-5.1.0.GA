package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.ehs.tools.*;
import java.util.*;
import com.hd.ehs.form.*;

public final class PrintJHAAnalysisCreationDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>EHS</title>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"stylesheets/jha.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"stylesheets/ppe_assessment.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\t\r\n");
      out.write("<body>\r\n");
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
      out.write("<div>&nbsp;</div>\r\n");

List<Object> jhaAnalysisCategoryMasterList = null;
Map<String, Map> jhaAnalysisCreationResultMap = null;
Map<String, Map> jhaAnalysisCreationInternalResultMap = null;
String assessmentNo = null;
if(request.getAttribute(Constants.JHA_ANALYSIS_CATEGORY_MASTER_DATA) != null)
	jhaAnalysisCategoryMasterList = (List) request.getAttribute(Constants.JHA_ANALYSIS_CATEGORY_MASTER_DATA);

if(request.getAttribute(Constants.ASSESSMENT_NO) != null)
	assessmentNo = request.getAttribute(Constants.ASSESSMENT_NO).toString();
if(request.getAttribute(Constants.JHA_ANALYSIS_CREATION_RESULT) != null)
	jhaAnalysisCreationResultMap = (Map)request.getAttribute(Constants.JHA_ANALYSIS_CREATION_RESULT);

if(jhaAnalysisCreationResultMap != null && jhaAnalysisCreationResultMap.size() > 0){
	jhaAnalysisCreationInternalResultMap = (Map)jhaAnalysisCreationResultMap.get(Constants.JHA_GENERAL_INFORMATION_PAGE);
	if(jhaAnalysisCreationInternalResultMap != null){
		Map<String, String> jhaGeneralInformationMap = jhaAnalysisCreationInternalResultMap.get(Constants.PRIMARY_DATA);
		if(jhaGeneralInformationMap != null){
      out.write("\r\n");
      out.write("\t\t\t<table width=\"80%\" border=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" border=\"1\" id=\"tableborder\" cellpadding=\"8\" cellspacing=\"1\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"50%\" id=\"jha_print_header\">Job Hazard Analysis</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\" width=\"50%\">HunterDouglas</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><b>JHA No :</b>&nbsp;");
      out.print(TextUtils.getText(assessmentNo));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><b>Job / Eq Name:</b>&nbsp;");
      out.print(TextUtils.getTextFieldValue(Constants.JOB_EQUIPMENT, jhaGeneralInformationMap));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><b>Location:</b>&nbsp;");
      out.print(TextUtils.getTextFieldValue(Constants.LOCATION, jhaGeneralInformationMap));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><b>Department:</b>&nbsp;");
      out.print(TextUtils.getTextFieldValue(Constants.DEPARTMENT, jhaGeneralInformationMap));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>Date Created:</b>&nbsp;");
      out.print(TextUtils.getTextFieldValue(Constants.DATE_CREATED, jhaGeneralInformationMap));
      out.write("<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>Date Revised:</b>&nbsp;");
      out.print(TextUtils.getTextFieldValue(Constants.DATE_REVISED, jhaGeneralInformationMap));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><b>Developed By:</b>&nbsp;");
      out.print(TextUtils.getTextFieldValue(Constants.DEVELOPED_BY, jhaGeneralInformationMap));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><b>Reviewed By:</b>&nbsp;");
      out.print(TextUtils.getTextFieldValue(Constants.REVIEWED_BY, jhaGeneralInformationMap));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\t\t\r\n");
      out.write("\t\t\t\t\t");
Iterator jhaAnalysisCreationResultItr = jhaAnalysisCreationResultMap.keySet().iterator();
					String addMultipleValues = "N";
					String cellpadding = "";
					boolean header = false;
					while(jhaAnalysisCreationResultItr.hasNext()){
						header=true;
						String jhaCategory = jhaAnalysisCreationResultItr.next().toString();
						if(jhaCategory.equals(Constants.JHA_GENERAL_INFORMATION_PAGE))
							continue;
						jhaAnalysisCreationInternalResultMap = jhaAnalysisCreationResultMap.get(jhaCategory);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
String categoryHeader = "";
								  if(jhaAnalysisCategoryMasterList != null && jhaAnalysisCategoryMasterList.size() > 0){
									  for(int i=0;i<jhaAnalysisCategoryMasterList.size();i++){
										JHAAnalysisCategoryMaster jhaAnalysisCategoryMaster = (JHAAnalysisCategoryMaster) jhaAnalysisCategoryMasterList.get(i);	
											if(jhaAnalysisCategoryMaster.getId() == (Integer.valueOf(jhaCategory)-1)){
												categoryHeader = jhaAnalysisCategoryMaster.getPrintHeader();
												addMultipleValues = jhaAnalysisCategoryMaster.getAddMultipleValues();
												if(addMultipleValues.equals("Y"))
													cellpadding = "5";
												else
													cellpadding = "0";
											}
									  }
								  }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"jha_print_header\">");
      out.print(categoryHeader);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" id=\"tableborder\" cellpadding=\"");
      out.print(cellpadding);
      out.write("\" cellspacing=\"1\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
Iterator jhaAnalysisCreationInternalResultItr = jhaAnalysisCreationInternalResultMap.keySet().iterator();
									String[] jhaHeaders = null;
									while(jhaAnalysisCreationInternalResultItr.hasNext()){
										String internalKey = jhaAnalysisCreationInternalResultItr.next().toString();
										Map<String, String> jhaAnalysisCreationMap = jhaAnalysisCreationInternalResultMap.get(internalKey);
										if(jhaAnalysisCreationMap != null){
											Iterator jhaAnalysisCreationItr = jhaAnalysisCreationMap.keySet().iterator();
											if(addMultipleValues.equals("Y")){
												if(header){
													header = false;
													jhaHeaders = new String[jhaAnalysisCreationMap.size()];
													int count = 0;
													while(jhaAnalysisCreationItr.hasNext()){
														jhaHeaders[count++] = jhaAnalysisCreationItr.next().toString();
													}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr id=\"jha_print_column_header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for(int i=0;i<jhaHeaders.length;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><b>");
      out.print(TextUtils.getJHAAnalysisHeader(jhaHeaders[i]));
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t");
}
										    	if(jhaHeaders != null && jhaHeaders.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\t");
      out.print(TextUtils.getJHAAnalysisValues(jhaHeaders, jhaAnalysisCreationMap));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t");
}
											}else{
												int i=0;
												while(jhaAnalysisCreationItr.hasNext()){
													String headerKey = jhaAnalysisCreationItr.next().toString();
													if(i%2==0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr style=\"height: 120px;\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"jha_print_column_header\">");
      out.print(TextUtils.getJHAAnalysisHeader(headerKey));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getTextFieldValue(headerKey, jhaAnalysisCreationMap));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(i==(jhaAnalysisCreationMap.size()-1) || (i%2)!=0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
													i+=1;
												}
											}
										}	
			 						}
      out.write("\r\n");
      out.write("\t \t\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t");
}
	}	
}
      out.write("\r\n");
      out.write("</body>\t\r\n");
      out.write("\r\n");
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
}
