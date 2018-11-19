<%@page import="control.TipoController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objTipo" class="model.Tipo" />
<jsp:useBean id="controlTipo" class="control.TipoController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objTipo = controlTipo.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Edição de Tipo</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="EditarTipoSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objTipo.getId()%>">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descrição da Vacina</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="descricao" name="ndescricao"
					placeholder="" required 
					value="<%=objTipo.getDescricao()%>"/>
			</div>
		</div>
		
		
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarTipo.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
