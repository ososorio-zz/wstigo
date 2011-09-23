$(document).ready(function(){   
	$("#formcel").submit(function(){peticionNumCel();});	
	$("#formident").submit(function(){peticionNuIde();});	
	$("#submitcel").click(function(){peticionNumCel();});	
	$("#submitide").click(function(){peticionNuIde();});	
});
function peticionNumCel()
{
	var number=$("#numcel").val();
	if(number==""){alert("Digite por favor un numero.");return;}
	var req=
	{
			"informationNumberPhone":{
				"msisdn":number
			}
	};
	$.ajax({
		url:"../../AAWServices",
		global: true,
		type: "POST",
		data: $.toJSON(req),
		contentType: "text/html",
		success: function(response)
		{callbackPhone(response);},
		error: function()
		{stopLoading();alert("Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
		beforeSend: loading,
		complete: stopLoading
	}
	);	

	
	var req1=
	{
			"informationAvailablePacage":{
				"msisdn":number
			}
	};
	

}
function peticionNuIde()
{
	alert("peticion identificacion");
}


function callbackPhone(response)
{
	console.info(response);
}


function loading()
{console.info("implementar")}
function stopLoading()
{console.info("implementar")}

