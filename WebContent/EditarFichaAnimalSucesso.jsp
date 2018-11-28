<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="dao.AnimalDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Animal"%>
<%@page import="model.FichaAnimal"%>
<%@page import="java.util.Calendar" %>
<%@page import="model.BasicModel"%>
<%@page import="control.AnimalController"%>
<%@page import="control.FichaAnimalController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String pesoantes = request.getParameter("npesoantes");

	    String animal = request.getParameter("ncomboAnimal");

	    String id = request.getParameter("nid");
		if (pesoantes != null) {
			
			
			
			FichaAnimal fichanimal = new FichaAnimal();
			fichanimal.setId(Long.parseLong(id));
			fichanimal.setPesoOuPorteAntesDoProcedimento(pesoantes);
		    fichanimal.setAnimal(AnimalController.getInstance().buscarPoriD(Long.parseLong(animal)));
			FichaAnimalController.getInstance().persistir(fichanimal);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Ficha Animal alterada com sucesso
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Fichas</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
      <tr>
      <th scope="col">Pet</th>
       <th scope="col">Peso ou Porte antes do Procedimento</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${FichaAnimalController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.animal.nome}</td>
				<td>${i.pesoOuPorteAntesDoProcedimento}</td>
				<td><a href="EditarFichaAnimal.jsp?id=${i.id}" class="btn btn-lg btn-primary">Alterar</a>
				<td><a href="./controller?acao=deletarFichaAnimal&id=${i.id}" class="btn btn-lg btn-danger">Deletar</a>
				<td><a href="detalheFichaAnimal.jsp?id=${i.id}" class="btn btn-lg btn-dark">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			<a href="cadastrarFichaAnimal.jsp" class="btn btn-lg btn-success">Criar novo</a>
			<a href="index.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>
<jsp:include page="button.jsp" />