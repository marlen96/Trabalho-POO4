<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="dao.AnamneseDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Anamnese"%>
<%@page import="model.FichaAnimal"%>
<%@page import="model.BasicModel"%>
<%@page import="control.AnamneseController"%>
<%@page import="control.FichaAnimalController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
	    String diagnostico = request.getParameter("ndiagnostico");
	    String anamnese =  request.getParameter("nanamnese");
	    String medicamentos =  request.getParameter("nmedicamentos");
	    String procedimentosRealizados =  request.getParameter("nprocedimentosrealizados");
        String fichaAnimal = request.getParameter("ncomboFicha");


	    
	    String id = request.getParameter("nid");
		if (diagnostico != null) {
			
			
			
			Anamnese anamneses = new Anamnese();
			anamneses.setDiagnostico(diagnostico);
			anamneses.setAnamnese(anamnese);
			anamneses.setMedicamentos(medicamentos);
			anamneses.setProcedimentosRealizados(procedimentosRealizados);
			anamneses.setFichaAnimal(FichaAnimalController.getInstance().buscarPoriD(Long.parseLong(fichaAnimal)));

			AnamneseController.getInstance().persistir(anamneses);
	

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> Anamnese cadastrado com
			sucesso....</span>
	</h1>

	<%
		} 
	%>

	<h1>
		<span class="label label-default"> Listagem de anamnese</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome</th>
      <th scope="col">Diagnóstico</th>
      <th scope="col">Anamnese</th>
      <th scope="col">Medicamentos</th>
      <th scope="col">Procedimentos Realizados</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${AnamneseController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.fichaAnimal.animal.nome}</td>
				<td>${i.diagnostico}</td>
				<td>${i.anamnese}</td>
				<td>${i.medicamentos}</td>
				<td>${i.procedimentosRealizados}</td>
				<td><a href="EditarAnamnese.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarAnamnese&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheAnamnese.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarAnamnese.jsp" class="btn btn-lg btn-warning">Criar novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>