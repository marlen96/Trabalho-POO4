<%@page import="java.text.DecimalFormat"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="dao.ProdutoServicoDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.ProdutoServico"%>
<%@page import="model.Tipo"%>
<%@page import="model.BasicModel"%>
<%@page import="control.TipoController"%>
<%@page import="control.ProdutoServicoController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String nome = request.getParameter("nnomeprod");
	    String marca =  request.getParameter("nmarca");
	    String lote = request.getParameter("nlote");
	    String tipo = request.getParameter("ncomboTipo");
	    
	    String id = request.getParameter("nid");
		if (nome != null) {
			Double precovenda = Double.parseDouble(request.getParameter("nprecovenda"));
		    Double precocompra = Double.parseDouble(request.getParameter("nprecocompra"));
			ProdutoServico produtoservico = new ProdutoServico();
			
	
			produtoservico.setNome(nome);
			produtoservico.setMarca(marca);
			produtoservico.setPrecoDeVenda(BigDecimal.valueOf(precovenda));
			produtoservico.setPrecoDeCompra(BigDecimal.valueOf(precocompra));
			produtoservico.setLote(lote);
			produtoservico.setTipo(TipoController.getInstance().buscarPoriD(Long.parseLong(tipo)));
			
					
			ProdutoServicoController.getInstance().persistir(produtoservico);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Produto ou Serviço cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Produtos e Serviços</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Tipo</th>
      <th scope="col">Produto</th>
      <th scope="col">Marca</th>
      <th scope="col">Preço de Venda</th>
      <th scope="col">Custo</th>
      <th scope="col">Lote</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${ProdutoServicoController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.tipo.descricao}</td>
				<td>${i.nome}</td>
				<td>${i.marca}</td>
				<td>${i.precoDeVenda}</td>
				<td>${i.precoDeCompra}</td>
				<td>${i.lote}</td>
				<td><a href="EditarProdutoServico.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarProdutoServico&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheProdutoServico.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarProdutoServico.jsp" class="btn btn-lg btn-warning">Criar Novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>