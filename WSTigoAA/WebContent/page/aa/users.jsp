<center>
<div id="divoperacionesusers" style="display: block;">
			<button value="Listar Usuarios" id="listuser" onclick="adminusers.listuser();">Listar Usuarios</button>
			<button value="Crear usuario"  onclick="adminusers.createuser();">Formulario Crear usuario</button>
</div>
</center>
<div id="resultoperationlistuser" style="display:none;">
	<div>
	<p>Roles: 1.usuario solo consulta.   2. usuario activa y cancela   3.usuario administrador</p>
	<p>Por favor para editar o eliminar por favor de click en los botones.</p>
	</div>


	<div id="contenttable" style="position:relative;left:5px;">
		<div id="contentlist"></div>
		<div id="contentpager"></div>
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
							<select id="typeide" style="width: 220px;">
							 <option value="">Seleccione una opcion</option>
						     <option value="CC">Cedula de Ciudadania </option>
							 <option value="NIT">Nit </option>
							 <option value="CE">Cedula de extranjeria </option>
							</select>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="numide">Numero de identicacion:</label>
							<input	type="text" id="numide" onkeyup="javascript:this.value=this.value.replace(/[^0-9]/g, '');"></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="name">Nombres:</label>
							<input	type="text" id="name" onkeyup="javascript:this.value=this.value.replace(/[^a-zA-Z\s]/g, '');"></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="ape">Apellidos:</label>
							<input	type="text" id="ape" onkeyup="javascript:this.value=this.value.replace(/[^a-zA-Z\s]/g, '');"></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="pass">Password:</label>
							<input	type="password" id="pass" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="typerol"  >ROl:</label>
							<select id="typerol" style="width: 220px;">
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
						<button value="Crear"  onclick="adminusers.createuserform();">Crear usuario</button>
					</td>
				</tr>
				
			</tbody>
		</table>
		</center>
		
</div>



<div id="dialog-confirm" title="Que operacion desea realizar?" style="display:none;">
	<p><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span>Seleccione la opcion que desee realizar</p>
</div>





<div id="dialog-confirm-edit" title="Editar Usuario"  style="display:none;">
	   <br/>
	   <center>
	   <table id="styleforedit">
			<tbody>
				<tr>
					<td align="right">
							<label for="typeide1">Tipo de identicacion:</label>
							<input	type="text" id="typeide1" readonly></input>
							<input	type="text" id="us_id1" style="display:none;" ></input>

					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="numide1">Numero de identicacion:</label>
							<input	type="text" id="numide1" readonly></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="name1">Nombres:</label>
							<input	type="text" id="name1" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="ape1">Apellidos:</label>
							<input	type="text" id="ape1" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="pass1">Password:</label>
							<input	type="password" id="pass1" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="typerol1"  >ROl:</label>
							<!--  input	type="text" id="typerol1" readonly></input-->
							<select id="typerol1" style="width: 220px;">
							  <option value="1">Consulta Operaciones</option>
							  <option value="2">Operaciones</option>
							  <option value="3">Operaciones,Adm </option>
							</select>

					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="email1">Email:</label>
							<input	type="text" id="email1" ></input>
					</td>
				</tr>
				<tr>
					<td align="right">
							<label for="ultlogin">Ultimo login:</label>
							<input	type="text" id="ultlogin" readonly></input>
					</td>
				</tr>
				
			</tbody>
		</table>
		</center>
		
</div>


