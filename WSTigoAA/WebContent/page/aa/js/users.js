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
			alert("crear usuario");
		},
		idbuble:''
};

function callinfousers()
{
	tok=new Date();
	var req=
	{
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
			{stopLoading();alert("Ocurrio un error realizando la peticion, Revise su conexion a internet, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
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
		colNames:["ID","IDENTIFICACION","TIPO DE IDENTIFICACION","NOMBRES","APELLIDOS","ROL","EMAIL","ULTIMO LOGIN","PASSWORD"],
		colModel:[ 
		          {name:'id',      index:'id',      width:24}, 
		          {name:'ide',     index:'ide',     width:70}, 
		          {name:'tipoide', index:'tipoide', width:30 }, 
		          {name:'name',    index:'name',    width:100,sortable:false }, 
		          {name:'apll',    index:'apll',    width:100,sortable:false }, 
		          {name:'rol',     index:'rol',     width:20, sortable:false},
		          {name:'email',   index:'email',   width:100, sortable:false},
		          {name:'login',   index:'login',   width:50, sortable:false},
		          {name:'pass',     index:'pass',   width:1, sortable:false} 
		         ],
		multiselect: false,
		caption: "USUARIOS",
		viewrecords: true,
		rowNum:20,
		rowList:[5,10,20,30,40,50,60],
		pager: '#pager',
		ondblClickRow: function(id){
			adminusers.idbuble=id;
			//jQuery("#list").jqGrid().getCell(id,8);
			$( "#dialog-confirm" ).dialog({
				resizable: false,
				height:190,
				width:500,
				modal: true,
				buttons: {
					"Editar Usuario": function() {
						$( this ).dialog( "close" );
					},
					"Eliminar Usuario": function() {
						$( this ).dialog( "close" );
						eliminateUser();
					},
					Cancel: function() {
						$( this ).dialog( "close" );
					}
				}
			});
			
		}
		});

  jQuery("#list").jqGrid('navGrid',"#pager",{edit:false,add:false,del:false});
  
}catch (e) {
	alert(e);
}
		for(var i=0;i<=json.data.length;i++) jQuery("#list").addRowData(i, json.data[i]);
		jQuery("#list").setGridParam({rowNum:20}).trigger("reloadGrid");		
}

function eliminateUser()
{
	var response = confirm('Esta seguro de eliminar al usuario--identificacion:'+jQuery("#list").jqGrid().getCell(adminusers.idbuble,1)+"--nombre:"+jQuery("#list").jqGrid().getCell(adminusers.idbuble,3));
    // OR var response = window.confirm('Confirm Test: Continue?');
    if (response) {alert("funcion para cancelar!");}
    else alert("No se realizo ninguna operacion");
}

