<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.gerenciador.model.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty empresa }">
	Empresa <h4>${ empresa }</h4> Cadastrado com sucesso!
	</c:if>

	Lista de Empresa
	<br />

	<ul>
		<c:forEach items="${empresas}" var="empresa">

			<li>
				${empresa.nome }- <fmt:formatDate value="${empresa.data }" />
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id }">editar</a> | 
				<a href="/gerenciador/removeEmpresa?id=${empresa.id }">remover</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>