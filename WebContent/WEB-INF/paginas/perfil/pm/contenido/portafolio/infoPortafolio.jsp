<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div>
	<h1>
		<s:property value="#session.portafolio.getNombre()" />
	</h1>
</div>

<form class="form-horizontal"
	action="<s:url action="editarPortafolioDes" namespace="/portafolio"/>"
	method="post">
	<textarea class="form-control span10"><s:property value="#session.portafolio.getDes()"/></textarea>

	<input type="submit" class="btn btn-primary" value="Editar">

</form>

<div class="row-fluid sortable ui-sortable">
	<div class="box span12">
		<form class="form-horizontal"
			action="/PMPRO/proyecto/formAgregarProyecto"
			method="post">
			<fieldset>
				<div class="box-header" data-original-title="">
					<h2>
						<i class=" halflings-icon folder-open"></i><span class="break"></span>Proyectos
					</h2>
				</div>
				<div class="box-content">

					<table class="table">
						<thead>
							<tr role="row">
								<th class="sorting_asc" role="columnheader" tabindex="0"
									aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
									aria-sort="ascending"
									aria-label="Username: activate to sort column descending"
									style="width: 170px;">Codigo</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
									aria-label="Date registered: activate to sort column ascending"
									style="width: 248px;">Nombre</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
									aria-label="Role: activate to sort column ascending"
									style="width: 136px;">Estado</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
									aria-label="Status: activate to sort column ascending"
									style="width: 145px;">Avance</th>
							</tr>
						</thead>

						<tbody role="alert" aria-live="polite" aria-relevant="all">
							<s:iterator value="#session.proyectos">

								<tr>
									<td class=" sorting_1"><s:property value="codigo" /></td>
									<td class="center "><s:property value="nombre" /></td>
									<td class="center "><s:property value="estado.des" /></td>
									<td class="center ">
										<div class="progress" style="height: 20px">
											<div class="progress-bar" role="progressbar"
												aria-valuenow="<s:property value="avance"/>"
												aria-valuemin="0" aria-valuemax="100"
												style="width: <s:property value="avance"/>%;">
												<s:property value="avance" />
												%
											</div>
										</div>
									</td>
								</tr>
							</s:iterator>
						</tbody>
					</table>

					<div class="form-actions">
						<button type="submit" class="btn btn-primary span4"
							style="margin-left: 14em;">Crear nuevo proyecto</button>
					</div>
				</div>

			</fieldset>
		</form>
	</div>
</div>
