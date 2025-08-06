<%@page import="com.hd.som.utils.Constants"%>
<%boolean editmode = new Boolean(request.getParameter("editmode"));%>
<div id="selectable">
		<ul id="menu">
				<li class="liadmin" id="admin"><a href="#">Administration</a></li>
	            <li class="licompany" id="company"><a href="#">Company</a></li> 
				<li class="linews" id="news"><a href="#">News & Achievements</a></li>
				<li class="lireward" id="reward"><a href="#">Reward Program</a></li>
				<li class="liproducts" id="products"><a href="#">Products</a></li>
				<li class="lisupport" id="support"><a href="#">Support</a></li>
				<li class="limediacenter" id="mediacenter"><a href="#" >Media Center</a></li>
				<li class="liepic" id="epic"><a href="#">Epic</a></li>
		</ul> 
	</div>
	
	<div id="adminsm" class="megamenu">
		<div class="column">
			<ul>
				<%if(editmode){%>
					<li><a href="#" onclick="javascript:setmode('<%=Constants.DISABLE_EDIT_MODE%>');">Disable Edit Mode</a></li>
				<%}else{%>
					<li><a href="#" onclick="javascript:setmode('<%=Constants.ENABLE_EDIT_MODE%>');">Enable Edit Mode</a></li>
				<%}%>	
			</ul>
		</div>
	</div>
	
	<div id="megamenus" class="megamenu">
		<div class="column" >
			<ul>
				<li><a href="#" onclick="javascript:load('company/home');">Home</a></li>
				<li><a href="#" onclick="javascript:load('company/history');">History</a></li>
				<li><a href="#" onclick="javascript:load('company/mission');">Mission</a></li>
				<li><a href="#" onclick="javascript:load('company/management-team');">Management Team</a></li>
				<li><a href="#" onclick="javascript:load('company/partnership');">Partnership</a></li>
				<li><a href="#" onclick="javascript:load('company/benefits');">Benefits</a></li>
				<li><a href="#" onclick="javascript:load('company/contact-us');">Contact Us</a></li>
				<li><a href="#" onclick="javascript:load('company/presidents-message');">Presidents Message</a></li><br>
			</ul>
		</div>
	</div>
	
	<div id="megamenus1" class="megamenu">
		<div class="column">
			<ul>
				<li><a href="#" onclick="javascript:load('news-achievements/press-releases');">Press Releases</a></li>
				<li><a href="#" onclick="javascript:load('news-achievements/promotions');">Promotions</a></li>
				<li><a href="#" onclick="javascript:load('news-achievements/announcements');">Announcements</a></li><br>
			</ul>
		</div>
	</div>
	
	<div id="megamenu1" class="megamenu">
		<div class="column">
			<ul>
				<li><a href="#" onclick="javascript:load('reward-program/how-it-works');">How it works</a></li>
				<li><a href="#" onclick="javascript:load('reward-program/how-to-claim');">How to Claim</a></li>
				<li><a href="#" onclick="javascript:load('reward-program/faq');">FAQ's</a></li>
				<li><a href="#" onclick="javascript:load('reward-program/packages');">Packages</a></li>
				<li><a href="#" onclick="javascript:load('reward-program/reward-activity');">Reward Activity</a></li>
				<li><a href="#" onclick="javascript:load('reward-program/messages');">Messages</a></li>
			</ul>
		</div>
	</div>
	<div id="megamenu2" class="megamenu">
		<div class="column">
			<ul>
				<li><a href="#" onclick="javascript:load('support/customer-care');">Customer Care</a></li>
				<li><a href="#" onclick="javascript:load('support/support-forms');">Support Forms</a></li>
				<li><a href="#" onclick="javascript:load('support/contact-us');">Contact Us</a></li>
				<li><a href="#" onclick="javascript:load('support/faq');">FAQ's</a></li>
			</ul>
		</div>	
	</div>
	<div id="productssm" class="megamenu">
		<div class="column">
			<ul>
				<li><a href="#" onclick="javascript:load('products/honeycomb-shades');">Honeycomb Shades</a></li>
			</ul>
		</div>		
	</div>
	<div id="epicsm"></div>
	<div id="mediacentersm"></div>
