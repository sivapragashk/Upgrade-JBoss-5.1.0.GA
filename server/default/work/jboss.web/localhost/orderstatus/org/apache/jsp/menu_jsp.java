package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.orderstatus.*;
import com.sap.mw.jco.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import com.sap.mw.jco.*;;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


/*
* Function to Parse the contents of  a long string and braek in to number of lines .
* formatString(String str,int no)
* str : String to be parsed , no : No_of_Params_per_line.
*/
	public String formatString(String str,int no){
    	
		 StringTokenizer st = new StringTokenizer(str,";");
		 String output="",tmp="";
		 int i=0;
		
		 while (st.hasMoreTokens()) {
				
				tmp=st.nextToken();
				if(i==no){

				         output=output +"<br>"+tmp;
						 i=0;
				}
				else{
					 if(i==0)
							 output=output+tmp;
					 else
							 output=output+", "+tmp;
			   }
		 	   i++;
		}
		
		return output;
	}
			
		/* 	public String replace(String str,String from,String to
		* 	Function replace a specified string with destination string)
		*
		*/
	
		public String replace(String str,String from,String to){

			while(str.indexOf(from)>-1){
					str=str.substring(0,str.indexOf(from))+to+ str.substring(str.indexOf(from)+from.length(),str.length());
			}
			return str;
		}
		/*  public String replaceSpecialCharacters(String src)
		*	Replace the Special characters of the string. Helps to pass values to javascript
		*
		*/
		

		public String replaceSpecialCharacters(String src){
			String pattern="~^&*";
			String specialCharacter[]={"\""};
			for(int replaceIndex=0;replaceIndex<specialCharacter.length;replaceIndex++){
				src=replace(src,specialCharacter[replaceIndex],pattern);
				src=replace(src,pattern,"\\"+specialCharacter[replaceIndex]);
			}
			return src;
		}				
			public com.hd.orderstatus.MappedData getData(String fileLocation) throws Exception{
	
			FileInputStream fis=null;
			ObjectInputStream ois=null;
			com.hd.orderstatus.MappedData md;
			try{
				fis= new FileInputStream(fileLocation);
				ois= new ObjectInputStream(fis);

				md=(com.hd.orderstatus.MappedData)ois.readObject();		
				ois.close();
				fis.close();
			
			}
			catch(IOException ex){
				throw new Exception("Error occured during Object Activation"+ex);
			}
				
			return md;
	}
	
	
	public JCO.Function getfun(String fileLocation) throws Exception{
	
			FileInputStream fis=null;
			ObjectInputStream ois=null;
			JCO.Function md;
			try{
				fis= new FileInputStream(fileLocation);
				ois= new ObjectInputStream(fis);

				md=(JCO.Function)ois.readObject();		
				ois.close();
				fis.close();
			
			}
			catch(IOException ex){
				throw new Exception("Error occured during Object Activation"+ex);
			}
				
			return md;
	}
	
	
	public String formatFloat(String floatValue){
			
			floatValue=floatValue+"00";
			return floatValue.substring(0,floatValue.indexOf(".")+3);	
	}
	
	public String formatSapDate(String date){
			
			if(date.length()>6){
				return date.substring(5,7) +"/"+ date.substring(8,date.length())+"/"+ date.substring(0, 4);
			}
			else
				return date;			
	}

        public boolean isNumeric(String s) {
           try {
                  Double.parseDouble(s);
                  return true;
           }catch(Exception e) {
                  return false;
           }
        }     

        //Converts the string from mm/dd/yyyy to yyyy-mm-dd format as required by the valueOf method of Date class.
        public String formatDate(String inputString) {
            String outputString;
            String[] dateArray = new String[3];
            StringTokenizer temp = new StringTokenizer(inputString,"/");
            for(int i=0;temp.hasMoreTokens();i++) {
                dateArray[i]=temp.nextToken();    
            }
            outputString=dateArray[2]+"-"+dateArray[0]+"-"+dateArray[1];
            return outputString;
        }



  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/sessioninclude.jsp");
    _jspx_dependants.add("/utility.jsp");
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

      out.write("<!-- DATE     : 07/12/02   -->\r\n");
      out.write("<!-- AUTHOR   : Nirmala .K -->\r\n");
      out.write("<!-- PURPOSE  : Order Status - Left Navigation bar  -->\r\n");
      out.write("<!-- COMPANY  : GAVS Information Services Pvt Ltd, India  -->\r\n");
      out.write("<!-- MODIFIED :   -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

        //response.addHeader("Pragma" , "No-cache") ;
        //response.addHeader("Cache-Control", "no-cache") ;
        //response.addDateHeader("Expires", 0);

	User profile=null;
		
        /*
	* Retrieve the User Object from session and assign to the implict object variable "profile"
	*
	*/
         if(session.getAttribute("PROFILE")!=null) {
            profile=(User)session.getAttribute("PROFILE");
         }else {
	 /* Redirect the user to login page, if the user is not logged in
	  *
	 */
         
      out.write("\r\n");
      out.write("\t\t\t<script>           \r\n");
      out.write("\t\t\tif(parent.main){\r\n");
      out.write("\t\t\t   parent.main.location.href=\"login.jsp?strMsg=Your session has expired. Please Re-Login.\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t   document.location.href=\"index.html\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t ");
}
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<HTML><HEAD>\r\n");
      out.write("<TITLE>Order Status Home - HunterDouglas</TITLE>\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"orderstatus.css\">\r\n");
      out.write("<style>\r\n");
      out.write("        .Menu\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tfont-family:Arial;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tfont-size: 8pt;\r\n");
      out.write("\t\t\tbackground-color: #000000;\r\n");
      out.write("\t\t\tcolor: #FC9700;\r\n");
      out.write("\t\t\tcursor: hand;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.MenuHref\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tfont-family:Arial;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tfont-size: 8pt;\r\n");
      out.write("\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\tbackground-color: #000000;\r\n");
      out.write("\t\t\tcolor: #FC9700;\r\n");
      out.write("\t\t\tcursor: hand;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.SelectedMenu\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tfont-family:Arial;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tfont-size: 8pt;\r\n");
      out.write("\t\t\tbackground-color: #FC9700;\r\n");
      out.write("\t\t\tcolor: #000000\r\n");
      out.write("\t\t\tcursor:hand;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.SelectedMenuHref\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tfont-family:Arial;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tfont-size: 8pt;\r\n");
      out.write("\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\tbackground-color: #FC9700;\r\n");
      out.write("\t\t\tcolor: #000000\r\n");
      out.write("\t\t\tcursor:hand;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function highlight(val){\r\n");
      out.write("\tdocument.all(\"Menu\")[val].className=\"SelectedMenu\"\r\n");
      out.write("\tdocument.all(\"MenuHref\")[val].className=\"SelectedMenuHref\"\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function unHighlight(val){\r\n");
      out.write("\tdocument.all(\"Menu\")[val].className=\"Menu\"\r\n");
      out.write("\tdocument.all(\"MenuHref\")[val].className=\"MenuHref\"\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
if(profile!=null){
      out.write("\r\n");
      out.write("<BODY background=\"images/window.gif\" leftmargin=0 topmargin=0>\r\n");
      out.write("<TABLE  align=\"center\"  width=\"100%\" bgcolor=\"black\">\r\n");
      out.write("<TR>\r\n");
      out.write("<TD id=Menu class=Menu  ><A href=\"http://www.hunterdouglas.com\" id=\"MenuHref\" class=\"MenuHref\" target=\"new\"\r\n");
      out.write("onmouseout=\"javascript:unHighlight(0)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(0)\" >HunterDouglas.com</TD>\r\n");
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><A href=\"searchorders.jsp?operation=newsearch\" id=\"MenuHref\" class=\"MenuHref\"\r\n");
      out.write("onmouseout=\"javascript:unHighlight(1)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(1)\"\r\n");
      out.write("target=\"main_right\">New Search</a></td>\r\n");
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><A href=\"researchorders.jsp?operation=newsearch\" id=\"MenuHref\" class=\"MenuHref\"\r\n");
      out.write("onmouseout=\"javascript:unHighlight(2)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(2)\"\r\n");
      out.write("target=\"main_right\">Research Closed Orders</a></td>\r\n");
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><A href=\"javascript:printpage();\"\r\n");
      out.write("onmouseout=\"javascript:unHighlight(3)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(3)\"\r\n");
      out.write("id=\"MenuHref\" class=\"MenuHref\">Print this Page</a></td>\r\n");
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><a href=\"ShippingSite.jsp\" id=\"MenuHref\"\r\n");
      out.write("class=\"MenuHref\" target=\"main_right\"onmouseout=\"javascript:unHighlight(4)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(4)\">Shipping Sites </a></td>\r\n");
      out.write("\r\n");
