package dao;

import model.VendaServico;

public class VendaServicoDAO extends BasicDAO<Object>{

	public VendaServicoDAO(Object objeto) {
		super(objeto);
	}

	private static VendaServicoDAO vendaServicoDAO;
	
	public static VendaServicoDAO getInstance() {
		if (vendaServicoDAO == null) vendaServicoDAO = new VendaServicoDAO(VendaServico.class);
		return vendaServicoDAO;
	}
}
