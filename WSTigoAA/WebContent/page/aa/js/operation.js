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
			{stopLoading();alert("29:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
			beforeSend: loading,
			complete: stopLoading
	}
	);	





}


function callbackPhone(response)
{
	if(response.responseinfo.error)
	{
		alert(response.responseinfo.error);
		return;
	}

	 if(response.responseinfo.estadocuenta!="Activa")
		 {
		 alert("Usuario se encuentra Cancelado");
		 $("#contentresult").hide();
		 return;
		 }
	
	$("#phone").val( response.responseinfo.phone );
	$("#tipodocumento").val( response.responseinfo.tipodocumento );
	$("#numdocumento").val( response.responseinfo.numerodoc );
	$("#plani").val( response.responseinfo.plan );
	$("#nombreprop").val( response.responseinfo.nombrecliente );
	$("#pacestado").val(((response.responseinfo.estadopaquete.toString()=="1")?"Activado":"Cancelado"));
	$("#pacactual").val(response.responseinfo.nombrepaquete);
	$("#contentresult").show();
	if(rl=="1")
		return;
	callAvailablePackage(response.responseinfo.idpaquete);
	callAvailableReasonCancelate(response.responseinfo.idpaquete);
	$("#operationsavailables").show();
	adminoperations.idtocancelate=response.responseinfo.idpaquete.toString();
	adminoperations.nametocancelate=response.responseinfo.nombrepaquete.toString();
	adminoperations.estatepackage=response.responseinfo.estadopaquete.toString();
}

function callAvailableReasonCancelate(packageid)
{
	var req=
	{
			"uid":uid,
			"informationAvailableCancelate":{
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
			callbackcancelate(rta);},
			error: function()
			{stopLoading();alert("101:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas ERR:paquetes nos disponible");},
			beforeSend: loading,
			complete: stopLoading
	}
	);	
	
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
			{stopLoading();alert("94:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas ERR:paquetes nos disponible");},
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


function callbackcancelate(response)
{
			$("#cancelateselect").html("");
			$("#cancelateselect").append('<option>Seleccione una razon</option>');

			for(var i=0; i < response.responseinfo.length; i++)
			{
			$("#cancelateselect").append('<option value="' + response.responseinfo[i].id + '">'+ response.responseinfo[i].description + '</option>');
			}
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
					"Procesar cancelacion": function() {
						if($("#canceltxt").val()=='')
						{
							alert("Por favor Rellene el campo de Comentario.")
							return;
						}
						adminoperations._cancels("web:cancelate service-id:"+$("#cancelateselect").val(),"id:"+$("#cancelateselect").val()+" R:"+$("#canceltxt").val());
						$( this ).dialog( "close" );
					},
					"Regresar":function(){
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
					if(rta.responseinfo.result)
					{
						alert(rta.responseinfo.result);
						return;
					}
					else{
						alert(rta.responseinfo.error);
					return;
					}

					if(adminoperations.enableadd==true)
					{
						//alert("Se Cancelo el servicio activo, se procedera a activar el nuevo servicio codigo de transaccion(cancelacion):"+rta.responseinfo.result);
						adminoperations.enableadd=false;
						adminoperations._activate(adminoperations.operation,adminoperations.reason,adminoperations.packageac);
					}else
						{
						//alert("Operacion Exitosa(cancelacion) codigo de transaccion:"+rta.responseinfo.result);

						}
				},
				error: function()
				{stopLoading();alert("233:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas ERR:cancelacion no disponible");},
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
					adminoperations.enableadd=false,adminoperations.operation='',adminoperations.reason='',adminoperations.packageac='';
					if(rta.responseinfo.result)
					{
						alert(rta.responseinfo.result);
						return;
					}
					else
						alert(rta.responseinfo.error);
				},
				error: function()
				{stopLoading();alert("271:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas ERR:Activacion no disponible");},
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

