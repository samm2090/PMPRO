<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<h2>${sessionScope.proyecto.getNombre()}</h2>


<div class="row-fluid sortable ui-sortable">		
	<div class="box span12">
		<div class="box-header" data-original-title="">
			<h2><i class="halflings-icon calendar white"></i><span class="break"></span>Cronograma Público</h2>
			<div class="box-icon">
				<a href="#" class="btn-close"><i class="halflings-icon fullscreen white"></i></a>
			</div>
		</div>
		<div class="box-content">
			
			<table class="table">
			  <thead>
				  <tr role="row">
					<th class="sorting_asc" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Username: activate to sort column descending" style="width: 170px;">Fase</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Date registered: activate to sort column ascending" style="width: 248px;">Fecha Inicio</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Role: activate to sort column ascending" style="width: 136px;">Fecha Fin</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Status: activate to sort column ascending" style="width: 145px;">Avance</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Actions: activate to sort column ascending" style="width: 289px;">Archivos</th>
				</tr>
			  </thead>   
			  
				<tbody role="alert" aria-live="polite" aria-relevant="all">									
					<s:iterator value="fases">
						
						<tr>
							<td class=" sorting_1"><s:property value="des"></s:property></td>
							<td class="center "></td>
							<td class="center "></td>
							<td class="center "><span class="label label-success">Active</span>
							</td>
							<td class="center ">
								<a href="#"> <i class=" glyphicons-icon download"></i>
								</a></td>
						</tr> 
					</s:iterator>	
				</tbody>
			</table>
		</div>            
	</div>
</div>

<div class="row-fluid sortable ui-sortable">		
	<div class="box span12">
		<div class="box-header" data-original-title="">
			<h2><i class="halflings-icon calendar white"></i><span class="break"></span>Cronograma Privado</h2>
			<div class="box-icon">
				<a href="#" class="btn-close"><i class="halflings-icon fullscreen white"></i></a>
			</div>
		</div>
		<div class="box-content">
			
			<table class="table">
			  <thead>
				  <tr role="row">
					<th class="sorting_asc" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Username: activate to sort column descending" style="width: 170px;">Fase</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Date registered: activate to sort column ascending" style="width: 248px;">Fecha Inicio</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Role: activate to sort column ascending" style="width: 136px;">Fecha Fin</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Status: activate to sort column ascending" style="width: 145px;">Avance</th>
					<th class="sorting" role="columnheader" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Actions: activate to sort column ascending" style="width: 289px;">Archivos</th>
				  </tr>
			  </thead>   
			  
				<tbody role="alert" aria-live="polite" aria-relevant="all">									
					<s:iterator value="fases">
						<tr>
							<td class=" sorting_1"><s:property value="des"></s:property></td>
							<td class="center "></td>
							<td class="center "></td>
							<td class="center "><span class="label label-success">Active</span>
							</td>
							<td class="center ">
								<a href="#"> <i class=" glyphicons-icon download"></i></a>
							</td>
						</tr> 
					</s:iterator>	
				</tbody>
			</table>
		</div>            
	</div>
</div>	

