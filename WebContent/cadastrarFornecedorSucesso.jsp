
<%@page import="dao.FornecedorDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Fornecedor"%>
<%@page import="model.BasicModel"%>
<%@page import="control.FornecedorController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />


	<%
		if (request.getParameter("nnovo") != null) {

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Fornecedor cadastrado com
			sucesso....</span>
	</h1>

	<%
		} else if (request.getParameter("nid") != null) {
	%>

	<h1>
		<span class="label label-success"> Fornecedor alterado com
			sucesso....</span>
	</h1>
	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Fornecedor</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Apelido</th>
      <th scope="col">Cnpj</th>
      <th scope="col">Telefone</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${FornecedorController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.nomeFantasia}</td>
				<td>${i.cnpj}</td>
				<td>${i.telefone}</td>

				<td><a href="EditarFornecedor.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarFornecedor&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheFornecedor.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarFornecedor.jsp" class="btn btn-lg btn-success">Criar Novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>

<jsp:include page="button.jsp" />