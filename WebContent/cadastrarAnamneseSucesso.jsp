<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="dao.AnamneseDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Anamnese"%>
<%@page import="model.FichaAnimal"%>
<%@page import="model.BasicModel"%>
<%@page import="control.AnamneseController"%>
<%@page import="control.FichaAnimalController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">

	<%
		if (request.getParameter("nnovo") != null) {

	%>
	
	<h1>
		<span class="label label-success"> Anamnese cadastrada com
			sucesso....</span>
	</h1>

	<%
		} else if (request.getParameter("nid") != null) {
	%>

	<h1>
		<span class="label label-success"> Anamnese alterada com
			sucesso....</span>
	</h1>
	<%
		}
	%>
	
	
	<h1>
		<span class="label label-default"> Listagem de anamnese</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome</th>
      <th scope="col">Diagn�stico</th>
      <th scope="col">Anamnese</th>
      <th scope="col">Medicamentos</th>
      <th scope="col">Procedimentos Realizados</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${AnamneseController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.fichaAnimal.animal.nome}</td>
				<td>${i.diagnostico}</td>
				<td>${i.anamnese}</td>
				<td>${i.medicamentos}</td>
				<td>${i.procedimentosRealizados}</td>
				<td><a href="EditarAnamnese.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarAnamnese&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheAnamnese.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarAnamnese.jsp" class="btn btn-lg btn-success">Criar novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />