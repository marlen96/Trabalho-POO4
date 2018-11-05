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
			Animal animalteste = new Animal();
			Calendar c = Calendar.getInstance();
			c.set(2012, 12, 1);
			animalteste.setNome("rubens");
			animalteste.setPesoOuPorte("medio");
			animalteste.setDataNascimento(c);
			animalteste.setEspecie("teste");
			animalteste.setRaca("teste2");
			
			new BasicDAO<Animal>(animalteste).remover();
			%>
</body>
</html>