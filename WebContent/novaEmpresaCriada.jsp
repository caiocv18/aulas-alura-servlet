<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

	<%
		//scriplet
		String nomeEmpresa = (String)request.getAttribute("empresa");
		System.out.println(nomeEmpresa);
	%>

<body>
    
    Empresa <%= nomeEmpresa%> cadastrada com sucesso!

</body>
</html>