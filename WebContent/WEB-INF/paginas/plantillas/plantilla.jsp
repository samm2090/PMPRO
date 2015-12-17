<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="tiles"  uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<title>CIBERTEC</title>
	 
	 <!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->
	
	<!-- start: CSS -->
	<link id="bootstrap-style" href="<s:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
	<link href="<s:url value='/css/bootstrap-responsive.min.css'/>" rel="stylesheet">
	<link id="base-style" href="<s:url value='/css/style.css'/>" rel="stylesheet">
	<link id="base-style-responsive" href="<s:url value='/css/style-responsive.css'/>" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
	<!-- end: CSS -->
	<script src="<s:url value='/js/jquery-1.9.1.min.js'/>"></script>
		
	<!-- start: Favicon -->
	<link rel="shortcut icon" href="<s:url value='/img/favicon.ico'/>">
	
	
	<script>
		$(document).ready(function(){
			$('#botonForm').click(function()
			{
				$('#modalAnalisis').css({"opacity":"100","display":"block","top":"10%"});$('#fondoModal').removeClass('hide').addClass('in')
			});
			$('.botonCerrar').click(function(){
				$('#modalAnalisis').css({"opacity":"0","display":"none","top":"-25%"});$('#fondoModal').removeClass('in').addClass('fade')
			});
			
			$('#botonForm2').click(function()
			{
				$('#modalDiseno').css({"opacity":"100","display":"block","top":"10%"});$('#fondoModal').removeClass('hide').addClass('in')
			});
			$('.botonCerrar').click(function(){
				$('#modalDiseno').css({"opacity":"0","display":"none","top":"-25%"});$('#fondoModal').removeClass('in').addClass('fade')
			});
			
			$('#botonForm3').click(function()
			{
				$('#modalDesarrollo').css({"opacity":"100","display":"block","top":"10%"});$('#fondoModal').removeClass('hide').addClass('in')
			});
			$('.botonCerrar').click(function(){
				$('#modalDesarrollo').css({"opacity":"0","display":"none","top":"-25%"});$('#fondoModal').removeClass('in').addClass('fade')
			});
			
			$('#botonForm4').click(function()
			{
				$('#modalPruebas').css({"opacity":"100","display":"block","top":"10%"});$('#fondoModal').removeClass('hide').addClass('in')
			});
			$('.botonCerrar').click(function(){
				$('#modalPruebas').css({"opacity":"0","display":"none","top":"-25%"});$('#fondoModal').removeClass('in').addClass('fade')
			});
			
		});
	</script>
	 
</head>
<body>

				<!-- CABECERA -->
	<tiles:insertAttribute name="cabecera"/>
				
	<div class="container-fluid-full">
		<div class="row-fluid">

			<!-- MENU --><tiles:insertAttribute name="menu"/>	
			<div id="content" class="span10">
				<!-- CONTENIDO -->
				<tiles:insertAttribute name="contenido"/>
			</div>
				

		</div>	
	</div>
	
	
	
	<div class="clearfix"></div>
	<!-- PIE  -->
	<tiles:insertAttribute name="pie"/>

</body>

	<!-- start: JavaScript-->

		
		<script src="<s:url value='/js/jquery-migrate-1.0.0.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery-ui-1.10.0.custom.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.ui.touch-punch.js'/>"></script>
	
		<script src="<s:url value='/js/modernizr.js'/>"></script>
	
		<script src="<s:url value='/js/bootstrap.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.cookie.js'/>"></script>
	
		<script src="<s:url value='/js/fullcalendar.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.dataTables.min.js'/>"></script>

		<script src="<s:url value='/js/excanvas.js'/>"></script>
		<script src="<s:url value='/js/jquery.flot.js'/>"></script>
		<script src="<s:url value='/js/jquery.flot.pie.js'/>"></script>
		<script src="<s:url value='/js/jquery.flot.stack.js'/>"></script>
		<script src="<s:url value='/js/jquery.flot.resize.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.chosen.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.uniform.min.js'/>"></script>
		
		<script src="<s:url value='/js/jquery.cleditor.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.noty.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.elfinder.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.raty.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.iphone.toggle.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.uploadify-3.1.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.gritter.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.imagesloaded.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.masonry.min.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.knob.modified.js'/>"></script>
	
		<script src="<s:url value='/js/jquery.sparkline.min.js'/>"></script>
	
		<script src="<s:url value='/js/counter.js'/>"></script>
	
		<script src="<s:url value='/js/retina.js'/>"></script>

		<script src="<s:url value='/js/custom.js'/>"></script>
	<!-- end: JavaScript-->

</html>











