<%@page import="com.hd.som.utils.HTMLUtils"%>
<%@page import="com.hd.som.utils.TextUtils"%>
<%@page import="com.hd.som.utils.Constants"%>
<%@page import="java.util.*"%>
<%!
	private static final int MAIN_HEADER = 1;
	private static final int MAIN_HEADER_CONTENT = 2;
	private static final int BODY_HEADER = 3;
	private static final int BODY_CONTENT = 4;
%>
<%
int submenu = TextUtils.parseParams(request.getAttribute(Constants.SUBMENU_ID));
String imagepath = Constants.DISPLAY_IMAGE_FROM + TextUtils.getText(request.getAttribute(Constants.MENU_ID))+"/";
if(submenu > 0)
	imagepath += submenu+"/";
boolean editmode = new Boolean(request.getParameter("editmode"));
Map<Integer, Map<Integer, Map<String, String>>> sectionmap = null;
if(request.getAttribute(Constants.CONTENT) != null){
	sectionmap=(HashMap)request.getAttribute(Constants.CONTENT);
}%>

<div id="maincontent">
	<div id="templateheader">
		<%if(sectionmap != null && sectionmap.get(MAIN_HEADER) != null){
			Map<Integer, Map<String, String>> contentmap = sectionmap.get(MAIN_HEADER);
			if(contentmap!=null && contentmap.size() > 0){
				for(int contentid : contentmap.keySet()){
					Map<String, String> referencemap = contentmap.get(contentid);%>
					<%=TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER)%>		
					<%=HTMLUtils.generateLinks(contentid, MAIN_HEADER, editmode, false)%>
				<%break;
				}
			}	
		}else if(editmode){%>
			<div id="admin_templateheader">
				<a href="javascript:insert('<%=MAIN_HEADER%>')" id="admin_template_insert_link">Insert Content</a>
			</div>
		<%}%>
	</div>
	
	<div id="product_header_content_main">
		<div id="product_header_content">
			<%if(sectionmap != null && sectionmap.get(MAIN_HEADER_CONTENT) != null){
				Map<Integer, Map<String, String>> contentmap = sectionmap.get(MAIN_HEADER_CONTENT);
				if(contentmap!=null && contentmap.size() > 0){
					for(int contentid : contentmap.keySet()){
						Map<String, String> referencemap = contentmap.get(contentid);%>
						<div style="text-align: left;padding-bottom: 10px;">
							<%=TextUtils.getMapValue(referencemap, Constants.ITEM_CONTENT)%>		
						</div>
						<%String image = "background:url(" + imagepath + TextUtils.getMapValue(referencemap, Constants.ITEM_IMAGE) + ") no-repeat;";%>
						<div id="product_header_image" style="<%=image%>"></div>
						<%=HTMLUtils.generateLinks(contentid, MAIN_HEADER_CONTENT, editmode, false)%>
					<%break;
					}
			   }
			}else if(editmode){%>
				<div id="admin_product_header_content">
					<a href="javascript:insert('<%=MAIN_HEADER_CONTENT%>');" id="admin_template_insert_link">Insert Content</a>
				</div>
			<%}%>
			
			
		</div>
	</div>	
	
	<div id="product_main">
		
			<%if(sectionmap != null && sectionmap.get(BODY_HEADER) != null){
				Map<Integer, Map<String, String>> contentmap = sectionmap.get(BODY_HEADER);
				if(contentmap!=null && contentmap.size() > 0){%>
					<div id="product_main_header">
						<%for(int contentid : contentmap.keySet()){
							Map<String, String> referencemap = contentmap.get(contentid);%>
							<%=TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER)%>		
							<%=HTMLUtils.generateLinks(contentid, BODY_HEADER, editmode, false)%>
						<%break;
						}%>
					</div>
				<%}
			}else if(editmode){%>
				<div id="admin_product_main_header">
					<a href="javascript:insert('<%=BODY_HEADER%>')" id="admin_template_insert_link">Insert Content</a>
				</div>
			<%}%>
		
		
		<div id="product_main_content">
			<div id="product_main_content_holder">
				<%if(sectionmap != null && sectionmap.get(BODY_CONTENT) != null){
					Map<Integer, Map<String, String>> contentmap = sectionmap.get(BODY_CONTENT);
					if(contentmap!=null && contentmap.size() > 0){
						for(int contentid : contentmap.keySet()){
							Map<String, String> referencemap = contentmap.get(contentid);
							String image = imagepath + TextUtils.getMapValue(referencemap, Constants.ITEM_IMAGE);%>
							<div id="product_main_content_item">
								<div id="product_main_content_item_image" style="background:url(<%=image%>) no-repeat;"></div>
								<div id="product_main_content_desc">
									<div id="product_main_content_item_header">
										<%=TextUtils.getMapValue(referencemap, Constants.ITEM_HEADER)%>	
									</div>	
									<div id="product_main_content_item_text">
										<%=TextUtils.getMapValue(referencemap, Constants.ITEM_CONTENT)%>
									</div>
									<div id="product_main_content_item_video">
										<a href="javascript:watchvideo('<%=TextUtils.getMapValue(referencemap, Constants.ITEM_VIDEO)%>')" class="product_main_content_item_video_link">WATCH VIDEO</a>
									</div>
									<div id="product_main_content_item_links_holder">
										<%=HTMLUtils.generateLinks(contentid, BODY_CONTENT, editmode, false)%>
									</div>	
								</div>	
							</div>
						<%}
					}
				} if(editmode){%>
					<div id="admin_product_main_content_item">
						<a href="javascript:insert('<%=BODY_CONTENT%>')" id="admin_template_insert_link">Insert Content</a>
					</div>
				<%}%>
			</div>
		</div>
	</div>
	
</div>