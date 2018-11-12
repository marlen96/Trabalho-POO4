package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Vacina;
import util.PersistenceUtil;

public class VacinaDAO extends BasicDAO<Object>{

	public VacinaDAO(Object objeto) {
		super(objeto);
	}
	
	private static VacinaDAO vacinaDAO;
	
	public static VacinaDAO getInstance() {
		if (vacinaDAO == null) vacinaDAO = new VacinaDAO(Vacina.class);
		return vacinaDAO;
	}
	

	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(v.id) from Vacina as v");
		
		return (Long) query.getSingleResult();
	}

}
