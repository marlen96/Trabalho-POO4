package dao;

import model.ProdutoServicoVendaServico;

public class ProdutoServicoVendaServicoDAO extends BasicDAO<Object> {

	public ProdutoServicoVendaServicoDAO(Object objeto) {
		super(objeto);
	}

	private static ProdutoServicoVendaServicoDAO produtoServicoVendaServicoDAO;
	
	public static ProdutoServicoVendaServicoDAO getInstance() {
		if (produtoServicoVendaServicoDAO == null) produtoServicoVendaServicoDAO = new ProdutoServicoVendaServicoDAO(ProdutoServicoVendaServico.class);
		return produtoServicoVendaServicoDAO;
	}
}
