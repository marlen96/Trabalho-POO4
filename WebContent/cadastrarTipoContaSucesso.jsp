<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="java.util.List"%>
<%@page import="model.TipoDeConta"%>
<%@page import="model.BasicModel"%>
<%@page import="control.TipoDeContaController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String descricao = request.getParameter("ndescricaoconta");
	    String id = request.getParameter("nid");
		if (descricao != null) {
			
			
			TipoDeConta tipoconta = new TipoDeConta();
			tipoconta.setDescricao(descricao);
		 
			TipoDeContaController.getInstance().persistir(tipoconta);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Tipo de conta cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de tipos de conta </span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Descrição</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${TipoDeContaController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.descricao}</td>
				<td><a href="EditarTipoConta.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarDeConta&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheTipoConta.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="CadastrarTipoConta.jsp" class="btn btn-lg btn-warning">Cadastrar</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>