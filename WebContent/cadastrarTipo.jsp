<%@page import="control.TipoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objTipo" class="model.Tipo" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Tipo</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarTipoSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objTipo.getId()%>">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descrição</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="descricao" name="ndescricao"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Cadastrar</button>
				<a href="cadastrarTipoSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
