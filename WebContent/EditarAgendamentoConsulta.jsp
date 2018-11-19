<%@page import="control.ClienteController"%>
<%@page import="control.AgendamentoConsultaController"%>
<jsp:include page="layout.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="objAgendamento" class="model.AgendamentoConsulta" />
<jsp:useBean id="controlAgendamento" class="control.AgendamentoConsultaController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objAgendamento = controlAgendamento.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Alteração de Agendamento</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="EditarAgendamentoConsultaSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objAgendamento.getId()%>">
		
		<div class="form-group">
            <label for="descricao" class="col-sm-3 control-label">Descrição</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="descricao" name="ndescricao"
                    placeholder="" required 
                    value="<%=objAgendamento.getDescricao()%>"/>
            </div>
        </div>


            <div class="form-group">
            <label for="status" class="col-sm-3 control-label">Status</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="status"
                    name="nstatus" placeholder="" required 
                    value="<%=objAgendamento.getStatus()%>" />
            </div>
        </div>
		
			<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de agendamento</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="datan" name="ndatan"
					placeholder="" required 
					value="<%=AgendamentoConsultaController.getInstance().getdataCadastroFormatado(objAgendamento)%>"/>
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
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarAgendamentoConsultaSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
