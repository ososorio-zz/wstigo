<center>
<div id="divoperacionesusers" style="display: block;">
			<button value="Listar Usuarios"  onclick="adminusers.listuser();">Listar Usuarios</button>
			<button value="Buscar usuario especifico"  onclick="adminusers.searchuser();">Buscar usuario especifico</button>
			<button value="Crear usuario"  onclick="adminusers.createuser();">Crear usuario</button>
</div>
</center>
<div id="resultoperationlistuser" style="display:none;">resultado lista</div>
<div id="resultoperationsearch"   style="display:none;">
   <div id="formSearchusr"	style="border-bottom: 1px solid; position: relative;">
	<form id="formusrs" action="javascript:void(0)">
		<fieldset style="border: none;">
			<label for="numusr">Ingrese un numero de identificacion:</label> 
			<input id="numusr" onkeyup="javascript:this.value=this.value.replace(/[^0-9]/g, '');" type="text" size=15 maxlength=15 style="font-size: 19px; position: relative; left: 4px;" />
			<input id="submitusr" type="button" value="Buscar" style="position: relative; left: 30px;" />
		</fieldset>
	</form>
</div>

</div>
<div id="resultoperationcreate"   style="display:none;">
	   <br/>
	   <center>
	   <table>
			<tbody>
				<tr>
					<td align="right">
							<label for="typeide">Tipo de identicacion:</label>
							<select id="typeide">
							  <option value="CC">Cedula de Ciudadania </option>
							</select>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="numide">Numero de identicacion:</label>
							<input	type="text" id="numide" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="name">Nombres:</label>
							<input	type="text" id="name" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="ape">Apellidos:</label>
							<input	type="text" id="ape" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="pass">Password:</label>
							<input	type="text" id="pass" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="typerol">ROl:</label>
							<select id="typerol">
							  <option value="1">Consulta Operaciones</option>
							  <option value="2">Operaciones</option>
							  <option value="3">Operaciones,Adm </option>
							</select>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="email">Email:</label>
							<input	type="text" id="email" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
						<button value="Crear"  onclick="adminoperations.createuserform();">Crear usuario</button>
					</td>
				</tr>
				
			</tbody>
		</table>
		</center>
		
</div>
