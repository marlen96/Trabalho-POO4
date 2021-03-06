<%@page import="java.util.Date"%>
<%@page import="control.TipoDeContaController"%>
<%@page import="control.FornecedorController"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="dao.AnimalDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Animal"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="model.ContasAPagar"%>
<%@page import="java.util.Calendar" %>
<%@page import="model.BasicModel"%>
<%@page import="control.ContasAPagarController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
		<%
		if (request.getParameter("nnovo") != null) {

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Conta a pagar cadastrada com
			sucesso....</span>
	</h1>

	<%
		} else if (request.getParameter("nid") != null) {
	%>

	<h1>
		<span class="label label-success">  Conta a pagar alterada com
			sucesso....</span>
	</h1>
	<%
		}
	%>
	

	<h1>
		<span class="label label-default"> Listagem de Contas a Pagar</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome Fantasia</th>
       <th scope="col">Tipo</th>
       <th scope="col">Valor</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${ContasAPagarController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.fornecedor.nomeFantasia}</td>
				<td>${i.tipoDeConta.descricao}</td>
				<td>${i.valor}</td>
				<td><a href="EditarContasPagar.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarContasAPagar&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheContasPagar.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarContasPagar.jsp" class="btn btn-lg btn-success">Criar novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />