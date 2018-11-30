<%@page import="control.FichaAnimalController"%>
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
	<h1>Detalhe de Ficha Animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objFichaAnimal.getId()%>">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome do Animal</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="nome" name="nnome"
					placeholder=""
					value="<%=objFichaAnimal.getAnimal().getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="raca" class="col-sm-3 control-label">Peso ou Porte Antes do Procedimento</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="raca"
					name="nraca" placeholder=""
					value="<%=objFichaAnimal.getPesoOuPorteAntesDoProcedimento()%>" />
			</div>
		</div>
	
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarFichaAnimalSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
