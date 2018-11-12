package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ContasAPagar;
import util.PersistenceUtil;

public class ContasAPagarDAO extends BasicDAO<Object>{

	public ContasAPagarDAO(Object objeto) {
		super(objeto);
	}

	private static ContasAPagarDAO contasAPagarDAO;
	
	public static ContasAPagarDAO getInstance() {
		if (contasAPagarDAO == null) contasAPagarDAO = new ContasAPagarDAO(ContasAPagar.class);
		return contasAPagarDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(c.id) from ContasAPagar as c");
		
		return (Long) query.getSingleResult();
	}
}
