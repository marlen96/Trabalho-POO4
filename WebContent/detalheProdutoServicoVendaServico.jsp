<%@page import="control.ProdutoServicoVendaServicoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objProdutoServicoVenda" class="model.ProdutoServicoVendaServico" />
<jsp:useBean id="controlProdutoServicoVenda" class="control.ProdutoServicoVendaServicoController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objProdutoServicoVenda = controlProdutoServicoVenda.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="">
		
		<input type="hidden" name="nid" value="<%=objProdutoServicoVenda.getId()%>">
		
		<div class="form-group">
			<label for="quantidade" class="col-sm-3 control-label">Quantidade</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="nquantidade" name="nquantidade"
					placeholder="" required 
					value="<%=objProdutoServicoVenda.getQuantidadeProduto()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="valor" class="col-sm-3 control-label">Valor Produto</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="valor"
					name="nvalor" placeholder="" required 
					value="<%=objProdutoServicoVenda.getValorProduto()%>" />
			</div>
		</div>
		
	
			<div class="form-group">
			<label for="precovenda" class="col-sm-3 control-label">Produto Serviço</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="precovenda" name="nprecovenda"
					placeholder="" required 
					value="<%=objProdutoServicoVenda.getProdutoServico().getNome()%>"/>
			</div>
		</div>
		
		
		
		
		<div class="form-group">
			<label for="vendaprod" class="col-sm-3 control-label">Venda Produto</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="vendaprod" name="nvendaprod"
					placeholder="" required 
						value="<%=objProdutoServicoVenda.getVendaServico().getDescricao()%>" />
			</div>
		</div>
		
			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastar" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
