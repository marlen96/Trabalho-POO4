<%@page import="control.AnamneseController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAnamnese" class="model.Anamnese" />
<jsp:useBean id="controlAnamnese" class="control.AnamneseController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objAnamnese = controlAnamnese.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de Anamnese</h1>
	
	<br />


		
		<input type="hidden" name="nid" value="<%=objAnamnese.getId()%>">
		
		<div class="form-group">
			<label for="diagnostico" class="col-sm-3 control-label">Diagnostico</label>
			<div class="col-sm-2">
				<input type="text" readonly class="form-control" id="diagnostico" name="ndiagnostico"
					placeholder="" required 
					value="<%=objAnamnese.getDiagnostico()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="anamnese" class="col-sm-3 control-label">Anamnese</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="anamnese"
					name="nanamnese" placeholder="" required 
					value="<%=objAnamnese.getAnamnese()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="medicamento" class="col-sm-3 control-label">Medicamentos</label>
			<div class="col-sm-3">
				<input type="text" readonly class="form-control" id="medicamento"
					name="nmedicamento" placeholder="" required 
					value="<%=objAnamnese.getMedicamentos()%>" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="procedimentosrealizados" class="col-sm-3 control-label">Procedimentos Realizados</label>

			<div class="col-sm-3">
				<input type="text" readonly class="form-control" id="procedimentosrealizados" name="nprocedimentosrealizados"
					placeholder="" required 
					value="<%=objAnamnese.getProcedimentosRealizados()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="nomeanimal" class="col-sm-3 control-label">Nome do animal</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="nomeanimal" name="nnomeanimal"
					placeholder="" required 
					value="<%=objAnamnese.getFichaAnimal().getAnimal().getNome()%>"/>
			</div>
		</div>
			
			
			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarAnamneseSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>

</div>
<jsp:include page="button.jsp" />
