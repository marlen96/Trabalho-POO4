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
			tipoconta.setId(Long.parseLong(id));
			tipoconta.setDescricao(descricao);
		 
			TipoDeContaController.getInstance().persistir(tipoconta);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Tipo de conta editado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Tipos de Conta </span>
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
				<td><a href="EditarTipoConta.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarTipoDeConta&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheTipoConta.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			<a href="CadastrarTipoConta.jsp" class="btn btn-lg btn-success">Cadastrar</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />