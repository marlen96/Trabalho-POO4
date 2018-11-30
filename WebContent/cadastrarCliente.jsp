<%@page import="control.ClienteController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objCliente" class="model.Cliente" />





<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Cliente</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarCliente">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="nome" name="nnome"
					placeholder="Nome do Cliente" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cpf" class="col-sm-3 control-label">CPF</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="cpf"
					name="ncpf" placeholder="CPF" required 
					value="" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="rg" class="col-sm-3 control-label">RG</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="rg"
					name="nrg" placeholder="RG(Identidade)" required 
					value="" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="telefone" class="col-sm-3 control-label">Telefone</label>

			<div class="col-sm-3">
				<input type="text" class="form-control" id="telefone" name="ntelefone"
					placeholder="Telefone" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="email" class="col-sm-3 control-label">E-mail</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="email" name="nemail"
					placeholder="exemplo@email.com" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="rua" class="col-sm-3 control-label">Rua</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="rua" name="nrua"
					placeholder="Rua" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="numero" class="col-sm-3 control-label">Número</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="numero" name="nnumero"
					placeholder="Número" required 
					value=""/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="bairro" class="col-sm-3 control-label">Bairro</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="bairro" name="nbairro"
					placeholder="Bairro" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cidade" class="col-sm-3 control-label">Cidade</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="cidade" name="ncidade"
					placeholder="Cidade" required 
					value=""/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="cep" class="col-sm-3 control-label">Cep</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="cep" name="ncep"
					placeholder="Cep" required 
					value=""/>
			</div>
			</div>
			
			
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarClienteSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />