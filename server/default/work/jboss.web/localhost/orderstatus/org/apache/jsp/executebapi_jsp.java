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

public final class executebapi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.hd.orderstatus.Query tmpQry = null;
      synchronized (_jspx_page_context) {
        tmpQry = (com.hd.orderstatus.Query) _jspx_page_context.getAttribute("tmpQry", PageContext.PAGE_SCOPE);
        if (tmpQry == null){
          tmpQry = new com.hd.orderstatus.Query();
          _jspx_page_context.setAttribute("tmpQry", tmpQry, PageContext.PAGE_SCOPE);
          out.write('\r');
          out.write('\n');
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("tmpQry"), request);
          out.write('\r');
          out.write('\n');
        }
      }
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

session.setAttribute("tempSalesOrgType",request.getParameter("salesOrgType"));
session.setAttribute("tempSalesOrg",request.getParameter("salesOrg"));

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

if(profile!=null){

adminBean.updateQueryCount(request,profile.getUsername());
tmpQry.setUserName(profile.getUsername());		
profile.setLastSavedQuery(tmpQry);		

try{
		String path=((String) this.getServletConfig().getServletContext().getInitParameter("PROFILEPATH"))+session.getId()+".dat";
        String RMI_Server = (String)this.getServletConfig().getServletContext().getInitParameter("SERVER");
		String errMessage = new String();
        if(request.getParameter("querytype")!=null) {
	       errMessage=profile.executeQuery(path,RMI_Server,"c");
        }else {
		   errMessage=profile.executeQuery(path,RMI_Server);
        }
		if(!errMessage.equals("SuccessFull")){
		    if(errMessage.startsWith("General Error")) {
            // Read the parameters from mail.properties file

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
                
		        //ResourceBundle rsb=ResourceBundle.getBundle("mail", Locale.getDefault());
                
				String host = properties.getProperty("mailserver");
				String to=this.getServletConfig().getServletContext().getInitParameter("WEBMASTER");
				StringBuffer message=new StringBuffer();
				message.append("<html><head><title>Login Failure</title><style>.text{FONT-SIZE: 10pt;FONT-FAMILY: Arial}");
				message.append(".message{FONT-FAMILY: Verdana;	FONT-SIZE: 12px;COLOR: #00008b;	FONT-WEIGHT: bold;}");
				message.append("</style></head><body><u class='message'>User encountered a problem dated 	"+ new java.util.Date()+"</u>");
				message.append("<p class='text'>Username of the User is: "+profile.getUsername());
				message.append("</p>");
				message.append("<p class='text'>Error Encountered is :"+errMessage+"<p>");
				message.append("</p></body></html>");
				
      out.write("\r\n");
      out.write("\t\t\t\t");
      //  orderstatus:mail
      com.hd.orderstatus.taglib.mailer.SendMail _jspx_th_orderstatus_005fmail_005f0 = (com.hd.orderstatus.taglib.mailer.SendMail) _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody.get(com.hd.orderstatus.taglib.mailer.SendMail.class);
      _jspx_th_orderstatus_005fmail_005f0.setPageContext(_jspx_page_context);
      _jspx_th_orderstatus_005fmail_005f0.setParent(null);
      // /executebapi.jsp(64,4) name = host type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setHost(host);
      // /executebapi.jsp(64,4) name = from type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setFrom("OSAdmin@hunterdouglas.com");
      // /executebapi.jsp(64,4) name = to type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setTo(to);
      // /executebapi.jsp(64,4) name = messageText type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setMessageText(message.toString());
      // /executebapi.jsp(64,4) name = subject type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setSubject("Order Status Application: Error Alert");
      // /executebapi.jsp(64,4) name = contentType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_orderstatus_005fmail_005f0.setContentType("text/html");
      int _jspx_eval_orderstatus_005fmail_005f0 = _jspx_th_orderstatus_005fmail_005f0.doStartTag();
      if (_jspx_th_orderstatus_005fmail_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody.reuse(_jspx_th_orderstatus_005fmail_005f0);
        return;
      }
      _005fjspx_005ftagPool_005forderstatus_005fmail_0026_005fto_005fsubject_005fmessageText_005fhost_005ffrom_005fcontentType_005fnobody.reuse(_jspx_th_orderstatus_005fmail_005f0);
      out.write("\r\n");
      out.write("\t\t\t\t");

			    errMessage = "System encountered an unknown problem while fetching data from the Server. Webmaster was notified. Please try after sometime.";
			}	
            if(request.getParameter("querytype")!=null) {
		   		   response.sendRedirect("researchorders.jsp?errorMessage="+errMessage);
            }else {
  	   		       response.sendRedirect("searchorders.jsp?errorMessage="+errMessage);
            }
		}else{
				if((request.getParameter("poNumber")!=null && request.getParameter("poNumber").length()>0)&&
				((request.getParameter("material")!=null &&request.getParameter("material").length()>0)
				|| (request.getParameter("fromDate")!=null && request.getParameter("fromDate").length()>0)
				|| (request.getParameter("toDate")!=null && request.getParameter("toDate").length()>0)
				|| (request.getParameter("salesOrg")!=null && request.getParameter("salesOrg").length()>0) 
				|| (request.getParameter("materialGroup")!=null && request.getParameter("materialGroup").length()>0)
				|| (request.getParameter("orderNumber")!=null && request.getParameter("orderNumber").length()>0)
				|| (request.getParameter("goodsType")!=null && request.getParameter("goodsType").length()>0)
				|| (request.getParameter("orderType")!=null && request.getParameter("orderType").length()>0) )){
                	if(request.getParameter("querytype")!=null) {
		  			   response.sendRedirect("searchresults.jsp?errorMessage=Additional Parameters were ignored as \"PO NUMBER\" was specified&querytype=closed&orderStatus=SHIPPED&reset=true");
    	            }else {
					   response.sendRedirect("searchresults.jsp?errorMessage=Additional Parameters were ignored as \"PO NUMBER\" was specified");
            	    }
				} else {
						if((request.getParameter("orderNumber")!=null && request.getParameter("orderNumber").length()>0)&&
						((request.getParameter("material")!=null &&request.getParameter("material").length()>0)
						|| (request.getParameter("fromDate")!=null && request.getParameter("fromDate").length()>0)
						|| (request.getParameter("toDate")!=null && request.getParameter("toDate").length()>0)
						|| (request.getParameter("salesOrg")!=null && request.getParameter("salesOrg").length()>0) 
						|| (request.getParameter("materialGroup")!=null && request.getParameter("materialGroup").length()>0)
						|| (request.getParameter("poNumber")!=null && request.getParameter("orderNumber").length()>0)
						|| (request.getParameter("goodsType")!=null && request.getParameter("goodsType").length()>0)
						|| (request.getParameter("orderType")!=null && request.getParameter("orderType").length()>0) )){
                			if(request.getParameter("querytype")!=null) {
				  				   response.sendRedirect("searchresults.jsp?errorMessage=Additional Parameters were ignored as \"Sales Order NUMBER\" was specified&querytype=closed&orderStatus=SHIPPED&reset=true");
    		            	}else {
							   response.sendRedirect("searchresults.jsp?errorMessage=Additional Parameters were ignored as \"Sales Order NUMBER\" was specified");
    	        		    }
						} else {	
		                	if(request.getParameter("querytype")!=null) {
								response.sendRedirect("searchresults.jsp?querytype=closed&orderStatus=SHIPPED&reset=true");
    	        		    }else {
								response.sendRedirect("searchresults.jsp");
							}	
	            	    }
				}	
		}
		
}catch(Exception ex){
    System.out.println("Error occurred in ExecuteBAPI due to :"+ex);
}
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
