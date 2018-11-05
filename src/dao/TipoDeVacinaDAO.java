package dao;

import model.TipoDeVacina;

public class TipoDeVacinaDAO extends BasicDAO<Object> {

	public TipoDeVacinaDAO(Object objeto) {
		super(objeto);
		// TODO Auto-generated constructor stub
	}
	
	private static TipoDeVacinaDAO tipoDeVacinaDAO;
	
	public static TipoDeVacinaDAO getInstance() {
		if (tipoDeVacinaDAO == null) tipoDeVacinaDAO = new TipoDeVacinaDAO(TipoDeVacina.class);
		return tipoDeVacinaDAO;
	}
	

}
