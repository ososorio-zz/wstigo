<div id="formSearchNum"
	style="border-bottom: 1px solid; position: relative;">
	<form id="formcel" action="javascript:void(0)">
		<fieldset style="border: none;">
			<label for="numcel">Ingrese un numero celular:</label> <input
				id="numcel"
				onkeyup="javascript:this.value=this.value.replace(/[^0-9]/g, '');"
				type="text" size=12 maxlength=11
				style="font-size: 19px; position: relative; left: 70px;" /> <input
				id="submitcel" type="button" value="Buscar"
				style="position: relative; left: 100px;" />
		</fieldset>
	</form>

</div>
<div id="resultsearch">
	<br />
	<div id="contentresult" style="display:none;">
		<input type="text" id="phone" id="phone" style="display: none;"></input>
		<table>
			<tbody>
				<tr>
					<td align="right"><label for="plani">Plan:</label> <input
						type="text" id="plani" name="plani" readonly></input>
					</td>
					<td align="right"><label for="nombreprop">Nombre
							registrado:</label> <input type="text" id="nombreprop" name="nombreprop" readonly></input>
					</td>
				</tr>
				<tr>
					<td align="right"><label for="tipodocumento">Tipo
							documento:</label> <input type="text" name="tipodocumento"
						id="tipodocumento" readonly></input>
					</td>
					<td align="right"><label for="numdocumento">Numero
							documento:</label> <input type="text" id="numdocumento" name="numdocumento" readonly></input>
					</td>
				</tr>
				<tr>
					<td align="right"><label for="pacactual">Paquete
							Actual:</label> <input type="text" id="pacactual" name="pacactual" readonly></input>
					</td>
					<td align="right"><label for="pacestado">Estado del
							paquete:</label> <input type="text" name="pacapacestadoctual"
						id="pacestado" readonly></input>
					</td>
				</tr>
			</tbody>

		</table>

	</div>
	<center>
	<div id="operationsavailables" style="display:none;">
		<br/>
			<button value="Cancelar Servicio Actual"  onclick="adminoperations.cancelateservice();">Cancelar Servicio Actual</button>
			<button value="Activar un nuevo servicio" onclick="adminoperations.activateservice();">Activar un nuevo servicio</button>
			
	</div>
	</center>
	
	<div id="resultActivateService" style="display:none;">
	<table id="selecoptac">
	
	</table>	
	<label for="reason">Comentario:</label>
	<textarea id="reason" rows="20" cols="20"></textarea>
	</div>
	<div id="cancelservice" style="display:none;">
	<select id="cancelateselect" style="width: 421px;"></select>	
	<label for="canceltxt">Causa de la cancelacion:</label>
	<textarea id="canceltxt" rows="20" cols="20"></textarea>
	</div>
	
	

</div>

