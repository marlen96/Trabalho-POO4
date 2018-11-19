<%@page import="model.EstadoCivilEnum"%>
<%@page import="dao.FuncionarioDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Funcionario"%>
<%@page import="model.BasicModel"%>
<%@page import="model.EstadoCivilEnum"%>
<%@page import="control.FuncionarioController"%>
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
	    String titulo =  request.getParameter("ntitulo");
	    String pis = request.getParameter("npis");
	    String funcao = request.getParameter("nfuncao");
	    String estadocivil = request.getParameter("nestadocivil");
	    String id = request.getParameter("nid");
	    
		if (nome != null) {
			Funcionario funcionario = new Funcionario();
		    
			funcionario.setId(Long.parseLong(id));
			funcionario.setNome(nome);
			funcionario.setCpf(cpf);
			funcionario.setRg(rg);
			funcionario.setTelefone(telefone);
			funcionario.setEmail(email);
			funcionario.setRua(rua);
			funcionario.setNumero(numero);
			funcionario.setBairro(bairro);
			funcionario.setCidade(cidade);
			funcionario.setCep(cep);
			funcionario.setTituloDeEleitor(titulo);
			funcionario.setPis(pis);
			funcionario.setFuncao(funcao);
		    funcionario.setEstadoCivil(EstadoCivilEnum.fromInt(Integer.parseInt(estadocivil)));
			FuncionarioController.getInstance().persistir(funcionario);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Funcionario cadastrado com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Funcionarios</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Login</th>
      <th scope="col">Nome</th>
      <th scope="col">Função</th>
      <th scope="col">Telefone</th>
      <th scope="col">E-Mail</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${FuncionarioController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.usuarios.login}</td>
				<td>${i.nome}</td>
                <td>${i.funcao}</td>
				<td>${i.telefone}</td>
				<td>${i.email}</td>
				<td><a href="EditarFuncionario.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarFuncionario&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheFuncionario.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			 <a href="cadastrarFuncionario.jsp" class="btn btn-lg btn-warning">Criar Novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>