function setmode(controllerAction){
	$('#htm_controlleraction').attr('value', controllerAction);
	$('#somform').attr('action', 'admin');
	$('#somform').submit();
}

function loadtemplate(menu, submenu){
	$('#htm_controlleraction').attr('value', 'LoadTemplate');
	$('#htm_menuId').attr('value', menu);
	$('#htm_subMenuId').attr('value', submenu);
	$('#somform').attr('action', 'template');
	$('#somform').submit();
}

function insert(sectionId){
	var url = 'template?htm_controlleraction=LoadSectionItems&htm_sectionId='+sectionId;
	var menuid = $('#htm_menuId').val();
	var submenuid = $('#htm_subMenuId').val();
	if(submenuid > 0)
		url += '&htm_menuId='+menuid+'&htm_subMenuId='+submenuid;
	else
		url += '&htm_menuId='+menuid;
	window.open(url, 'ShadeOMatic', 'left=150,top=150,width=930,height=620,toolbar=0,resizable=0,status=1, scrollbars=1');
}
