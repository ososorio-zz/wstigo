window.onbeforeunload = function(){ 
	onClose();
};

function onClose()
{
	//alert("Se procedera a terminar su session");
	var req={
			"cancelateSession":{
				"token":ses,
				"uid":uid
			}

	};


	$.ajax({
		url:"../../AAWServices",
		global: false,
		type: "POST",
		data: $.toJSON(req),
		contentType: "application/json",
		success: function(rta)
		{
			stopLoading();
			console.info(rta);
			window.location="../login/loginAAWST.html";

		},
		error: function()
		{stopLoading();
		alert("Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");
		window.location="../login/loginAAWST.html";},
		beforeSend: loading,
		complete: stopLoading
	}
	);


}

function opload()
{
	$("#divusuarios").hide();	
	$("#divoperaciones").show();	
}

function adminusr()
{
	$("#divoperaciones").hide();
	$("#divusuarios").show();	
}
function closesession()
{
	onClose();
}