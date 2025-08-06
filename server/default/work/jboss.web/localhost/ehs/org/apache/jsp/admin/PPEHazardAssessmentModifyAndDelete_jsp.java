package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.ehs.tools.Constants;
import com.hd.ehs.form.PPEAssessmentForm;

public final class PPEHazardAssessmentModifyAndDelete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
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
      out.write("\t<link href=\"stylesheets/admin.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascript/ehsadmin.js\"></script>\r\n");
PPEAssessmentForm[] ppeAssessmentForm = null;
if(request.getAttribute("PPE_ASSESSMENT_MASTER_DETAILS")!=null)
	ppeAssessmentForm = (PPEAssessmentForm[])request.getAttribute("PPE_ASSESSMENT_MASTER_DETAILS");


      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function editContent(formName,id){\r\n");
      out.write("\tvar path=\"ppeAssessment.do\";\r\n");
      out.write("\twindow.opener.document.ppeAssessmentForm.mode.value = \"DisplayAssessmentDetailBasedOnId\";\r\n");
      out.write("\twindow.opener.document.ppeAssessmentForm.action.value = path;\r\n");
      out.write("\twindow.opener.document.ppeAssessmentForm.id.value = id;\r\n");
      out.write("\tself.close();\r\n");
      out.write("\twindow.opener.document.ppeAssessmentForm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteContent(formName,id){\r\n");
      out.write("\tif(confirm(\"Are you sure that you want to delete?\")){\r\n");
      out.write("\t\tvar path=\"ppeAssessment.do\";\r\n");
      out.write("\t\tdocument.forms[formName].mode.value = \"deletePartsMasterDetailsBasedOnId\";\r\n");
      out.write("\t\tdocument.forms[formName].action.value = path;\r\n");
      out.write("\t\tdocument.forms[formName].id.value = id;\r\n");
      out.write("\t\tdocument.forms[formName].submit();\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /admin/PPEHazardAssessmentModifyAndDelete.jsp(37,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/ppeAssessment");
      // /admin/PPEHazardAssessmentModifyAndDelete.jsp(37,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setMethod("post");
      // /admin/PPEHazardAssessmentModifyAndDelete.jsp(37,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleId("ppeAssessmentModifyForm");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<div align=\"center\">\r\n");
          out.write("\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"800\" id=\"table1\" >\r\n");
          out.write("\t\t<tr valign=\"top\">\r\n");
          out.write("\t\t\t<td width=\"700\" height=\"500\" valign=\"top\">\r\n");
          out.write("\t\t\t\t<table border=\"0\" cellpadding=\"1\" cellspacing=\"1\" width=\"700\" id=\"table2\">\r\n");
          out.write("\t\t\t\t\t <tr>\r\n");
          out.write("\t\t\t\t\t \t<td height=\"50\" valign=\"top\" align=\"center\"><div id=\"header\">Modify PPE Hazard Assessment</div></td>\r\n");
          out.write("\t\t\t\t\t </tr>\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t \t<td align=\"right\" height=\"30\" valign=\"top\" width=\"750\">\r\n");
          out.write("\t\t\t\t\t \t\t<table border=\"0\" cellpadding=\"1\" cellspacing=\"1\" id=\"table3\">\r\n");
          out.write("\t\t\t\t\t \t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t \t\t\t\t<td width=\"500\">&nbsp;</td>\r\n");
          out.write("\t\t\t\t\t \t\t\t\t<td width=\"200\" align=\"center\"><a href=\"javascript:self.close()\" class=\"menulink\">Close Window</td>\r\n");
          out.write("\t\t\t\t\t \t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t \t\t</table>\r\n");
          out.write("\t\t\t\t\t \t</td>\r\n");
          out.write("\t\t\t \t\t</tr>\r\n");
          out.write("\t\t\t \t\t<tr>\r\n");
          out.write("\t\t\t\t\t \t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t \t\t\r\n");
          out.write("\t\t\t \t\t\t\t <table border=\"0\" cellpadding=\"1\" cellspacing=\"1\" width=\"603\" id=\"table4\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr><td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
 String message = (String) request.getAttribute(Constants.MESSAGES);
												if ( message != null ){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t   ");
          out.print(message);
          out.write(' ');
          out.write(' ');
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
if(ppeAssessmentForm != null && ppeAssessmentForm.length > 0){
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<table border=\"1\" bordercolor=\"#273e1e\" style=\"BORDER-COLLAPSE: collapse;\" cellpadding=\"2\" cellspacing=\"2\" width=\"100%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"5%\">No.</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"20%\">Part Of Body</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"35%\">Image Description</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"5%\">&nbsp;</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"5%\">&nbsp;</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
int count=1;
									for(int i=0;i<ppeAssessmentForm.length;i++)
										{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"5%\">");
          out.print(count);
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"20%\">");
          out.print(ppeAssessmentForm[i].getTitle() );
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"35%\">");
          out.print(ppeAssessmentForm[i].getSummary());
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:editContent('ppeAssessmentForm',");
          out.print(ppeAssessmentForm[i].getId());
          out.write(")\" class=\"menulink\">Edit</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:deleteContent('ppeAssessmentForm',");
          out.print(ppeAssessmentForm[i].getId());
          out.write(")\" class=\"menulink\">Delete</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
count++;
									}
          out.write("\t\r\n");
          out.write("\t\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");

								}else{
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<table border=\"1\" bordercolor=\"#273e1e\" style=\"BORDER-COLLAPSE: collapse;\" cellpadding=\"2\" cellspacing=\"2\" width=\"100%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"center\" height=\"20\" valign=\"top\"><div id=\"header\">Contents are not available for PPE Hazard Assessment to edit/delete</div></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
}
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t</table>\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"action\">\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"mode\">\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"id\">\r\n");
          out.write("\t</table>\r\n");
          out.write("</div>\r\n");
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
