<%@page import="control.FornecedorController"%>
<%@page import="control.ContasAPagarController"%>
<%@page import="control.TipoDeContaController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="controlConta" class="control.ContasAPagarController" />
<jsp:useBean id="objConta" class="model.ContasAPagar"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<%
  
  if (request.getParameter("id") != null){
	  objConta = controlConta.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>

<div class="container" style="padding-top: 20px;">
	<h1>Alteração de Contas a Pagar</h1>
	
	<br />

<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="EditarContasPagarSucesso.jsp">


		
		<input type="hidden" name="nid" value="<%=objConta.getId()%>">
		
		<div class="form-group">
			<label for="valor" class="col-sm-3 control-label">Valor</label>

			<div class="col-sm-15">
				<input type="number" class="form-control" id="valor" name="nvalor"
					placeholder="" required 
					value="<%=objConta.getValor()%>"/>
			</div>
		</div>
		
				    <div class="form-group">
			<label for="Forn" class="col-sm-3 control-label">Fornecedor</label>
			<div class="col-sm-5">
				<select name="ncomboForn" id="comboForn" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${FornecedorController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.nomeFantasia}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
	      
	      <div class="form-group">
			<label for="Tipo" class="col-sm-3 control-label">Tipo de Conta</label>
			<div class="col-sm-5">
				<select name="ncomboTipo" id="comboTipo" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${TipoDeContaController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.descricao}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
			<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de vencimento</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="datan" name="ndatan"
					placeholder="" required 
					value="<%=ContasAPagarController.getInstance().getdataCadastroFormatado(objConta)%>"/>
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
			    	<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarContasPagarSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
