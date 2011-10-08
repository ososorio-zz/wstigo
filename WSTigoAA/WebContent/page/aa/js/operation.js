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
			"uid":uid,
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
	$("#pacapacestadoctual").val((response.responseinfo.estadopaquete=="1")?"Activo":"Sin Activar");
	$("#pacactual").val(response.responseinfo.nombrepaquete);
	console.info(response);
	$("#contentresult").show();
	if(rl=="1")
		return;
	callAvailablePackage(response.responseinfo.idpaquete);
	$("#operationsavailables").show();
	adminoperations.idtocancelate=response.responseinfo.idpaquete.toString();
	adminoperations.nametocancelate=response.responseinfo.nombrepaquete.toString();
	adminoperations.estatepackage=response.responseinfo.estadopaquete.toString();
}


function callAvailablePackage(packageid)
{
	var req=
	{
			"uid":uid,
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
		nametocancelate:'',
		enableadd:false,
		operation:'',
		reason:'',
		packageac:'',
		estatepackage:'',
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
						if(adminoperations.idtocancelate !="0" &&  adminoperations.estatepackage !="0")
						{
							adminoperations.enableadd=true;
							adminoperations.operation="Web:activate service";
							adminoperations.reason=$("#reason").val();
							adminoperations.packageac=$("#selecoptac input[type='radio']:checked").val();
							adminoperations._cancels("Web:cancelate to activate other","Activacion nuevo producto:"+$("#selecoptac input[type='radio']:checked").val()+"--reason:"+$("#reason").val());
						}
						else
							adminoperations._activate("Web:activate service",$("#reason").val(),$("#selecoptac input[type='radio']:checked").val());

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
						adminoperations._cancels("web:cancelate service",$("#canceltxt").val());
						$( this ).dialog( "close" );
					}
				},
				close: function() {
					$("#canceltxt").val( "" );
				}

			});
		},

		_cancels:function(operacion,reason)
		{
			if(adminoperations.idtocancelate=="0" ||  adminoperations.estatepackage=="0"){
				alert("Actualmente no tiene ningun servicio activo");return;}

			var req={"uid":uid,"cancelateService":{
				"operation":operacion.toString(),
				"reason":reason.toString(),
				"msisdn":$("#phone").val(),
				"package":adminoperations.idtocancelate.toString()
			}};

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
					if(rta.toString().indexOf("ERROR") != -1)
					{
						alert(rta.responseinfo.result);
						return;
					}
					 

					if(adminoperations.enableadd==true)
					{
						alert("Se Cancelo el servicio activo, se procedera a activar el nuevo servicio codigo de transaccion(cancelacion):"+rta.responseinfo.result);
						adminoperations.enableadd=false;
						adminoperations._activate(adminoperations.operation,adminoperations.reason,adminoperations.packageac);
					}else
						{
						alert("Operacion Exitosa(cancelacion) codigo de transaccion:"+rta.responseinfo.result);

						}
				},
				error: function()
				{stopLoading();alert("Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas ERR:cancelacion no disponible");},
				beforeSend: loading,
				complete: stopLoading
			}
			);


		},
		_activate:function(operacion,reason,packagea)
		{

			var req={"uid":uid,"activateService":{
				"operation":operacion.toString(),
				"reason":reason.toString(),
				"msisdn":$("#phone").val(),
				"package":packagea.toString(),
				"packageold":adminoperations.idtocancelate
			}};

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
					adminoperations.enableadd=false,adminoperations.operation='',adminoperations.reason='',adminoperations.packageac='';
					if(rta.toString().indexOf("ERROR") != -1)
					{
						alert(rta.responseinfo.result);
						return;
					}
					else
						alert("Operacion Exitosa(activacion) codigo de transaccion:"+rta.responseinfo.result);
				},
				error: function()
				{stopLoading();alert("Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas ERR:Activacion no disponible");},
				beforeSend: loading,
				complete: stopLoading
			}
			);			
		}

};



function loading()
{$("#loadingdiv").show();}
function stopLoading()
{$("#loadingdiv").hide();}

