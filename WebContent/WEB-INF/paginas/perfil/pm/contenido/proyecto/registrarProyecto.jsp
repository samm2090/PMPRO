<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="/WEB-INF/Libreria.tld" %>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

	<div class="row-fluid sortable">
		<div class="box span12">
			<div class="box-header" data-original-title>
				<h2>
					<i class="halflings-icon white edit"></i><span class="break"></span>Agregar Proyecto
				</h2>
			</div>
			
			<div class="box-content">
				<form class="form-horizontal" action="registrarProyecto" namespace="/proyecto">
					<fieldset>
						<div class="control-group">
							<label class="control-label" for="typeahead">Portafolio</label>
							<div class="controls">
								<c:cboPortafolios />
							</div>
						</div>
					
						<div class="control-group">
							<label class="control-label" for="typeahead">Nombre</label>
							<div class="controls">
								<input name="proyecto.nombre" type="text" class="span6 typeahead" id="typeahead">
							</div>
						</div>
					
						<div class="control-group">
							<label class="control-label" for="typeahead">Descripcion</label>
							<div class="controls">
								<input name="proyecto.des" type="text" class="span6 typeahead" id="typeahead">
							</div>
						</div>
						
						<div class="control-group">
								<label class="control-label">Modalidad</label>
								<div class="controls">
									<select name="proyecto.desdecero">
										<option value="1" >Desde inicio</option>
										<option value="2" > Mantenimiento </option>
									</select>
								</div>
						</div>
						
						<div class="form-actions">
							<button type="submit" class="btn btn-primary">Guardar</button>
							<button type="reset" class="btn">Cancel</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
		<!--/span-->

	</div>
<s:actionmessage/>
	