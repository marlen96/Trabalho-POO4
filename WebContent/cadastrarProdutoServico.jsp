<%@page import="control.ProdutoServicoController"%>
<%@page import="control.TipoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objProdutoServico" class="model.ProdutoServico"/>
<jsp:useBean id="objTipo" class="model.Tipo" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Produto ou Serviço</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarProdutoServico">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="nomeprod" class="col-sm-3 control-label">Nome</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="nomeprod" name="nnomeprod"
					placeholder="Nome do Serviço" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="marca" class="col-sm-3 control-label">Marca</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="marca"
					name="nmarca" placeholder="Marca" required 
					value="" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="precovenda" class="col-sm-3 control-label">Preço de venda</label>
			<div class="col-sm-2">
				<input type="number" class="form-control" id="precovenda"
					name="nprecovenda" placeholder="Preço de Venda" required 
					value="" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="precocompra" class="col-sm-3 control-label">Preço de compra</label>

			<div class="col-sm-2">
				<input type="number" class="form-control" id="precocompra" name="nprecocompra"
					placeholder="Preço de Compra" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="lote" class="col-sm-3 control-label">Lote</label>

			<div class="col-sm-4">
				<input type="text" class="form-control" id="lote" name="nlote"
					placeholder="Lote" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="tipo" class="col-sm-3 control-label">Tipo de Produto</label>
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
					required pattern="[0-9]{2}/[0-9]{2}/[0-9]{4}" placeholder="DD/MM/AAAA"/>
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarProdutoServicoSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />