<%@page import="control.TipoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objTipoConta" class="model.TipoDeConta" />
<jsp:useBean id="controlTipoConta" class="control.TipoDeContaController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objTipoConta = controlTipoConta.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Edição de Tipo de Conta</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="EditarTipoContaSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objTipoConta.getId()%>">
		
		<div class="form-group">
			<label for="descricaoconta" class="col-sm-3 control-label">Descrição da conta</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="descricaoconta" name="ndescricaoconta"
					placeholder="Descrição da conta" required 
					value="<%=objTipoConta.getDescricao()%>"/>
			</div>
		</div>
		
		
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarTipoContaSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />