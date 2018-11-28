<%@page import="control.UsuarioController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objUsuario" class="model.Usuario" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Usuário</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarUsuarioSucesso.jsp">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="login" class="col-sm-3 control-label">Login</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="login" name="nlogin"
					placeholder="Login" required 
					value=""/>
			</div>
		</div>
		
		
		
		<div class="form-group">
			<label for="senha" class="col-sm-3 control-label">Senha</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="senha" name="nsenha"
					placeholder="Senha" required 
					value=""/>
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarUsuarioSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />