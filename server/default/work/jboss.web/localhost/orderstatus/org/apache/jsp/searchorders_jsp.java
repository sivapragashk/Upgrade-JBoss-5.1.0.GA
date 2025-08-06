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

public final class searchorders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/sessioninclude.jsp");
    _jspx_dependants.add("/utility.jsp");
    _jspx_dependants.add("/bottom.jsp");
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
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
      out.write("\r\n");
      com.hd.orderstatus.AdministratorBean adminBean = null;
      synchronized (_jspx_page_context) {
        adminBean = (com.hd.orderstatus.AdministratorBean) _jspx_page_context.getAttribute("adminBean", PageContext.PAGE_SCOPE);
        if (adminBean == null){
          adminBean = new com.hd.orderstatus.AdministratorBean();
          _jspx_page_context.setAttribute("adminBean", adminBean, PageContext.PAGE_SCOPE);
          out.write('\r');
          out.write('\n');
          out.write('	');
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("adminBean"), request);
          out.write('\r');
          out.write('\n');
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      com.hd.orderstatus.Query tmpQuery = null;
      synchronized (_jspx_page_context) {
        tmpQuery = (com.hd.orderstatus.Query) _jspx_page_context.getAttribute("tmpQuery", PageContext.PAGE_SCOPE);
        if (tmpQuery == null){
          tmpQuery = new com.hd.orderstatus.Query();
          _jspx_page_context.setAttribute("tmpQuery", tmpQuery, PageContext.PAGE_SCOPE);
          out.write('\r');
          out.write('\n');
          out.write('	');
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("tmpQuery"), request);
          out.write('\r');
          out.write('\n');
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Search Orders</TITLE>\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"includes/orderstatus.css\">\r\n");
      out.write("<SCRIPT LANGUAGE=javascript>\r\n");
      out.write("<!--\r\n");
      out.write("var messageWindowObj;\r\n");
      out.write("var tmpVar=0;\r\n");
      out.write("//function to set the focus to the CustomerID\r\n");
      out.write("function setfocus(){\r\n");
      out.write("                document.frmSearchOrders.customerID.focus();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\t\tfunction clearCustomerID(){\r\n");
      out.write("\t\t\tif(document.frmSearchOrders.tempcustomerID.selectedIndex > 0){\r\n");
      out.write("\t\t\t\tdocument.frmSearchOrders.customerID.value = '';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("        function SubmitForm(cntl,fabAccess,accessType)\r\n");
      out.write("        {\r\n");
      out.write("               if(tmpVar==0) {\r\n");
      out.write("               \r\n");
      out.write("               \t\tif(document.frmSearchOrders.tempcustomerID == null){\r\n");
      out.write("               \t\t\tif(document.frmSearchOrders.customerID.value.length ==0) {\r\n");
      out.write("\t                       alert(\"Customer Number cannot be blank.\");\r\n");
      out.write("    \t                   document.frmSearchOrders.customerID.focus();\r\n");
      out.write("        \t               return false;\r\n");
      out.write("            \t        }\r\n");
      out.write("               \t\t}else{\r\n");
      out.write("               \t\t\tif(document.frmSearchOrders.customerID.value.length ==0 && document.frmSearchOrders.tempcustomerID.selectedIndex == 0) {\r\n");
      out.write("\t                       alert(\"Please enter/select Customer Number.\");\r\n");
      out.write("    \t                   document.frmSearchOrders.customerID.focus();\r\n");
      out.write("        \t               return false;\r\n");
      out.write("            \t        }\r\n");
      out.write("            \t        \r\n");
      out.write("            \t        if(document.frmSearchOrders.customerID.value.length ==0)\r\n");
      out.write("                      \t\tdocument.frmSearchOrders.customerID.value = document.frmSearchOrders.tempcustomerID.value;\r\n");
      out.write("               \t\t}   \t\r\n");
      out.write("               \t   \r\n");
      out.write("                   if(document.frmSearchOrders.tempcustomerID == null){\r\n");
      out.write("\t\t\t\t\t\tif(document.frmSearchOrders.customerID.value.length < 10)\r\n");
      out.write("                      \t\tdocument.frmSearchOrders.customerID.value='0000'+document.frmSearchOrders.customerID.value;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tif(document.frmSearchOrders.tempcustomerID.selectedIndex > 1 && document.frmSearchOrders.customerID.value.length <10)\r\n");
      out.write("                      \t\tdocument.frmSearchOrders.customerID.value='0000'+document.frmSearchOrders.customerID.value;\r\n");
      out.write("\t\t\t\t\t}\t\r\n");
      out.write("\r\n");
      out.write("\t\tif(document.frmSearchOrders.salesOrg != null)\r\n");
      out.write("\t\t   if(document.frmSearchOrders.salesOrg.selectedIndex==0)\r\n");
      out.write("\t\t   {\r\n");
      out.write("\t\t\t   if(!(fabAccess==\"N\" && accessType==\"ALL\"))\r\n");
      out.write("\t\t\t   {\r\n");
      out.write("\t\t\t\t   alert(\"Please select the Sales Organization\");\r\n");
      out.write("\t\t\t\t   document.frmSearchOrders.salesOrg.focus();\r\n");
      out.write("\t\t\t\t   return false;\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t   }\t\t\t\r\n");
      out.write("\r\n");
      out.write("                   if(!validate()) return false;\r\n");
      out.write("                   messageWindowObj=window.showModelessDialog(\"message.html\",null,\"dialogHeight:100px;dialogWidth:250px;resizable:no;scroll:no;status:no;center:yes;\");\r\n");
      out.write("                   document.frmSearchOrders.submit();\r\n");
      out.write("                   tmpVar=1;\r\n");
      out.write("               }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("function showCalendar(obj){\r\n");
      out.write("\twindow.showModalDialog(\"fcal.html\",obj,\"dialogHeight:250px;dialogWidth:155px;dialogTop:225px;dialogLeft:500px;status=no\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function fnGetLastSavedQuery(){\r\n");
      out.write("\twindow.location.href=\"searchorders.jsp?operation=LastSavedQuery\";\r\n");
      out.write("}\r\n");
      out.write("function resetForm(){\r\n");
      out.write("\twindow.location.href=\"searchorders.jsp?operation=newsearch\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeMessageWindow() {\r\n");
      out.write("    if(typeof(messageWindowObj)==\"object\") {\r\n");
      out.write("          messageWindowObj.close();\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validate(){\r\n");
      out.write("\r\n");
      out.write("\tif(date_check1(document.frmSearchOrders.fromDate)==false) {\r\n");
      out.write("\t   alert(\"Please enter the From Date in the MM/DD/YYYY format before submiting your criteria.\");\r\n");
      out.write("\t   return false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(date_check1(document.frmSearchOrders.toDate)==false) {\r\n");
      out.write("\t   alert(\"Please enter the To Date in the MM/DD/YYYY format before submiting your criteria.\");\r\n");
      out.write("\t   return false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar fromdate=new Date(toDateFormat(document.frmSearchOrders.fromDate.value));\r\n");
      out.write("\tvar todate=new Date(toDateFormat(document.frmSearchOrders.toDate.value));\r\n");
      out.write("\t\r\n");
      out.write("\t\tif(document.frmSearchOrders.tempcustomerID != null && document.frmSearchOrders.tempcustomerID.selectedIndex == 1){\r\n");
      out.write(" \t       \tif(document.frmSearchOrders.poNumber.value.length == 0\r\n");
      out.write(" \t       \t\t&& document.frmSearchOrders.material.value.length == 0\r\n");
      out.write(" \t       \t\t&& document.frmSearchOrders.fromDate.value.length == 0){\r\n");
      out.write(" \t       \t\talert(\"Please specify either the 'Fabrication PO Number' or 'Material/PCN' or 'HD Order Number' or From and To Order Date\");\r\n");
      out.write(" \t       \t\treturn false;\r\n");
      out.write(" \t       \t}\r\n");
      out.write("   \t        \r\n");
      out.write("   \t       \tif(document.frmSearchOrders.poNumber.value.length == 0\r\n");
      out.write("   \t       \t\t&& document.frmSearchOrders.material.value.length == 0\r\n");
      out.write("   \t       \t\t&& document.frmSearchOrders.toDate.value.length == 0){\r\n");
      out.write("   \t       \t\talert(\"Please specify either the 'Fabrication PO Number' or 'Material/PCN' or 'HD Order Number' or From and To Order Date\");\r\n");
      out.write("   \t       \t\treturn false;\r\n");
      out.write("   \t       \t}\r\n");
      out.write("   \t       \tif(document.frmSearchOrders.poNumber.value.length == 0\r\n");
      out.write("   \t       \t\t&& document.frmSearchOrders.material.value.length == 0){\r\n");
      out.write("   \t       \t\t\tvar one_day=1000*60*60*24;\r\n");
      out.write("\t\t\t\t\tvar dateDiff =Math.ceil((todate.getTime()-fromdate.getTime())/(one_day));\r\n");
      out.write("   \t        \t\t\t\r\n");
      out.write("        \t\t\tif(dateDiff > 3){\r\n");
      out.write("        \t\t\t\talert('Number of Days between From and To date cannot be greater than 3.');\r\n");
      out.write("        \t\t\t\treturn false;\r\n");
      out.write("      \t\t\t\t}\r\n");
      out.write("   \t        \t}\r\n");
      out.write("   \t     }\r\n");
      out.write("\r\n");
      out.write("    if(todate <fromdate) {\r\n");
      out.write("\t\talert(\"To Date cannot be lesser than From Date\");\r\n");
      out.write("\t\tdocument.frmSearchOrders.toDate.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("    }\r\n");
      out.write("\telse return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function selectSalesOrg() {\r\n");
      out.write("\tdocument.frmSearchOrders.action=\"searchorders.jsp\";\r\n");
      out.write("\tdocument.frmSearchOrders.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function displayMessage(value){\r\n");
      out.write("\tvar windowCovering = 2000;\r\n");
      out.write("\tvar windowDecor = 3000;\r\n");
      out.write("\tif(value == windowCovering){\r\n");
      out.write("\t\talert('All orders placed after 12/31/09 will be under the Horizontal Blinds Sales Organization');\r\n");
      out.write("\t}else if(value == windowDecor){\r\n");
      out.write("\t\talert('All orders placed after 12/31/09 will be under the Window Designs Sales Organization');\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<SCRIPT language=\"JavaScript\" src=\"includes/validations.js\"></SCRIPT>\r\n");
      out.write("</HEAD>\r\n");
if (profile != null) {
                String fabAccessVisibility = "hidden";
                String fabAccessPosition = "absolute";
                String fabAccess="N";
				Connection connection = null;
				ResultSet selectGroupRs = null;
				ResultSet selectDivisionRs = null;
				ResultSet selectMaterialGroupRs = null;
				Statement statement  = null;
				Statement statement1 = null;
				Statement statement2 = null;

				try {
					String errMessage = "";
					String tempcustomerID = request.getParameter("tempcustomerID");
					if (request.getParameter("errorMessage") != null)
						errMessage = request.getParameter("errorMessage");
					int groupID;
					DBConnection dbConnection = new DBConnection();

					String operation = request.getParameter("operation");
					String customerID, poNumber, material, fromDate, toDate, customerNo;
					String salesOrg, orderNumber, orderType, goodsType, accessType, materialGroup;
					String salesOrgType = new String();

					if(request.getParameter("salesOrgType")!=null) {
						salesOrgType=request.getParameter("salesOrgType");
					}

					groupID = profile.getGroupID();
					customerID = profile.getCustomerID();

					//Get the Divisions of the Group in which the logged in user belongs to.
					connection = dbConnection.getConnection();
					statement = connection.createStatement();
					statement1 = connection.createStatement();
					statement2 = connection.createStatement();

					selectGroupRs = statement.executeQuery("select accesstype,fab_access from groups where groupid="+ groupID);
					selectGroupRs.next();
					accessType = selectGroupRs.getString("accesstype");
					fabAccess = selectGroupRs.getString("fab_access");

					if(fabAccess.trim().equalsIgnoreCase("Y") && accessType.trim().equalsIgnoreCase("ALL")) {
		                fabAccessVisibility = "visible";
		                fabAccessPosition = "relative";
					}

					if (fabAccess.trim().equalsIgnoreCase("N") && accessType.trim().equalsIgnoreCase("ALL")) {
						selectDivisionRs = statement.executeQuery("select name,value from salesorg order by name");
					} else if(accessType.trim().equalsIgnoreCase("ALL") && salesOrgType.trim().equalsIgnoreCase("fab")) {
						selectDivisionRs = statement.executeQuery("select name,value from salesorg where type='F' order by name");
					} else if(accessType.trim().equalsIgnoreCase("ALL") && salesOrgType.trim().equalsIgnoreCase("man")) {
						selectDivisionRs = statement.executeQuery("select name,value from salesorg where type='M' order by name");
					} else if(accessType.trim().equalsIgnoreCase("SOME")) {
						selectDivisionRs = statement.executeQuery("select name,value from salesorg,group_privilege where salesorg.salesorgid=group_privilege.salesorgid and groupid="+ groupID +"order by name");
					}
					//Get the material group for the fabrication orders
					selectMaterialGroupRs = statement1
							.executeQuery("select description from material_group order by description");

					poNumber = new String();
					material = new String();
					fromDate = new String();
					toDate = new String();
					materialGroup = new String();
					salesOrg = new String();
					orderNumber = new String();
					orderType = new String();
					goodsType = new String();
					customerNo = new String();

					// Clear the fields when the user clicks on Perform Another Search link

					if (operation != null
							&& operation.equalsIgnoreCase("newsearch")) {
						poNumber = "";
						material = "";
						materialGroup = "";
						fromDate = "";
						toDate = "";
						salesOrg = "";
						orderNumber = "";
						orderType = "";
						goodsType = "";
						customerNo = "";
					}

					/*
					 *		Last Saved Query Operation retrieves the Query Object from the Session.
					 */

					if (request.getParameter("operation") != null
							&& request.getParameter("operation").equals(
									"LastSavedQuery")) {
						try {
							adminBean.setusername(profile.getUsername());
							Query tmpLastSavedQuery = adminBean.getLastSavedQuery();
							if (tmpLastSavedQuery != null) {
								customerID = tmpLastSavedQuery.getCustomerID();
								poNumber = tmpLastSavedQuery.getPoNumber();
								materialGroup = tmpLastSavedQuery.getMaterialGroup();
								material = tmpLastSavedQuery.getMaterial();
								fromDate = tmpLastSavedQuery.getFromDate();
								toDate = tmpLastSavedQuery.getToDate();
								salesOrg = tmpLastSavedQuery.getSalesOrg();
								salesOrgType = tmpLastSavedQuery.getSalesOrgType();
								orderNumber = tmpLastSavedQuery.getOrderNumber();
								orderType = tmpLastSavedQuery.getOrderType();
								goodsType = tmpLastSavedQuery.getGoodsType();
								customerNo = tmpLastSavedQuery.getCustomerID();
								if(fabAccess.trim().equalsIgnoreCase("N")){
									salesOrgType="";
								}
								if(salesOrgType != null && salesOrgType.length() > 0){
									if(accessType.trim().equalsIgnoreCase("ALL") && salesOrgType.trim().equalsIgnoreCase("fab")) {
										selectDivisionRs = statement2.executeQuery("select name,value from salesorg where type='F' order by name");
									} else if(accessType.trim().equalsIgnoreCase("ALL") && salesOrgType.trim().equalsIgnoreCase("man")) {
										selectDivisionRs = statement2.executeQuery("select name,value from salesorg where type='M' order by name");
									}
								}else{
									salesOrgType="";
								}

							} else
								errMessage = "No previous search operation detected";
						} catch (Exception ex) {
							errMessage = "Error Occured while retrieving the Last Saved Query";
						}

					}

      out.write("\r\n");
      out.write("<BODY onload=\"setfocus();\" onunload=\"closeMessageWindow();\"\r\n");
      out.write("\tbgcolor=#ffffff topmargin=10>\r\n");
      out.write("<FORM name=\"frmSearchOrders\" action=\"executebapi.jsp\" method=POST><!--Page Content Starts here -->\r\n");
      out.write("<center><FONT face=Arial color=red size=2> <B>");
      out.print(errMessage);
      out.write("</B> </FONT></center>\r\n");
      out.write("<TABLE cellspacing=0 cellpadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD width=\"100%\" colspan=\"3\" align=\"right\">&nbsp;</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD width=\"20%\" align=\"middle\"></TD>\r\n");
      out.write("\t\t<TD width=\"45%\" align=\"left\"><IMG border=\"0\"\r\n");
      out.write("\t\t\tsrc=\"images/searchcriteria.gif\" width=\"181\" height=\"28\"></TD>\r\n");
      out.write("\t\t<TD width=\"25%\" align=\"left\"><IMG border=\"0\"\r\n");
      out.write("\t\t\tsrc=\"images/helpsection.gif\" width=\"131\" height=\"31\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR height=\"8\">\r\n");
      out.write("\t\t<TD></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("<TABLE cellspacing=1 cellpadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\" color=\"red\"> Customer\r\n");
      out.write("\t\tNumber &nbsp;</FONT></TD>\r\n");
      out.write("\t\t<TD align=\"left\" width=\"38%\">\r\n");
      out.write("\t\t");
if (customerID == null || customerID.equalsIgnoreCase("null"))
			customerID = "";
	if (profile.getCustomerID() != null	&& !(profile.getCustomerID().trim().equals("null"))	&& !(profile.getCustomerID().trim().equals("")))
	{
      out.write("\r\n");
      out.write("\t\t<INPUT name=\"customerID\" value=\"");
      out.print(customerID);
      out.write("\" readonly class=\"textStyle\" tabindex=\"1\" MAXLENGTH=\"15\">\r\n");
      out.write("\t");
} else {
			if(customerID.equals(""))
			{
				if (tmpQuery.getCustomerID() != null && !(tmpQuery.getCustomerID().equalsIgnoreCase("null")))
					customerID = tmpQuery.getCustomerID();
			}
      out.write("\r\n");
      out.write("\t\t\t<INPUT name=\"customerID\" class=\"textStyle\" value=\"");
      out.print(customerID);
      out.write("\" tabindex=\"1\" MAXLENGTH=\"15\">\r\n");
      out.write("\t\t\t");
if(customerID.equals("")){ 
				if (tempcustomerID != null && !(tempcustomerID.equals("0")))
					customerID = tempcustomerID;
			}
				Map<String, String> customerNumMap = tmpQuery.getMFGCustomerNumberList();
				if(customerNumMap != null && customerNumMap.size() > 0){
				Iterator iterator = customerNumMap.keySet().iterator();
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;<FONT class=\"text\">OR</FONT>&nbsp;\r\n");
      out.write("\t\t\t\t\t<select name=\"tempcustomerID\" class=\"textStyle\" onchange=\"clearCustomerID()\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\" style=\"text-align: center;\">--Select the Customer--</option>\t\r\n");
      out.write("\t\t\t\t\t\t<option value=\"All\" style=\"text-align: center;\" ");
if(customerID.equals("All")){
      out.write("selected");
}
      out.write(">All</option>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
while(iterator.hasNext()){
							String mfgcustomerid = iterator.next().toString();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(mfgcustomerid);
      out.write('"');
      out.write(' ');
if(customerID.equals(mfgcustomerid)){
      out.write("selected");
}
      out.write('>');
      out.print(customerNumMap.get(mfgcustomerid));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t");
}
      out.write(" \r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"31%\" align=\"left\" class=\"link\">\r\n");
      out.write("\t\t<P><FONT class=\"text\"> <A href=\"javascript:fnGetLastSavedQuery()\">\r\n");
      out.write("\t\t<IMG border=\"0\" src=\"images/lastsaved_new.gif\" width=\"126\" height=\"21\"> </A>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\">Fabrication PO Number\r\n");
      out.write("\t\t&nbsp;</FONT></TD>\r\n");
      out.write("\t\t");
if(poNumber.equals(""))
		  {
			if (tmpQuery.getPoNumber() != null && !(tmpQuery.getPoNumber().equalsIgnoreCase("null")))
				poNumber = tmpQuery.getPoNumber();
		  }
      out.write("\r\n");
      out.write("\t\t<TD align=\"left\"><INPUT type=\"text\" name=\"poNumber\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.print(poNumber);
      out.write("\" class=\"textStyle\" tabindex=\"2\" MAXLENGTH=\"15\">\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"31%\" align=\"left\" rowspan=\"2\"><IMG\r\n");
      out.write("\t\t\tborder=\"0\" src=\"images/fabrication_new.gif\" width=\"230\" height=\"42\"></TD>\r\n");
      out.write("\t\t<TD></TD>\r\n");
      out.write("\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t");
if(material.equals(""))
		  {
			if (request.getParameter("material") != null && !(request.getParameter("material").equalsIgnoreCase("null")))
				material = request.getParameter("material");
		 }
      out.write("\r\n");
      out.write("\t\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\">Material/PCN &nbsp;</FONT></TD>\r\n");
      out.write("\t\t<TD align=\"left\"><INPUT type=\"text\" name=\"material\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.print(material);
      out.write("\" class=\"textStyle\" tabindex=\"3\" MAXLENGTH=\"15\">\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD colspan=\"2\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<TABLE cellspacing=1 cellpadding=0 width=\"100%\" border=0>\r\n");
      out.write("<TR>\r\n");
      out.write("\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\">From Order Date &nbsp;</FONT>\r\n");
      out.write("\t</TD>\r\n");
      out.write("\t");
if(fromDate.equals("")){
		if (tmpQuery.getFromDate() != null && !(tmpQuery.getFromDate().equalsIgnoreCase("null")))
			fromDate = tmpQuery.getFromDate();
	}
      out.write("\r\n");
      out.write("\t<TD align=\"left\"><INPUT type=\"text\" name=\"fromDate\" class=\"DateBox\"\r\n");
      out.write("\t\tvalue=\"");
      out.print(fromDate);
      out.write("\" MAXLENGTH=\"10\" tabindex=\"5\"\r\n");
      out.write("\t\tstyle=\"WIDTH: 137px; HEIGHT: 19px\">&nbsp;<a\r\n");
      out.write("\t\thref=\"javascript:showCalendar(document.frmSearchOrders.fromDate)\"\r\n");
      out.write("\t\tclass=\"link\"><img src=\"images/show-calendar.gif\" border=\"0\"\r\n");
      out.write("\t\talign=\"absmiddle\"></a></TD>\r\n");
      out.write("\t<TD width=\"30%\" align=\"middle\" class=\"link\"></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("\t");
if(toDate.equals("")){
		if (tmpQuery.getToDate() != null && !(tmpQuery.getToDate().equalsIgnoreCase("null")))
			toDate = tmpQuery.getToDate();
	}
      out.write("\r\n");
      out.write("\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\">To Order Date &nbsp;</FONT></TD>\r\n");
      out.write("\t<TD align=\"left\"><INPUT type=\"text\" name=\"toDate\" class=\"DateBox\"\r\n");
      out.write("\t\tMAXLENGTH=\"10\" value=\"");
      out.print(toDate);
      out.write("\" tabindex=\"6\"\r\n");
      out.write("\t\tstyle=\"WIDTH: 137px; HEIGHT: 19px\">&nbsp;<a\r\n");
      out.write("\t\thref=\"javascript:showCalendar(document.frmSearchOrders.toDate)\"\r\n");
      out.write("\t\tclass=\"link\"><img src=\"images/show-calendar.gif\" border=\"0\"\r\n");
      out.write("\t\talign=\"absmiddle\"></a></TD>\r\n");
      out.write("\t<TD width=\"30%\" align=\"middle\">&nbsp;</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<HR>\r\n");
      out.write("<TABLE cellspacing=0 cellpadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t<TR height=\"5\">\r\n");
      out.write("\t\t<TD></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD width=\"20%\" align=\"middle\"></TD>\r\n");
      out.write("\t\t<TD width=\"45%\" align=\"left\"><IMG border=\"0\" src=\"images/addcrit.gif\"\r\n");
      out.write("\t\t\twidth=\"181\" height=\"28\"></TD>\r\n");
      out.write("\t\t<TD width=\"30%\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR height=\"12\">\r\n");
      out.write("\t\t<TD></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("<TABLE name=\"salesOrgSelector\" cellspacing=1 cellpadding=0 width=\"100%\" border=0 style=\"visibility:");
      out.print(fabAccessVisibility);
      out.write(";position:");
      out.print(fabAccessPosition);
      out.write("\">\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"right\" width=\"38%\">\r\n");
      out.write("\t\t\t<FONT class=\"text\">Sales Organization Type &nbsp;</FONT>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<SELECT name=\"salesOrgType\" onchange=\"selectSalesOrg()\" class=\"textStyle\" tabindex=\"7\">\r\n");
      out.write("\t\t\t\t<OPTION value=\"all\" ");
if(salesOrgType.equals("all")){
      out.write("selected");
}
      out.write(">All</OPTION>\r\n");
      out.write("\t\t\t\t<OPTION value=\"fab\" ");
if(salesOrgType.equals("fab")){
      out.write("selected");
}
      out.write(">HD-Fabrication</OPTION>\r\n");
      out.write("\t\t\t\t<OPTION value=\"man\" ");
if(salesOrgType.equals("man")){
      out.write("selected");
}
      out.write(">Manufacturing</OPTION>\r\n");
      out.write("\t\t\t</SELECT>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
if(salesOrgType.trim().equalsIgnoreCase("fab")){
      out.write("\r\n");
      out.write("<TABLE name=\"materialGroupSelector\" cellspacing=1 cellpadding=0 width=\"100%\" border=0 style=\"visibility:");
      out.print(fabAccessVisibility);
      out.write(";position:");
      out.print(fabAccessPosition);
      out.write("\">\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t");

		if(materialGroup!=null && materialGroup.equals("")){
			if (tmpQuery.getMaterialGroup() != null && !(tmpQuery.getMaterialGroup().equalsIgnoreCase("null")))
				materialGroup = tmpQuery.getMaterialGroup();
		 }
      out.write("\r\n");
      out.write("\t\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\">Fabrication Material Group &nbsp;</FONT></TD>\r\n");
      out.write("\t\t<TD align=\"left\"><SELECT name=\"materialGroup\" class=\"textStyle\"\r\n");
      out.write("\t\t\ttabindex=\"4\">\r\n");
      out.write("\t\t\t<OPTION></OPTION>\r\n");
      out.write("\t\t\t");
while (selectMaterialGroupRs.next()) {
      out.write("\r\n");
      out.write("\t\t\t<OPTION value=\"");
      out.print(selectMaterialGroupRs.getString("description"));
      out.write("\"\r\n");
      out.write("\t\t\t\t");
if(selectMaterialGroupRs.getString("description").trim().equals(materialGroup)){
      out.write(" selected ");
}
      out.write('>');
      out.print(selectMaterialGroupRs.getString("description"));
      out.write("</OPTION>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t</SELECT></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD colspan=\"2\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
if(selectDivisionRs!=null) {
      out.write("\r\n");
      out.write("<TABLE name=\"salesOrgList\" cellspacing=1 cellpadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\">Sales Organization\r\n");
      out.write("\t\t&nbsp;</FONT></TD>\r\n");
      out.write("\t\t<TD width=\"35%\"><SELECT name=\"salesOrg\" class=\"textStyle\" tabindex=\"7\" onchange=\"displayMessage(this.options.value)\">\r\n");
      out.write("\t\t<OPTION></OPTION>\r\n");
      out.write("\t\t\t");
while (selectDivisionRs.next()) {
      out.write("\r\n");
      out.write("\t\t\t<OPTION value=\"");
      out.print(selectDivisionRs.getString("value"));
      out.write("\"\r\n");
      out.write("\t\t\t\t");
if(selectDivisionRs.getString("value")!=null && selectDivisionRs.getString("value").trim().equals(salesOrg.trim())){
      out.write("\r\n");
      out.write("\t\t\t\tselected ");
}
      out.write('>');
      out.print(selectDivisionRs.getString("name"));
      out.write("</OPTION>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t</SELECT></TD>\r\n");
      out.write("\t\t<TD width=\"30%\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
}
      out.write("\r\n");
      out.write("<TABLE cellspacing=1 cellpadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t");
if(orderNumber.equals("")){
			if(request.getParameter("orderNumber") != null && !(request.getParameter("orderNumber").equalsIgnoreCase("null")))
				orderNumber = request.getParameter("orderNumber");
		}
      out.write("\r\n");
      out.write("\t\t<TD width=\"38%\" align=\"right\"><FONT class=\"text\">HD Order Number\r\n");
      out.write("\t\t&nbsp;</FONT></TD>\r\n");
      out.write("\t\t<TD width=\"35%\"><INPUT type=\"text\" name=\"orderNumber\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.print(orderNumber);
      out.write("\" class=\"textStyle\" tabindex=\"8\"\r\n");
      out.write("\t\t\tmaxlength=\"15\"></TD>\r\n");
      out.write("\t\t<TD width=\"30%\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t");
if(salesOrgType.trim().equalsIgnoreCase("fab")){
      out.write("\r\n");
      out.write("\t\t\t<TD align=\"right\" width=\"38%\">&nbsp;</TD>\r\n");
      out.write("\t\t\t<TD width=\"35%\"><INPUT type=\"hidden\" name=\"goodsType\" value=\"04\"></TD>\r\n");
      out.write("\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<TD align=\"right\" width=\"38%\"><FONT class=\"text\">Goods Type &nbsp;</TD>\r\n");
      out.write("\t\t\t");
if(goodsType.length()==0){
				if(tmpQuery.getGoodsType() != null && !(tmpQuery.getGoodsType().equalsIgnoreCase("null")))
					goodsType = tmpQuery.getGoodsType();
			 }
      out.write("\r\n");
      out.write("\t\t\t<TD width=\"35%\"><INPUT type=\"radio\" name=\"goodsType\" value=\"01\"\r\n");
      out.write("\t\t\t\tclass=\"textStyle\" tabindex=\"9\" ");
 if(goodsType.equals("01")) {
      out.write("\r\n");
      out.write("\t\t\t\tchecked ");
}
      out.write("> <FONT class=\"text\">Core Goods Only</FONT><BR>\r\n");
      out.write("\t\t\t<INPUT type=\"radio\" name=\"goodsType\" value=\"04\" class=\"textStyle\"\r\n");
      out.write("\t\t\t\t");
 if(goodsType.equals("04")) {
      out.write(" checked ");
}
      out.write("> <FONT class=\"text\">Fabricated\r\n");
      out.write("\t\t\tShades Only</FONT><br>\r\n");
      out.write("\t\t\t<INPUT type=\"radio\" name=\"goodsType\" value=\"\" class=\"textStyle\"\r\n");
      out.write("\t\t\t\t");
 if(goodsType.length()==0) {
      out.write(" checked ");
}
      out.write("> <FONT class=\"text\">Both</FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t<TD width=\"30%\" align=\"middle\">\r\n");
      out.write("\t\t<input type=\"button\"\r\n");
      out.write("\t\t\tstyle=\"border:0;background-color:white;background-image:url('images/submit.gif');width:75;height:22;cursor:hand;\"\r\n");
      out.write("\t\t\ttabindex=\"10\" size=\"20\" id=\"submitForm\" name=\"submitForm\"\r\n");
      out.write("\t\t\tonmousedown=\"javascript:return SubmitForm(this,'");
      out.print(fabAccess.trim());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(accessType.trim());
      out.write("');\"\r\n");
      out.write("\t\t\tonkeydown=\"javascript:return SubmitForm(this,'");
      out.print(fabAccess.trim());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(accessType.trim());
      out.write("');\"> <input type=\"button\"\r\n");
      out.write("\t\t\tstyle=\"border:0;background-color:white;background-image:url('images/clear.gif');width:75;height:22;cursor:hand;\"\r\n");
      out.write("\t\t\ttabindex=\"11\" size=\"20\" onclick=\"javascript:resetForm();\"\r\n");
      out.write("\t\t\tonkeypress=\"javascript:resetForm();\"> \r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"30%\" align=\"left\">\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR height=\"8\">\r\n");
      out.write("\t\t<TD></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<!--Page Content Ends here -->\r\n");
      out.write("\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("<!-- DATE     : 08/20/02   -->\r\n");
      out.write("<!-- AUTHOR   : Nirmala .K -->\r\n");
      out.write("<!-- PURPOSE  : include file contains session details-->\r\n");
      out.write("<!-- COMPANY  : GAVS Information Services Pvt Ltd, India  -->\r\n");
      out.write("<!-- MODIFIED :   -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function contactWebMaster(){\r\n");
      out.write("var contactWin=window.open(\"ContactWebmaster.jsp\",'ContactWebMaster','toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,width=600,height=400,top=10,left=100');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<center><font class=\"text\"><a href=\"javascript:contactWebMaster()\">Contact WebMaster</a></font></center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
} catch (Exception ex) {
					System.out.println("OrderStatus:SearchOrders:" + ex);
				} finally {
					selectGroupRs.close();
					selectMaterialGroupRs.close();
					if(selectDivisionRs!=null) selectDivisionRs.close();
					statement.close();
					statement1.close();
					statement2.close();
					connection.close();
				}
			}
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
