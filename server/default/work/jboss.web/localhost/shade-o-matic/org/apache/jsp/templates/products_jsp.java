package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.som.utils.HTMLUtils;
import com.hd.som.utils.TextUtils;
import com.hd.som.utils.Constants;
import java.util.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	private static final int MAIN_HEADER = 1;
	private static final int MAIN_HEADER_CONTENT = 2;
	private static final int BODY_HEADER = 3;
	private static final int BODY_CONTENT = 4;

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

int submenu = TextUtils.parseParams(request.getAttribute(Constants.SUBMENU_ID));
String imagepath = Constants.DISPLAY_IMAGE_FROM + TextUtils.getText(request.getAttribute(Constants.MENU_ID))+"/";
if(submenu > 0)
	imagepath += submenu+"/";
boolean editmode = new Boolean(request.getParameter("editmode"));
Map<Integer, Map<Integer, Map<String, String>>> sectionmap = null;
if(request.getAttribute(Constants.CONTENT) != null){
	sectionmap=(HashMap)request.getAttribute(Constants.CONTENT);
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"maincontent\">\r\n");
      out.write("\t<div id=\"templateheader\">\r\n");
      out.write("\t\t");
if(sectionmap != null && sectionmap.get(MAIN_HEADER) != null){
			Map<Integer, Map<String, String>> contentmap = sectionmap.get(MAIN_HEADER);
			if(contentmap!=null && contentmap.size() > 0){
				for(int contentid : contentmap.keySet()){
					Map<String, String> referencemap = contentmap.get(contentid);
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER));
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(contentid, MAIN_HEADER, editmode, false));
      out.write("\r\n");
      out.write("\t\t\t\t");
break;
				}
			}	
		}else if(editmode){
      out.write("\r\n");
      out.write("\t\t\t<div id=\"admin_templateheader\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:insert('");
      out.print(MAIN_HEADER);
      out.write("')\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"product_header_content_main\">\r\n");
      out.write("\t\t<div id=\"product_header_content\">\r\n");
      out.write("\t\t\t");
if(sectionmap != null && sectionmap.get(MAIN_HEADER_CONTENT) != null){
				Map<Integer, Map<String, String>> contentmap = sectionmap.get(MAIN_HEADER_CONTENT);
				if(contentmap!=null && contentmap.size() > 0){
					for(int contentid : contentmap.keySet()){
						Map<String, String> referencemap = contentmap.get(contentid);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"text-align: left;padding-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_CONTENT));
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
String image = "background:url(" + imagepath + TextUtils.getMapValue(referencemap, Constants.ITEM_IMAGE) + ") no-repeat;";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"product_header_image\" style=\"");
      out.print(image);
      out.write("\"></div>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(contentid, MAIN_HEADER_CONTENT, editmode, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t");
break;
					}
			   }
			}else if(editmode){
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"admin_product_header_content\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:insert('");
      out.print(MAIN_HEADER_CONTENT);
      out.write("');\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"product_main\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
if(sectionmap != null && sectionmap.get(BODY_HEADER) != null){
				Map<Integer, Map<String, String>> contentmap = sectionmap.get(BODY_HEADER);
				if(contentmap!=null && contentmap.size() > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"product_main_header\">\r\n");
      out.write("\t\t\t\t\t\t");
for(int contentid : contentmap.keySet()){
							Map<String, String> referencemap = contentmap.get(contentid);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER));
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(contentid, BODY_HEADER, editmode, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
break;
						}
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
}
			}else if(editmode){
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"admin_product_main_header\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:insert('");
      out.print(BODY_HEADER);
      out.write("')\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"product_main_content\">\r\n");
      out.write("\t\t\t<div id=\"product_main_content_holder\">\r\n");
      out.write("\t\t\t\t");
if(sectionmap != null && sectionmap.get(BODY_CONTENT) != null){
					Map<Integer, Map<String, String>> contentmap = sectionmap.get(BODY_CONTENT);
					if(contentmap!=null && contentmap.size() > 0){
						for(int contentid : contentmap.keySet()){
							Map<String, String> referencemap = contentmap.get(contentid);
							String image = imagepath + TextUtils.getMapValue(referencemap, Constants.ITEM_IMAGE);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"product_main_content_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"product_main_content_item_image\" style=\"background:url(");
      out.print(image);
      out.write(") no-repeat;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"product_main_content_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"product_main_content_item_header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER));
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"product_main_content_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_CONTENT));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"product_main_content_item_video\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:watchvideo('");
      out.print(TextUtils.getMapValue(referencemap, Constants.ITEM_VIDEO));
      out.write("')\" class=\"product_main_content_item_video_link\">WATCH VIDEO</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"product_main_content_item_links_holder\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(HTMLUtils.generateLinks(contentid, BODY_CONTENT, editmode, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
}
					}
				} if(editmode){
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"admin_product_main_content_item\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:insert('");
      out.print(BODY_CONTENT);
      out.write("')\" id=\"admin_template_insert_link\">Insert Content</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
