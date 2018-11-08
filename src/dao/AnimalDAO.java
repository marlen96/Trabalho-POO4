package dao;

import model.Animal;

public class AnimalDAO extends BasicDAO<Object> {

	public AnimalDAO(Object objeto) {
		super(objeto);
	}

	
	private static AnimalDAO animalDAO;
	
	public static AnimalDAO getInstance() {
		if (animalDAO == null) animalDAO = new AnimalDAO(Animal.class);
		return animalDAO;
	}
	

}
