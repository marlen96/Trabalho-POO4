<%@page import="control.VacinaController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objVacina" class="model.Vacina" />
<jsp:useBean id="controlVacina" class="control.VacinaController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objVacina = controlVacina.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarFuncionarioSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objVacina.getId()%>">
		
		<div class="form-group">
			<label for="marca" class="col-sm-3 control-label">Marca</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="marca" name="nmarca"
					placeholder=""
					value="<%=objVacina.getMarca()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="lote" class="col-sm-3 control-label">Lote</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="lote"
					name="nlote" placeholder=""
					value="<%=objVacina.getLote()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="fornecedor" class="col-sm-3 control-label">Fornecedor</label>
			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="fornecedor"
					name="nfornecedor" placeholder=""
					value="<%=objVacina.getFornecedor()%>" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="custo" class="col-sm-3 control-label">Custo</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="custo" name="ncusto"
					placeholder=""
					value="<%=objVacina.getCusto()%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de agendamento</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="datan" name="ndatan"
					placeholder="" 
					value="<%=VacinaController.getInstance().getdataCadastroFormatado(objVacina)%>"/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="ficha" class="col-sm-3 control-label">Pet</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="ficha" name="nficha"
					placeholder=""
					value="<%=objVacina.getFichaAnimal().getAnimal().getNome()%>"/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="vacina" class="col-sm-3 control-label">Tipo de Vacina</label>

			<div class="col-sm-8">
				<input type="text" readonly class="form-control" id="vacina" name="nvacina"
					placeholder=""
					value="<%=objVacina.getTipoDeVacina().getDescricao()%>"/>
			</div>
		</div>
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarVacinaSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />
