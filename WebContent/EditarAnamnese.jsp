<%@page import="control.AnamneseController"%>
<%@page import="control.FichaAnimalController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAnamnese" class="model.Anamnese" />
<jsp:useBean id="controlAnamnese" class="control.AnamneseController" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objAnamnese = controlAnamnese.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Altera��o de Anamnese</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="EditarAnamneseSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objAnamnese.getId()%>">
		
		<div class="form-group">
			<label for="diagnostico" class="col-sm-3 control-label">Diagnostico</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="diagnostico" name="ndiagnostico"
					placeholder="" required 
					value="<%=objAnamnese.getDiagnostico()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="anamnese" class="col-sm-3 control-label">Anamnese</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="anamnese"
					name="nanamnese" placeholder="" required 
					value="<%=objAnamnese.getAnamnese()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="medicamento" class="col-sm-3 control-label">Medicamentos</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="rg"
					name="nmedicamento" placeholder="Digite o medicamento aqui" required 
					value="<%=objAnamnese.getMedicamentos()%>" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="procedimentosrealizados" class="col-sm-3 control-label">Procedimentos Realizados</label>

			<div class="col-sm-3">
				<input type="text" class="form-control" id="procedimentosrealizados" name="nprocedimentosrealizados"
					placeholder="" required 
					value="<%=objAnamnese.getProcedimentosRealizados()%>"/>
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
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarAnamneseSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
