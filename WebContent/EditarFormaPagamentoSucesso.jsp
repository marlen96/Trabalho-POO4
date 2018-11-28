<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="java.util.List"%>
<%@page import="model.FormaDePagamento"%>
<%@page import="model.BasicModel"%>
<%@page import="control.FormaDePagamentoController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String descricao = request.getParameter("ndescricaopag");
	    String id = request.getParameter("nid");
		if (descricao != null) {
			
			
			FormaDePagamento formapagamento = new FormaDePagamento();
			formapagamento.setId(Long.parseLong(id));
			formapagamento.setDescricao(descricao);
		 
			FormaDePagamentoController.getInstance().persistir(formapagamento);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Forma de Pagamento cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de forma de pagamentos </span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
       <tr>
      <th scope="col">Forma de Pagamento</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${FormaDePagamentoController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.descricao}</td>
				<td><a href="EditarFormaPagamento.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarFormaDePagamento&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheFormaPagamento.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			<a href="CadastrarFormaPagamento.jsp" class="btn btn-lg btn-success">Criar Novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />