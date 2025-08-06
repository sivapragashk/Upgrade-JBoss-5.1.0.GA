package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.io.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/mailer.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody.release();
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

      out.write("<!-- DATE     : 07/20/02   -->\r\n");
      out.write("<!-- AUTHOR   : Balakrishnan B.T. -->\r\n");
      out.write("<!-- PURPOSE  : To accept the user login details -->\r\n");
      out.write("<!-- COMPANY  : GAVS Information Services Pvt Ltd, India  -->\r\n");
      out.write("<!-- MODIFIED :   -->\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<style>\r\n");
      out.write(".welcomedivision {\r\n");
      out.write("    FONT-WEIGHT: bold;\r\n");
      out.write("    FONT-SIZE: 12px;\r\n");
      out.write("    COLOR: #000000;\r\n");
      out.write("    FONT-FAMILY: Arial;\r\n");
      out.write("\tBACKGROUND-COLOR: #ffffff;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".welcometable{\r\n");
      out.write("BACKGROUND-COLOR: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".welcomelocation\r\n");
      out.write("{\r\n");
      out.write("    FONT-SIZE: 11px;\r\n");
      out.write("    COLOR: #000000;\r\n");
      out.write("    FONT-FAMILY: Arial;\r\n");
      out.write("\tBACKGROUND-COLOR: #ffffff;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".legal\r\n");
      out.write("{\r\n");
      out.write("    FONT-SIZE: 11px;\r\n");
      out.write("    COLOR: #000000;\r\n");
      out.write("    FONT-FAMILY: Arial;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style> \r\n");
      out.write("<TITLE>Order Status - Login</TITLE>\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"includes/orderstatus.css\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      com.hd.orderstatus.AdministratorBean adminBean = null;
      synchronized (_jspx_page_context) {
        adminBean = (com.hd.orderstatus.AdministratorBean) _jspx_page_context.getAttribute("adminBean", PageContext.PAGE_SCOPE);
        if (adminBean == null){
          adminBean = new com.hd.orderstatus.AdministratorBean();
          _jspx_page_context.setAttribute("adminBean", adminBean, PageContext.PAGE_SCOPE);
          out.write('\r');
          out.write('\n');
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("adminBean"), request);
          out.write('\r');
          out.write('\n');
        }
      }
      out.write("\t\r\n");
      out.write("\r\n");


    // Get the Query String value
    String strMessage,Today;
	strMessage = request.getParameter("strMsg");
	int attempts=0;
	
	if(request.getParameter("attempts")!=null ) {
		attempts=Integer.parseInt(request.getParameter("attempts"))+1;
	}
	String enableLocking = adminBean.isLockingEnabled(request.getParameter("username"));
	if(enableLocking.equals("Y") && attempts==3){
		strMessage=strMessage+" The WebMaster has been notified. Contact Regional Administrator for assistance.";
		//ResourceBundle rsb=ResourceBundle.getBundle("mail", Locale.getDefault());
        
        ResourceBundle filePathProperty = ResourceBundle.getBundle("filepath");
        String filePath = filePathProperty.getString("propertiesfilepath");
        
        // load properties from file
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(filePath+"mail.properties");
            properties.load(fis);
            fis.close();
        }catch(IOException e) {
            System.out.println("Unable to load properties file due to "+e);
        }
		
        int count = adminBean.lockUser(request.getParameter("username"));

		String host = properties.getProperty("mailserver");
		String to=getServletConfig().getServletContext().getInitParameter("WEBMASTER");
        //String to="B.Balakrishnan@hunterdouglas.com";
		
		StringBuffer message=new StringBuffer();
		message.append("<html><head><title>Login Failure</title><style>.text{FONT-SIZE: 10pt;FONT-FAMILY: Arial}");
		message.append(".message{FONT-FAMILY: Verdana;	FONT-SIZE: 12px;COLOR: #00008b;	FONT-WEIGHT: bold;}");
		message.append("</style></head><body><u class='message'>User Login failure -Notifcation dated 	"+ new Date()+"</u>");
		message.append("<p class='text'>User attempt to Login to the Order Status System using username : "+request.getParameter("username"));
		message.append(" failed for more than threee attempts</p>");
        if(count!=0)  {
        		message.append("<p class='text'>User Account is locked.</p>");
        } else {
       		    message.append("<p class='text'>Could not lock the User Account.</p>");
        }
		message.append("<p class='text'>The IP of the User is  : "+request.getHeader("WL-Proxy-Client-IP"));
		message.append("</p></body></html>");
        strMessage = "Your account is locked. Please contact the Webmaster for details.";
        attempts=0;
		
      out.write("\r\n");
      out.write("\t\t");
      //  orderstatus:mail
      com.hd.orderstatus.taglib.mailer.SendMail _jspx_th_orderstatus_005fmail_005f0 = (com.hd.orderstatus.taglib.mailer.SendMail) _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody.get(com.hd.orderstatus.taglib.mailer.SendMail.class);
      _jspx_th_orderstatus_005fmail_005f0.setPageContext(_jspx_page_context);
      _jspx_th_orderstatus_005fmail_005f0.setParent(null);
      // /login.jsp(98,2) name = host type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setHost(host);
      // /login.jsp(98,2) name = from type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setFrom("OS@hunterdouglas.com");
      // /login.jsp(98,2) name = to type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setTo(to);
      // /login.jsp(98,2) name = messageText type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setMessageText(message.toString());
      // /login.jsp(98,2) name = subject type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setSubject("Order Status Application: Login Failure Notification");
      // /login.jsp(98,2) name = contentType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setContentType("text/html");
      int _jspx_eval_orderstatus_005fmail_005f0 = _jspx_th_orderstatus_005fmail_005f0.doStartTag();
      if (_jspx_th_orderstatus_005fmail_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody.reuse(_jspx_th_orderstatus_005fmail_005f0);
        return;
      }
      _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody.reuse(_jspx_th_orderstatus_005fmail_005f0);
      out.write("\r\n");
      out.write("\t\t");

	}else{
		if(enableLocking.equals("N"))
			attempts=0;
	}
	

    if (strMessage == null)
         strMessage = "";
      
    // Create a date object 
	Date today;
	String dateOut;
	DateFormat dateFormatter;

	dateFormatter = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault()); 
	today = new Date();
	dateOut = dateFormatter.format(today);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<BODY onload=\"javascript:setfocus()\" background=\"images/window.gif\" topmargin=0>\r\n");
      out.write("<FORM method=\"post\" name=\"frmLogin\" action=\"AuthenticateUser.jsp\">\r\n");
      out.write("<TABLE  height=176 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=right width=\"97%\" height=24><FONT face=Arial size=-2>\r\n");
      out.write("    Today's Date is : ");
      out.print(dateOut);
      out.write(" </FONT></TD>\r\n");
      out.write("    <TD width=\"3%\" height=\"54\"></TD>\r\n");
      out.write("   </TR>\r\n");
      out.write("<!-- display the error message -->\t\t\t   \r\n");
if  (strMessage != ""){
      out.write("                  \r\n");
      out.write("   <TR>\r\n");
      out.write("      <TD colspan=\"2\" align=\"center\"><FONT face=Arial color=red size=2><B>");
      out.print(strMessage);
      out.write("</FONT></B><BR><BR><BR><BR> </TD>\r\n");
      out.write("   </TR>\t\r\n");
}
      out.write("\t\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=right width=\"97%\">\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("\t\t\t<TD>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("            <TBODY>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t<TD></TD><TD></TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("\t\t\t  <td  width=\"35%\">\r\n");
      out.write("\t\t\t  \t\t\t\t<table border=0 align=\"center\" class=\"welcometable\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td colspan=\"3\" align=\"center\"><img src=\"images/welcome.gif\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Window Fashions </td><td class=\"welcomelocation\">Broomfield, Colorado </td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Window Coverings </td><td class=\"welcomelocation\">Tupelo, Mississippi</td></tr>\t\t\t  \t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Window Decor</td><td class=\"welcomelocation\">Fort Lauderdale, Florida</td></tr>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Designer Shades</td><td class=\"welcomelocation\">Gastonia, North Carolina</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Woods </td><td class=\"welcomelocation\" >  Gilbert, Arizona</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Shutters </td><td class=\"welcomelocation\">Gilbert, Arizona</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Metals and Distribution</td><td class=\"welcomelocation\">Tupelo, Mississippi</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td><td class=\"welcomedivision\">Components</td><td class=\"welcomelocation\">Owensboro, Kentucky</td></tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("\t\t\t  </td>\r\n");
      out.write("                      <TD width=\"65%\">\r\n");
      out.write("\t\t\t\t      <TABLE cellSpacing=0 cellPadding=0 border=0 align=\"left\">\r\n");
      out.write("                              <TR><td></td><TD><IMG src=\"images/ordstatuslogin.gif\"></TD></TR>\r\n");
      out.write("                              <TR><TD colspan=\"2\" height=\"20\" >&nbsp;</TD></TR>\r\n");
      out.write("\t\t    \t\t          <TR>\r\n");
      out.write("                                        <TD width=\"20%\"><FONT class=\"text\">User Name &nbsp;</FONT></TD>\r\n");
      out.write("\t                                    <TD width=\"60%\" ><INPUT type=\"text\" class=\"textStyle\" name=\"username\" tabindex=\"1\"></TD>\r\n");
      out.write("\t\t     \t     \t      </TR>\r\n");
      out.write("                                      <TR><TD colspan=\"2\" >&nbsp;</TD></TR>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                          <TD><FONT class=\"text\">Password &nbsp;</FONT></TD>\r\n");
      out.write("                                          <TD><INPUT type=password name=\"password\" class=\"textStyle\" tabindex=\"2\"></TD>\r\n");
      out.write("\t\t                      </TR>\r\n");
      out.write("                                      <TR><TD colspan=\"2\" >&nbsp;</TD></TR>\r\n");
      out.write("                                      <TR>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <TD colspan=\"2\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <TABLE cellSpacing=0 cellPadding=0 border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   <TR>\r\n");
      out.write("\t\t                                            <TD class=\"legal\" width=\"60%\"><p><INPUT type=\"checkbox\" tabindex=\"4\" name=\"accept\">By selecting this box and clicking submit,\r\n");
      out.write("        \t\t                                    the person accessing the website represents and warrants to Hunter Douglas that all \r\n");
      out.write("                \t\t                            conditions to his/her access of the website have been met, and (if a Fabricator\r\n");
      out.write("                        \t\t                    employee) reaffirms his/her agreement to comply with all obligations of the Fabricator\r\n");
      out.write("                                \t\t            set forth in the Access Agreement.</p></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD width=\"40%\"><a href=\"enhancements.html\" target=_blank\"><img src =\"images/enhancements.jpg\" border=\"0\" style=\"background-color:transparent\"></a></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TD>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                      </TR>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                          <TD height=\"20\"></TD>\r\n");
      out.write("                                      </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                          <TD></TD><TD><a style=\"FONT-SIZE: 11px;FONT-FAMILY:Arial\" href=\"javascript:window.showModalDialog('terms.html')\">Terms & Conditions</a></TD>\r\n");
      out.write("                                      </TR>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                          <TD height=\"20\"></TD>\r\n");
      out.write("                                      </TR>\r\n");
      out.write("                                       <TR>\r\n");
      out.write("                                          <TD></TD><TD>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                              <input type=\"button\" style=\"border:0;background-color:white;background-image:url('images/submit.gif');width:75;height:22;cursor:hand;\"\r\n");
      out.write("                                              tabindex=\"4\"  size=\"20\" id=\"submitForm\" name=\"submitForm\" onmousedown=\"javascript:return Validate();\" \r\n");
      out.write("                                              onkeydown=\"javascript:return Validate();\">\r\n");
      out.write("                                          </TD>\r\n");
      out.write("                                       </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <TD></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <TD><BR><font class=\"text\"><a href=\"javascript:contactWebMaster()\">Contact WebMaster</a></font></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <TD></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <TD><BR><font class=\"text\"><a href=\"http://www.hunterdouglas.com\" target=\"_blank\">HunterDouglas.com</a></font></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   </TR>\r\n");
      out.write("       \t\t \t\t       </TABLE>\r\n");
      out.write("                            </TD>\r\n");
      out.write("\t                    </TR>\r\n");
      out.write("                            </TBODY>\r\n");
      out.write("                            </TABLE>\r\n");
      out.write("\t    </TD>\r\n");
      out.write("\t    </TR></TBODY>\r\n");
      out.write("\t    </TABLE></TD>\r\n");
      out.write("    <TD width=\"3%\">&nbsp;</TD></TR>\r\n");
      out.write("    </TBODY></TABLE>\r\n");
      out.write("    </FONT><BR><BR></FONT></P>\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\"  NAME=\"attempts\" value=\"");
      out.print(attempts);
      out.write("\">\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("<!--\r\n");
      out.write("    //Function to display webmaster screen.\r\n");
      out.write("\tfunction contactWebMaster(){\r\n");
      out.write("\t\tvar contactWin=window.open(\"ContactWebmasterWithoutQuery.jsp\",'ContactWebMaster','toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,width=600,height=400,top=10,left=100');\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//function to set the focus to the username field\r\n");
      out.write("\tfunction setfocus()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.frmLogin.username.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//function to validate the Form elements\r\n");
      out.write("\tfunction Validate()\r\n");
      out.write("\t{\r\n");
      out.write("                if(document.frmLogin.accept.checked==false) {\r\n");
      out.write("                        alert(\"You must agree to the Terms & Conditions to proceed.\");\r\n");
      out.write("\t\t\t            return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\t\tif (isNaN(document.frmLogin.username.value)==false && document.frmLogin.username.value.length<10) {       \r\n");
      out.write("                    document.frmLogin.username.value='0000'+document.frmLogin.username.value;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif (document.frmLogin.username.value.length == 0) {   \r\n");
      out.write("                        alert(\"Please enter the Customer Number \");\r\n");
      out.write("\t\t\tdocument.frmLogin.username.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tif (document.frmLogin.password.value.length == 0) {   \r\n");
      out.write("                        alert(\"Please enter the Password \");\r\n");
      out.write("\t\t\tdocument.frmLogin.password.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("    \t        document.frmLogin.submit();\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</HTML>\r\n");
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
