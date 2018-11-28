<%@page import="control.TipoDeContaController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objTipoConta" class="model.TipoDeConta" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Tipo de Conta</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarTipoContaSucesso.jsp">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="descricaoconta" class="col-sm-3 control-label">Descrição</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="descricaoconta" name="ndescricaoconta"
					placeholder="Descrição" required 
					value=""/>
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarTipoContaSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
