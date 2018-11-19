<%@page import="java.util.Date"%>
<%@page import="control.TipoDeVacinaController"%>
<%@page import="control.FichaAnimalController"%>

<%@page import="model.EstadoCivilEnum"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="dao.VacinaDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Vacina"%>
<%@page import="model.BasicModel"%>
<%@page import="control.VacinaController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String marca = request.getParameter("nmarca");
	    String lote =  request.getParameter("nlote");
	    String fornecedor =  request.getParameter("nfornecedor");
	    String data = request.getParameter("ndatan");
	    String ficha = request.getParameter("ncomboFicha");
	    String tipo = request.getParameter("ncombotipov");
	    
		if (marca != null) {
		Double custo = Double.parseDouble(request.getParameter("ncusto"));	
			
		Vacina vacina = new Vacina();	
			Date date = new Date(data);
			vacina.setValidade(date);
		    vacina.setMarca(marca);
		    vacina.setLote(lote);
		    vacina.setFornecedor(fornecedor);
		    vacina.setCusto(BigDecimal.valueOf(custo));
		    vacina.setFichaAnimal(FichaAnimalController.getInstance().buscarPoriD(Long.parseLong(ficha)));
			vacina.setTipoDeVacina(TipoDeVacinaController.getInstance().buscarPoriD(Long.parseLong(tipo)));
		  
			VacinaController.getInstance().persistir(vacina);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> vacina cadastada com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de Vacinas</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Pet</th>
      <th scope="col">Peso ou Porte antes do procedimento</th>
      <th scope="col">Descrição</th>
      <th scope="col">Marca</th>
      <th scope="col">Lote</th>
      <th scope="col">Fornecedor</th>
      <th scope="col">Custo</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${VacinaController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.fichaAnimal.animal.nome}</td>
				<td>${i.fichaAnimal.pesoOuPorteAntesDoProcedimento}</td>
				<td>${i.tipoDeVacina.descricao}</td>
				<td>${i.marca}</td>
				<td>${i.lote}</td>
				<td>${i.fornecedor}</td>
				<td>${i.custo}</td>
				<td><a href="EditarVacina.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarVacina&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheVacina.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
		    <a href="cadastrarVacina.jsp" class="btn btn-lg btn-warning">Criar Novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>