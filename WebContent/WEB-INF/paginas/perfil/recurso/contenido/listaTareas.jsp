<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="/WEB-INF/Libreria.tld" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="row-fluid sortable ui-sortable">
	<div class="box span12">
		<div class="box-header" data-original-title="">
			<h2>
				<i class="halflings-icon calendar white"></i><span class="break"></span>Analisis Nombre Proyecto
			</h2>
		</div>
		<div class="box-content">

			<table class="table">
				<thead>
					<tr role="row">
						<th class="center" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-sort="ascending"
							aria-label="Username: activate to sort column descending"
							style="width: 170px;">Tarea</th>
						<th class="center" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Date registered: activate to sort column ascending"
							style="width: 248px;">Fecha Inicio</th>
						<th class="center" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Role: activate to sort column ascending"
							style="width: 136px;">Fecha Fin</th>
						<th class="center" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Actions: activate to sort column ascending"
							style="width: 289px;">Iniciado</th>
						<th class="center" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Actions: activate to sort column ascending"
							style="width: 289px;">Compleado</th>
						<th class="center" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Actions: activate to sort column ascending"
							style="width: 289px;">Incidencia</th>
					</tr>
				</thead>

				<tbody role="alert" aria-live="polite" aria-relevant="all">
				<s:iterator value="atareas">
					<tr class="odd">
						<td class=" sorting_1"><s:property value="des"/></td>
						<td class="center "><s:property value="fechainiciopu"/></td>
						<td class="center "><s:property value="fechafinpu"/></td>
						<s:if test="%{fechainiciore==null}">
							<td class="center ">
								<a class="btn btn-info" href="/PMPRO/atareas/comenzarTarea?atarea.codigo=<s:property value="codigo"/>" style="margin-left:10px">
									<i class="halflings-icon white check"></i>  
								</a>
							</td>
							<td class="center ">
								<a class="btn btn-info noty" href="#" style="margin-left:10px" data-noty-options="{&quot;text&quot;:&quot;Debe primero comenzar la tarea&quot;,&quot;layout&quot;:&quot;topLeft&quot;,&quot;type&quot;:&quot;success&quot;}">
									<i class="halflings-icon white check"></i>  
								</a>
							</td>
							<td class="center ">
							<% String nombre = "#" +%><s:property value="codigo"/><%; %>
								<a class="btn btn-success" href="#" style="margin-left:10px" data-toggle="modal" data-target="<%nombre;%>">
									<i class="halflings-icon white plus-sign"></i> 
								</a>
								<!-- - -->
								<div class="modal hide fade" id="<s:property value="codigo"/>" >
									<div class="modal-header">
										<button type="button" class="close botonCerrar" data-dismiss="modal">×</button>
										<h3>Agregar Incidencia</h3>
									</div>
									<div class="modal-body">
										<form action="registrarIncidencias" namespace="/incidencia">
											<fieldset>
												<div class="control-group">
													<label class="control-label" for="typeahead">Descripcion</label>
													<div class="controls">
														<input type="text" name="incidencia.des" class="span6 typeahead" id="typeahead" data-error="Debe ingresar la descripcion" required>
													</div>
												</div>
												<div class="control-group">
													<label class="control-label" for="typeahead">Urgencia</label>
													<c:cboUrgencia />
												</div>
												
												<div class="form-actions">
													<input type="submit" class="btn btn-primary" value="Agregar"/>
													<input type="reset" data-dismiss="modal" class="btn botonCerrar" value="Cancelar"/>
												</div>
											</fieldset>
										</form>
									</div>
								</div>
							</td>
						</s:if>
						<s:else>
							<td class="center ">
								<span class="label label-success" style="margin-left:10px;padding:10px 12px;">
									<i class=" halflings-icon white ok"></i>
								</span>
							</td>
							<s:if test="%{fechafinre==null}">
							<td class="center ">
								<a class="btn btn-info" href="/PMPRO/atareas/terminarTarea?atarea.codigo=<s:property value="codigo"/>" style="margin-left:10px">
									<i class="halflings-icon white check"></i>  
								</a>
							</td>
							<td class="center ">
								<a class="btn btn-success" href="#" style="margin-left:10px" data-toggle="modal" data-target="#modalIncidencia">
									<i class="halflings-icon white plus-sign"></i> 
								</a>
							</td>
							</s:if>
							<s:else>
								<td class="center ">
									<span class="label label-success" style="margin-left:10px;padding:10px 12px;">
										<i class=" halflings-icon white ok"></i>
									</span>
								</td>
								<td class="center ">
									<a class="btn btn-success noty" href="#" style="margin-left:10px" data-noty-options="{&quot;text&quot;:&quot;La tarea ya finalizo&quot;,&quot;layout&quot;:&quot;topLeft&quot;,&quot;type&quot;:&quot;success&quot;}">
										<i class="halflings-icon white plus-sign"></i> 
									</a>
								</td>
							</s:else>
							
						</s:else>
						
						<td class="center ">
							<a class="btn btn-success" href="#" style="margin-left:10px">
								<i class="halflings-icon white plus-sign"></i>  
							</a>
						</td>
					</tr>
				</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</div>