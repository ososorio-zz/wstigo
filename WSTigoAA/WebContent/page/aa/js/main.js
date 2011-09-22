 window.onbeforeunload = function(){ 
            onClose();
        };
        
function onClose()
{
	alert("Se procedera a terminar su session");
	window.location="../login/loginAAWST.html";
	//TODO enviar al servidor cerrar session
}

function opload()
{
	$("#divoperaciones").toggle();	
}

function adminusr()
{
	$("#divusuarios").toggle();	

}
function closesession()
{
onClose();
}