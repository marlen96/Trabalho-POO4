package dao;

import model.FornecedorProdutoServico;

public class FornecedorProdutoServicoDAO extends BasicDAO<Object> {

	public FornecedorProdutoServicoDAO(Object objeto) {
		super(objeto);
	}
	
	private static FornecedorProdutoServicoDAO fornecedorProdutoServicoDAO;
	
	public static FornecedorProdutoServicoDAO getInstance() {
		if (fornecedorProdutoServicoDAO == null) fornecedorProdutoServicoDAO = new FornecedorProdutoServicoDAO(FornecedorProdutoServico.class);
		return fornecedorProdutoServicoDAO;
	}

}
