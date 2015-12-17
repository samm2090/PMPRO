<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="m" uri="/WEB-INF/Libreria.tld"%>

<div id="sidebar-left" class="span2">
	<div class="nav-collapse sidebar-nav">
		<ul class="nav nav-tabs nav-stacked main-menu">
			<li></li>
			<li style="color: white; margin-left: 10px; margin-top: 10px;">
				<span class="hidden-tablet" style="margin-right: 5px"> Buscar</span>
				<input type="text" class="span6 typeahead" id="typeahead"
				data-provide="typeahead" data-items="4"
				data-source="[&quot;Alabama&quot;,&quot;Alaska&quot;,&quot;Arizona&quot;,&quot;Arkansas&quot;,&quot;California&quot;,&quot;Colorado&quot;,&quot;Connecticut&quot;,&quot;Delaware&quot;,&quot;Florida&quot;,&quot;Georgia&quot;,&quot;Hawaii&quot;,&quot;Idaho&quot;,&quot;Illinois&quot;,&quot;Indiana&quot;,&quot;Iowa&quot;,&quot;Kansas&quot;,&quot;Kentucky&quot;,&quot;Louisiana&quot;,&quot;Maine&quot;,&quot;Maryland&quot;,&quot;Massachusetts&quot;,&quot;Michigan&quot;,&quot;Minnesota&quot;,&quot;Mississippi&quot;,&quot;Missouri&quot;,&quot;Montana&quot;,&quot;Nebraska&quot;,&quot;Nevada&quot;,&quot;New Hampshire&quot;,&quot;New Jersey&quot;,&quot;New Mexico&quot;,&quot;New York&quot;,&quot;North Dakota&quot;,&quot;North Carolina&quot;,&quot;Ohio&quot;,&quot;Oklahoma&quot;,&quot;Oregon&quot;,&quot;Pennsylvania&quot;,&quot;Rhode Island&quot;,&quot;South Carolina&quot;,&quot;South Dakota&quot;,&quot;Tennessee&quot;,&quot;Texas&quot;,&quot;Utah&quot;,&quot;Vermont&quot;,&quot;Virginia&quot;,&quot;Washington&quot;,&quot;West Virginia&quot;,&quot;Wisconsin&quot;,&quot;Wyoming&quot;]">
				<span class="icon-search" style="margin-right: 10px"></span>
			</li>
			
			<m:menuPortafolioRecurso codigo="${sessionScope.recurso.getCodigo()}" area="${sessionScope.recurso.getCodarea()}" />
			
		</ul>
	</div>
</div>



<!-- MODAL -->
<div class="modal hide fade" id="myModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>Agregar Portafolio</h3>
	</div>
	<div class="modal-body">
		<!-- <form class="form-horizontal"> -->
			<fieldset>
			<s:form action="registrarPortafolio" namespace="/portafolio" method="post">
				<div class="control-group">
					<label class="control-label" for="typeahead">Nombre
						Portafolio</label>
					<div class="controls">
						<input class="input-large" name="portafolio.nombre" id="username"
							type="text" placeholder="">
					</div>
				</div>

				<div class="control-group">
					<label class="control-label" for="typeahead">Descripcion</label>
					<div class="controls">
						<textarea name="portafolio.des" class="" rows="5"></textarea>
					</div>
				</div>

				<div class="form-actions">
					<input type="submit" class="btn btn-primary" value="Agregar"/>
					<input type="reset" data-dismiss="modal" class="btn" value="Cancelar"/>
				</div>
			</s:form>
			</fieldset>
		<!-- </form> -->
	</div>
</div>


<!-- MODAL -->
