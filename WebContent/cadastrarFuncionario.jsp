<%@page import="control.FuncionarioController"%>
<%@page import="control.UsuarioController"%>
<jsp:useBean id="objUsuario" class="model.Usuario" />
<jsp:include page="layout.jsp" />
<jsp:useBean id="objFun" class="model.Funcionario" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de Funcionario</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=cadastrarFuncionario">
		
		<input type="hidden" name="nnovo" value="">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>

			<div class="col-sm-6">
				<input type="text" class="form-control" id="nome" name="nnome"
					placeholder="Nome" required 
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
					name="nrg" placeholder="RG" required 
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
					placeholder="E-mail" required 
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
			<label for="numero" class="col-sm-3 control-label">N�mero</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="numero" name="nnumero"
					placeholder="N�mero" required 
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
			<label for="titulo" class="col-sm-3 control-label">T�tulo de eleitor</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="titulo" name="ntitulo"
					placeholder="T�tulo de Eleitor" required 
					value=""/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="pis" class="col-sm-3 control-label">Pis</label>

			<div class="col-sm-2">
				<input type="text" class="form-control" id="pis" name="npis"
					placeholder="Pis" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="funcao" class="col-sm-3 control-label">Fun��o</label>

			<div class="col-sm-5">
				<input type="text" class="form-control" id="funcao" name="nfuncao"
					placeholder="Fun��o" required 
					value=""/>
			</div>
		</div>
		
		
	    <div class="form-group ">
             
             <label for="estadocivil" class="col-md-1 control-label">Estado Civil</label>
             <div class="col-md-4">
         <select  class="form-control"  id="estadocivil" name="nestadocivil" data-placeholder="Selecione o estado civil">
         <option value="0">Solteiro</option>
         <option value="1">Casado</option>
         <option value="2">Vi�vo</option>
       </select>
   </div>
</div>


	<div class="form-group">
			<label for="usuario" class="col-sm-3 control-label">Login</label>
			<div class="col-sm-4">
				<select name="ncomboUsuario" id="comboUsuario" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${UsuarioController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.login}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
		
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-success">Cadastrar</button>
				<a href="cadastrarFuncionarioSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
