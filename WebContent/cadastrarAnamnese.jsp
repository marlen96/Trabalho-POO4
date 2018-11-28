<%@page import="control.AnamneseController"%>
<%@page import="control.FichaAnimalController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAnamnese" class="model.Anamnese" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Anamnese</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarAnamnese">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="diagnostico" class="col-sm-3 control-label">Diagnostico</label>

			<div class="col-sm-15">
				<input type="text" class="form-control" id="diagnostico" name="ndiagnostico"
					placeholder="Diagnostico" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="anamnese" class="col-sm-3 control-label">Anamnese</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="anamnese"
					name="nanamnese" placeholder="Anamnese" required 
					value="" />
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cpf" class="col-sm-3 control-label">Medicamentos</label>
			<div class="col-sm-15">
				<input type="text" class="form-control" id="medicamentos"
					name="nmedicamentos" placeholder="Medicamentos" required 
					value="" />
			</div>
		</div>
		
		
		
		<div class="form-group">
			<label for="procedimentosrealizados" class="col-sm-3 control-label">Procedimentos Realizados</label>

			<div class="col-sm-15">
				<input type="text" class="form-control" id="procedimentosrealizados" name="nprocedimentosrealizados"
					placeholder="Procedimentos" required 
					value=""/>
			</div>
		</div>
		
	      
	      <div class="form-group">
			<label for="Ficha" class="col-sm-3 control-label">Ficha Animal</label>
			<div class="col-sm-5">
				<select name="ncomboFicha" id="comboFicha" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${FichaAnimalController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.animal.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
			
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarAnamneseSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />