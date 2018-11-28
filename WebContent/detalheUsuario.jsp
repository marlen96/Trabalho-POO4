<%@page import="control.ClienteController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objUsuario" class="model.Usuario" />
<jsp:useBean id="controlUsuario" class="control.UsuarioController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objUsuario = controlUsuario.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de Usuário</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objUsuario.getId()%>">
		
		<div class="form-group">
			<label for="login" class="col-sm-3 control-label">Login</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="login" name="nlogin"
					placeholder="" required 
					value="<%=objUsuario.getLogin()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="senha" class="col-sm-3 control-label">Senha</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="senha"
					name="nsenha" placeholder="" required 
					value="<%=objUsuario.getSenha()%>" />
			</div>
		</div>
		
			
			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarUsuarioSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />