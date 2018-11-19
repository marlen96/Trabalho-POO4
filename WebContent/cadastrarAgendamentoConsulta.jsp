<%@page import="control.AgendamentoConsultaController"%>
<%@page import="control.ClienteController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objAgendamento" class="model.AgendamentoConsulta" />
<jsp:useBean id="objCliente" class="model.Cliente" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>







<div class="container" style="padding-top: 20px;">
	<h1>Cadastro de agendamento de consulta</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarAgendamentoConsultaSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objAgendamento.getId()%>">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descrição</label>

			<div class="col-sm-10">
				<input type="text" class="form-control" id="descricao" name="ndescricao"
					placeholder="" required 
					value=""/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="status" class="col-sm-3 control-label">Status</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="status"
					name="nstatus" placeholder="" required 
					value="" />
			</div>
		</div>
		
				<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de Agendamento</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="datan" name="ndatan"
					required pattern="[0-9]{2}/[0-9]{2}/[0-9]{4}" placeholder="DD/MM/AAAA"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="cliente" class="col-sm-3 control-label">Cliente</label>
			<div class="col-sm-4">
				<select name="ncomboCliente" id="comboCliente" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${ClienteController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
			
		

		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Cadastrar</button>
				<a href="cadastrarAgendamentoConsultaSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
