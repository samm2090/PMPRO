<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en" class=" js inlinesvg"><head>
	
	<!-- start: Meta -->
	<meta charset="utf-8">
	<title>Consulting Group</title>
	<meta name="description" content="Bootstrap Metro Dashboard">
	<meta name="author" content="Dennis Ji">
	<meta name="keyword" content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<!-- end: Meta -->
	
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->
	
	<!-- start: CSS -->
	<link id="bootstrap-style" href="<s:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
	<link href="<s:url value='/css/bootstrap-responsive.min.css'/>" rel="stylesheet">
	<link id="base-style" href="<s:url value='/css/style.css'/>" rel="stylesheet">
	<link id="base-style-responsive" href="<s:url value='/css/style-responsive.css'/>" rel="stylesheet">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&amp;subset=latin,cyrillic-ext,latin-ext" rel="stylesheet" type="text/css">
	<!-- end: CSS -->
	
		
	<!-- start: Favicon -->
	<link rel="shortcut icon" href="<s:url value='/img/favicon.ico'/>">
	<!-- end: Favicon -->
	
			<style type="text/css">
			body { background: url(<s:url value='/img/bg-login.jpg'/>) !important; }
		</style>
		
		
		
<style type="text/css">.jqstooltip { position: absolute;left: 0px;top: 0px;visibility: hidden;background: rgb(0, 0, 0) transparent;background-color: rgba(0,0,0,0.6);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000);-ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000)";color: white;font: 10px arial, san serif;text-align: left;white-space: nowrap;padding: 5px;border: 1px solid white;z-index: 10000;}.jqsfield { color: white;font: 10px arial, san serif;text-align: left;}</style></head>

<body>
		<div class="container-fluid-full">
		<div class="row-fluid">
					
			<div class="row-fluid">
				<div class="login-box">

					<h2>Ingresa a tu cuenta</h2>
					<form class="form-horizontal" action="<s:url action="iniciarSesion" namespace="/usuario"/>" method="post">
						<fieldset>
							
							<div class="input-prepend" title="Username">
								<span class="add-on"><i class="halflings-icon user"></i></span>
								<input class="input-large span10" name="usuario.user" id="username" type="text" placeholder="Nombre de usuario">
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="Password">
								<span class="add-on"><i class="halflings-icon lock"></i></span>
								<input class="input-large span10" name="usuario.password" id="password" type="password" placeholder="Contraseña">
							</div>
							<div class="clearfix"></div>
							
							<label class="remember" for="remember"><span><input type="checkbox" id="remember"></span>Recuerdame</label>

							<div class="button-login">	
								<button type="submit" class="btn btn-primary">Ingresar</button>
							</div>
							<div class="clearfix"></div>
					
					<hr>
					<h3>Olvidaste tu contraseña?</h3>
					<p>
						<a href="#">click aqui</a> para obtener una nueva.
					</p>	
				</fieldset></form></div><!--/span-->
			</div><!--/row-->
			

	</div><!--/.fluid-container-->
	
		</div><!--/fluid-row-->

	<!-- start: JavaScript-->

		<script src="<s:url value='/js/jquery-1.9.1.min.js'/>"></script>
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
	


</body></html>