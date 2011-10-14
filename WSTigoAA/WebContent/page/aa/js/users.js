adminusers={
		listuser:function(){
			$("#resultoperationlistuser").show();
			$("#resultoperationsearch").hide();
			$("#resultoperationcreate").hide();
			callinfousers();
			$("#resultoperationlistuser").show();
		},
		createuser:function(){
			$("#resultoperationlistuser").hide();
			$("#resultoperationsearch").hide();
			$("#resultoperationcreate").show();
		},
		createuserform:function(){
			
			if(adminusers.validateformCreate()){
				alert("Recuerde el usuario para entrar al sistema es el siguiente:"+$("#numide").val());
				createuserSend();
			}
		},
		editUserform:function(){},
		idbuble:'',
		validateformCreate:function(){

			if(!isValidEmail($("#email").val()))
			{
				return false;
			}
			if($("#numide").val()=="" || $("#name").val()=="" || $("#ape").val()=="" || $("#pass").val()=="")
			{
				alert("por favor rellene todos los campos");
				return false;
			}
			return true;
		},
		validateformEdit:function()
		{			
			if(!isValidEmail($("#email1").val()))
			{
				return false;
			}
			if($("#numid1e").val()=="" || $("#name1").val()=="" || $("#ape1").val()=="" || $("#pass1").val()=="")
			{
				alert("por favor rellene todos los campos");
				return false;
			}
			return true;	
		}
};


function isValidEmail(strEmail){  
	validRegExp = /^[^@]+@[^@]+.[a-z]{2,}$/i;
	if (strEmail.search(validRegExp) == -1)   
	{   
		alert('Digite un email valido');     
		return false;  
	} 
	return true; 
}



