package dao;

import model.TipoDeConta;

public class TipoDeContaDAO extends BasicDAO<Object>{

	public TipoDeContaDAO(Object objeto) {
		super(objeto);
	}
	
	private static TipoDeContaDAO tipoDeContaDAO;
	
	public static TipoDeContaDAO getInstance() {
		if (tipoDeContaDAO == null) tipoDeContaDAO = new TipoDeContaDAO(TipoDeConta.class);
		return tipoDeContaDAO;
	}

}
