<%@page import="control.AgendamentoConsultaController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAgendamento" class="model.AgendamentoConsulta" />
<jsp:useBean id="controlAgendamento" class="control.AgendamentoConsultaController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objAgendamento = controlAgendamento.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de Agendamento</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objAgendamento.getId()%>">
		
		<div class="form-group">
			<label for="marca" class="col-sm-3 control-label">Descrição</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="marca" name="nmarca"
					placeholder=""
					value="<%=objAgendamento.getDescricao()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="lote" class="col-sm-3 control-label">Status</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="lote"
					name="nlote" placeholder="" 
					value="<%=objAgendamento.getStatus()%>" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de agendamento</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="datan" name="ndatan"
					placeholder=""
					value="<%=AgendamentoConsultaController.getInstance().getdataCadastroFormatado(objAgendamento)%>"/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="vacina" class="col-sm-3 control-label">Cliente</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="vacina" name="nvacina"
					placeholder=""
					value="<%=objAgendamento.getCliente().getNome()%>"/>
			</div>
		</div>
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarAgendamentoConsultaSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
