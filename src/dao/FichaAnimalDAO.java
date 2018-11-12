package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.FichaAnimal;
import util.PersistenceUtil;

public class FichaAnimalDAO extends BasicDAO<Object> {

	public FichaAnimalDAO(Object objeto) {
		super(objeto);
	}

	private static FichaAnimalDAO fichaAnimalDAO;
	
	public static FichaAnimalDAO getInstance() {
		if (fichaAnimalDAO == null) fichaAnimalDAO = new FichaAnimalDAO(FichaAnimal.class);
		return fichaAnimalDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(f.id) from FichaAnimal as f");
		
		return (Long) query.getSingleResult();
	}
}
