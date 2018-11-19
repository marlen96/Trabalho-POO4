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
		role="form" action="cadastrarProdutoServicoSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objProdutoServico.getId()%>">
		
		<div class="form-group">
			<label for="nomeprod" class="col-sm-3 control-label">Nome</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="nomeprod" name="nnomeprod"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="marca" class="col-sm-3 control-label">Marca</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="marca"
					name="nmarca" placeholder="" required 
					value="" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="precovenda" class="col-sm-3 control-label">Preço de venda</label>
			<div class="col-sm-8">
				<input type="number" class="form-control" id="precovenda"
					name="nprecovenda" placeholder="" required 
					value="" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="precocompra" class="col-sm-3 control-label">Preço de compra</label>

			<div class="col-sm-8">
				<input type="number" class="form-control" id="precocompra" name="nprecocompra"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="lote" class="col-sm-3 control-label">Lote</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="lote" name="nlote"
					placeholder="" required 
					value=""/>
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
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Cadastrar</button>
				<a href="cadastrarProdutoServicoSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
