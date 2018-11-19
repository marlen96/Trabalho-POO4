<%@page import="dao.ClienteDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Cliente"%>
<%@page import="model.BasicModel"%>
<%@page import="control.ClienteController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String nome = request.getParameter("nnome");
	    String cpf =  request.getParameter("ncpf");
	    String rg =  request.getParameter("nrg");
	    String telefone =  request.getParameter("ntelefone");
	    String email =  request.getParameter("nemail");
	    String rua =  request.getParameter("nrua");
	    String numero =  request.getParameter("nnumero");
	    String bairro =  request.getParameter("nbairro");
	    String cidade =  request.getParameter("ncidade");
	    String cep =  request.getParameter("ncep");
	    
	    String id = request.getParameter("nid");
		if (nome != null) {
			Cliente cliente = new Cliente();
		    
			cliente.setNome(nome);
			cliente.setCpf(cpf);
			cliente.setRg(rg);
			cliente.setTelefone(telefone);
			cliente.setEmail(email);
			cliente.setRua(rua);
			cliente.setNumero(numero);
			cliente.setBairro(bairro);
			cliente.setCidade(cidade);
			cliente.setCep(cep);

		
			ClienteController.getInstance().persistir(cliente);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Cliente cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de clientes</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome</th>
      <th scope="col">Telefone</th>
      <th scope="col">E-Mail</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${ClienteController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.nome}</td>
				<td>${i.telefone}</td>
				<td>${i.email}</td>
				<td><a href="EditarCliente.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarCliente&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheCliente.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarCliente.jsp" class="btn btn-lg btn-warning">Criar novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>