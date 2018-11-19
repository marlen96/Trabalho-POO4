<%@page import="control.TipoDeVacinaController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objTipoVacina" class="model.TipoDeVacina" />
<jsp:useBean id="controlTipoVacina" class="control.TipoDeVacinaController" />



<%
  // Pega objetivo UF que veio da alteracao da Listagem de UF e transforma em um BEAN UF.
  if (request.getParameter("id") != null){
	  objTipoVacina = controlTipoVacina.buscarPoriD(Long.parseLong(request.getParameter("id")));
  }

%>


<div class="container" style="padding-top: 20px;">
	<h1>Detalhe de animal</h1>
	
	<br />

	<form class="form-horizontal" method="post" data-toggle="validator"
		role="form" action="cadastrarTipoVacinaSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objTipoVacina.getId()%>">
		
		<div class="form-group">
			<label for="descricao" class="col-sm-3 control-label">Descri��o da Vacina</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control" id="descricao" name="ndescricao"
					placeholder="" required 
					value="<%=objTipoVacina.getDescricao()%>"/>
			</div>
		</div>
		
		
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				
				<a href="cadastrarTipoVacinaSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
