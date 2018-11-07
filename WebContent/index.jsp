<%@page import="dao.BasicDAO"%>
<%@page import="java.util.Calendar"%>
<%@page import="model.Animal"%>
<%@page import="dao.AnimalDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 		

			AnimalDAO.getInstance().buscarTodas();
			%>
</body>
</html>