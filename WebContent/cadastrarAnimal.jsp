<%@page import="control.AnimalController"%>
<%@page import="control.ClienteController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAnimal" class="model.Animal" />
<jsp:useBean id="objCliente" class="model.Cliente" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarAnimal">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="nome" name="nnome"
					placeholder="Nome do Pet" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="raca" class="col-sm-3 control-label">Ra�a</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="raca"
					name="nraca" placeholder="Ra�a" required 
					value="" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="peso" class="col-sm-3 control-label">Peso ou Porte</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="peso"
					name="npeso" placeholder="Peso ou Porte" required 
					value="" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="telefone" class="col-sm-3 control-label">Esp�cie</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="especie" name="nespecie"
					placeholder="Esp�cie" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de nascimento</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="datan" name="ndatan"
					required pattern="[0-9]{2}/[0-9]{2}/[0-9]{4}" placeholder="DD/MM/AAAA"/>
			</div>
		</div>
		
	
		    <div class="form-group ">
             
             <label for="sexo" class="col-md-1 control-label">Sexo</label>
             <div class="col-md-5">
             <select  class="form-control"  id="sexo" name="nsexo" data-placeholder="Selecione o sexo">
         <option value="Macho">Macho</option>
         <option value="F�mea">F�mea</option>
       </select>
   </div>
</div>
		
			<div class="form-group">
			<label for="cliente" class="col-sm-3 control-label">Cliente</label>
			<div class="col-sm-4">
				<select name="ncomboCliente" id="comboCliente" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${ClienteController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
			
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarAnimalSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
