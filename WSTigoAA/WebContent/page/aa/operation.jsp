<script type="text/javascript" src="js/operation.js"></script>
<div id="formSearchNum">
	<form id="formcel" action="javascript:void(0)">
	<fieldset style="border:none;">  
	<label for="numcel">Ingrese un numero celular:</label>
	<input id="numcel" onkeyup="javascript:this.value=this.value.replace(/[^0-9]/g, '');" type="text" size=12 maxlength=11 style="font-size: 19px; position: relative; left: 70px;"/>
	<input id="submitcel" type="button" value="Buscar" style="position:relative;left:100px;"/>
	</fieldset>
	</form>
	
	<form id="formident" action="javascript:void(0)">
	<fieldset style="border:none;">  
	<label for="numide">Ingrese Numero de identificaci&oacute;n:</label>
	<input id="numide" type="text" size=12 maxlength=11 style="position: relative; font-size: 19px; left: 17px;"/>
	<input  id="submitide" type="button" value="Buscar" style="position: relative; left: 48px;"/>
	</fieldset>
	</form>
</div>
<div id="resultsearch">

</div>

