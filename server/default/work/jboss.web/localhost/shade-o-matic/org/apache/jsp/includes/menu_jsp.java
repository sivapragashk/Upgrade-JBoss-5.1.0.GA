package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.som.utils.Constants;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
boolean editmode = new Boolean(request.getParameter("editmode"));
      out.write("\r\n");
      out.write("<div id=\"selectable\">\r\n");
      out.write("\t\t<ul id=\"menu\">\r\n");
      out.write("\t\t\t\t<li class=\"liadmin\" id=\"admin\"><a href=\"#\">Administration</a></li>\r\n");
      out.write("\t            <li class=\"licompany\" id=\"company\"><a href=\"#\">Company</a></li> \r\n");
      out.write("\t\t\t\t<li class=\"linews\" id=\"news\"><a href=\"#\">News & Achievements</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"lireward\" id=\"reward\"><a href=\"#\">Reward Program</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liproducts\" id=\"products\"><a href=\"#\">Products</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"lisupport\" id=\"support\"><a href=\"#\">Support</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"limediacenter\" id=\"mediacenter\"><a href=\"#\" >Media Center</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liepic\" id=\"epic\"><a href=\"#\">Epic</a></li>\r\n");
      out.write("\t\t</ul> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"adminsm\" class=\"megamenu\">\r\n");
      out.write("\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t");
if(editmode){
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" onclick=\"javascript:setmode('");
      out.print(Constants.DISABLE_EDIT_MODE);
      out.write("');\">Disable Edit Mode</a></li>\r\n");
      out.write("\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" onclick=\"javascript:setmode('");
      out.print(Constants.ENABLE_EDIT_MODE);
      out.write("');\">Enable Edit Mode</a></li>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"megamenus\" class=\"megamenu\">\r\n");
      out.write("\t\t<div class=\"column\" >\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('company/history');\">History</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('company/mission');\">Mission</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('company/management-team');\">Management Team</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('company/partnership');\">Partnership</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('company/benefits');\">Benefits</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('company/contact-us');\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('company/presidents-message');\">Presidents Message</a></li><br>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"megamenus1\" class=\"megamenu\">\r\n");
      out.write("\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('news-achievements/press-releases');\">Press Releases</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('news-achievements/promotions');\">Promotions</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('news-achievements/announcements');\">Announcements</a></li><br>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"megamenu1\" class=\"megamenu\">\r\n");
      out.write("\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('reward-program/how-it-works');\">How it works</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('reward-program/how-to-claim');\">How to Claim</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('reward-program/faq');\">FAQ's</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('reward-program/packages');\">Packages</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('reward-program/reward-activity');\">Reward Activity</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('reward-program/messages');\">Messages</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"megamenu2\" class=\"megamenu\">\r\n");
      out.write("\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('support/customer-care');\">Customer Care</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('support/support-forms');\">Support Forms</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('support/contact-us');\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('support/faq');\">FAQ's</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"productssm\" class=\"megamenu\">\r\n");
      out.write("\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"javascript:load('products/honeycomb-shades');\">Honeycomb Shades</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"epicsm\"></div>\r\n");
      out.write("\t<div id=\"mediacentersm\"></div>\r\n");
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
