<%@page import="control.VacinaController"%>
<%@page import="control.FichaAnimalController"%>
<%@page import="control.TipoDeVacinaController"%>
<jsp:include page="layout.jsp" />
<jsp:useBean id="objVacina" class="model.Vacina" />
<jsp:useBean id="objTipoVacina" class="model.TipoDeVacina" />
<jsp:useBean id="controlVacina" class="control.VacinaController" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



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
		role="form" action="EditarVacinaSucesso.jsp">
		
		<input type="hidden" name="nid" value="<%=objVacina.getId()%>">
		
		<div class="form-group">
			<label for="marca" class="col-sm-3 control-label">Marca</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="marca" name="nmarca"
					placeholder="" required 
					value="<%=objVacina.getMarca()%>"/>
			</div>
		</div>
		
		
			<div class="form-group">
			<label for="lote" class="col-sm-3 control-label">Lote</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="lote"
					name="nlote" placeholder="" required 
					value="<%=objVacina.getLote()%>" />
			</div>
		</div>
		
			<div class="form-group">
			<label for="fornecedor" class="col-sm-3 control-label">Fornecedor</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" id="fornecedor"
					name="nfornecedor" placeholder="" required 
					value="<%=objVacina.getFornecedor()%>" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="custo" class="col-sm-3 control-label">Custo</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="custo" name="ncusto"
					placeholder="" required 
					value="<%=objVacina.getCusto()%>"/>
			</div>
		</div>
		
		
		<div class="form-group">
			<label for="datan" class="col-sm-3 control-label">Data de agendamento</label>

			<div class="col-sm-8">
				<input type="text" class="form-control" id="datan" name="ndatan"
					placeholder="" required 
					value="<%=VacinaController.getInstance().getdataCadastroFormatado(objVacina)%>"/>
			</div>
		</div>
		
		<div class="form-group">
			<label for="Ficha" class="col-sm-3 control-label">Ficha Animal</label>
			<div class="col-sm-5">
				<select name="ncomboFicha" id="comboFicha" class="form-control"
					class="form-control" required>
					<c:forEach var="i" items="${FichaAnimalController.getInstance().buscarTodos()}">
						<option value="${i.id}">${i.animal.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		
				<div class="form-group">
			<label for="tipov" class="col-sm-3 control-label">Tipo de Vacina</label>
			<div class="col-sm-5">
				<select name="ncombotipov" id="combotipov" class="form-control"
					class="form-control" required>
					  
					<c:forEach var="i" items="${TipoDeVacinaController.getInstance().buscarTodos()}">
						
						<option value="${i.id}">${i.descricao}</option>
					</c:forEach>
					   
				</select>
			</div>
		</div>
		

			
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-10">
				<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
				<a href="cadastrarVacinaSucesso.jsp" class="btn btn-lg btn-primary">Voltar</a>
			</div>
		</div>
	</form>
</div>
