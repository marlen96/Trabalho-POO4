<%@page import="control.FornecedorController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objForn" class="model.Fornecedor" />
<jsp:useBean id="controlForn" class="control.FornecedorController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objForn = controlForn.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de Fornecedor</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objForn.getId()%>">
		
		<div class="form-group">
			<label for="apelido" class="col-sm-3 control-label">Apelido</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="apelido" name="napelido"
					placeholder=""
					value="<%=objForn.getNomeFantasia()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cpf" class="col-sm-3 control-label">Cnpj</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="cnpj"
					name="ncnpj" placeholder=""
					value="<%=objForn.getCnpj()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="rg" class="col-sm-3 control-label">Razão Social</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="razaosocial"
					name="nrazaosocial" placeholder=""
					value="<%=objForn.getRazaoSocial()%>" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="telefone" class="col-sm-3 control-label">Telefone</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="telefone" name="ntelefone"
					placeholder="Digite o telefone aqui" 
					value="<%=objForn.getTelefone()%>"/>
			</div>
		</div>
		
		
		
		<div class="form-group">
			<label for="sigla" class="col-sm-3 control-label">Rua</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="rua" name="nrua"
					placeholder="Digite a rua aqui" 
					value="<%=objForn.getRua()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="numero" class="col-sm-3 control-label">Número</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="numero" name="nnumero"
					placeholder="Digite o número aqui" 
					value="<%=objForn.getNumero()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="bairro" class="col-sm-3 control-label">Bairro</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="bairro" name="nbairro"
					placeholder="Digite o bairro aqui" 
					value="<%=objForn.getBairro()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cidade" class="col-sm-3 control-label">Cidade</label>

			<div class="col-sm-8">
				<input type="text"  readonly class="form-control" id="cidade" name="ncidade"
					placeholder="Digite a cidade aqui" 
					value="<%=objForn.getCidade()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="cep" class="col-sm-3 control-label">Cep</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="cep" name="ncep"
					placeholder=""
					value="<%=objForn.getCep()%>"/>
			</div>
			</div>
			
			
			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarFornecedorSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
