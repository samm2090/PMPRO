<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


	<s:form action="registrarTarea">
		<s:textfield label="Estado" name="atarea.codestado" />
		<s:textfield label="Fase" name="atarea.codpfase" />
		<s:textfield label="Area" name="atarea.codarea" />
	<!-- 	<input type="date" name="atarea.fechainiciopu"  id="a"/>
		<input type="date" name="atarea.fechafinpu"  id="a"/> -->
		
		<s:textfield label="Fecha inicio" name="atarea.fechainiciopu" />
		<s:textfield label="Fecha fin" name="atarea.fechafinpu" />
		<s:textfield label="Descripcion" name="atarea.des" />
		<s:submit value="Grabar" />
	</s:form>

	<s:actionmessage />
