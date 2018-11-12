package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Tipo;
import util.PersistenceUtil;

public class TipoDAO extends BasicDAO<Object> {

	public TipoDAO(Object objeto) {
		super(objeto);
	}

	private static TipoDAO tipoDAO;
	
	public static TipoDAO getInstance() {
		if (tipoDAO == null) tipoDAO = new TipoDAO(Tipo.class);
		return tipoDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(t.id) from Tipo as t");
		
		return (Long) query.getSingleResult();
	}
}
