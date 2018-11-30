<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="java.util.List"%>
<%@page import="model.TipoDeVacina"%>
<%@page import="model.BasicModel"%>
<%@page import="control.TipoDeVacinaController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<%
		if (request.getParameter("nnovo") != null) {

	%>
	
	<h1>
		<span class="label label-success"> Tipo de vacina cadastrada com
			sucesso....</span>
	</h1>

	<%
		} else if (request.getParameter("nid") != null) {
	%>

	<h1>
		<span class="label label-success"> Tipo de vacina alterada com
			sucesso....</span>
	</h1>
	<%
		}
	%>



	<h1>
		<span class="label label-default"> Listagem de tipos de vacinas</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Descrição</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${TipoDeVacinaController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.descricao}</td>
				<td><a href="EditarTipoVacina.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarDeVacina&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheTipoVacina.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarTipoVacina.jsp" class="btn btn-lg btn-success">Cadastrar Novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>

<jsp:include page="button.jsp" />