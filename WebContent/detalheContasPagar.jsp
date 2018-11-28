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
	<h1>Detalhe de Contas a Pagar</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="">
		
		<input type="hidden" name="nid" value="<%=objConta.getId()%>">
		
		<div class="form-group">
			<label for="valor" class="col-sm-3 control-label">Valor</label>

			<div class="col-sm-8">
				<input type="number" readonly  class="form-control" id="valor" name="nvalor"
					placeholder="" required 
					value="<%=objConta.getValor()%>"/>
			</div>
		</div>
		
			<div class="form-group">
			<label for="fornecedor" class="col-sm-3 control-label">Fornecedor</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="fornecedor"
					name="nfornecedor" placeholder="" required 
					value="<%=objConta.getFornecedor().getNomeFantasia()%>" />
			</div>
		</div>
		
	      
	      <div class="form-group">
			<label for="valor" class="col-sm-3 control-label">Tipo de Conta</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="valor" name="nvalor"
					placeholder="" required 
					value="<%=objConta.getTipoDeConta().getDescricao()%>"/>
			</div>
		</div>
		
			
		<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data do serviço</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="datan" name="ndatan"
					placeholder="" required 
					value="<%=ContasAPagarController.getInstance().getdataCadastroFormatado(objConta)%>"/>
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<a href="cadastrarContasPagarSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />