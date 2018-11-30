<%@page import="control.TipoDeVacinaController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objTipoVacina" class="model.TipoDeVacina" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Tipo de vacina</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarTVacina">
		
		<input type="hidden" name="nnovo" value="">
		
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descri��o</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="descricao" name="ndescricao"
					placeholder="Descri��o" required 
					value=""/>
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarTipoVacinaSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />