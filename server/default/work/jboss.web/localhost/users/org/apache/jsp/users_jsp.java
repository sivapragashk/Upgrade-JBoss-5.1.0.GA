package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.usermanagement.utils.*;
import com.hd.usermanagement.user.*;
import com.hd.usermanagement.applications.*;
import com.hd.usermanagement.utils.*;
import java.util.*;
import com.hd.usermanagement.utils.*;
import com.hd.usermanagement.user.*;
import com.hd.usermanagement.applications.*;
import com.hd.usermanagement.groups.*;
import com.hd.usermanagement.groupusertypes.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/message.jsp");
    _jspx_dependants.add("/userApplicationDetails.jsp");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>User Management</title>\r\n");
      out.write("<link href=\"stylesheets/users.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.js\"></script>\r\n");
      out.write("<script type=\"text/JavaScript\" language=\"JavaScript\" src=\"js/user.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" $(document).ready(function() {\r\n");
      out.write("        $(\"#savechanges\").click(function(){\r\n");
      out.write("          if($(\"#username\").val() == ''){\r\n");
      out.write("\t\t\talert('Please enter Username to continue');\r\n");
      out.write("\t\t\tdocument.userForm.username.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t  }\r\n");
      out.write("          if($(\"#userId\").val() == 0){\r\n");
      out.write("          \t$.post(\"searchuser.do\", {username:$(\"#username\").val(), action:'checkuser'}, function(xml) {\r\n");
      out.write("    \t      checkUser(\r\n");
      out.write("        \t \t  $(\"status\", xml).text()\r\n");
      out.write("\t          );          \r\n");
      out.write("     \t     });\r\n");
      out.write("          }else{\t\r\n");
      out.write("\t\t\tsaveUserDetails('");
      out.print(Constants.MANAGE_USERS);
      out.write("');\t          \r\n");
      out.write("     \t  }   \r\n");
      out.write("      });\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  function checkUser(status){\r\n");
      out.write("  \tif(status == 'UserExists'){\r\n");
      out.write("  \t\talert('Username already exists, please choose a different username.');\r\n");
      out.write("  \t\treturn;\r\n");
      out.write("  \t}else{\r\n");
      out.write("  \t\tsaveUserDetails('");
      out.print(Constants.MANAGE_USERS);
      out.write("');\r\n");
      out.write("  \t}\r\n");
      out.write("  \t\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

int userId = 0;
String username = "";
String password = "";
String firstname = "";
String lastname = "";
String email = "";
String address1 = "";
String address2 = "";
String city = "";
String state = "";
String postalcode = "";
String phone = "";
String status = "";
String ummAdmin = "N";
boolean manageUsers = false;
boolean manageGroups = false;
boolean manageGroupUserType = false;
boolean manageCustonFields = false;
boolean manageUserRegs = false;
String newRegistrationStatus = "";
if(request.getAttribute(Constants.USER_DETAILS)!=null){
	UserDO user = (UserDO) request.getAttribute(Constants.USER_DETAILS);
	userId = user.getUserId();
	username = user.getUserName()==null?"":user.getUserName();
	password = user.getPassword()==null?"":user.getPassword();
	firstname = user.getFirstName()==null?"":user.getFirstName();
	lastname = user.getLastName()==null?"":user.getLastName();
	email = user.getEmail()==null?"":user.getEmail();
	address1 = user.getAddress1()==null?"":user.getAddress1();
	address2 = user.getAddress2()==null?"":user.getAddress2();
	city = user.getCity()==null?"":user.getCity();
	state = user.getState()==null?"":user.getState();
	postalcode = user.getPostalCode()==null?"":user.getPostalCode();
	phone = user.getPhone()==null?"":user.getPhone();
	status = user.getStatus()==null?"":user.getStatus();
	ummAdmin = user.getUMMAdmin()==null?"":user.getUMMAdmin();
	newRegistrationStatus = user.getNewRegistrationStatus()==null?"":user.getNewRegistrationStatus();
	ApplicationDO[] applicationDO = user.getApplications();
	
	if(session.getAttribute(Constants.IS_UMM_ADMIN).equals(Constants.UMM_ADMINISTRATOR)){
		manageUsers = true;
		manageGroups = true;
		manageGroupUserType = true;
		manageCustonFields = true;
		manageUserRegs = true;
	}else if(application != null && applicationDO.length > 0){
		for(int count=0;count<applicationDO.length;count++){
			if(applicationDO[count].getLoggedUserTypeId() == Constants.SUPER_USER){
				manageGroups = true;
				manageUsers = true;
				manageGroupUserType = true;
				manageCustonFields = true;
				manageUserRegs = true;
				break;
			}else if(applicationDO[count].getLoggedUserTypeId() < Constants.USER){
				manageUsers = true;
				manageGroupUserType = true;
				manageCustonFields = true;
				manageUserRegs = true;
			}
			
		}
	}
}
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("<TABLE style=\"BORDER-COLLAPSE: collapse\" cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("\t  <TBODY>\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t     <TD align=right>\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\"><IMG src=\"images/logo.gif\"  border=0></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"applicationHeader\" align=\"right\">User Management System&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr height=\"7\"><td></td></tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t  </TBODY>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("    <TABLE class=hd-main cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
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
      out.write("\t\t\t\t                <TD height=\"10\"><IMG height=1 src=\"blank.gif\" width=22></TD>\r\n");
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
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("     <p id=\"heading\"><b>&nbsp;&nbsp;Manage Users</b></p>\r\n");
      out.write("\t <table border=\"0\" cellpadding=\"3\" cellspacing=\"5\" width=\"85%\">\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td align=\"left\">\r\n");
      out.write("\t\t \t\t <p><span class=\"required\">* - Required fields.</span></p>\r\n");
      out.write("\t\t \t</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>\r\n");
      out.write(" \t\t\t\t<form name=\"userForm\" action=\"user\" method=\"post\">\r\n");
      out.write("\t\t\t\t <table border=\"0\" cellpadding=\"2\" cellspacing=\"3\" width=\"100%\" id=\"tablenobackground\">\r\n");
      out.write("\t\t\t\t\t <tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t ");
      out.write('\r');
      out.write('\n');
String message = (String) request.getAttribute(Constants.MESSAGE);
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
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t\t <td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t \t");
if(manageUsers){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t \t<a href=\"#\" onclick=\"javascript:submitform('");
      out.print(Constants.CREATE_NEW_USER);
      out.write("')\">Create new user</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t \t<a href=\"#\" onclick=\"javascript:submitform('");
      out.print(Constants.MODIFY_DELETE_USERS);
      out.write("')\">Modify/Delete existing users</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t \t");
}if(manageGroups){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t \t\t<a href=\"#\" onclick=\"javascript:manageGroups('userForm')\">Manage Groups</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t \t");
}if(manageCustonFields){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t \t\t<a href=\"#\" onclick=\"javascript:customFieldList('");
      out.print(Constants.CFTYPE_CUSTOM_FIELD);
      out.write("')\">Manage Custom Fields</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t \t");
}if(manageGroupUserType){
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t \t\t<a href=\"#\" onclick=\"javascript:manageGroupUserTypes()\">Manage Group Access</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t \t");
}if(manageUserRegs){
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t \t\t<a href=\"#\" onclick=\"javascript:manageUserRegistrations()\">User Registrations</a><br><br>\r\n");
      out.write("\t\t\t\t\t\t \t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\">Username</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" id=\"username\" name=\"username\" value=\"");
      out.print(username);
      out.write('"');
      out.write(' ');
if(userId > 0){
      out.write("readonly");
}
      out.write(" size=\"25\" maxlength=\"25\"/>&nbsp;<span class=\"required\">*</span></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\">Password</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"password\" name=\"password\" value=\"");
      out.print(password);
      out.write("\" size=\"25\" maxlength=\"25\"/>&nbsp;<span class=\"required\">*</span></td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t \t<td align=\"right\">First name</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"firstname\" value=\"");
      out.print(firstname);
      out.write("\" size=\"30\" maxlength=\"25\"/>&nbsp;<span class=\"required\">*</span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Last name</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"lastname\" value=\"");
      out.print(lastname);
      out.write("\" size=\"30\" maxlength=\"25\"/>&nbsp;<span class=\"required\">*</span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Email Id</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"email\" value=\"");
      out.print(email);
      out.write("\" size=\"50\" maxlength=\"50\"/>&nbsp;<span class=\"required\">*</span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Is UMM Admin</td>\r\n");
      out.write("\t\t\t\t\t\t");
if(session.getAttribute(Constants.IS_UMM_ADMIN).equals(Constants.UMM_ADMINISTRATOR)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"umm_admin\" value=\"N\" style=\"border: 0px;\" checked>No\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"umm_admin\" value=\"Y\" style=\"border: 0px;\" ");
if(ummAdmin.equals("Y")){
      out.write("checked");
}
      out.write(">Yes\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"textStyle\">No</span><input type=\"hidden\" name=\"umm_admin\" value=\"N\"> \r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");

ApplicationDO[] applications = null;
boolean umm_admin = false;
if(request.getAttribute(Constants.USER_DETAILS)!=null){
	UserDO user = (UserDO) request.getAttribute(Constants.USER_DETAILS);				
	applications = user.getApplications();
}
if(session.getAttribute(Constants.IS_UMM_ADMIN)!=null){
	if(session.getAttribute(Constants.IS_UMM_ADMIN).equals(Constants.UMM_ADMINISTRATOR))
		umm_admin = true;	
}

      out.write("\r\n");
      out.write("<tr valign=\"top\">\r\n");
      out.write("\t<td align=\"right\">Application Details</td>\r\n");
      out.write("\t<td width=\"75%\">\r\n");
      out.write("\t<div style=\"border-color: #000000; border-style: solid; border-width: 1px; width:790px; height: 250px; overflow: auto;\">\r\n");
      out.write("\t    <table>\r\n");
      out.write("\t\t");
if(applications != null && applications.length > 0){
			String applicationLabel = "<span class=\"textBold\">Applications:</span>";
			String groupLabel = "<span class=\"textBold\" style=\"width: 220px;\">Groups:</span><span class=\"textBold\">Group Access:</span>";
			String departmentLabel = "Departments:";
			String typeLabel = "<span class=\"textBold\">Application Access:</span>";
			for(int i=0;i<applications.length;i++){
				String check_application = "";
				int assigned_department = 0;
				int assigned_user_type = 0;
				List<String> assigned_group_list = null;
				Map<String, String> assigned_group_type_map = null;
				if(applications[i].isAssigned())
					check_application = "checked";
				assigned_department = applications[i].getAssignedDepartmentId();
				assigned_user_type = applications[i].getAssignedUserTypeId();
				assigned_group_list = applications[i].getAssignedGroupList();
				assigned_group_type_map = applications[i].getAssignedGroupUserTypeMap();
				if(i==1){
					applicationLabel = "";
					groupLabel = "";
					departmentLabel = "";
					typeLabel = "";
				}
				if(!umm_admin && applications[i].getLoggedUserTypeId() == Constants.USER){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\" width=\"20%\">&nbsp;");
      out.print(applicationLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"70%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"textStyle\">");
      out.print(applications[i].getApplicationName());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t\t\t\t");
UserTypeDO[] userTypes = applications[i].getUserTypes();
							if(userTypes != null && userTypes.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"18%\">&nbsp;");
      out.print(typeLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
for(int m=0;m<userTypes.length;m++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"textStyle\">");
      out.print(userTypes[m].getUserType());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"18%\">&nbsp;");
      out.print(typeLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td valign=\"middle\"><span class=\"textStyle\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}		
							GroupDO[] groups = applications[i].getGroups();
							if(groups != null && groups.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"40%\">&nbsp;");
      out.print(groupLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"border-color: #000000; border-style: solid; border-width: 1px; width: 370px; height: 100px; overflow: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
for(int j=0;j<groups.length;j++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" width=\"60%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"textStyle\">");
      out.print(groups[j].getGroupName());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
GroupUserTypeDO[] groupUserType = groups[j].getGroupUserTypes();
													if(groupUserType != null && groupUserType.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" width=\"40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for(int k=0;k<groupUserType.length;k++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"textStyle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
String groupType= "";
																	if(assigned_group_type_map != null && assigned_group_type_map.get(""+groups[j].getGroupId()) != null)
																		groupType = assigned_group_type_map.get(""+groups[j].getGroupId());
																	if(groupType.equals("0")){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAll\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
break;
																	}else if(groupType.equals(""+groupUserType[k].getGroupUserTypeId())){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(groupUserType[k].getGroupUserType());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" width=\"40%\"><span class=\"textStyle\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"40%\">&nbsp;");
      out.print(groupLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><span class=\"textStyle\" width=\"60%\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><span class=\"textStyle\" width=\"40%\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\" width=\"20%\">&nbsp;");
      out.print(applicationLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"70%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"APPLICATION_");
      out.print(applications[i].getApplicationId());
      out.write("\" value=\"");
      out.print(applications[i].getApplicationId());
      out.write("\" style=\"border: 0px;\" ");
      out.print(check_application);
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"textStyle\">");
      out.print(applications[i].getApplicationName());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t\t\t\t");
UserTypeDO[] userTypes = applications[i].getUserTypes();
							if(userTypes != null && userTypes.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"18%\">&nbsp;");
      out.print(typeLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"APPUSERTYPE_");
      out.print(applications[i].getApplicationId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Select User Type</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for(int m=0;m<userTypes.length;m++){
															String selectUserType = "";
															if(userTypes[m].getUserTypeId() == assigned_user_type)
																selectUserType = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(userTypes[m].getUserTypeId());
      out.write('"');
      out.write(' ');
      out.print(selectUserType);
      out.write('>');
      out.print(userTypes[m].getUserType());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"18%\">&nbsp;");
      out.print(typeLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td valign=\"middle\"><span class=\"textStyle\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}	
							GroupDO[] groups = applications[i].getGroups();
							if(groups != null && groups.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"40%\">&nbsp;");
      out.print(groupLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"border-color: #0065A4; border-style: solid; border-width: 1px; height: 100px; overflow: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
for(int j=0;j<groups.length;j++){
												String check_group = "";
												if(assigned_group_list != null && assigned_group_list.contains(""+groups[j].getGroupId()))
													check_group = "checked";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" width=\"60%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"GROUP_");
      out.print(applications[i].getApplicationId());
      out.write('_');
      out.print(groups[j].getGroupId());
      out.write("\" value=\"");
      out.print(groups[j].getGroupId());
      out.write("\" style=\"border: 0px;\" ");
      out.print(check_group);
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"textStyle\">");
      out.print(groups[j].getGroupName());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
GroupUserTypeDO[] groupUserType = groups[j].getGroupUserTypes();
													if(groupUserType != null && groupUserType.length > 0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" width=\"40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"GROUPUSERTYPE_");
      out.print(groups[j].getGroupId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">All</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for(int k=0;k<groupUserType.length;k++){
																String select_group_user_type = "";
																String groupType= "";
																if(assigned_group_type_map != null && assigned_group_type_map.get(""+groups[j].getGroupId()) != null)
																	groupType = assigned_group_type_map.get(""+groups[j].getGroupId());
																if(groupType.equals(""+groupUserType[k].getGroupUserTypeId()))
																	select_group_user_type = "selected";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(groupUserType[k].getGroupUserTypeId());
      out.write('"');
      out.write(' ');
      out.print(select_group_user_type);
      out.write('>');
      out.print(groupUserType[k].getGroupUserType());
      out.write("</option>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" width=\"40%\"><span class=\"textStyle\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" align=\"left\" width=\"40%\">&nbsp;");
      out.print(groupLabel);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><span class=\"textStyle\" width=\"60%\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><span class=\"textStyle\" width=\"40%\">N/A</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
}	
		 }
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</td>\t\r\n");
      out.write("</tr>");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Address1</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"address1\" value=\"");
      out.print(address1);
      out.write("\" size=\"50\" maxlength=\"50\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Address2</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"address2\" value=\"");
      out.print(address2);
      out.write("\" size=\"50\" maxlength=\"50\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">City</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"city\" value=\"");
      out.print(city);
      out.write("\" maxlength=\"25\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">State/Province</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"state\" value=\"");
      out.print(state);
      out.write("\" maxlength=\"25\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Postal Code</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"postalCode\" value=\"");
      out.print(postalcode);
      out.write("\" maxlength=\"10\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Phone</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"phone\" value=\"");
      out.print(phone);
      out.write("\" size=\"30\" maxlength=\"15\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Status</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"Y\" style=\"border: none;\" checked/>Active\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"N\" style=\"border: none;\" ");
if(status.equals("N")){
      out.write("checked");
}
      out.write(" />Inactive\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"P\" style=\"border: none;\" ");
if(status.equals("P")){
      out.write("checked");
}
      out.write(" />Pending\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" id=\"savechanges\" value=\"Save Changes\" class=\"buttonStyle\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" id=\"\" value=\"Clear\" class=\"buttonStyle\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"userId\" name=\"userId\" value=\"");
      out.print(userId);
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"Action\" value=\"\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"newRegistrationStatus\" value=\"");
      out.print(newRegistrationStatus);
      out.write("\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\t\r\n");
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
