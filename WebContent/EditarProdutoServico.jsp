<%@page import="control.ProdutoServicoController"%>
<jsp:include page="layout.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="control.TipoController"%>
<jsp:useBean id="objProdutoServico" class="model.ProdutoServico" />
<jsp:useBean id="controlProdutoServico" class="control.ProdutoServicoController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objProdutoServico = controlProdutoServico.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Alteração de Produto ou Serviço</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=editarProdutoServico">
		
		<input type="hidden" name="nid" value="<%=objProdutoServico.getId()%>">
		
		<div class="form-group">
			<label for="nomeprod" class="col-sm-3 control-label">Nome</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="nomeprod" name="nnomeprod"
					placeholder="Nome" required 
					value="<%=objProdutoServico.getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="marca" class="col-sm-3 control-label">Marca</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="marca"
					name="nmarca" placeholder="Marca" required 
					value="<%=objProdutoServico.getMarca()%>" />
			</div>
		</div>
		
	
			<div class="form-group">
			<label for="precovenda" class="col-sm-3 control-label">Preço de Venda</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="precovenda" name="nprecovenda"
					placeholder="Preço de Venda" required 
					value="<%=objProdutoServico.getPrecoDeVenda()%>"/>
			</div>
		</div>
		
		
		
		
		<div class="form-group">
			<label for="precocompra" class="col-sm-3 control-label">Preço de Compra</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="precocompra" name="nprecocompra"
					placeholder="Preço de Compra" required 
						value="<%=objProdutoServico.getPrecoDeCompra()%>" />
			</div>
		</div>
		
		
				<div class="form-group">
			<label for="lote" class="col-sm-3 control-label">Lote</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="lote"
					name="nlote" placeholder="Lote" required 
					value="<%=objProdutoServico.getLote()%>" />
			</div>
		</div>
		
		
	<div class="form-group">
			<label for="tipo" class="col-sm-3 control-label">Tipo</label>
			<div class="col-sm-4">
				<select name="ncomboTipo" id="comboTipo" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${TipoController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.descricao}</option>
					</c:forEach>
				</select>
			</div>
		</div>

	<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de validade</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="datan" name="ndatan"
					placeholder="" required 
					value="<%=ProdutoServicoController.getInstance().getdataCadastroFormatado(objProdutoServico)%>"/>
			</div>
		</div>
			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarProdutoServicoSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />