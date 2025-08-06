package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.ehs.form.GeneralInformation;
import com.hd.ehs.tools.Constants;
import java.util.*;
import com.hd.ehs.form.PPEAssessmentMaster;
import com.hd.ehs.form.PPEAssessmentForm;
import com.hd.ehs.form.NewPPEAssessmentForm;

public final class NewHazardAssessmentCreation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<html>\r\n");
      out.write("<title>EHS</title>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"stylesheets/ppe_assessment.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
 
int startIndex=0,endIndex=0, total = 0,pageNumber=0,hazard_per_page=2,checkBoxCounter=0,counter=0,checkBoxRecommendedCounter=0,checkBoxRequiredCounter=0,selectedStartIndex=0,selectedEndIndex=0;
if(request.getAttribute("PAGE_NUMBER")!=null){
	pageNumber = Integer.parseInt(request.getAttribute("PAGE_NUMBER").toString());
	}
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction goNextPage(intDirection, serialNumber){\r\n");
      out.write("\t\tvar pageNumer;\r\n");
      out.write("\t\tpageNumber = ");
      out.print(pageNumber);
      out.write(";\r\n");
      out.write("\t\tif(!intDirection){\r\n");
      out.write("\t\t\t--pageNumber;\r\n");
      out.write("\t\t\tdocument.getElementById('direction').value = \"false\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t++pageNumber;\r\n");
      out.write("\t\t\tdocument.getElementById('direction').value = \"true\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif(pageNumber<0){\r\n");
      out.write("\t\t\tdocument.getElementById('mode').value = \"loadGeneralInformation\";\r\n");
      out.write("\t\t\tdocument.getElementById('sequenceStatus').value = \"No\";\r\n");
      out.write("\t\t\tdocument.getElementById('generalInformation').submit();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.getElementById('mode').value = \"maintainPPEAssessmentDetails\";\r\n");
      out.write("\t\t\tdocument.getElementById('pageNumber').value = pageNumber;\r\n");
      out.write("\t\t\tdocument.getElementById('generalInformation').submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction submitForm(){\r\n");
      out.write("\t\tdocument.getElementById('mode').value = \"maintainPPEAssessmentDetails\";\r\n");
      out.write("\t\tdocument.getElementById('generalInformation').submit();\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");

PPEAssessmentForm ppeAssessmentForm = null;
PPEAssessmentForm selectedAssessmentForm = null;
ArrayList list = null;
Iterator it  = null;
LinkedHashMap ppeAssessmentDetailsMap = null;
LinkedHashMap radioButtonCounterMap = new LinkedHashMap();
LinkedHashMap selectedPartsHazardPPEMap = null;
HashMap hazardPPEMap = null;
List hazardList = null;
List ppeList = null;
List reqAndReccList = null;
String assessmentTitle;
String assessmentTitle1;
String checked ="";
String reqOrRec = null;
int indexvalue  = 0;
ArrayList ppePartsMasterList = null;
String imagePath = "";
StringBuffer hazardTitle = new StringBuffer();
String directoryPath = Constants.IMAGE_DIR;
System.out.println("Path--->"+directoryPath);
	if(session.getAttribute("PPE_HAZARD_PARTS_DETAILS")!=null)
		ppePartsMasterList = (ArrayList)session.getAttribute("PPE_HAZARD_PARTS_DETAILS");
	if(session.getAttribute("PPE_HAZARD_ASSESSMENT_DETAILS")!=null)
		ppeAssessmentDetailsMap = (LinkedHashMap)session.getAttribute("PPE_HAZARD_ASSESSMENT_DETAILS");
	if(session.getAttribute("SELECTED_PPE_HAZARD_ASSESSMENT_DETAILS")!=null)
		selectedPartsHazardPPEMap = (LinkedHashMap)session.getAttribute("SELECTED_PPE_HAZARD_ASSESSMENT_DETAILS");
	if(request.getAttribute("START_INDEX")!=null)
		selectedStartIndex = Integer.parseInt(request.getAttribute("START_INDEX").toString());
	if(request.getAttribute("END_INDEX")!=null)
		selectedEndIndex = Integer.parseInt(request.getAttribute("END_INDEX").toString());
	
if(ppePartsMasterList != null && ppePartsMasterList.size() > 0){
	total = (new Double(Math.ceil((double)ppePartsMasterList.size() / 2))).intValue();
	startIndex = pageNumber * hazard_per_page;
	endIndex = startIndex + hazard_per_page;
	System.out.println("startIndex Jsp---->"+startIndex);
	for(int i=startIndex;i<endIndex && i<ppePartsMasterList.size();i++){
		
		ppeAssessmentForm = (PPEAssessmentForm) ppePartsMasterList.get(i);
		list = (ArrayList)ppeAssessmentDetailsMap.get(ppeAssessmentForm);
		ppeAssessmentForm = (PPEAssessmentForm) ppePartsMasterList.get(i);
		hazardTitle = hazardTitle.append(ppeAssessmentForm.getTitle()).append("/");
	}
}
      out.write("\r\n");
      out.write("\r\n");

if(selectedPartsHazardPPEMap != null && selectedPartsHazardPPEMap.size()>0){
		selectedAssessmentForm = (PPEAssessmentForm) ppePartsMasterList.get(selectedStartIndex);
		if(selectedAssessmentForm != null){
			hazardPPEMap = (HashMap)selectedPartsHazardPPEMap.get(selectedAssessmentForm.getId());
			if(hazardPPEMap !=null && hazardPPEMap.size() > 0){
				hazardList = (ArrayList) hazardPPEMap.get("HAZARD");
				ppeList = (ArrayList) hazardPPEMap.get("PPE");
				reqAndReccList = (ArrayList) hazardPPEMap.get("SELECTED_RADIO_VALUES");
				System.out.println(reqAndReccList.size());
				for(int loop=0;loop<reqAndReccList.size();loop++){
					System.out.println("ReccorReq---->"+reqAndReccList.get(loop));
				}
			}
		}
}


      out.write("\r\n");
      out.write("</head>\r\n");
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
      out.write("\t<div id=\"header\" style=\"text-align:left;\">EHS Tool Box - PPE Assessment Module</div>\r\n");
      out.write("\t<div id=\"mainheader\">NEW PPE ASSESSMENT CREATION </div>\r\n");
      out.write("\t\t<div id=\"header\">Hazard Assessment - ");
if(hazardTitle.length() > 0){
      out.write(' ');
      out.print( hazardTitle.substring(0,hazardTitle.length()-1));
}
      out.write("</div>\r\n");
      out.write("\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /NewHazardAssessmentCreation.jsp(114,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/newAssessment.do");
      // /NewHazardAssessmentCreation.jsp(114,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setMethod("post");
      // /NewHazardAssessmentCreation.jsp(114,2) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("generalInformation");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div id=\"displayContentContainer\">\r\n");
          out.write("\t\t\t<div id=\"displayHazardBodyContent\">\r\n");
          out.write("\t\t\t\t<div id=\"displayBodyContentHeader\">\r\n");
          out.write("\t\t\t\t\t<div id=\"BodyContentHeader\">\r\n");
          out.write("\t\t\t\t\t\t<div id=\"contentHeader1\"> PART OF BODY </div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div id=\"BodyContentHeaderBig\">\r\n");
          out.write("\t\t\t\t\t\t<div id=\"contentHeader2\"> HAZARD </div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div id=\"BodyContentHeaderBig\">\r\n");
          out.write("\t\t\t\t\t\t<div id=\"contentHeader3\"> PERSONAL PROTECTIVE EQUIPMENT </div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div id=\"BodyContentHeaderSmall\">\r\n");
          out.write("\t\t\t\t\t\t<div id=\"contentHeader4\"> Rec or required </div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
 for(int i=startIndex;i<endIndex && i<ppePartsMasterList.size();i++){
						ppeAssessmentForm = (PPEAssessmentForm) ppePartsMasterList.get(i);
						list = (ArrayList)ppeAssessmentDetailsMap.get(ppeAssessmentForm);
						
					
          out.write("\r\n");
          out.write("\t\t\t\t\t<div id=\"BodyPartsContent\">\r\n");
          out.write("\t\t\t\t\t\t\t<div id=\"contentHeader\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.print(ppeAssessmentForm.getTitle());
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t<div id=\"contentImage\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
imagePath = directoryPath+ ppeAssessmentForm.getFileName(); 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<img src=\"");
          out.print(imagePath);
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t<div id=\"contentFooter\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.print(ppeAssessmentForm.getSummary());
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div id=\"BodyHazardContent\">\r\n");
          out.write("\t\t\t\t\t\t");
if(list !=null && list.size() > 0){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<ul id=\"hazardItems\">\r\n");
          out.write("\t\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n");
          out.write("\t\t\t\t\t\t\t");
for(int j=0;j<list.size();j++){
								PPEAssessmentMaster ppeAssessmentMaster = (PPEAssessmentMaster)list.get(j);
										if(ppeAssessmentMaster.getHazard()!=null){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
 if(hazardList != null && hazardList.size() > 0){
													//String id = (String)hazardList.get(j);
													System.out.println("PPEAssessmentMasterId------->"+ppeAssessmentMaster.getId());
														if(hazardList.contains(Integer.toString(ppeAssessmentMaster.getId()))){ 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"hazard_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" name=\"hazard_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" checked=\"checked\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"hazard_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" name=\"hazard_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"");
          out.print(ppeAssessmentMaster.getId());
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
													}else{
													System.out.println("else part");
													
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"hazard_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" name=\"hazard_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"");
          out.print(ppeAssessmentMaster.getId());
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>");
          out.print(ppeAssessmentMaster.getHazard());
          out.write(" </li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
									
							}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div id=\"BodyPPEContent\">\r\n");
          out.write("\t\t\t\t\t\t");
if(list !=null && list.size() > 0){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<ul id=\"hazardItems\">\r\n");
          out.write("\t\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\" height=\"300\">\r\n");
          out.write("\t\t\t\t\t\t\t");
System.out.println("Size--->"+list.size()); 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
for(int k=0,indexValue=0;k<list.size();k++){
								PPEAssessmentMaster ppeAssessmentMaster = (PPEAssessmentMaster)list.get(k);
									if(ppeAssessmentMaster.getPpe()!=null){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr style=\"height:10px;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
if(ppeList !=null && ppeList.size() > 0){ 
													
												
          out.write("\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if(ppeList.contains(Integer.toString(ppeAssessmentMaster.getId()))){
													
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"ppe_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" name=\"ppe_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" checked=\"checked\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"ppe_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" name=\"ppe_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"");
          out.print(ppeAssessmentMaster.getId());
          out.write("\"/>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"ppe_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" name=\"ppe_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"");
          out.print(ppeAssessmentMaster.getId());
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"51%\" style=\"border-right:1px #000000 solid\" align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>");
          out.print(ppeAssessmentMaster.getPpe());
          out.write(" </li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"16%\" style=\"border-left:1px #000000 solid;border-right:1px #000000 solid\" align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
if(reqAndReccList !=null && reqAndReccList.size() > 0){ 
													if(reqAndReccList.contains("Recc"+Integer.toString(ppeAssessmentMaster.getId()))){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Recc");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" checked=\"checked\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"16%\" style=\"border-left:1px #000000 solid;border-right:1px #000000 solid\" align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Req");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else if(reqAndReccList.contains("Req"+Integer.toString(ppeAssessmentMaster.getId()))){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Recc");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"16%\" style=\"border-left:1px #000000 solid;border-right:1px #000000 solid\" align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Req");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" checked=\"checked\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Recc");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"16%\" style=\"border-left:1px #000000 solid;border-right:1px #000000 solid\" align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Req");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
												}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Recc");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"16%\" style=\"border-left:1px #000000 solid;border-right:1px #000000 solid\" align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\"  name=\"radio_");
          out.print(ppeAssessmentForm.getId());
          out.write('_');
          out.print(ppeAssessmentMaster.getId());
          out.write("\" value=\"Req");
          out.print(ppeAssessmentMaster.getId());
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
}
							
						
							
							}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr style=\"\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"10%\"> &nbsp;</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"51%\" style=\"border-right:1px #000000 solid\" align=\"left\"> &nbsp;</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"16%\" style=\"border-left:1px #000000 solid;border-right:1px #000000 solid\" align=\"center\"> &nbsp;</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"16%\" style=\"border-left:1px #000000 solid;border-right:1px #000000 solid\" align=\"center\"> &nbsp;</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t");
selectedStartIndex++;
						}
						
          out.write("\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<div id=\"button\" style=\"margin-left:280px;\">\r\n");
          out.write("\t\t\t<div style=\"float: left;\">\r\n");
          out.write("\t\t\t\t<input type=\"button\" value=\"Back\" name=\"Save\" class=\"buttonStyle\" onclick=\"goNextPage(false)\" size=\"50\" >\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div style=\"float: left; text-align: right; width: 450px;\">\r\n");
          out.write("\t\t\t\t<input type=\"button\" value=\"Next\" name=\"Save\" class=\"buttonStyle\" onclick=\"goNextPage(true)\" style=\"\" size=\"50\">\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"pageNumber\" id=\"pageNumber\" value=\"\" />\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"totalCount\" id=\"totalCount\" value=\"");
          out.print(total);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"startIndex\" id=\"startIndex\" value=\"");
          out.print(startIndex);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"endIndex\" id=\"endIndex\" value=\"");
          out.print(endIndex);
          out.write("\" />\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"direction\" id=\"direction\" value=\"\" />\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"mode\" id=\"mode\" value=\"\" />\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"sequenceStatus\" id=\"sequenceStatus\" value=\"\" />\r\n");
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
}
