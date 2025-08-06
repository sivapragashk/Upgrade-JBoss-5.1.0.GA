package org.apache.jsp.templates.mrtc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.helper.SectionReference;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.db.ContentReference;
import java.util.LinkedList;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.db.ContentReference;
import java.util.LinkedList;
import java.util.HashMap;
import com.hd.directweb.db.Content;
import java.util.List;
import java.util.Map;
import com.hd.directweb.service.HTMLUtils;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.constants.TemplateConstants;

public final class template1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write(" \r\n");
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

int templateid = TextUtils.getIntValue(request.getParameter(Constants.TEMPLATE_ID));
int SECTION_BODY_CONTENT = SectionReference.getInstance().getSectionId(templateid,TemplateConstants.SECTION_BODY_CONTENT);
boolean approvalmode = Boolean.parseBoolean(request.getParameter(TemplateConstants.APPROVAL_MODE));
boolean editmode = Boolean.parseBoolean(request.getParameter(TemplateConstants.EDIT_MODE));
Map<Integer, List<Content>> contentmap = null;
if(request.getAttribute(TemplateConstants.TEMPLATE_CONTENT) != null)
	contentmap = (HashMap)request.getAttribute(TemplateConstants.TEMPLATE_CONTENT);

      out.write("\r\n");
      out.write("<div id=\"contentcontainer\">\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div id=\"page_header\">\r\n");
      out.write("\t\t\t\t");
if(contentmap != null && contentmap.get(SECTION_BODY_CONTENT) != null){
						List contentlist = (LinkedList) contentmap.get(SECTION_BODY_CONTENT);
						if(contentlist!=null && contentlist.size() > 0){
						
							for(int i=0;i<contentlist.size();i++){
								boolean enablesort = false;
								if(i==0){
									enablesort = true;
								}
						Content content = (Content) contentlist.get(i);
						Map<String, ContentReference> lcl_contentmap = content.getContentItemValues();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"page_header_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getItemValue(lcl_contentmap, TemplateConstants.HEADER));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"page_content_main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>");
      out.print(TextUtils.getItemValue(lcl_contentmap, TemplateConstants.CONTENT));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(content,SECTION_BODY_CONTENT,editmode,approvalmode, enablesort));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
						}	
				}if(editmode){
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<div id=\"admin_box_main\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:loadTemplateItems(");
      out.print(SECTION_BODY_CONTENT);
      out.write(")\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
