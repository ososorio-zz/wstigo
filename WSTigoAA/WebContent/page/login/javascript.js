$(document).ready(function() {
	$("div.panel_button").click(function(){
		$("div#panel").animate({
			height: "500px"
		})
		.animate({
			height: "400px"
		}, "fast");
		$("div.panel_button").toggle();

		var now = new Date();
		var hour        = now.getHours();
		var minute      = now.getMinutes();
		var second      = now.getSeconds();
		$("#idtime").html("Hora de acceso: "+hour+":"+minute+":"+second);

	});	

	$("div#hide_button").click(function(){
		$("div#panel").animate({
			height: "0px"
		}, "fast");
	});	

	$("#login_btn").click(function(){
		var usern=$("#username").val();
		var pass=$("#password").val();
		if(usern=="" || pass=="")
		{alert("Por Favor Verifique los datos no se permiten campos vacios");
		return;}

		$.ajax({
			url:"../../AAWSLogin",
			global: true,
			type: "POST",
			data: {us:usern,ps:pass},
			contentType: "text/html",
			success: function(response)
			{callbacklogin(response);},
			error: function()
			{stopLoading();alert("Ocurrio un error realizando el login, intente mas tarde, si el error persiste comuniquese con el area de sistemas");},
			beforeSend: loading,
			complete: stopLoading
		}
		);	
	});
});


function loading()
{$("#loading").show();}
function stopLoading()
{$("#loading").hide();}


function callbacklogin(response)
{
	if(response.login=="0")
	{
		alert(response.value);
		$("#username").val("");
		$("#password").val("");
		return;
	}
	else
		if(response.login=="202")
		{
			window.location="../aa/manager.jsp?token="+response.value;
		}
}