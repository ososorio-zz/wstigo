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
	$("#pacactual").val(response.responseinfo.nombrepaquete);
	console.info(response);
	callAvailablePackage(response.responseinfo.idpaquete);
	$("#contentresult").show();
	$("#operationsavailables").show();
	adminoperations.idtocancelate=response.responseinfo.idpaquete.toString();

}


function callAvailablePackage(packageid)
{
	var req=
	{
			"informationAvailablePackage":{
				"code":packageid.toString()
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
			callbackpackage(rta);},
		error: function()
		{stopLoading();alert("Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas ERR:paquetes nos disponible");},
		beforeSend: loading,
		complete: stopLoading
	}
	);	
	
	
}
function callbackpackage(response){
	if(response.responseinfo.error)
	{
	alert(response.responseinfo.error);
	$("#selecoptac").html("No hay informacion disponible");
	return;
	}
	var container="<tbody>";
	$.each(response.responseinfo, function(key, value) { 
		  if(value.pc_id=="0")
			  return;
			tmprow='<tr><td>'+value.description+'</td><td><input type="radio" name="group1" value="'+value.pc_id+'"></td></tr>';
			container+=tmprow;
		});
	 container+="</tbody>";
	$("#selecoptac").html(container);	
}

adminoperations={
		idtocancelate:'',
		activateservice:function()
		{
			$( "#resultActivateService" ).dialog({
				width: 490,
				modal: true,
				buttons: {
					"Activar": function() {
						
						if($("#reason").val()=='')
							{
							alert("Por favor Rellene el campo de Comentario.")
							return;
							}
						//TODO: observar si tiene activo uno ya antes para mandarlo a cancelar
						if(adminoperations.idtocancelate!="0")
						adminoperations._cancels();

						
					alert("vamos a activar el servicio id#"+$("#selecoptac input[type='radio']:checked").val());
							$( this ).dialog( "close" );
						
					},
					"Cancelar": function() {
						$( this ).dialog( "close" );
					}
				},
				close: function() {
					$("#reason").val( "" );
				}
				
			});
			
		},
		cancelateservice:function()
		{
			
			$( "#cancelservice" ).dialog({
				width: 490,
				modal: true,
				buttons: {
					"Cancelar": function() {
						
						if($("#canceltxt").val()=='')
							{
							alert("Por favor Rellene el campo de Comentario.")
							return;
							}
						//TODO: observar si tiene activo uno ya antes para mandarlo a cancelar
						adminoperations._cancels();
						
					alert("cancelar");
							$( this ).dialog( "close" );
						
					}
				},
				close: function() {
					$("#canceltxt").val( "" );
				}
				
			});
		
		},
		
		_cancels:function()
		{
			if(adminoperations.idtocancelate!="0")
			alert("Se Cancelara el actual servicio activo "+adminoperations.idtocancelate);
			else
				alert("Actualmente no tiene servicios activo");
		}
		
		
};



function loading()
{console.info("implementar")}
function stopLoading()
{console.info("implementar")}

