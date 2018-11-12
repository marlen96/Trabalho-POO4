package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Animal;
import util.PersistenceUtil;

public class AnimalDAO extends BasicDAO<Object> {

	public AnimalDAO(Object objeto) {
		super(objeto);
	}

	
	private static AnimalDAO animalDAO;
	
	public static AnimalDAO getInstance() {
		if (animalDAO == null) animalDAO = new AnimalDAO(Animal.class);
		return animalDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(a.id) from Animal as a");
		
		return (Long) query.getSingleResult();
	}

}
