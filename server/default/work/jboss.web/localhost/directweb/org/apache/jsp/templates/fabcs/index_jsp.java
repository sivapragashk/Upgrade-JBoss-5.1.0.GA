package org.apache.jsp.templates.fabcs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Map;
import com.hd.directweb.service.constants.Constants;
import com.hd.directweb.service.constants.TemplateConstants;
import com.hd.directweb.db.base.BaseHeaderDesignAdminDAO;
import com.hd.directweb.db.HeaderDesignAdmin;
import com.hd.directweb.service.TextUtils;
import com.hd.directweb.service.SimpleProperty;
import com.hd.directweb.service.DesignUtils;
import com.hd.directweb.service.helper.DesignLoader;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

SimpleProperty simpleProperty = new SimpleProperty(getServletContext().getInitParameter(Constants.PROPERTY_FILE));
String path = simpleProperty.getProperty(Constants.BASE_HEADER_FOOTER_PATH);
int groupid = TextUtils.getIntValue(((Map)session.getAttribute(Constants.SESSION_VALUES)).get(Constants.GROUP_ID));
path = path+groupid+"/"+Constants.HEADER+"/";
List headerDetailsList = DesignLoader.getInstance().loadHeaderDesign(groupid);
HeaderDesignAdmin headerDesignAdmin = null;
      out.write('\r');
      out.write('\n');
if(headerDetailsList != null && headerDetailsList.size() > 0){	
		headerDesignAdmin = (HeaderDesignAdmin)headerDetailsList.get(0);		
}

      out.write("\r\n");
      out.write("<div id=\"parentcontainer\" style=\"background: #b6bbb5 url(");
      out.print(path+DesignUtils.getHeaderList(headerDetailsList,0));
      out.write("); background-repeat: repeat-x;\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div id=\"main\">\r\n");
if(headerDetailsList != null && headerDetailsList.size() > 1){	
		headerDesignAdmin = (HeaderDesignAdmin)headerDetailsList.get(1);		
}

      out.write("\r\n");
      out.write("\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t<div style=\"height: 134px; width: 215px; background-image: url(");
      out.print(path+DesignUtils.getHeaderList(headerDetailsList,1));
      out.write(")\"></div>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<li>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("</li>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"page\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + (("header.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("headerDetails2", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(DesignUtils.getHeaderList(headerDetailsList, 2)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("path", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(path), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/templates.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\t\t\r\n");
      out.write("</div>\r\n");
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