function callinfousers()
{
	tok=new Date();
	var req=
	{
			"uid":uid,
			"informationListUsers":{
				"token":tok
			}
	};

	$.ajax({
		url:"../../AAWAdmin",
		global: false,
		type: "POST",
		data: $.toJSON(req),
		contentType: "application/json",
		success: function(rta)
		{
			stopLoading();
			loadInformation(rta);

		},
		error: function()
		{stopLoading();alert("86:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
		beforeSend: loading,
		complete: stopLoading
	}
	);	

}


function loadInformation(json)
{

	jQuery("#contentlist").html('<table id="list"></table>');
	jQuery("#contentpager").html('<div id="pager"></div>'); 

	try{
		jQuery("#list").jqGrid(
				{ 
					datatype: "clientSide",
					height: 400,
					width:800,
					colNames:["ID","IDENTIFICACION","TIPO DE IDENTIFICACION","NOMBRES","APELLIDOS","ROL","EMAIL","ULTIMO LOGIN","OPERACION","PASSWORD"],
					colModel:[ 
					          {name:'id',      index:'id',      width:24}, 
					          {name:'ide',     index:'ide',     width:70}, 
					          {name:'tipoide', index:'tipoide', width:30 }, 
					          {name:'name',    index:'name',    width:95,sortable:false }, 
					          {name:'apll',    index:'apll',    width:95,sortable:false }, 
					          {name:'rol',     index:'rol',     width:20, sortable:false},
					          {name:'email',   index:'email',   width:100, sortable:false},
					          {name:'login',   index:'login',   width:55, sortable:false},
					          {name:'opr',     index:'opr',   width:85, sortable:false},
					          {name:'pass',     index:'pass',   width:1, sortable:false}

					          ],
					          multiselect: false,
					          caption: "USUARIOS",
					          viewrecords: true,
					          rowNum:20,
					          rowList:[5,10,20,30,40,50,60],
					          pager: '#pager'
				});

		jQuery("#list").jqGrid('navGrid',"#pager",{edit:false,add:false,del:false});

		/*
		,ondblClickRow: function(id){
					        	  adminusers.idbuble=id;
					        	  $( "#dialog-confirm" ).dialog({
					        		  resizable: false,
					        		  height:290,
					        		  width:500,
					        		  modal: true,
					        		  buttons: {
					        			  "Editar Usuario": function() {
					        				  $( this ).dialog( "close" );
					        				  edituser();
					        			  },
					        			  "Eliminar Usuario": function() {
					        				  $( this ).dialog( "close" );
					        				  eliminateUser();
					        			  },
					        			  "Cancelar": function() {
					        				  $( this ).dialog( "close" );
					        			  }
					        		  }
					        	  });
					          }
		 */

	}catch (e) {
		alert(e);
	}
	for(var i=0;i<=json.data.length;i++) jQuery("#list").addRowData( json.data[i].id, json.data[i]);
	jQuery("#list").setGridParam({rowNum:20}).trigger("reloadGrid");		
}

function eliminateUser()
{
	var response = confirm('Esta seguro de eliminar al usuario--identificacion:'+jQuery("#list").jqGrid().getCell(adminusers.idbuble,1)+"--nombre:"+jQuery("#list").jqGrid().getCell(adminusers.idbuble,3) );

	if (response) {

		var req={
				"uid":uid,
				"informationeliminateUsers":{
					"id":jQuery("#list").jqGrid().getCell(adminusers.idbuble,0)

				}
		};

		$.ajax({
			url:"../../AAWAdmin",
			global: false,
			type: "POST",
			data: $.toJSON(req),
			contentType: "application/json",
			success: function(rta)
			{
				stopLoading();
				rtaopr(rta);
			},
			error: function()
			{stopLoading();alert("186:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
			beforeSend: loading,
			complete: stopLoading
		}
		);
	}
	else alert("No se realizo ninguna operacion");
}

function rtaopr(response)
{
	if(response.responseinfo.error)
	{
		alert(response.responseinfo.error);
		return;
	}
	else{
		alert(response.responseinfo.response);
		$("#listuser").click();
	}
}

function edituser()
{	
	$("#us_id1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,0));
	$("#typeide1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,2));
	$("#numide1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,1));
	$("#name1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,3));
	$("#ape1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,4));
	$("#pass1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,9));
	
	$("#typerol1 option[value=" + jQuery("#list").jqGrid().getCell(adminusers.idbuble,5) +"]").attr("selected","selected");
	//$("#typerol1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,5));
	$("#email1").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,6));
	$("#ultlogin").val(jQuery("#list").jqGrid().getCell(adminusers.idbuble,7));


	$( "#dialog-confirm-edit" ).dialog({
		resizable: false,
		height:510,
		width:510,
		modal: true,
		buttons: {
			"Aceptar": function() {

				if(adminusers.validateformEdit())
				{
					edituserSend();
					$( this ).dialog( "close" );
				}
			},
			"Cancelar": function() {
				$( this ).dialog( "close" );
			}
		}
	});


}

function edituserSend()
{
	var req={
			"uid":uid,
			"informationEditUsers":{
				"us_id":   $("#us_id1").val(),
				"typedoc":	$("#typeide1").val(),
				"numdoc":	$("#numide1").val(),
				"names":	$("#name1").val(),
				"apelidos":	$("#ape1").val(),
				"pass":	$("#pass1").val(),
				"rol":	$("#typerol1 :selected").val(),//$("#typerol1").val(),
				"email":	$("#email1").val(),
				"ultlogin":	$("#ultlogin").val()	
			}
	};

	$.ajax({
		url:"../../AAWAdmin",
		global: false,
		type: "POST",
		data: $.toJSON(req),
		contentType: "application/json",
		success: function(rta)
		{
			stopLoading();
			rtaopr(rta);

			$("#typeide1").val(""),
			$("#numide1").val(""),
			$("#name1").val(""),
			$("#ap1").val(""),
			$("#pass1").val(""),
			$("#typerol1").val(""),
			$("#email1").val("");
		},
		error: function()
		{stopLoading();alert("281:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
		beforeSend: loading,
		complete: stopLoading
	}
	);
}



function createuserSend()
{
	var req={
			"uid":uid,
			"informationCreateUsers":{
				"typedoc":	$("#typeide").val(),
				"numdoc":	$("#numide").val(),
				"names":	$("#name").val(),
				"apelidos":	$("#ape").val(),
				"pass":	$("#pass").val(),
				"rol":	$("#typerol").val(),
				"email":	$("#email").val(),
			}
	};

	$.ajax({
		url:"../../AAWAdmin",
		global: false,
		type: "POST",
		data: $.toJSON(req),
		contentType: "application/json",
		success: function(rta)
		{
			stopLoading();
			rtaopr(rta);
			
			
			$("#typeide").val(""),
			$("#numide").val(""),
			$("#name").val(""),
			$("#ape").val(""),
			$("#pass").val(""),
			$("#typerol").val(""),
			$("#email").val("");
			

		},
		error: function()
		{stopLoading();alert("326:Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
		beforeSend: loading,
		complete: stopLoading
	}
	);
}


function editeuserjq(userid)
{
	adminusers.idbuble=userid.toString();

	if(jQuery("#list").jqGrid().getCell(adminusers.idbuble,3)=="WSTigo")
	{
		alert("Este usuario esta reservado para el servicio del webservice espejo");
		return;
	}
	edituser();
}
function eliminateuserjq(userid)
{
	adminusers.idbuble=userid.toString();
	if(jQuery("#list").jqGrid().getCell(adminusers.idbuble,3)=="WSTigo")
	{
		alert("Este usuario esta reservado para el servicio del webservice espejo");
		return;
	}
	eliminateUser();
}
