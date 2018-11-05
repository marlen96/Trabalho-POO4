package dao;

import model.ProdutoServico;

public class ProdutoServicoDAO extends BasicDAO<Object> {

	public ProdutoServicoDAO(Object objeto) {
		super(objeto);
	}

	private static ProdutoServicoDAO produtoServicoDAO;
	
	public static ProdutoServicoDAO getInstance() {
		if (produtoServicoDAO == null) produtoServicoDAO = new ProdutoServicoDAO(ProdutoServico.class);
		return produtoServicoDAO;
	}
}
