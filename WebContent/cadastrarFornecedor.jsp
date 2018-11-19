<%@page import="control.FornecedorController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objForn" class="model.Fornecedor" />





<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Funcionario</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFornecedorSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objForn.getId()%>">
		
		<div class="form-group">
			<label for="apelido" class="col-sm-3 control-label">Apelido</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="apelido" name="napelido"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cnpj" class="col-sm-3 control-label">CNPJ</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="cnpj"
					name="ncnpj" placeholder="" required 
					value="" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="razaosocial" class="col-sm-3 control-label">Razão Social</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="razaosocial"
					name="nrazaosocial" placeholder="" required 
					value="" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="telefone" class="col-sm-3 control-label">Telefone</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="telefone" name="ntelefone"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="rua" class="col-sm-3 control-label">Rua</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="rua" name="nrua"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="numero" class="col-sm-3 control-label">Número</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="numero" name="nnumero"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="bairro" class="col-sm-3 control-label">Bairro</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="bairro" name="nbairro"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cidade" class="col-sm-3 control-label">Cidade</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="cidade" name="ncidade"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="cep" class="col-sm-3 control-label">Cep</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="cep" name="ncep"
					placeholder="" required 
					value=""/>
			</div>
			</div>
			
			
			
		
		
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Cadastrar</button>
				<a href="cadastrarFornecedorSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
