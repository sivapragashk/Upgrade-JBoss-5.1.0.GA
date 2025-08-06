package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.som.utils.TextUtils;
import com.hd.som.model.Items;
import com.hd.som.utils.Constants;
import java.util.*;
import com.hd.som.utils.Constants;

public final class manageContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/messages.jsp");
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
      out.write("\r\n");
      out.write("\r\n");

List<Items> itemList = null;
Map<String, String> content = null;
if(request.getAttribute(Constants.ITEM_LIST) != null)
	itemList = (List) request.getAttribute(Constants.ITEM_LIST);
if(request.getAttribute(Constants.CONTENT) != null)
	content = (Map) request.getAttribute(Constants.CONTENT);


      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Shade-O-Matic</title> \r\n");
      out.write("\t<meta content=\"text/html; charset=utf-8\" http-equiv=\"content-type\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"ckeditor/ckeditor.js\"></script>\r\n");
      out.write("\t<script src=\"ckeditor/sample.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<link href=\"ckeditor/sample.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/style.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\" ></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tjQuery(document).ready(function($){\r\n");
      out.write("\t\t$(\"#savecontent\").click(function(){\r\n");
      out.write("\t\t\t$('#htm_controlleraction').attr('value', 'savecontent');\r\n");
      out.write("\t\t\t$('#managecontentfrm').submit();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #ffffff;\">\r\n");
      out.write("  <form name=\"managecontentfrm\" id=\"managecontentfrm\" method=\"post\" action=\"/shade-o-matic/content.do\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t<div id=\"popupwindow\">\r\n");
      out.write("\t\t<div id=\"closewindow\"><a href=\"javascript:window.close()\" class=\"linkstyle\">Close Window</a></div>\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
String message = (String) request.getAttribute(Constants.MESSAGES);
if ( message != null )
{
      out.write("\r\n");
      out.write("   <div id=\"messages\">");
      out.print(message);
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("\t\t");
if(itemList != null && itemList.size() > 0){
			Iterator<Items> iterator = itemList.iterator();
			while(iterator.hasNext()){
				Items item = iterator.next();
				if(item.getType().equals(Constants.TEXT_BOX)){
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"popuplabel\">");
      out.print(item.getName());
      out.write(" </div> <input type=\"text\" name=\"");
      out.print(item.getName());
      out.write("\" class=\"popuptextbox\" size=\"40\" value=\"");
      out.print(TextUtils.getMapValue(content, item.getName()));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<div id=\"popuplabel\"></div>\t<div id=\"popuptext\">");
      out.print(TextUtils.getItemSummary(item));
      out.write("</div>\r\n");
      out.write("\t\t\t\t");
}else if(item.getType().equals(Constants.FILE)){
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"popuplabel\">");
      out.print(item.getName());
      out.write(" </div> <input type=\"file\" name=\"");
      out.print(item.getName());
      out.write("\" class=\"popuptextbox\" size=\"40\">\r\n");
      out.write("\t\t\t\t\t<div id=\"popuplabel\"></div>\t<div id=\"popuptext\">");
      out.print(TextUtils.getItemSummary(item));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"htm_");
      out.print(item.getName());
      out.write("\" value=\"");
      out.print(TextUtils.getMapValue(content, item.getName()));
      out.write("\">\r\n");
      out.write("\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"popuplabel\">");
      out.print(item.getName());
      out.write(" </div> \r\n");
      out.write("\t\t\t\t\t<div id=\"ckeditor\">\r\n");
      out.write("\t\t\t\t\t\t<textarea cols=\"50\" id=\"editor1\" name=\"");
      out.print(item.getName());
      out.write("\" rows=\"2\">");
      out.print(TextUtils.getMapValue(content, item.getName()));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">CKEDITOR.replace( '");
      out.print(item.getName());
      out.write("' );</script>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"popuplabel\"></div>\t<div id=\"popuptext\"></div>\r\n");
      out.write("\t\t\t\t");
}
			}
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"popuplabel\"></div><div id=\"popupbuttons\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"submit\" id=\"savecontent\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"Cancel\" onclick=\"javascript:window.close();\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(Constants.CONTROLLER_ACTION);
      out.write("\" id=\"");
      out.print(Constants.CONTROLLER_ACTION);
      out.write("\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(Constants.MENU_ID);
      out.write("\" id=\"");
      out.print(Constants.MENU_ID);
      out.write("\" value=\"");
      out.print(TextUtils.getText(request.getAttribute(Constants.MENU_ID)));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(Constants.SUBMENU_ID);
      out.write("\" id=\"");
      out.print(Constants.SUBMENU_ID);
      out.write("\" value=\"");
      out.print(TextUtils.getText(request.getAttribute(Constants.SUBMENU_ID)));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(Constants.SECTION_ID);
      out.write("\" id=\"");
      out.print(Constants.SECTION_ID);
      out.write("\" value=\"");
      out.print(TextUtils.getText(request.getAttribute(Constants.SECTION_ID)));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(Constants.CONTENT_ID);
      out.write("\" id=\"");
      out.print(Constants.CONTENT_ID);
      out.write("\" value=\"");
      out.print(TextUtils.getText(request.getAttribute(Constants.CONTENT_ID)));
      out.write("\"/>\r\n");
      out.write("  </form>\t\t\r\n");
      out.write("</body>\r\n");
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
