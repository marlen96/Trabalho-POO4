<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="dao.AnimalDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Animal"%>
<%@page import="model.Cliente"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar" %>
<%@page import="model.BasicModel"%>
<%@page import="control.AnimalController"%>
<%@page import="control.ClienteController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String nome = request.getParameter("nnome");
	    String raca =  request.getParameter("nraca");
	    String peso =  request.getParameter("npeso");
	    String especie =  request.getParameter("nespecie");
	    String data = request.getParameter("ndatan");
	    String sexo =  request.getParameter("nsexo");
	    String cliente = request.getParameter("ncomboCliente");

	    
	    String id = request.getParameter("nid");
		if (nome != null) {
			
			
			
			Animal animal = new Animal();
			Date date = new Date(data);
			animal.setDataNascimento(date);
			animal.setNome(nome);
			animal.setRaca(raca);
			animal.setPesoOuPorte(peso);
			animal.setEspecie(especie);
			animal.setSexo(sexo);
		    animal.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
			AnimalController.getInstance().persistir(animal);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Animal cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default" align="center"> Listagem de Animal</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome</th>
      <th scope="col">Raça</th>
      <th scope="col">Especie</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${AnimalController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.nome}</td>
				<td>${i.raca}</td>
				<td>${i.especie}</td>
				<td><a href="EditarAnimal.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarAnimal&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheAnimal.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarAnimal.jsp" class="btn btn-lg btn-warning">Criar Novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>