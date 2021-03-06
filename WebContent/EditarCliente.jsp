<%@page import="control.ClienteController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objCliente" class="model.Cliente" />
<jsp:useBean id="controlCliente" class="control.ClienteController" />


<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objCliente = controlCliente.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Altera��o de Cliente</h1>
	
	<br />

		<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=editarCliente">
		
		<input type="hidden" name="nid" value="<%=objCliente.getId()%>">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="nome" name="nnome"
					placeholder="Nome" required 
					value="<%=objCliente.getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cpf" class="col-sm-3 control-label">CPF</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="cpf"
					name="ncpf" placeholder="CPF" required 
					value="<%=objCliente.getCpf()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="rg" class="col-sm-3 control-label">RG</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="rg"
					name="nrg" placeholder="Custo" required 
					value="<%=objCliente.getRg()%>" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="telefone" class="col-sm-3 control-label">Telefone</label>

			<div class="col-sm-3">
				<input type="text" class="form-control" id="telefone" name="ntelefone"
					placeholder="Telefone" required 
					value="<%=objCliente.getTelefone()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="email" class="col-sm-3 control-label">E-mail</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="email" name="nemail"
					placeholder="E-mail" required 
					value="<%=objCliente.getEmail()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="rua" class="col-sm-3 control-label">Rua</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="rua" name="nrua"
					placeholder="Rua" required 
					value="<%=objCliente.getRua()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="numero" class="col-sm-3 control-label">N�mero</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="numero" name="nnumero"
					placeholder="N�mero" required 
					value="<%=objCliente.getNumero()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="bairro" class="col-sm-3 control-label">Bairro</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="bairro" name="nbairro"
					placeholder="Bairro" required 
					value="<%=objCliente.getBairro()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cidade" class="col-sm-3 control-label">Cidade</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="cidade" name="ncidade"
					placeholder="Cidade" required 
					value="<%=objCliente.getCidade()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="cep" class="col-sm-3 control-label">Cep</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="cep" name="ncep"
					placeholder="Cep" required 
					value="<%=objCliente.getCep()%>"/>
			</div>
			</div>
			
			
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarClienteSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
