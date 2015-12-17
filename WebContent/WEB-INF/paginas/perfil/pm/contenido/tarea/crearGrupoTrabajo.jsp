<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


	<s:form action="crearGrupoTrabajo">
		<!-- tag -->
		<s:textfield label="codatarea" name="atarea.codestado" />
		<s:submit value="Grabar" />
	</s:form>

	<s:actionmessage />
