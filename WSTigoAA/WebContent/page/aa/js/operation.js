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
		global: false,
		type: "POST",
		data: $.toJSON(req),
		contentType: "application/json",
		success: function(rta)
		{
		
			stopLoading();
			callbackPhone(rta);},
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
	if(response.responseinfo.error)
		{
		alert(response.responseinfo.error);
		return;
		}
	
	$("#phone").val( response.responseinfo.phone );
    $("#tipodocumento").val( response.responseinfo.tipodocumento );
	$("#numdocumento").val( response.responseinfo.numerodoc );
	$("#plani").val( response.responseinfo.plan );
	$("#nombreprop").val( response.responseinfo.nombrecliente );
	$("#pacapacestadoctual").val(response.responseinfo.estadopaquete);
	console.info(response);
}


function loading()
{console.info("implementar")}
function stopLoading()
{console.info("implementar")}

