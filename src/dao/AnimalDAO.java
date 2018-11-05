package dao;

import java.util.List;

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
	
	@SuppressWarnings("unchecked")
	public List<Animal> buscarPorCliente (String parametro) {
		EntityManager em = PersistenceUtil.getEntityManager();
		
		Query query = em.createQuery("FROM Animal AS a "
				+ " INNER JOIN a.Cliente as u  "
				+ " WHERE UPPER(u.sigla)=:parametro");
		
		
		query.setParameter("parametro", parametro.toUpperCase());

		return query.getResultList();
	}
	

}
