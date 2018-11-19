<%@page import="control.VendaServicoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objVendaServico" class="model.VendaServico" />
<jsp:useBean id="controlVendaServico" class="control.VendaServicoController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objVendaServico = controlVendaServico.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de Venda Serviço</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objVendaServico.getId()%>">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descrição</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="descricao" name="ndescricao"
					placeholder="" required 
					value="<%=objVendaServico.getDescricao()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="vtotal" class="col-sm-3 control-label">Valor Total R$</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="vtotal"
					name="nvtotal" placeholder="" required 
					value="<%=objVendaServico.getValorTotal()%>" />
			</div>
		</div>
		
		
		
		<div class="form-group">
			<label for="cliente" class="col-sm-3 control-label">Cliente</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="sexo" name="nsexo"
					placeholder="" required 
					value="<%=objVendaServico.getCliente().getNome()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="funcionario" class="col-sm-3 control-label">Funcionario</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="sexo" name="nsexo"
					placeholder="" required 
					value="<%=objVendaServico.getFuncionario().getNome()%>"/>
			</div>
		</div>

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarVendaServicoSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
