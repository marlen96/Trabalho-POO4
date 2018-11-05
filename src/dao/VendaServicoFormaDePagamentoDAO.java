package dao;

import model.VendaServicoFormaDePagamento;

public class VendaServicoFormaDePagamentoDAO extends BasicDAO<Object> {

	public VendaServicoFormaDePagamentoDAO(Object objeto) {
		super(objeto);
	}
	
	private static VendaServicoFormaDePagamentoDAO vendaServicoFormaDePagamentoDAO;
	
	public static VendaServicoFormaDePagamentoDAO getInstance() {
		if (vendaServicoFormaDePagamentoDAO == null) vendaServicoFormaDePagamentoDAO = new VendaServicoFormaDePagamentoDAO(VendaServicoFormaDePagamento.class);
		return vendaServicoFormaDePagamentoDAO;
	}

}
