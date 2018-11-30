<%@page import="control.UsuarioController"%>
<%@page import="model.EstadoCivilEnum"%>
<%@page import="dao.FuncionarioDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Funcionario"%>
<%@page import="model.BasicModel"%>
<%@page import="model.EstadoCivilEnum"%>
<%@page import="control.FuncionarioController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
<%
		if (request.getParameter("nnovo") != null) {

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Funcionario cadastrado com
			sucesso....</span>
	</h1>

	<%
		} else if (request.getParameter("nid") != null) {
	%>

	<h1>
		<span class="label label-success"> Funcionario alterado com
			sucesso....</span>
	</h1>
	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Funcionarios</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Login</th>
      <th scope="col">Nome</th>
      <th scope="col">Função</th>
      <th scope="col">Telefone</th>
      <th scope="col">E-Mail</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${FuncionarioController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.usuarios.login}</td>
				<td>${i.nome}</td>
                <td>${i.funcao}</td>
				<td>${i.telefone}</td>
				<td>${i.email}</td>
				<td><a href="EditarFuncionario.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarFuncionario&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheFuncionario.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarFuncionario.jsp" class="btn btn-lg btn-success">Criar Novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />