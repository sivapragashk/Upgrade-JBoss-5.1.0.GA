function setmode(controllerAction){
	$('#controlleraction').attr('value', controllerAction);
	$('#somform').attr('action', 'admin');
	$('#somform').submit();
}

function loadtemplate(menu, submenu){
	$('#menuId').attr('value', menu);
	$('#subMenuId').attr('value', submenu);
	$('#somform').attr('action', 'template');
	$('#somform').submit();
}
