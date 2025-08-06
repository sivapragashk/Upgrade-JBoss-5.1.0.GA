package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.es.tools.Constants;
import com.hd.es.db.base.Category;

public final class sortCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Hunter Douglas ES</title>\r\n");
      out.write("<script type=\"text/JavaScript\" language=\"JavaScript\" src=\"javascript/jquery-1.4.2.min.js\"></script> \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/admin.css\" >\r\n");
      out.write("\r\n");

String selectedAccessLevel="";
String selected="";
if(request.getAttribute(Constants.SELECTED_ACCESS_LEVEL)!=null){
	selectedAccessLevel = (String)request.getAttribute(Constants.SELECTED_ACCESS_LEVEL);
}



      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function numbersOnly(evt)\r\n");
      out.write("{\r\n");
      out.write("    evt = (evt) ? evt : event;\r\n");
      out.write("    var charCode = (evt.charCode) ? evt.charCode : ((evt.keyCode) ? evt.keyCode :\r\n");
      out.write("        ((evt.which) ? evt.which : 0));\r\n");
      out.write("    if (charCode > 31 && (charCode < 48 || charCode > 57))\r\n");
      out.write("    {\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function saveChanges()\r\n");
      out.write("{\r\n");
      out.write("\tif(validateSortNo()){\r\n");
      out.write("\t\t$(\"#action\").val('");
      out.print(Constants.SAVE_SORTED_CATEGORIES);
      out.write("');\r\n");
      out.write("\t\t$(\"#sortAdminfrm\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateSortNo()\r\n");
      out.write("{\r\n");
      out.write("\tvar doc = document.forms[0].elements.length;\r\n");
      out.write("\tvar number='';\r\n");
      out.write("\tvar sortNos = new Array();\r\n");
      out.write("\tvar count=0;\r\n");
      out.write("\tfor(i=0;i<doc;i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar compName = document.forms[0].elements[i].name; \r\n");
      out.write("\t\tif(compName.lastIndexOf('SORT')!=-1)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar objValue = document.forms[0].elements[i].value;\r\n");
      out.write("\t\t\tif(objValue == ''){\r\n");
      out.write("\t\t\t\talert('Order numbers cannot be left blank, please enter unique numbers.');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfor(j=0;j<sortNos.length;j++)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif(sortNos[j] != 0) {\r\n");
      out.write("\t\t\t\t\tif(sortNos[j]==objValue)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\talert('Order numbers cannot be duplicated, please enter unique numbers.');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsortNos[count++]=objValue;\t\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getCategoryList(){\r\n");
      out.write("\tvar accessType = $(\"#accessType\").val();\r\n");
      out.write("\tif(accessType > 0){\r\n");
      out.write("\t\t$(\"#sortAdminfrm\").submit();\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert('Please select access to continue');\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<form class=\"ins\" id=\"sortAdminfrm\" action=\"category\" method=\"post\">\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  id=\"table3\" >\r\n");
      out.write("\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t<table border=\"0\" cellpadding=\"1\" cellspacing=\"1\"  id=\"table13\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t \t<td align=\"center\">&nbsp;</td>\r\n");
      out.write("\t\t\t </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t \t<td align=\"center\" valign=\"bottom\"><span class=\"hyperlink\" id=\"closeWindow\"><a href=\"javascript:self.close()\">Close Window</a></span></td>\r\n");
      out.write("\t\t\t </tr>\r\n");
      out.write("\t\t\t <tr>\r\n");
      out.write("\t\t\t \t<td align=\"center\" height=\"35\">\r\n");
      out.write("\t\t\t\t\t<span class=\"bodyHeader\">\r\n");
      out.write("\t\t\t\t\t\tManage Sort\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t </tr>\r\n");
      out.write("\t\t\t <tr>\r\n");
      out.write("\t\t\t <td>&nbsp;</td>\r\n");
      out.write("\t\t\t </tr>\r\n");
      out.write("\t\t\t <tr align=\"center\">\r\n");
      out.write("\t\t\t \t<td align=\"center\">\r\n");
      out.write(" \t\t\t\t\t <table border=\"0\" cellpadding=\"1\" cellspacing=\"1\" width=\"400\"  align=\"center\"  id=\"table14\">\r\n");
      out.write(" \t\t\t\t\t \t<tr>\r\n");
      out.write(" \t\t\t\t\t \t\t<td align=\"right\" class=\"columnLabel\">Access Level:</td>\r\n");
      out.write(" \t\t\t\t\t \t\t<td>\r\n");
      out.write(" \t\t\t\t\t \t\t<select name=\"accessType\" Id=\"accessType\">\r\n");
      out.write(" \t\t\t\t\t \t\t\t<option value=\"0\">Select Access Level:</option>\r\n");
      out.write(" \t\t\t\t\t \t\t\t");
