<%@page import="control.ProdutoServicoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objProdutoServico" class="model.ProdutoServico" />
<jsp:useBean id="controlProdutoServico" class="control.ProdutoServicoController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objProdutoServico = controlProdutoServico.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de Produtos ou Serviços</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="">
		
		<input type="hidden" name="nid" value="<%=objProdutoServico.getId()%>">
		
		<div class="form-group">
			<label for="nomeprod" class="col-sm-3 control-label">Nome</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="nomeprod" name="nnomeprod"
					placeholder="" required 
					value="<%=objProdutoServico.getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="marca" class="col-sm-3 control-label">Marca</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="marca"
					name="nmarca" placeholder="" required 
					value="<%=objProdutoServico.getMarca()%>" />
			</div>
		</div>
		
	
			<div class="form-group">
			<label for="precovenda" class="col-sm-3 control-label">Preço de Venda</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="precovenda" name="nprecovenda"
					placeholder="" required 
					value="<%=objProdutoServico.getPrecoDeVenda()%>"/>
			</div>
		</div>
		
		
		
		
		<div class="form-group">
			<label for="precocompra" class="col-sm-3 control-label">Preço de Compra</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="precocompra" name="nprecocompra"
					placeholder="" required 
						value="<%=objProdutoServico.getPrecoDeCompra()%>" />
			</div>
		</div>
		
		
				<div class="form-group">
			<label for="lote" class="col-sm-3 control-label">Lote</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="lote"
					name="nlote" placeholder="" required 
					value="<%=objProdutoServico.getLote()%>" />
			</div>
		</div>
		
		
	<div class="form-group">
			<label for="sexo" class="col-sm-3 control-label">Tipo</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="sexo" name="nsexo"
					placeholder="" required 
					value="<%=objProdutoServico.getTipo().getDescricao()%>"/>
			</div>
		</div>

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarProdutoServicoSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
