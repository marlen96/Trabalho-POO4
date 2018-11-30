<%@page import="control.TipoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objTipo" class="model.Tipo" />
<jsp:useBean id="controlTipo" class="control.TipoController" />



<%
 
  if (request.getParameter("id") != null){
	  objTipo = controlTipo.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarTipoSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objTipo.getId()%>">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descrição da Vacina</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="descricao" name="ndescricao"
					placeholder="" 
					value="<%=objTipo.getDescricao()%>"/>
			</div>
		</div>
		
		
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarTipoSucesso.jsp" class="btn btn-lg btn-warning">Voltar</a>
			</div>
		</div>
	</form>
</div>
<jsp:include page="button.jsp" />