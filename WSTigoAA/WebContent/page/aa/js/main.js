window.onbeforeunload = function(){ 
	onClose();
};

function onClose()
{
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
			window.location="../login/loginAAWST.html";

		},
		error: function()
		{
		stopLoading();
		alert("31:Session Finalizada.");
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