if(request.getAttribute(Constants.SELECTED_ACCESS_LEVEL)!=null){
	 					 			if(selectedAccessLevel.equals(Constants.PUBLIC_CONTENT)){
      out.write("\r\n");
      out.write("\t \t\t\t\t\t \t\t\t\t<option value=\"");
      out.print(Constants.PUBLIC_CONTENT);
      out.write("\" selected>Public</option>\r\n");
      out.write("\t \t\t\t\t\t \t\t\t\t<option value=\"");
      out.print(Constants.PRIVTE_CONTENT);
      out.write("\">Private</option>\r\n");
      out.write("\t \t\t\t\t\t \t\t\t");
}else if(selectedAccessLevel.equals(Constants.PRIVTE_CONTENT)){
      out.write("\r\n");
      out.write("\t \t\t\t\t\t \t\t\t\t<option value=\"");
      out.print(Constants.PUBLIC_CONTENT);
      out.write("\" >Public</option>\r\n");
      out.write("\t \t\t\t\t\t \t\t\t\t<option value=\"");
      out.print(Constants.PRIVTE_CONTENT);
      out.write("\" selected>Private</option>\r\n");
      out.write("\t \t\t\t\t\t \t\t\t");
}
 					 			}else{
      out.write("\r\n");
      out.write(" \t\t\t\t\t \t\t\t\t\t<option value=\"");
      out.print(Constants.PUBLIC_CONTENT);
      out.write("\" >Public</option>\r\n");
      out.write("\t \t\t\t\t\t \t\t\t\t<option value=\"");
      out.print(Constants.PRIVTE_CONTENT);
      out.write("\">Private</option>\r\n");
      out.write(" \t\t\t\t\t \t\t\t");
}
      out.write("\r\n");
      out.write(" \t\t\t\t\t \t\t\t</select>&nbsp;<input type=\"button\" name=\"search\" value=\"Go\" Id=\"search\" Class=\"search\" onclick=\"getCategoryList()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"bottom\" colspan=\"2\" align=\"center\" class=\"admin_messages\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"admin_messages\">\r\n");
      out.write("\t\t\t\t\t\t\t");
String message = (String) request.getAttribute(Constants.MESSAGE);
								if ( message != null ){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  ");
      out.print(message);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
if(request.getAttribute(Constants.CATEGORY_LIST_FOR_SELECTED_ACCESS_LEVEL) != null){
							Category[] categories = (Category[])request.getAttribute(Constants.CATEGORY_LIST_FOR_SELECTED_ACCESS_LEVEL);
							if(categories.length > 0){
							String sortNo="";
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table border=\"1\" bordercolor=\"#0065A4\" style=\"BORDER-COLLAPSE: collapse;\" cellpadding=\"2\" cellspacing=\"2\" width=\"60%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr  bgcolor=\"#FFD205\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"2%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"bodyHeader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tOrder.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"10%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"bodyHeader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tCategoryName\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
for(int i=0;i<categories.length;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
if(categories[i].getAccessType().length() > 1){
												 String [] sortNos = categories[i].getAccessType().split(",");
												 if(sortNos[0].equals(selectedAccessLevel)){
													 sortNo = Integer.toString(categories[i].getPublicSortNo());
												 }else if(sortNos[1].equals(selectedAccessLevel)){
													 sortNo = Integer.toString(categories[i].getPrivateSortNo());
												 }
											 }else{
											    if(categories[i].getAccessType().equals("1")){
													sortNo = Integer.toString(categories[i].getPublicSortNo());
												}else{
													sortNo = Integer.toString(categories[i].getPrivateSortNo());
												 }
											 }
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr bgcolor=\"#FFF2D2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"textHeading\" style=\"font-size:8pt;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name='");
      out.print("SORT-"+Integer.toString(categories[i].getCategoryId()));
      out.write("' value=\"");
      out.print(sortNo);
      out.write("\" size=\"2\" maxlength=\"3\" style=\"font-family:Verdana;\" onkeypress=\"return numbersOnly(event)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"categoryId\" value=\"");
      out.print(Integer.toString(categories[i].getCategoryId()));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"textHeading\" style=\"font-size:8pt;\">");
      out.print(categories[i].getCategoryName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" colspan=\"2\"><input type=\"button\" name=\"SaveChanges\" id=\"SaveChanges\" class=\"textToBold\" value=\"Save Changes\" onclick=\"saveChanges()\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"admin_messages\" colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"admin_messages\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tNo Category found for the given criteria.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"action\" id=\"action\" value=\"");
      out.print(Constants.SORT_CATEGORY);
      out.write("\" />\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"15\"  height=\"500\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
