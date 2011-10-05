adminusers={
		listuser:function(){
			$("#resultoperationlistuser").show();
			$("#resultoperationsearch").hide();
			$("#resultoperationcreate").hide();
		},
		searchuser:function(){
			$("#resultoperationlistuser").hide();
			$("#resultoperationsearch").show();
			$("#resultoperationcreate").hide();
		},
		createuser:function(){
			$("#resultoperationlistuser").hide();
			$("#resultoperationsearch").hide();
			$("#resultoperationcreate").show();
		},
		createuserform:function(){}
		
};




