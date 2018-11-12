package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Anamnese;
import util.PersistenceUtil;

public class AnamneseDAO extends BasicDAO<Object> {

	public AnamneseDAO(Object objeto) {
		super(objeto);
	}

	private static AnamneseDAO anamneseDAO;
	
	public static AnamneseDAO getInstance() {
		if (anamneseDAO == null) anamneseDAO = new AnamneseDAO(Anamnese.class);
		return anamneseDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(a.id) from Anamnese as a");
		
		return (Long) query.getSingleResult();
	}
}
