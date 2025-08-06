package org.apache.jsp.templates.usrhr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.helper.SectionReference;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.HTMLUtils;
import com.hd.directweb.db.ContentReference;
import java.util.LinkedList;
import java.util.HashMap;
import com.hd.directweb.db.Content;
import java.util.List;
import java.util.Map;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.constants.TemplateConstants;

public final class template2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

boolean approvalmode = Boolean.parseBoolean(request.getParameter(TemplateConstants.APPROVAL_MODE));
boolean editmode = Boolean.parseBoolean(request.getParameter(TemplateConstants.EDIT_MODE));

Map<Integer, List<Content>> contentmap = null;
if(request.getAttribute(TemplateConstants.TEMPLATE_CONTENT) != null)
	contentmap = (HashMap)request.getAttribute(TemplateConstants.TEMPLATE_CONTENT);
      out.write("\r\n");
      out.write("\t\t<div id=\"pageheading\">\r\n");
      out.write("\t\t");
if(contentmap != null && contentmap.get(SectionReference.getSectionId(TemplateConstants.SECTION_MAIN_HEADER)) != null){
			List contentlist = (LinkedList) contentmap.get(SectionReference.getSectionId(TemplateConstants.SECTION_MAIN_HEADER));
			if(contentlist!=null && contentlist.size() > 0){	
				Content content = (Content) contentlist.get(0);
				Map<String, ContentReference> lcl_contentmap = content.getContentItemValues();
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(TextUtils.getItemValue(lcl_contentmap, TemplateConstants.HEADER));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(content,SectionReference.getSectionId(TemplateConstants.SECTION_MAIN_HEADER),editmode,approvalmode, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t");
}
		}else if(editmode){
      out.write("\t\r\n");
      out.write("\t\t\t\t<a href=\"javascript:loadTemplateItems(");
      out.print(SectionReference.getSectionId(TemplateConstants.SECTION_MAIN_HEADER) );
      out.write(")\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div id=\"maincontainer\">\r\n");
      out.write("\t<div id=\"content-column-left\">\r\n");
      out.write("\t\t<div id=\"box\">\t\t\t\t\r\n");
      out.write("\t\t\t");
if(contentmap != null && contentmap.get(SectionReference.getSectionId(TemplateConstants.SECTION_LEFT_CONTENT)) != null){
			List contentlist = (LinkedList) contentmap.get(SectionReference.getSectionId(TemplateConstants.SECTION_LEFT_CONTENT));
			if(contentlist!=null && contentlist.size() > 0){	
				Content content = (Content) contentlist.get(0);
				Map<String, ContentReference> lcl_contentmap = content.getContentItemValues();
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"box-header\">\r\n");
      out.write("\t\t\t\t\t<div id=\"box_header_text\">");
      out.print(TextUtils.getItemValue(lcl_contentmap, TemplateConstants.HEADER));
      out.write("</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"box-main\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(TextUtils.getItemValue(lcl_contentmap, TemplateConstants.CONTENT));
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(content,SectionReference.getSectionId(TemplateConstants.SECTION_LEFT_CONTENT),editmode,approvalmode, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
}
		}else if(editmode){
      out.write("\t\r\n");
      out.write("\t\t\t<div id=\"admin_box_main\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:loadTemplateItems(");
      out.print(SectionReference.getSectionId(TemplateConstants.SECTION_LEFT_CONTENT) );
      out.write(")\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"content-column-right\">\t\t\t\t\r\n");
      out.write("\t\t<div id=\"box\">\t\t\t\r\n");
      out.write("\t\t\t");
if(contentmap != null && contentmap.get(SectionReference.getSectionId(TemplateConstants.SECTION_RIGHT_CONTENT)) != null){
			List contentlist = (LinkedList) contentmap.get(SectionReference.getSectionId(TemplateConstants.SECTION_RIGHT_CONTENT));
			if(contentlist!=null && contentlist.size() > 0){	
				Content content= (Content) contentlist.get(0);
				Map<String, ContentReference> lcl_contentmap = content.getContentItemValues();
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"box-header\">\r\n");
      out.write("\t\t\t\t\t<div id=\"box_header_text\">");
      out.print(TextUtils.getItemValue(lcl_contentmap, TemplateConstants.HEADER));
      out.write("</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"box-main\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(TextUtils.getItemValue(lcl_contentmap, TemplateConstants.CONTENT));
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(content,SectionReference.getSectionId(TemplateConstants.SECTION_RIGHT_CONTENT),editmode,approvalmode, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
}
		}else if(editmode){
      out.write("\t\r\n");
      out.write("\t\t\t<div id=\"admin_box_main\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:loadTemplateItems(");
      out.print(SectionReference.getSectionId(TemplateConstants.SECTION_RIGHT_CONTENT));
      out.write(")\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t");
}
      out.write("\t\t\t\r\n");
      out.write("\t\t<div id=\"box-footer\"></div>\r\n");
      out.write("\t\t</div>\r\n");
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
