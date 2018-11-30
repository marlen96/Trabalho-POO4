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
	<h1>Detalhe de Cliente</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objCliente.getId()%>">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="nome" name="nnome"
					placeholder="Digite a marca aqui"
					value="<%=objCliente.getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cpf" class="col-sm-3 control-label">CPF</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="cpf"
					name="ncpf" placeholder="Digite o CPF aqui"
					value="<%=objCliente.getCpf()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="rg" class="col-sm-3 control-label">RG</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="rg"
					name="nrg" placeholder="Digite o custo aqui"
					value="<%=objCliente.getRg()%>" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="telefone" class="col-sm-3 control-label">Telefone</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="telefone" name="ntelefone"
					placeholder="Digite o telefone aqui"
					value="<%=objCliente.getTelefone()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="email" class="col-sm-3 control-label">E-mail</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="email" name="nemail"
					placeholder="Digite o e-mail aqui" 
					value="<%=objCliente.getEmail()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="sigla" class="col-sm-3 control-label">Rua</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="rua" name="nrua"
					placeholder="Digite a rua aqui"
					value="<%=objCliente.getRua()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="numero" class="col-sm-3 control-label">Número</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="numero" name="nnumero"
					placeholder="Digite o número aqui"
					value="<%=objCliente.getNumero()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="bairro" class="col-sm-3 control-label">Bairro</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="bairro" name="nbairro"
					placeholder="Digite o bairro aqui" 
					value="<%=objCliente.getBairro()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cidade" class="col-sm-3 control-label">Cidade</label>

			<div class="col-sm-8">
				<input type="text"  readonly class="form-control" id="cidade" name="ncidade"
					placeholder="Digite a cidade aqui"
					value="<%=objCliente.getCidade()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="cep" class="col-sm-3 control-label">Cep</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="cep" name="ncep"
					placeholder=""
					value="<%=objCliente.getCep()%>"/>
			</div>
			</div>
			
			
			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarClienteSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
