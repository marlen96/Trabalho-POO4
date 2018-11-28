<%@page import="control.VendaServicoController"%>
<%@page import="control.ClienteController"%>
<%@page import="control.FuncionarioController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objVendaServ" class="model.VendaServico" />
<jsp:useBean id="objCliente" class="model.Cliente" />
<jsp:useBean id="objFuncionario" class="model.Funcionario" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Venda Serviço</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarVendaServicoSucesso.jsp">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descrição</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="descricao" name="ndescricao"
					placeholder="Descrição" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="vtotal" class="col-sm-3 control-label">Valor Total R$:</label>
			<div class="col-sm-8">
				<input type="number" class="form-control" id="vtotal"
					name="nvtotal" placeholder="Valor Total" required 
					value="" />
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cliente" class="col-sm-3 control-label">Cliente</label>
			<div class="col-sm-4">
				<select name="ncomboCliente" id="comboCliente" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${ClienteController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
			<div class="form-group">
			<label for="funcionario" class="col-sm-3 control-label">Funcionario</label>
			<div class="col-sm-4">
				<select name="ncomboFuncionario" id="comboFuncionario" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${FuncionarioController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data do Serviço</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="datan" name="ndatan"
					required pattern="[0-9]{2}/[0-9]{2}/[0-9]{4}" placeholder="DD/MM/AAAA"/>
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarVendaServicoSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
				
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
