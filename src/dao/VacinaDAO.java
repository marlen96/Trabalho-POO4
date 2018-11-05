package dao;

import model.Vacina;

public class VacinaDAO extends BasicDAO<Object>{

	public VacinaDAO(Object objeto) {
		super(objeto);
	}
	
	private static VacinaDAO vacinaDAO;
	
	public static VacinaDAO getInstance() {
		if (vacinaDAO == null) vacinaDAO = new VacinaDAO(Vacina.class);
		return vacinaDAO;
	}

}
