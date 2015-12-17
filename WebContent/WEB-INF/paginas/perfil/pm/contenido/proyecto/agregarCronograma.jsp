<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="/WEB-INF/Libreria.tld" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:actionmessage/>

	<div class="row-fluid sortable">
		<div class="box span12">
			<div class="box-header" data-original-title>
				<h2>
					<i class="halflings-icon white edit"></i><span class="break"></span>Cronograma: <s:property value="proyecto.nombre"></s:property>
				</h2>
			</div>
			
			<div class="box-content">
				<form class="form-horizontal" action="terminarRegistroProyecto" namespace="/proyecto" method="post">
					<fieldset>
						<!-- tabla fase1 -->
						<div class="control-group">
						<div class="box span11">
							<div class="box-header">
								<h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Analisis</h2>
								<div class="box-icon">
									<a href="#" id="botonForm" data-toggle="modal" data-target="#modalAnalisis"><i class="halflings-icon white wrench"></i></a>
								</div>
							</div>
							<div class="box-content">
								<table class="table table-striped">
									  <thead>
										  <tr>
											  <th>Tarea</th>
											  <th>Fecha Inicio</th>
											  <th>Fecha Fin</th>
											  <th>Responsable</th>
											  <th>Estado</th>                                     
										  </tr>
									  </thead>   
									  <tbody>
										<s:iterator value="atareas">
										  		<s:if test="%{pfase.codigofase==1}">
													<tr>
														<td><s:property value="des"/></td>
														<td class="center"><s:property value="fechainiciopu"/></td>
														<td class="center"><s:property value="fechafinpu"/></td>
														<td class="center"><s:property value="activo"/></td>
														<td><s:property value="des"/></td>                                      
													</tr>
												</s:if>
											</s:iterator>

									
									  </tbody>
								 </table>  
								 <div class="pagination pagination-centered">
								  <ul>
									<li><a href="#">Prev</a></li>
									<li class="active">
									  <a href="#">1</a>
									</li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">Next</a></li>
								  </ul>
								</div>     
							</div>
						</div><!--/span-->
						</div>
						<!-- tabla fas2 -->
						<div class="control-group">
						<div class="box span11">
							<div class="box-header">
								<h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Diseno</h2>
								<div class="box-icon">
									<a href="#" id="botonForm2" data-toggle="modal" data-target="#modalDiseno"><i class="halflings-icon white wrench"></i></a>
								</div>
							</div>
							<div class="box-content">
								<table class="table table-striped">
									  <thead>
										  <tr>
											  <th>Tarea</th>
											  <th>Fecha Inicio</th>
											  <th>Fecha Fin</th>
											  <th>Responsable</th>
											  <th>Estado</th>                                     
										  </tr>
									  </thead>   
									  <tbody>
									  
									  <s:iterator value="atareas">
									  		<s:if test="%{pfase.codigofase==2}">
												<tr>
													<td><s:property value="des"/></td>
													<td class="center"><s:property value="fechainiciopu"/></td>
													<td class="center"><s:property value="fechafinpu"/></td>
													<td class="center"><s:property value="activo"/></td>
													<td><s:property value="des"/></td>                                      
												</tr>
											</s:if>
										</s:iterator>
                            
									  </tbody>
								 </table>  
								 <div class="pagination pagination-centered">
								  <ul>
									<li><a href="#">Prev</a></li>
									<li class="active">
									  <a href="#">1</a>
									</li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">Next</a></li>
								  </ul>
								</div>     
							</div>
						</div><!--/span-->
						</div>
						<!-- tabla fase3 -->
						<div class="control-group">
						<div class="box span11">
							<div class="box-header">
								<h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Desarrollo</h2>
								<div class="box-icon">
									<a href="#" id="botonForm3" data-toggle="modal" data-target="#modalDesarrollo"><i class="halflings-icon white wrench"></i></a>
								</div>
							</div>
							<div class="box-content">
								<table class="table table-striped">
									  <thead>
										  <tr>
											  <th>Tarea</th>
											  <th>Fecha Inicio</th>
											  <th>Fecha Fin</th>
											  <th>Responsable</th>
											  <th>Estado</th>                                     
										  </tr>
									  </thead>   
									  <tbody>
									  
									  <s:iterator value="atareas">
									  		<s:if test="%{pfase.codigofase==3}">
												<tr>
													<td><s:property value="des"/></td>
													<td class="center"><s:property value="fechainiciopu"/></td>
													<td class="center"><s:property value="fechafinpu"/></td>
													<td class="center"><s:property value="activo"/></td>
													<td><s:property value="des"/></td>                                      
												</tr>
											</s:if>
										</s:iterator>
                            
									  </tbody>
								 </table>  
								 <div class="pagination pagination-centered">
								  <ul>
									<li><a href="#">Prev</a></li>
									<li class="active">
									  <a href="#">1</a>
									</li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">Next</a></li>
								  </ul>
								</div>     
							</div>
						</div><!--/span-->
						</div>
						<!-- tabla fase4 -->
						<div class="control-group">
						<div class="box span11">
							<div class="box-header">
								<h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Pruebas</h2>
								<div class="box-icon">
									<a href="#" id="botonForm4" data-toggle="modal" data-target="#modalPruebas"><i class="halflings-icon white wrench"></i></a>
								</div>
							</div>
							<div class="box-content">
								<table class="table table-striped">
									  <thead>
										  <tr>
											  <th>Tarea</th>
											  <th>Fecha Inicio</th>
											  <th>Fecha Fin</th>
											  <th>Responsable</th>
											  <th>Estado</th>                                     
										  </tr>
									  </thead>   
									  <tbody>
									  
									  <s:iterator value="atareas">
									  		<s:if test="%{pfase.codigofase==4}">
												<tr>
													<td><s:property value="des"/></td>
													<td class="center"><s:property value="fechainiciopu"/></td>
													<td class="center"><s:property value="fechafinpu"/></td>
													<td class="center"><s:property value="activo"/></td>
													<td><s:property value="des"/></td>                                      
												</tr>
											</s:if>
										</s:iterator>
                            
									  </tbody>
								 </table>  
								 <div class="pagination pagination-centered">
								  <ul>
									<li><a href="#">Prev</a></li>
									<li class="active">
									  <a href="#">1</a>
									</li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">Next</a></li>
								  </ul>
								</div>     
							</div>
						</div><!--/span-->
						</div>
						
						<div class="form-actions">
							<button type="submit" class="btn" data-noty-options="{&quot;text&quot;:&quot;Se agrego el cronograma&quot;,&quot;layout&quot;:&quot;topLeft&quot;,&quot;type&quot;:&quot;success&quot;}">
								Terminar
							</button>
							<button type="reset" class="btn">Cancel</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
		<!--/span-->
	</div>
