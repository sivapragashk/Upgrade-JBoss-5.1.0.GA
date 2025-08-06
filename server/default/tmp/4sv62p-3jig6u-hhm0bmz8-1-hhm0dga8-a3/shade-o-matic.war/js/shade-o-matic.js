function setmode(controllerAction){
	$('#htm_controlleraction').attr('value', controllerAction);
	$('#somform').attr('action', '/shade-o-matic/admin.do');
	$('#somform').submit();
}

function load(url){
	$(location).attr('href', '/shade-o-matic/'+url);
}

function insert(sectionId){
	var url = '/shade-o-matic/template.do?htm_controlleraction=LoadSectionItems&htm_sectionId='+sectionId;
	var menuid = $('#htm_menuId').val();
	var submenuid = $('#htm_subMenuId').val();
	if(submenuid > 0)
		url += '&htm_menuId='+menuid+'&htm_subMenuId='+submenuid;
	else
		url += '&htm_menuId='+menuid;
	window.open(url, 'ShadeOMatic', 'left=150,top=150,width=930,height=620,toolbar=0,resizable=0,status=1, scrollbars=1');
}

function edit(contentid, sectionId){
	var url = '/shade-o-matic/template.do?htm_controlleraction=editSectionContent&htm_contentId='+contentid+'&htm_sectionId='+sectionId;
	var menuid = $('#htm_menuId').val();
	var submenuid = $('#htm_subMenuId').val();
	if(submenuid > 0)
		url += '&htm_menuId='+menuid+'&htm_subMenuId='+submenuid;
	else
		url += '&htm_menuId='+menuid;
	window.open(url, 'ShadeOMatic', 'left=150,top=150,width=930,height=620,toolbar=0,resizable=0,status=1, scrollbars=1');
}

function deleteContent(contentid){
	if(confirm('Are you sure that you want to delete the content ?')){
		$('#htm_contentId').attr('value', contentid);
		$('#htm_controlleraction').attr('value', 'deletecontent');
		$('#somform').attr('action', '/shade-o-matic/content.do');
		$('#somform').submit();
	}
}