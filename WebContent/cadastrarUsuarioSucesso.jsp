<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="java.util.List"%>
<%@page import="model.Usuario"%>
<%@page import="model.BasicModel"%>
<%@page import="control.UsuarioController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String login = request.getParameter("nlogin");
	    String senha = request.getParameter("nsenha");
	    String id = request.getParameter("nid");
		if (login != null) {
		
			
			
			Usuario usuario = new Usuario();
			usuario.setLogin(login);
			usuario.setSenha(senha);
		 
			UsuarioController.getInstance().persistir(usuario);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Usuário cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	
    <h1>
		<span class="label label-default"> Listagem de usuários </span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Login</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${UsuarioController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.login}</td>
				<td><a href="EditarUsuario.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarUsuario&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheUsuario.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>
    

	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarUsuario.jsp" class="btn btn-lg btn-success">Criar Novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
	</div>
	<jsp:include page="button.jsp" />
