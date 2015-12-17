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
						</s:if>
						<s:else>
							<td class="center ">
								<span class="label label-success" style="margin-left:10px;padding:10px 12px;">
									<i class=" halflings-icon white ok"></i>
								</span>
							</td>
						</s:else>
						
						<s:if test="%{fechafinre==null}">
							<td class="center ">
								<a class="btn btn-info" href="/PMPRO/atareas/comenzarTarea?atarea.codigo=<s:property value="codigo"/>" style="margin-left:10px">
									<i class="halflings-icon white check"></i>  
								</a>
							</td>
						</s:if>
						<s:else>
							<td class="center ">
								<span class="label label-success" style="margin-left:10px;padding:10px 12px;">
									<i class=" halflings-icon white ok"></i>
								</span>
							</td>
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