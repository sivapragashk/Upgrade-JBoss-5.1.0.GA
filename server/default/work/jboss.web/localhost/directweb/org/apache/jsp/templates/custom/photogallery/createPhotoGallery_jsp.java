package org.apache.jsp.templates.custom.photogallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.marketing.photogallery.*;
import java.util.*;
import java.text.*;

public final class createPhotoGallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String now()
{
Calendar cal = Calendar.getInstance();
SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
return sdf.format(cal.getTime());
}

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
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("  <TITLE>Marketing Resource Center</TITLE>\r\n");
      out.write("  <SCRIPT>\r\n");
      out.write("\tvar UPLOAD_PHOTOS = 1;  \r\n");
      out.write("  \tvar DELETE_PHOTOS = 9;\r\n");
      out.write("  \tfunction deletePhoto()\r\n");
      out.write("  \t{\r\n");
      out.write("\t\tif(confirm('Are you sure, you want to delete the Photo?'))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.createGalleryForm.actionToBePerformed.value=DELETE_PHOTOS;\t\r\n");
      out.write("\t\t\tdocument.createGalleryForm.submit();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction submitform(action)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(action == 'SAVE' && document.createGalleryForm.uploadedFile.value.length == 0)\r\n");
      out.write("\t    {\r\n");
      out.write("\t\t     alert('Please select a file to upload');\r\n");
      out.write("\t\t     return;\r\n");
      out.write("\t    }\r\n");
      out.write("\t\tif(document.createGalleryForm.brand.selectedIndex==0)\r\n");
      out.write("\t    {\r\n");
      out.write("\t\t     alert('Please select a Brand');\r\n");
      out.write("\t\t     document.createGalleryForm.brand.focus();\r\n");
      out.write("\t\t     return;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    document.createGalleryForm.actionToBePerformed.value=UPLOAD_PHOTOS;\t\r\n");
      out.write("\t    document.createGalleryForm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("  </SCRIPT>\r\n");
      out.write("  <SCRIPT>\r\n");
      out.write("\t\tvar xReached = 1;\r\n");
      out.write("\t</SCRIPT>\r\n");
      out.write("  <META http-equiv=Content-Type content=\"text/html; charset=windows-1252\">\r\n");
      out.write("  \t<link href=\"./javascript/yui/styles2004.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"./javascript/yui/build/reset-fonts-grids/reset-fonts-grids.css\"> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./javascript/yui/build/fonts/fonts-min.css?_yuiversion=2.3.1\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./javascript/yui/build/button/assets/skins/sam/button.css?_yuiversion=2.3.1\" />\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\r\n");
      out.write("\tTD.wiw-main-container {\r\n");
      out.write("\t\tBORDER-RIGHT: #ECCF82 1px solid; BORDER-TOP: #ECCF82 1px solid; PADDING-LEFT: 10px; BORDER-LEFT: #ECCF82 1px solid; WIDTH: 600px; PADDING-TOP: 8px; BORDER-BOTTOM: #ECCF82 1px solid\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tTD.wiw-search-container {\r\n");
      out.write("\t\tBORDER-RIGHT: #ECCF82 1px solid; BORDER-TOP: #ECCF82 1px solid; PADDING-LEFT: 10px; BORDER-LEFT: #ECCF82 1px solid; WIDTH: 750px; PADDING-TOP: 8px; BORDER-BOTTOM: #ECCF82 1px solid\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("    h1 {\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        font-family: verdana;\r\n");
      out.write("        font-size: 13px;\r\n");
      out.write("        margin: 0 0 1em 0;\r\n");
      out.write("        padding: .25em .5em;\r\n");
      out.write("        background-color: #F2E0B0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\th4\t{ font-size: 110%; margin-top:1.2em margin-bottom:1.2em; padding:1em 0 0 0; border-top:1px dashed #C3D2DC;}\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

int postingID = 0;
String postingDescription = "";
String createdDate = "";
String modifiedDate = "";
int brandID = 0;
String operatingSystem = "";
String imageFileName = "";
String imageFileLocation = "";
String imageStatus = "";
String PBSFilename = "";
String comments = "";
String imageNamePrefix="";
ArrayList osList = new ArrayList();

if(request.getAttribute(PhotoGalleryConstants.PHOTO_DETAILS) != null)
{
	PhotoDO photoDO = (PhotoDO) request.getAttribute(PhotoGalleryConstants.PHOTO_DETAILS);
	postingID = photoDO.getPostingID();
	postingDescription = photoDO.getPostingDescription();
	createdDate = photoDO.getCreateDate();
	if(photoDO.getModifiedDate() != null)
		modifiedDate = photoDO.getModifiedDate();
	brandID = photoDO.getBrandID();
	operatingSystem = photoDO.getOperatingSystem();
	imageFileName = photoDO.getImageFileName();
	imageFileLocation = photoDO.getImageFileLocation();
	imageStatus = photoDO.getImageStatus();
	if(photoDO.getPBSFilename() != null)
		PBSFilename = photoDO.getPBSFilename();
	if(photoDO.getcomments() != null)
		comments = photoDO.getcomments();
	imageNamePrefix = photoDO.getImageNamePrefix();
	
	
	if(operatingSystem.indexOf(",")!=-1){
		StringTokenizer OSTokenizer = new StringTokenizer(operatingSystem, ",");
		while(OSTokenizer.hasMoreElements()){
			  osList.add(OSTokenizer.nextElement().toString());
		}
   }else{
	   osList.add(operatingSystem);
   }

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"createGalleryForm\" action=\"upload.do\" method=post enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=100%>\r\n");
      out.write(" \t<tr>\r\n");
      out.write("\t<td height=600 width=\"50\">&nbsp;</td>\r\n");
      out.write("\t\t<td colspan=2 valign=\"top\">\r\n");
      out.write("        \t<div id=\"hd\">\r\n");
      out.write("\t            \r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        ");
if(request.getAttribute(PhotoGalleryConstants.MESSAGE)!=null && request.getAttribute(PhotoGalleryConstants.MESSAGE).toString().length() > 0){
      out.write("\r\n");
      out.write("\t\t    \t<table id=\"tablenobackground\">\r\n");
      out.write("\t\t    \t<tr>\r\n");
      out.write("\t\t    \t\t<td align=\"left\">\r\n");
      out.write("\t\t    \t\t    <DIV id=\"req_message\"><font color=\"red\"><b>");
      out.print(request.getAttribute(PhotoGalleryConstants.MESSAGE));
      out.write("</b></font></DIV>\r\n");
      out.write("\t\t    \t\t</td>\r\n");
      out.write("\t\t    \t</tr>\r\n");
      out.write("\t\t    \t</table>\r\n");
      out.write("\t\t    ");
}
      out.write("\r\n");
      out.write("\t        <div id=\"bd\">\r\n");
      out.write("\t            <br>\r\n");
      out.write("\t\t\t\t");
if(request.getAttribute(PhotoGalleryConstants.BRAND_DETAILS)!= null && request.getAttribute(PhotoGalleryConstants.SITE_TERMS)!=null)
				{
      out.write("\r\n");
      out.write("\t\t\t\t\t<table width=\"600\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<TD class=\"wiw-main-container\">\r\n");
      out.write("\t\t\t\t\t\t<h1>Upload Photos:</h1>\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" cellpadding=\"2\" cellspacing=\"4\" class=\"text\">\r\n");
      out.write("\t\t\t\t\t\t");
if(request.getAttribute(PhotoGalleryConstants.PHOTO_DETAILS) != null && imageFileName.length() > 0 && imageFileLocation.length() > 0){
							String filename = imageFileLocation +"/"+ imageFileName;
      out.write("\r\n");
      out.write("\t\t\t\t            <tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"225\">Image Preview:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"407\"><img src=\"");
      out.print(filename);
      out.write("\">&nbsp;&nbsp;<b>");
      out.print(imageNamePrefix);
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"225\">Upload Display Image:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"407\"><input type=\"file\" value=\"Browse\" name=\"uploadedFile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br><font size=\"1\" face=\"Arial\">Note: Thumbnail/Icon image&nbsp;will be created by the system.<br></font><br>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"225\">Brand Name<font color=\"red\">*</font>:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"407\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"brand\">\r\n");
      out.write("\t\t\t\t                        <option value=\"0\">Select Brand Name</option>\r\n");
      out.write("\t\t\t\t                        ");
ArrayList brandList = (ArrayList)request.getAttribute(PhotoGalleryConstants.BRAND_DETAILS);
				                        for(int i=0;i<brandList.size();i++){
				                        	BrandDO brandDO = (BrandDO) brandList.get(i);
      out.write("\r\n");
      out.write("\t\t\t\t                        \t<option value=\"");
      out.print(brandDO.getBrandID());
      out.write('"');
      out.write(' ');
if(brandID == brandDO.getBrandID()){
      out.write("selected");
}
      out.write('>');
      out.print(brandDO.getBrandDisplayName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t                        ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"225\">Operating System:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"407\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select multiple=\"10\" width=\"330\" style=\"width: 330px\" name=\"OperatingSystem\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
ArrayList siteTermsList = (ArrayList)request.getAttribute(PhotoGalleryConstants.SITE_TERMS);
				                        for(int i=0;i<siteTermsList.size();i++){
				                        	SiteTermsDO siteTermsDO = (SiteTermsDO) siteTermsList.get(i);
      out.write("\r\n");
      out.write("\t\t\t\t                        \t<option value=\"");
      out.print(siteTermsDO.getAttributeID());
      out.write('"');
      out.write(' ');
if(osList.contains(""+siteTermsDO.getAttributeID())){
      out.write("selected");
}
      out.write('>');
      out.print(siteTermsDO.getAttributeDisplayName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t                        ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t                    <tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"225\">PBS File Name:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"407\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"");
      out.print(PBSFilename);
      out.write("\" name=\"PBSFileName\" size=\"35\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t                        <td width=\"225\"><p>Image Status:&nbsp;</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"407\">Archive</td>\r\n");
      out.write("\t\t\t            </tr>\r\n");
      out.write("\t\t\t            <tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t         \t\t\t<tr valign=\"top\">\r\n");
      out.write("\t                        <td width=\"225\"><p>Date Created Online:&nbsp;</p></td>\r\n");
      out.write("\t                        ");
if(createdDate.length() > 0){
      out.write("\r\n");
      out.write("\t                        \t<td width=\"407\">");
      out.print(createdDate);
      out.write("</td>\r\n");
      out.write("\t                        ");
}else{
      out.write("\r\n");
      out.write("\t                        \t<td width=\"407\">");
      out.print(now());
      out.write("\r\n");
      out.write("\t                        \t<input type=\"hidden\" value=\"");
      out.print(now());
      out.write("\" name=\"dateCreated\">\r\n");
      out.write("\t                        \t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t            </tr>\r\n");
      out.write("\t\t\t            <tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t            ");
if(request.getAttribute(PhotoGalleryConstants.PHOTO_DETAILS) != null){
      out.write("\r\n");
      out.write("\t\t\t\t\t        <tr valign=\"top\">\r\n");
      out.write("\t\t                         <td width=\"225\"><p>Date Updated Online:</p></td>\r\n");
      out.write("\t\t\t\t\t    \t     <td width=\"407\">");
      out.print(modifiedDate);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t           </tr>\r\n");
      out.write("\t\t\t           ");
}
      out.write("\r\n");
      out.write("\t\t\t           <tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t           <tr valign=\"top\">\r\n");
      out.write("\t                         <td width=\"225\"><p>Comments:</p></td>\r\n");
      out.write("\t\t\t\t\t         <td width=\"407\"><textarea rows=\"5\" cols=\"49\" name=\"Comments\">");
      out.print(comments);
      out.write("</textarea></td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\" width=\"609\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(request.getAttribute(PhotoGalleryConstants.PHOTO_DETAILS)== null){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\"  name=\"Save\" value=\"Save\" onclick=\"submitform('SAVE')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\"  name=\"Update\" value=\"Update\" onclick=\"submitform('UPDATE')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\"  name=\"Delete\" value=\"Delete\" onclick=\"deletePhoto()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;<input type=\"reset\"  name=\"Cancel\" value=\"Reset\">\r\n");
      out.write("\t\t\t\t\t \t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t</TD></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- the unwrapped div.yui-b takes a fixed width and alignment based on the class of the top-level containing node -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"ft\">\r\n");
      out.write("\t\t<p>&nbsp;</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- page content ends -->\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"actionToBePerformed\" value=\"\">\r\n");
      out.write("<input type=\"hidden\" name=\"filename\" value=\"");
      out.print(imageFileName);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"postingID\" value=\"");
      out.print(postingID);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"directory\" value=\"");
      out.print(imageFileLocation);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"imageNamePrefix\" value=\"");
      out.print(imageNamePrefix);
      out.write("\">\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</HTML>");
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
