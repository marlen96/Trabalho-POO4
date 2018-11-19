<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@page import="dao.AnimalDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="model.VendaServico"%>
<%@page import="model.Cliente"%>
<%@page import="model.Funcionario"%>
<%@page import="java.util.Calendar" %>
<%@page import="model.BasicModel"%>
<%@page import="control.ClienteController"%>
<%@page import="control.VendaServicoController"%>
<%@page import="control.FuncionarioController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="layout.jsp" />

<div class="container" style="padding-top: 20px;">
	<%
		String descricao = request.getParameter("ndescricao");
	
	    String cliente = request.getParameter("ncomboCliente");

	    String funcionario = request.getParameter("ncomboFuncionario");
	    
	    String id = request.getParameter("nid");
		if (descricao != null) {
			Double vtotal = Double.parseDouble(request.getParameter("nvtotal"));	
			
			
			VendaServico vendaservico = new VendaServico();
			vendaservico.setDescricao(descricao);
			vendaservico.setValorTotal(BigDecimal.valueOf(vtotal));
			vendaservico.setFuncionario(FuncionarioController.getInstance().buscarPoriD(Long.parseLong(funcionario)));
            vendaservico.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
			VendaServicoController.getInstance().persistir(vendaservico);

	%>
	
	
	
	
	<h1>
		<span class="label label-success"> venda serviço cadastrada com
			sucesso....</span>
	</h1>

	<%
		}
	%>

	<h1>
		<span class="label label-default"> Listagem de vendas de serviço</span>
	</h1>


	<!--  Listando todas as UF`s Cadatradas no sistemas com JavaBeans e TagLib-->
	<table class="table table-stripedk">
  <thead>
    <tr>
      <th scope="col">Nome do Cliente</th>
      <th scope="col">Nome do Funcionario</th>
      <th scope="col">Valor Total</th>
      <th scope="col">Descrição</th>
    </tr>
  </thead>
		<!-- percorre ufs montando as linhas da tabela utiliuzando tagLib e JavaBeans definida no inicio do arquivo -->
		<c:forEach var="i" items="${VendaServicoController.getInstance().buscarTodos()}">
			<tr>
				<td>${i.cliente.nome}</td>
				<td>${i.funcionario.nome}</td>
				<td>${i.valorTotal}</td>
				<td>${i.descricao}</td>

				<td><a href="EditarVendaServico.jsp?id=${i.id}" class="btn btn-lg btn-warning">Alterar</a>
				<td><a href="./controller?acao=deletarVendaServico&id=${i.id}" class="btn btn-lg btn-info">Deletar</a>
				<td><a href="detalheVendaServico.jsp?id=${i.id}" class="btn btn-lg btn-info">Detalhes</a>
				
			</tr>
		</c:forEach>
	</table>


	<div class="form-group">
		<div class="col-sm-offset-3 col-sm-10">
			<a href="cadastrarVendaServico.jsp" class="btn btn-lg btn-warning">Criar Novo</a>
			<a href="layout.jsp" class="btn btn-lg btn-warning">Voltar</a>
		</div>
	</div>
</div>