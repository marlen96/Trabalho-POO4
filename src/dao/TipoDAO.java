package dao;

import model.Tipo;

public class TipoDAO extends BasicDAO<Object> {

	public TipoDAO(Object objeto) {
		super(objeto);
	}

	private static TipoDAO tipoDAO;
	
	public static TipoDAO getInstance() {
		if (tipoDAO == null) tipoDAO = new TipoDAO(Tipo.class);
		return tipoDAO;
	}
}
