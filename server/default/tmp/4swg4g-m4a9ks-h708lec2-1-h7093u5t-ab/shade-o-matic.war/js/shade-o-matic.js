function setmode(controllerAction){
	alert(controllerAction);
	$('#controlleraction').attr('value', controllerAction);
	$('#somform').attr('action', 'admin');
	$('#somform').submit();
}

function loadtemplate(menu, submenu){
	$('#controlleraction').attr('value', 'LoadTemplate');
	$('#menuId').attr('value', menu);
	$('#subMenuId').attr('value', submenu);
	$('#somform').attr('action', 'template');
	$('#somform').submit();
}

function insert(sectionId){
	var url = 'template?controlleraction=LoadSectionItems&sectionId='+sectionId;
	var menuid = $('#menuId').val();
	var submenuid = $('#subMenuId').val();
	if(submenuid > 0)
		url += '&menuId='+menuid+'&subMenuId='+submenuid;
	else
		url += '&menuId='+menuid;
	window.open(url, 'Shade-O-Matic', 'left=150,top=150,width=930,height=620,toolbar=0,resizable=0,status=0, scrollbars=1')
}
