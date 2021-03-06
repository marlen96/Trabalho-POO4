<%@page import="dao.ClienteDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Cliente"%>
<%@page import="model.BasicModel"%>
<%@page import="control.ClienteController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	
	<%
		if (request.getParameter("nnovo") != null) {

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Cliente cadastrado com
			sucesso....</span>
	</h1>

	<%
		} else if (request.getParameter("nid") != null) {
	%>

	<h1>
		<span class="label label-success"> Cliente alterado com
			sucesso....</span>
	</h1>
	<%
		}
	%>
	

	<h1>
		<span class="label label-default"> Listagem de clientes</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome</th>
      <th scope="col">Telefone</th>
      <th scope="col">E-Mail</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${ClienteController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.nome}</td>
				<td>${i.telefone}</td>
				<td>${i.email}</td>
				<td><a href="EditarCliente.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarCliente&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheCliente.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarCliente.jsp" class="btn btn-lg btn-success">Criar novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />