package dao;

import model.Anamnese;

public class AnamneseDAO extends BasicDAO<Object> {

	public AnamneseDAO(Object objeto) {
		super(objeto);
	}

	private static AnamneseDAO anamneseDAO;
	
	public static AnamneseDAO getInstance() {
		if (anamneseDAO == null) anamneseDAO = new AnamneseDAO(Anamnese.class);
		return anamneseDAO;
	}
}
