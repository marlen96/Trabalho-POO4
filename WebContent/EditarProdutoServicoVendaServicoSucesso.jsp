<%@page import="control.VendaServicoController"%>
<%@page import="control.ProdutoServicoController"%>
<%@page import="model.ProdutoServico"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="dao.ProdutoServicoVendaServicoDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.ProdutoServicoVendaServico"%>
<%@page import="model.BasicModel"%>
<%@page import="control.ProdutoServicoVendaServicoController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		
	    String produtoservico = request.getParameter("ncomboProdServ");
	    String vendaservico = request.getParameter("ncomboVendaServ");
	    
	    String id = request.getParameter("nid");
		if (produtoservico != null) {
			int quantidade  = Integer.parseInt(request.getParameter("nquantidade"));
			Double vproduto = Double.parseDouble(request.getParameter("nvproduto"));
			ProdutoServicoVendaServico produtoservicovenda = new ProdutoServicoVendaServico();
			produtoservicovenda.setId(Long.parseLong(id));
			produtoservicovenda.setQuantidadeProduto(quantidade);
			produtoservicovenda.setValorProduto(BigDecimal.valueOf(vproduto));
			produtoservicovenda.setProdutoServico(ProdutoServicoController.getInstance().buscarPoriD(Long.parseLong(produtoservico)));
			produtoservicovenda.setVendaServico(VendaServicoController.getInstance().buscarPoriD(Long.parseLong(vendaservico)));
					
			ProdutoServicoVendaServicoController.getInstance().persistir(produtoservicovenda);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Produto Serviço Venda Produto cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de produtos serviços</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome do Produto Serviço</th>
      <th scope="col">Descrição da Venda Serviço</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${ProdutoServicoVendaServicoController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.produtoServico.nome}</td>
				<td>${i.vendaServico.descricao}</td>
				<td><a href="EditarProdutoServicoVendaServico.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarProdutoServicoVendaServico&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheProdutoServicoVendaServico.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			<a href="." class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />