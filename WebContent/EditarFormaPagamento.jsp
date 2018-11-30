<%@page import="control.FormaDePagamentoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objFormaPagamento" class="model.FormaDePagamento" />
<jsp:useBean id="controlFormaPagamento" class="control.FormaDePagamentoController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objFormaPagamento = controlFormaPagamento.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Alteração de Forma de Pagamento</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="./controller?acao=editarFormaPagamento">
		
		<input type="hidden" name="nid" value="<%=objFormaPagamento.getId()%>">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descrição da forma de pagamento</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="descricao" name="ndescricaopag"
					placeholder="Descrição da Forma de Pagamento" required 
					value="<%=objFormaPagamento.getDescricao()%>"/>
			</div>
		</div>
		
		
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarFormaPagamentoSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
