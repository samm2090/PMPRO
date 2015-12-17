<%@ taglib prefix="s" uri="/struts-tags" %>

<h3>Bienvenido Project Manager: </h3>

<s:property value="#session.usuario.getUser()"/>
<s:property value="#session.usuario.getPassword()"/><br/>

${sessionScope.usuario.getUser()}
${sessionScope.usuario.getPassword()}
${sessionScope.pm.getCodigo()}
${sessionScope.datosPersona.getNombre()}

