<%@page import="control.FormaDePagamentoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objFormaPagamento" class="model.FormaDePagamento" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Forma de Pagamento</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarFormaPagamento">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="descricaopag" class="col-sm-3 control-label">Descrição</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="descricaopag" name="ndescricaopag"
					placeholder="Descrição" required 
					value=""/>
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarFormaPagamentoSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
