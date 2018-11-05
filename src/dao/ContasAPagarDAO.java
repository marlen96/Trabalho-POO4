package dao;

import model.ContasAPagar;

public class ContasAPagarDAO extends BasicDAO<Object>{

	public ContasAPagarDAO(Object objeto) {
		super(objeto);
	}

	private static ContasAPagarDAO contasAPagarDAO;
	
	public static ContasAPagarDAO getInstance() {
		if (contasAPagarDAO == null) contasAPagarDAO = new ContasAPagarDAO(ContasAPagar.class);
		return contasAPagarDAO;
	}
	
}
