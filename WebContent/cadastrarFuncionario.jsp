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
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objFun.getId()%>">
		
		<div class="form-group">
			<label for="nome" class="col-sm-3 control-label">Nome</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="nome" name="nnome"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cpf" class="col-sm-3 control-label">CPF</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="cpf"
					name="ncpf" placeholder="" required 
					value="" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="rg" class="col-sm-3 control-label">RG</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="rg"
					name="nrg" placeholder="" required 
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
			<label for="email" class="col-sm-3 control-label">E-mail</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="email" name="nemail"
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
			<label for="titulo" class="col-sm-3 control-label">Título de eleitor</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="titulo" name="ntitulo"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="pis" class="col-sm-3 control-label">Pis</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="pis" name="npis"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="funcao" class="col-sm-3 control-label">Função</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="funcao" name="nfuncao"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
	    <div class="form-group ">
             
             <label for="estadocivil" class="col-md-1 control-label">Estado Civil</label>
             <div class="col-md-5">
         <select  class="form-control"  id="estadocivil" name="nestadocivil" data-placeholder="Selecione o estado civil">
         <option value="0">Solteiro</option>
         <option value="1">Casado</option>
         <option value="2">Viúvo</option>
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
				<button type="submit" class="btn btn-lg btn-primary">Cadastrar</button>
				<a href="cadastrarFuncionarioSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
