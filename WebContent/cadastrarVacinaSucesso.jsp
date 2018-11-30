<%@page import="java.util.Date"%>
<%@page import="control.TipoDeVacinaController"%>
<%@page import="control.FichaAnimalController"%>

<%@page import="model.EstadoCivilEnum"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="dao.VacinaDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Vacina"%>
<%@page import="model.BasicModel"%>
<%@page import="control.VacinaController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

	<%
		if (request.getParameter("nnovo") != null) {

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Vacina cadastrada com
			sucesso....</span>
	</h1>

	<%
		} else if (request.getParameter("nid") != null) {
	%>

	<h1>
		<span class="label label-success"> Vacina alterada com
			sucesso....</span>
	</h1>
	<%
		}
	%>
	
	
	<h1>
		<span class="label label-success"> vacina cadastada com
			sucesso....</span>
	</h1>

	

	<h1>
		<span class="label label-default"> Listagem de Vacinas</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Pet</th>
      <th scope="col">Peso ou Porte antes do procedimento</th>
      <th scope="col">Descrição</th>
      <th scope="col">Marca</th>
      <th scope="col">Lote</th>
      <th scope="col">Fornecedor</th>
      <th scope="col">Custo</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${VacinaController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.fichaAnimal.animal.nome}</td>
				<td>${i.fichaAnimal.pesoOuPorteAntesDoProcedimento}</td>
				<td>${i.tipoDeVacina.descricao}</td>
				<td>${i.marca}</td>
				<td>${i.lote}</td>
				<td>${i.fornecedor}</td>
				<td>${i.custo}</td>
				<td><a href="EditarVacina.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarVacina&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheVacina.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarVacina.jsp" class="btn btn-lg btn-success">Criar Novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>

<jsp:include page="button.jsp" />