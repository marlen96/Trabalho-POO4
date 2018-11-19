<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="java.util.List"%>
<%@page import="model.TipoDeVacina"%>
<%@page import="model.BasicModel"%>
<%@page import="control.TipoDeVacinaController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String descricao = request.getParameter("ndescricao");
	    String id = request.getParameter("nid");
		if (descricao != null) {
			
			
			TipoDeVacina tipodevacina = new TipoDeVacina();
			tipodevacina.setId(Long.parseLong(id));
			tipodevacina.setDescricao(descricao);
		 
			TipoDeVacinaController.getInstance().persistir(tipodevacina);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Tipo da vacina alterada com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de tipos de vacinas</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Descrição</th>

    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${TipoDeVacinaController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.descricao}</td>
				<td><a href="EditarTipoVacina.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarTipoDeVacina&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheTipoVacina.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			 <a href="cadastrarTipoVacina.jsp" class="btn btn-lg btn-warning">Criar Novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>