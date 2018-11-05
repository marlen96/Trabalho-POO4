package dao;

import model.FichaAnimal;

public class FichaAnimalDAO extends BasicDAO<Object> {

	public FichaAnimalDAO(Object objeto) {
		super(objeto);
	}

	private static FichaAnimalDAO fichaAnimalDAO;
	
	public static FichaAnimalDAO getInstance() {
		if (fichaAnimalDAO == null) fichaAnimalDAO = new FichaAnimalDAO(FichaAnimal.class);
		return fichaAnimalDAO;
	}
}
