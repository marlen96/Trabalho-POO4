package dao;

import model.FormaDePagamento;

public class FormaDePagamentoDAO extends BasicDAO<Object> {

	public FormaDePagamentoDAO(Object objeto) {
		super(objeto);
	}
	
	private static FormaDePagamentoDAO formaDePagamentoDAO;
	
	public static FormaDePagamentoDAO getInstance() {
		if (formaDePagamentoDAO == null) formaDePagamentoDAO = new FormaDePagamentoDAO(FormaDePagamento.class);
		return formaDePagamentoDAO;
	}
	
}
