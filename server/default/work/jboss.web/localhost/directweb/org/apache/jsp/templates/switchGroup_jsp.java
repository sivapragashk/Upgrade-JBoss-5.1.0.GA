package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hd.directweb.service.TextUtils;
import java.util.List;
import com.hd.directweb.service.constants.Constants;
import java.util.Map;

public final class switchGroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
if(session.getAttribute(Constants.SESSION_VALUES) != null){
	Map sessionValuesMap = (Map) session.getAttribute(Constants.SESSION_VALUES);
	List<Integer> grouplist = (List)sessionValuesMap.get(""+Constants.GROUPS_USER_HAS_ACCESS);
	Map<String, String> groupsMap = (Map<String, String>) sessionValuesMap.get(Constants.GROUPS);
	StringBuffer values = new StringBuffer();
	if(grouplist != null && grouplist.size() > 1){
		values.append("<select name="+Constants.DEFAULT_GROUP_ID+" id="+Constants.DEFAULT_GROUP_ID+" onchange=\"switchgroup()\">");
			for(int i=0;i<grouplist.size();i++){
				String selected = "";
				if(grouplist.get(i) == TextUtils.getIntValue(session.getAttribute(Constants.DEFAULT_GROUP_ID))){
					selected = "selected";
				}
				values.append("<option value=\""+grouplist.get(i)+"\" "+ selected +">"+TextUtils.getValue(groupsMap, ""+grouplist.get(i))+"</option>");
			}
		values.append("</select>");
		values.append("&nbsp;&nbsp;");
		values.append("<a href=\"javascript:setDefaultGroup()\">Set as default</a>");
	}else{
		if(request.getParameter(Constants.INCLUDE_SPACER_IMG) != null){
			values.append("<br><br><img src=\"/DirectWeb/images/spacer.gif\" border=\"0\" style=\"padding-left: 400pt; padding-top: 0px;\"/>");
		}
	}
	out.print(values);
}
      out.write("\t\r\n");
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
