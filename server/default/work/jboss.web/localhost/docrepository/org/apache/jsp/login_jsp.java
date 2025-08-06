package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.docrepository.utils.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/message.jsp");
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Document Repository</title>\r\n");
      out.write("<link href=\"stylesheets/repository.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/docrepo.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function initialize(){\r\n");
      out.write("\tdocument.loginform.username.focus();\r\n");
      out.write("}\r\n");
      out.write("function submitForm() {\r\n");
      out.write("  if (window.event && window.event.keyCode == 13)\r\n");
      out.write("    authenticate()\r\n");
      out.write("  else\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"initialize()\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<TABLE style=\"BORDER-COLLAPSE: collapse\" cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t  <TBODY>\r\n");
      out.write("\t\t\t  <TR>\r\n");
      out.write("\t\t\t    <TD width=\"28%\"><IMG src=\"images/logo.gif\"  border=0></TD>\r\n");
      out.write("\t\t\t    <TD align=right>\r\n");
      out.write("\t\t\t\t\t<table border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\"><td class=\"applicationHeader\">Document Repository&nbsp;&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t  </TR>\r\n");
      out.write("\t\t  </TBODY>\r\n");
      out.write("\t    </TABLE>\r\n");
      out.write("\t    <TABLE class=hd-main cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t\t  <TR valign=\"top\">\r\n");
      out.write("\t\t    <TD class=hd-titleareaframe colSpan=\"2\">\r\n");
      out.write("\t\t\t    <DIV id=\"pagetitle\">\r\n");
      out.write("\t\t\t      <TABLE class=hd-titleareaframe cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t\t\t\t        <TR>\r\n");
      out.write("\t\t\t\t          <TD style=\"PADDING-BOTTOM: 2px\">\r\n");
      out.write("\t\t\t\t            <TABLE style=\"PADDING-LEFT: 0px; PADDING-TOP: 0px\" cellSpacing=0 cellPadding=0 border=0 height=\"10\">\r\n");
      out.write("\t\t\t\t              <TBODY>\r\n");
      out.write("            \t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t                <TD style=\"PADDING-TOP: 4px\" noWrap align=middle width=108 height=\"10\">&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t                <TD height=\"10\"><IMG height=1 src=\"blank.gif\" width=22></TD>\r\n");
      out.write("\t\t\t\t\t                <TD style=\"PADDING-TOP: 0px\" noWrap height=\"10\"></TD>\r\n");
      out.write("\t\t\t\t\t                <TD valign=\"right\"></TD>\r\n");
      out.write("\t\t\t\t\t            </TR>\r\n");
      out.write("\t\t\t\t\t          </TBODY>\r\n");
      out.write("\t\t\t\t\t         </table> \r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t </TABLE>\r\n");
      out.write("\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t  </TABLE>\t\r\n");
      out.write("\t\t<form name=\"loginform\" action=\"authenticate\" method=\"post\" style=\"width: 720pt;\">\r\n");
      out.write("\t\t<table cellpadding=\"1\" cellspacing=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.write('\r');
      out.write('\n');
String message = (String) request.getAttribute(Constants.MESSAGES);
if ( message != null )
{
      out.write("\r\n");
      out.write("   <tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\" height=\"20\" valign=\"middle\" class=\"msg\">");
      out.print(message);
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
}
      out.write("\r\n");
      out.write("\t\t\t<tr height=\"10\"><td></td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" class=\"textBold\">Username </td>\r\n");
      out.write("\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"username\" size=\"20\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" class=\"textBold\">Password </td>\r\n");
      out.write("\t\t\t\t<td align=\"left\"><input type=\"password\" name=\"password\" size=\"20\" onkeypress=\"return submitForm()\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"Login\" onclick=\"authenticate()\" class=\"buttonStyle\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"repository\" value=\"");
      out.print(request.getParameter("repository"));
      out.write("\"/>\t\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"Action\" value=\"Login\"/>\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
