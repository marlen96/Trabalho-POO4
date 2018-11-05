package dao;

import model.Fornecedor;

public class FornecedorDAO extends BasicDAO<Object>{

	public FornecedorDAO(Object objeto) {
		super(objeto);
	}
	
	private static FornecedorDAO fornecedorDAO;
	
	public static FornecedorDAO getInstance() {
		if (fornecedorDAO == null) fornecedorDAO = new FornecedorDAO(Fornecedor.class);
		return fornecedorDAO;
	}
	
	
}
