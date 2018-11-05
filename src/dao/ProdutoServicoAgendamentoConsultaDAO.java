package dao;

import model.ProdutoServicoAgendamentoConsulta;

public class ProdutoServicoAgendamentoConsultaDAO extends BasicDAO<Object> {

	public ProdutoServicoAgendamentoConsultaDAO(Object objeto) {
		super(objeto);
	}

	private static ProdutoServicoAgendamentoConsultaDAO produtoServicoAgendamentoConsultaDAO;
	
	public static ProdutoServicoAgendamentoConsultaDAO getInstance() {
		if (produtoServicoAgendamentoConsultaDAO == null) produtoServicoAgendamentoConsultaDAO = new ProdutoServicoAgendamentoConsultaDAO(ProdutoServicoAgendamentoConsulta.class);
		return produtoServicoAgendamentoConsultaDAO;
	}
}
