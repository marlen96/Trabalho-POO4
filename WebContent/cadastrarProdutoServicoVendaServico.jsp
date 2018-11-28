<%@page import="control.VendaServicoController"%>
<%@page import="control.ProdutoServicoController"%>
<%@page import="control.ProdutoServicoVendaServicoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objProdutoServicoVenda" class="model.ProdutoServicoVendaServico" />
<jsp:useBean id="objProdutoServico" class="model.ProdutoServico" />
<jsp:useBean id="objVendaServico" class="model.VendaServico" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Venda Serviço</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarProdutoServicoVendaServicoSucesso.jsp">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="quantidade" class="col-sm-3 control-label">Quantidade</label>

			<div class="col-sm-10">
				<input type="number" class="form-control" id="quantidade" name="nquantidade"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="vproduto" class="col-sm-3 control-label">Valor Produto R$:</label>
			<div class="col-sm-8">
				<input type="number" class="form-control" id="vproduto"
					name="nvproduto" placeholder="" required 
					value="" />
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="prodserv" class="col-sm-3 control-label">Produto Serviço</label>
			<div class="col-sm-4">
				<select name="ncomboProdServ" id="comboProdServ" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${ProdutoServicoController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
			<div class="form-group">
			<label for="venda" class="col-sm-3 control-label">Venda Serviço</label>
			<div class="col-sm-4">
				<select name="ncomboVendaServ" id="comboVendaServ" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${VendaServicoController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.descricao}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
		
			
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Cadastrar</button>
				<a href="." class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
