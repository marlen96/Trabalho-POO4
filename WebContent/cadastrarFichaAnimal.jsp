<%@page import="control.AnimalController"%>
<%@page import="control.FichaAnimalController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAnimal" class="model.Animal" />
<jsp:useBean id="objFicha" class="model.FichaAnimal" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Ficha Animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarFichaAnimal">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="pesoantes" class="col-sm-3 control-label">Peso ou Porte antes do procedimento</label>

			<div class="col-sm-3">
				<input type="text" class="form-control" id="pesoantes" name="npesoantes"
					placeholder="Peso ou Porte" required 
					value=""/>
			</div>
		</div>
		
		
			
		
			<div class="form-group">
			<label for="animal" class="col-sm-3 control-label">Animal</label>
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
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarFichaAnimalSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
