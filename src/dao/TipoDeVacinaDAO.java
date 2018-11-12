package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.TipoDeVacina;
import util.PersistenceUtil;

public class TipoDeVacinaDAO extends BasicDAO<Object> {

	public TipoDeVacinaDAO(Object objeto) {
		super(objeto);
		// TODO Auto-generated constructor stub
	}
	
	private static TipoDeVacinaDAO tipoDeVacinaDAO;
	
	public static TipoDeVacinaDAO getInstance() {
		if (tipoDeVacinaDAO == null) tipoDeVacinaDAO = new TipoDeVacinaDAO(TipoDeVacina.class);
		return tipoDeVacinaDAO;
	}
	

	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(t.id) from TipoDeVacina as t");
		
		return (Long) query.getSingleResult();
	}
}
