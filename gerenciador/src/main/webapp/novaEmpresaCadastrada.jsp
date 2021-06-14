<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Empresa 
<% 
	String nomeEmpresa = (String) request.getAttribute("empresa");
	
%>
<h4><%= nomeEmpresa %></h4>
Cadastrado com sucesso!
</body>
</html>