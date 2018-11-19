<%@page import="control.AnimalController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAnimal" class="model.Animal" />
<jsp:useBean id="controlAnimal" class="control.AnimalController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objAnimal = controlAnimal.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objAnimal.getId()%>">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="nome" name="nnome"
					placeholder="" required 
					value="<%=objAnimal.getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="raca" class="col-sm-3 control-label">Raça</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="raca"
					name="nraca" placeholder="" required 
					value="<%=objAnimal.getRaca()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="peso" class="col-sm-3 control-label">Peso ou porte</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="peso"
					name="npeso" placeholder="" required 
					value="<%=objAnimal.getPesoOuPorte()%>" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data nascimento</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="datan" name="ndatan"
					placeholder="" required 
					value="<%=AnimalController.getInstance().getdataCadastroFormatado(objAnimal)%>"/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="especie" class="col-sm-3 control-label">Espécie</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="especie" name="nespecie"
					placeholder="" required 
					value="<%=objAnimal.getEspecie()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="sexo" class="col-sm-3 control-label">Sexo</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="sexo" name="nsexo"
					placeholder="" required 
					value="<%=objAnimal.getSexo()%>"/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="sexo" class="col-sm-3 control-label">Cliente</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="sexo" name="nsexo"
					placeholder="" required 
					value="<%=objAnimal.getCliente().getNome()%>"/>
			</div>
		</div>
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarAnimalSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
