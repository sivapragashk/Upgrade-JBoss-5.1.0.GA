package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.som.utils.HTMLUtils;
import com.hd.som.utils.TextUtils;
import com.hd.som.utils.Constants;
import java.util.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	private static final int BODY_CONTENT = 5;

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
      out.write('\r');
      out.write('\n');

boolean editmode = new Boolean(request.getParameter("editmode"));
Map<Integer, Map<Integer, Map<String, String>>> sectionmap = null;
if(request.getAttribute(Constants.CONTENT) != null){
	sectionmap=(HashMap)request.getAttribute(Constants.CONTENT);
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"maincontent\">\r\n");
      out.write("\t<div id=\"faq_container\">\r\n");
      out.write("\t\t");
if(sectionmap != null && sectionmap.get(BODY_CONTENT) != null){
			Map<Integer, Map<String, String>> contentmap = sectionmap.get(BODY_CONTENT);
			if(contentmap!=null && contentmap.size() > 0){
				for(int contentid : contentmap.keySet()){
					Map<String, String> referencemap = contentmap.get(contentid);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"faq_content_holder\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"faq_question\">\r\n");
      out.write("\t\t\t\t\t\t\t\tQ:&nbsp;");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER));
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"faq_answer\">\r\n");
      out.write("\t\t\t\t\t\t\t\tA:&nbsp;");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_CONTENT));
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"faq_edit_delete_links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(contentid, BODY_CONTENT, editmode, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t");
}
			}
		}if(editmode){
      out.write("\r\n");
      out.write("\t\t\t<div id=\"admin_faq\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:insert('");
      out.print(BODY_CONTENT);
      out.write("')\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
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