<!------------------------------------------------------------------------------------->
<!-- Modal Analisis -->
	<div class="modal hide fade" id="modalAnalisis">
		<div class="modal-header">
			<button type="button" class="close botonCerrar" data-dismiss="modal">×</button>
			<h3>Agregar tarea</h3>
		</div>
		<div class="modal-body">
			<form action="registrarTarea" namespace="/proyecto">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="typeahead">Descripcion</label>
						<div class="controls">
							<input type="text" name="atarea.des" class="span6 typeahead" id="typeahead" data-error="Debe ingresar la descripcion" required>
						</div>
					</div>
				
					<s:hidden name="atarea.codestado" value="1"/>
					<s:iterator value="pfase">
						<s:if test="%{codigofase==1}">
							<s:hidden name="atarea.codpfase" value="%{codigo}"/>
						</s:if>
					</s:iterator>
					<s:hidden name="atarea.codarea" value="1"/>

					<div class="control-group">
						<label class="control-label" for="date01">Fecha Inicio Privado</label>
						<div class="controls">
							<input name="atarea.fechainiciopu" type="text" class="input-xlarge datepicker" id="date01" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date02">Fecha Fin Privado</label>
						<div class="controls">
								<input name="atarea.fechafinpu" type="text" class="input-xlarge datepicker" id="date02" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date03">Fecha Inicio Publico</label>
						<div class="controls">
							<input type="text" name="atarea.fechainiciopr" class="input-xlarge datepicker" id="date03" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date04">Fecha Fin Publico</label>
						<div class="controls">
								<input type="text" name="atarea.fechafinpr" class="input-xlarge datepicker" id="date04" value="02/16/2015">
						</div>
					</div>
					
					<div class="form-actions">
						<input type="submit" class="btn btn-primary" value="Agregar"/>
						<input type="reset" data-dismiss="modal" class="btn botonCerrar" value="Cancelar"/>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
	
		<!-- Modal Diseno -->
	<div class="modal hide fade" id="modalDiseno">
		<div class="modal-header">
			<button type="button" class="close botonCerrar" data-dismiss="modal">×</button>
			<h3>Agregar tarea</h3>
		</div>
		<div class="modal-body">
			<form action="registrarTarea" namespace="/proyecto">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="typeahead">Descripcion</label>
						<div class="controls">
							<input type="text" name="atarea.des" class="span6 typeahead" id="typeahead" data-error="Debe ingresar la descripcion" required>
						</div>
					</div>
				
					<s:hidden name="atarea.codestado" value="1"/>
					<s:iterator value="pfase">
						<s:if test="%{codigofase==2}">
							<s:hidden name="atarea.codpfase" value="%{codigo}"/>
						</s:if>
					</s:iterator>
					<s:hidden name="atarea.codarea" value="1"/>

					<div class="control-group">
						<label class="control-label" for="date01">Fecha Inicio Privado</label>
						<div class="controls">
							<input name="atarea.fechainiciopu" type="text" class="input-xlarge datepicker" id="date05" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Fin Privado</label>
						<div class="controls">
								<input name="atarea.fechafinpu" type="text" class="input-xlarge datepicker" id="date06" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Inicio Publico</label>
						<div class="controls">
							<input type="text" name="atarea.fechainiciopr" class="input-xlarge datepicker" id="date07" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Fin Publico</label>
						<div class="controls">
								<input type="text" name="atarea.fechafinpr" class="input-xlarge datepicker" id="date08" value="02/16/2015">
						</div>
					</div>
					
					<div class="form-actions">
						<input type="submit" class="btn btn-primary" value="Agregar"/>
						<input type="reset" data-dismiss="modal" class="btn botonCerrar" value="Cancelar"/>
					</div>
					
				</fieldset>
			</form>	
		</div>
	</div>
		<!-- Modal Desarrollo -->
	<div class="modal modalAnalisis hide fade" id="modalDesarrollo">
		<div class="modal-header">
			<button type="button" class="close botonCerrar" data-dismiss="modal">×</button>
			<h3>Agregar tarea</h3>
		</div>
		<div class="modal-body">
			<form action="registrarTarea" namespace="/proyecto">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="typeahead">Descripcion</label>
						<div class="controls">
							<input type="text" name="atarea.des" class="span6 typeahead" id="typeahead" data-error="Debe ingresar la descripcion" required>
						</div>
					</div>
				
					<s:hidden name="atarea.codestado" value="1"/>
					<s:iterator value="pfase">
						<s:if test="%{codigofase==3}">
							<s:hidden name="atarea.codpfase" value="%{codigo}"/>
						</s:if>
					</s:iterator>
					<s:hidden name="atarea.codarea" value="2"/>

					<div class="control-group">
						<label class="control-label" for="date01">Fecha Inicio Privado</label>
						<div class="controls">
							<input name="atarea.fechainiciopu" type="text" class="input-xlarge datepicker" id="date09" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Fin Privado</label>
						<div class="controls">
								<input name="atarea.fechafinpu" type="text" class="input-xlarge datepicker" id="date10" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Inicio Publico</label>
						<div class="controls">
							<input type="text" name="atarea.fechainiciopr" class="input-xlarge datepicker" id="date11" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Fin Publico</label>
						<div class="controls">
								<input type="text" name="atarea.fechafinpr" class="input-xlarge datepicker" id="date12" value="02/16/2015">
						</div>
					</div>
					
					<div class="form-actions">
						<input type="submit" class="btn btn-primary" value="Agregar"/>
						<input type="reset" data-dismiss="modal" class="btn botonCerrar" value="Cancelar"/>
					</div>
					
				</fieldset>
			</form>	
		</div>
	</div>
		<!-- Modal Pruebas -->
	<div class="modal modalAnalisis hide fade" id="modalPruebas">
		<div class="modal-header">
			<button type="button" class="close botonCerrar" data-dismiss="modal">×</button>
			<h3>Agregar tarea</h3>
		</div>
		<div class="modal-body">
			<form action="registrarTarea" namespace="/proyecto">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="typeahead">Descripcion</label>
						<div class="controls">
							<input type="text" name="atarea.des" class="span6 typeahead" id="typeahead" data-error="Debe ingresar la descripcion" required>
						</div>
					</div>
				
					<s:hidden name="atarea.codestado" value="1"/>
					<s:iterator value="pfase">
						<s:if test="%{codigofase==4}">
							<s:hidden name="atarea.codpfase" value="%{codigo}"/>
						</s:if>
					</s:iterator>
					<s:hidden name="atarea.codarea" value="3"/>

					<div class="control-group">
						<label class="control-label" for="date01">Fecha Inicio Privado</label>
						<div class="controls">
							<input name="atarea.fechainiciopu" type="text" class="input-xlarge datepicker" id="date13" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Fin Privado</label>
						<div class="controls">
								<input name="atarea.fechafinpu" type="text" class="input-xlarge datepicker" id="date14" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Inicio Publico</label>
						<div class="controls">
							<input type="text" name="atarea.fechainiciopr" class="input-xlarge datepicker" id="date15" value="02/16/2015">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="date01">Fecha Fin Publico</label>
						<div class="controls">
								<input type="text" name="atarea.fechafinpr" class="input-xlarge datepicker" id="date16" value="02/16/2015">
						</div>
					</div>
					
					<div class="form-actions">
						<input type="submit" class="btn btn-primary" value="Agregar"/>
						<input type="reset" data-dismiss="modal" class="btn botonCerrar" value="Cancelar"/>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
	
	<!--  <div class="modal-backdrop fade hide" id="fondoModal"></div>-->