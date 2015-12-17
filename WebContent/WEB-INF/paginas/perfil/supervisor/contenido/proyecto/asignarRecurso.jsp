<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>${sessionScope.proyecto.getNombre()}</h1>


<div class="row-fluid sortable ui-sortable">
	<div class="box span12">
		<div class="box-header" data-original-title="">
			<h2>
				<i class="halflings-icon list-alt"></i><span class="break"></span>Tareas
			</h2>
			<div class="box-icon">
				<a href="#" class="btn-close"><i
					class="halflings-icon fullscreen white"></i></a>
			</div>
		</div>
		<div class="box-content">
			<table class="table">
				<thead>
					<tr role="row">
						<th class="sorting_asc" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-sort="ascending"
							aria-label="Username: activate to sort column descending"
							style="width: 170px;">Tarea</th>
						<th class="sorting" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Date registered: activate to sort column ascending"
							style="width: 248px;">Fecha Inicio</th>
						<th class="sorting" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Role: activate to sort column ascending"
							style="width: 136px;">Fecha Fin</th>
						<th class="sorting" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Status: activate to sort column ascending"
							style="width: 145px;">Responsable</th>
						<th class="sorting" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Actions: activate to sort column ascending"
							style="width: 289px;">Iniciado?</th>
						<th class="sorting" role="columnheader" tabindex="0"
							aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
							aria-label="Actions: activate to sort column ascending"
							style="width: 289px;">Terminado?</th>
					</tr>
				</thead>

				<tbody role="alert" aria-live="polite" aria-relevant="all">
					<s:iterator value="atareas">
						<tr>

							<td class=" sorting_1"><s:property value="des" /></td>
							<td class="center "><s:property value="fechainiciopu" /></td>
							<td class="center "><s:property value="fechafinpu" /></td>
							<td class="center "><a class="btn btn-success" href="#">Asignar</a></td>
							<td class="center "><s:property value="fechaInicioRe" /></td>
							<td class="center "><s:property value="fechaFinRe" /></td>

						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</div>
