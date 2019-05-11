<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tarea Labo 4</title>
</head>
<body>

	<h1>${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="producto">
	
		<label>Ingrese el nombre del producto: </label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br><br>
		
		<label>Ingrese la marca del producto: </label>
		<form:input type="text" name="marca" path="marca"/>
		<form:errors path="marca" cssStyle="color:#E81505;"></form:errors><br><br>	
		
		<label>Ingrese la descripcion del producto </label>
		<form:textarea  type="text" name="descripcion" path="descripcion"/>
		<form:errors path="descripcion" cssStyle="color:#E81505;"></form:errors><br><br>	
		
		<label>Ingrese la categoria del producto: </label>
		<form:input type="text" name="categoria" path="categoria"/>
		<form:errors path="categoria" cssStyle="color:#E81505;"></form:errors><br><br>	
		
	    <label>Ingrese el precio del producto: </label>
		<form:input type="number" name="precio" path="precio"/>
		<form:errors path="precio" cssStyle="color:#E81505;"></form:errors><br><br>

	    <label>Ingrese la fecha de vencimiento del producto: </label>
		<form:input type="date" name="fechaDeVencimiento" path="fechaDeVencimiento"/>
		<form:errors path="fechaDeVencimiento" cssStyle="color:#E81505;"></form:errors><br><br>	
	
		<input type="submit" value="Agregar producto">
	</form:form>

</body>
</html>