<%@page import="control.FuncionarioController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objFun" class="model.Funcionario" />
<jsp:useBean id="controlFun" class="control.FuncionarioController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objFun = controlFun.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de Funcionario</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objFun.getId()%>">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="nome" name="nnome"
					placeholder="" required 
					value="<%=objFun.getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cpf" class="col-sm-3 control-label">CPF</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="cpf"
					name="ncpf" placeholder="" required 
					value="<%=objFun.getCpf()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="rg" class="col-sm-3 control-label">RG</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control"  id="rg"
					name="nrg" placeholder="Digite o custo aqui" required 
					value="<%=objFun.getRg()%>" />
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="telefone" class="col-sm-3 control-label">Telefone</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="telefone" name="ntelefone"
					placeholder="" required 
					value="<%=objFun.getTelefone()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="email" class="col-sm-3 control-label">E-mail</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="email" name="nemail"
					placeholder="" required 
					value="<%=objFun.getEmail()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="sigla" class="col-sm-3 control-label">Rua</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="rua" name="nrua"
					placeholder="" required 
					value="<%=objFun.getRua()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="numero" class="col-sm-3 control-label">N�mero</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="numero" name="nnumero"
					placeholder="" required 
					value="<%=objFun.getNumero()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="bairro" class="col-sm-3 control-label">Bairro</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="bairro" name="nbairro"
					placeholder="" required 
					value="<%=objFun.getBairro()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cidade" class="col-sm-3 control-label">Cidade</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="cidade" name="ncidade"
					placeholder="" required 
					value="<%=objFun.getCidade()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="cep" class="col-sm-3 control-label">Cep</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="cep" name="ncep"
					placeholder="" required 
					value="<%=objFun.getCep()%>"/>
			</div>
			</div>
			
			
			<div class="form-group">
			<label for="titulo" class="col-sm-3 control-label">T�tulo de eleitor</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="titulo" name="ntitulo"
					placeholder="" required 
					value="<%=objFun.getTituloDeEleitor()%>"/>
			</div>
			</div>
			
			<div class="form-group">
			<label for="pis" class="col-sm-3 control-label">Pis</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="pis" name="npis"
					placeholder="" required 
					value="<%=objFun.getPis()%>"/>
			</div>
			</div>
			
				<div class="form-group">
			<label for="funcao" class="col-sm-3 control-label">Fun��o</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="funcao" name="nfuncao"
					placeholder="" required 
					value="<%=objFun.getFuncao()%>"/>
			</div>
			</div>


           	<div class="form-group">
			<label for="funcao" class="col-sm-3 control-label">Estado Civil</label>

			<div class="col-sm-5">
				<input type="text" readonly class="form-control" id="estadocivil" name="ncivil"
					placeholder="" required 
					value="<%=objFun.getEstadoCivil()%>"/>
			</div>
			</div>
			
			<div class="form-group">
			<label for="funcao" class="col-sm-3 control-label">Login</label>

			<div class="col-sm-5">
				<input type="text" readonly class="form-control" id="login" name="nlogin"
					placeholder="" required 
					value="<%=objFun.getUsuarios().getLogin()%>"/>
			</div>
			</div>


		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarFuncionarioSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
