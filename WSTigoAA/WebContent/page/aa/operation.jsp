<script type="text/javascript" src="js/operation.js"></script>
<link rel="stylesheet" href="css/form.css" type="text/css" media="all" />  


<div id="formSearchNum" style="border-bottom: 1px solid;position: relative;">
	<form id="formcel" action="javascript:void(0)">
	<fieldset style="border:none;">  
	<label for="numcel">Ingrese un numero celular:</label>
	<input id="numcel" onkeyup="javascript:this.value=this.value.replace(/[^0-9]/g, '');" type="text" size=12 maxlength=11 style="font-size: 19px; position: relative; left: 70px;"/>
	<input id="submitcel" type="button" value="Buscar" style="position:relative;left:100px;"/>
	</fieldset>
	</form>
	
	<!-- form id="formident" action="javascript:void(0)">
	<fieldset style="border:none;">  
	<label for="numide">Ingrese Numero de identificaci&oacute;n:</label>
	<input id="numide" type="text" size=12 maxlength=11 style="position: relative; font-size: 19px; left: 27px;"/>
	<input  id="submitide" type="button" value="Buscar" style="position: relative; left: 57px;"/>
	</fieldset>
	</form-->
</div>
<div id="resultsearch">
	<br/>
	<div id="contentresult">
	<form class="form" action="javascript:void(0);">
		<p id="numcelnombreproplan">
			<input type="text" id="phone" id="phone" style="display:none;"></input>
			
			<label for="plani">Plan:</label>
			<input type="text" id="plani" id="plani"></input>
			
			<label for="nombreprop">Nombre registrado:</label>
			<input type="text" id="nombreprop" id="nombreprop"></input>
		</p>
		<p id="tipodocnumdoc">
			<label for="tipodocumento">Tipo documento:</label>
			<input type="text" id="tipodocumento" id="tipodocumento"></input>
			
			<label for="numdocumento">Numero documento:</label>
			<input type="text" id="numdocumento" id="numdocumento"></input>
		</p>

		<p id="paqueteactualestado">
			<label for="pacactual">Paquete Actual:</label>
			<input type="text" id="pacactual" id="pacactual"></input>
			
			<label for="pacestado">Estado del paquete:</label>
			<input type="text" id="pacapacestadoctual" id="pacestado"></input>
		</p>

	</form>
	</div>


</div>

