<%@page import="control.FichaAnimalController"%>
<%@page import="control.AnimalController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objFichaAnimal" class="model.FichaAnimal" />
<jsp:useBean id="controlFichaAnimal" class="control.FichaAnimalController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objFichaAnimal = controlFichaAnimal.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Alteração de Ficha Animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=editarFichaAnimal">
		
		<input type="hidden" name="nid" value="<%=objFichaAnimal.getId()%>">
		
		
		<div class="form-group">
			<label for="animal" class="col-sm-3 control-label">Pet</label>
			<div class="col-sm-6">
				<select name="ncomboAnimal" id="comboAnimal" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${AnimalController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="pesoantes" class="col-sm-3 control-label">Peso ou Porte Antes do Procedimento</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="pesoantes"
					name="npesoantes" placeholder="Peso ou Porte Antes do Procedimento" required 
					value="<%=objFichaAnimal.getPesoOuPorteAntesDoProcedimento()%>" />
			</div>
		</div>
	
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarFichaAnimalSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
