
<%@page import="dao.FornecedorDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Fornecedor"%>
<%@page import="model.BasicModel"%>
<%@page import="control.FornecedorController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String apelido = request.getParameter("napelido");
	    String cnpj =  request.getParameter("ncnpj");
	    String razaosocial =  request.getParameter("nrazaosocial");
	    String telefone =  request.getParameter("ntelefone");
	    String rua =  request.getParameter("nrua");
	    String numero =  request.getParameter("nnumero");
	    String bairro =  request.getParameter("nbairro");
	    String cidade =  request.getParameter("ncidade");
	    String cep =  request.getParameter("ncep");
	    String id = request.getParameter("nid");
	    
		if (apelido != null) {
			Fornecedor fornecedor = new Fornecedor();
		    
			fornecedor.setId(Long.parseLong(id));
			fornecedor.setNomeFantasia(apelido);
			fornecedor.setCnpj(cnpj);
			fornecedor.setRazaoSocial(razaosocial);
			fornecedor.setTelefone(telefone);		
			fornecedor.setRua(rua);
			fornecedor.setNumero(numero);
			fornecedor.setBairro(bairro);
			fornecedor.setCidade(cidade);
			fornecedor.setCep(cep);
			FornecedorController.getInstance().persistir(fornecedor);
	

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Fornecedor cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Fornecedor</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Apelido</th>
      <th scope="col">Cnpj</th>
      <th scope="col">Telefone</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${FornecedorController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.nomeFantasia}</td>
				<td>${i.cnpj}</td>
				<td>${i.telefone}</td>

				<td><a href="EditarFornecedor.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarFornecedor&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheFornecedor.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			<a href="cadastrarFornecedor.jsp" class="btn btn-lg btn-warning">Criar Novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>