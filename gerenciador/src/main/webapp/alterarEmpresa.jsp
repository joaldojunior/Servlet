<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:url value="alteraEmpresa" var="linkServletNovaEmpresa"/>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="${linkServletNovaEmpresa }" method="post">
	Nome: <input type="text" name="nome" value="${empresa.nome }">
	Data: <input type="text" name="data" value="<fmt:formatDate value="${empresa.data }" />">
		  <input type="hidden" name="id" value="${empresa.id }">
		  <input type="submit"> 
</form>
</body>
</html>