if(profile.getuserType().trim().equals("SU")) {
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><A href=\"admintool.jsp?groupid=");
      out.print(request.getParameter("groupid"));
      out.write("\" id=\"MenuHref\"\r\n");
      out.write(" class=\"MenuHref\" target=\"main_right\" onmouseout=\"javascript:unHighlight(5)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(5)\">Administration</td>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
if(profile.getuserType().trim().equals("GA")) {
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><A href=\"groupusers.jsp?groupID=");
      out.print(request.getParameter("groupid"));
      out.write("\" id=\"MenuHref\"\r\n");
      out.write(" class=\"MenuHref\" target=\"main_right\" onmouseout=\"javascript:unHighlight(5)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(5)\">Administration</td>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
if(profile.getuserType().trim().equals("UR")) {
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><A href=\"resetpassword.jsp\" id=\"MenuHref\"\r\n");
      out.write(" class=\"MenuHref\" target=\"main_right\" onmouseout=\"javascript:unHighlight(5)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(5)\">Change Password</td>\r\n");
}
      out.write("\r\n");
      out.write("<td id=Menu class=Menu><A onclick=\"javascript:logout()\" style=\"cursor:hand\" id=\"MenuHref\" class=\"MenuHref\"\r\n");
      out.write("onmouseout=\"javascript:unHighlight(6)\"\r\n");
      out.write("onmouseover=\"javascript:highlight(6)\">Logout</a></td>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</BODY>\r\n");
      out.write("<SCRIPT language=\"javascript\">\r\n");
      out.write("// To print the page\r\n");
      out.write("function printpage() {\r\n");
      out.write("\twindow.parent.main_right.focus();\r\n");
      out.write("\twindow.print();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function logout() {\r\n");
      out.write("\ttop.window.main.location.href=\"logout.jsp\";\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
}
      out.write("\r\n");
      out.write("</HTML>\r\n");
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
