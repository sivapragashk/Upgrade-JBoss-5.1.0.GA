package org.apache.jsp.templates.fabcs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.db.dao.FooterDesignAdminDAO;
import com.hd.directweb.db.FooterDesignAdmin;
import java.util.List;
import java.util.Map;
import com.hd.directweb.service.SimpleProperty;
import com.hd.directweb.db.base.BaseFooterDesignAdminDAO;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.helper.DesignLoader;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tlds/struts-html.tld");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start Code to get Footer from DB-->\r\n");

SimpleProperty simpleProperty = new SimpleProperty(getServletContext().getInitParameter(Constants.PROPERTY_FILE));
String path = simpleProperty.getProperty(Constants.BASE_HEADER_FOOTER_PATH);

Map<String, Object> sessionValuesMap = (Map) session.getAttribute(Constants.SESSION_VALUES);
int groupid = 0;
if(sessionValuesMap != null){
	groupid = TextUtils.getIntValue(sessionValuesMap.get(Constants.GROUP_ID));
}else{
	groupid = TextUtils.getIntValue(request.getParameter(Constants.GROUP_ID));
}
path = path+groupid+"/"+Constants.FOOTER+"/";
List footerDetailsList = DesignLoader.getInstance().loadFooterDesign(groupid);
FooterDesignAdmin footerDesignAdmin = null;

      out.write("\r\n");
      out.write("\r\n");
if(footerDetailsList != null && footerDetailsList.size() > 0){	
		footerDesignAdmin = (FooterDesignAdmin)footerDetailsList.get(0);		
}

      out.write("\r\n");
      out.write("<div id=\"footer\" style=\"background: url(");
if(footerDesignAdmin != null && footerDesignAdmin.getFooterImage() != null){
      out.print(path+footerDesignAdmin.getFooterImage());
}
      out.write(")\">\r\n");
      out.write("\t<p>Copyright &copy;  2011 Hunter Douglas. All Rights Reserved. Hunter Douglas DirectWeb 2.0</p>\r\n");
      out.write("</div>");
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
