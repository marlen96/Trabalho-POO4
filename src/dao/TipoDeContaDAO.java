package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.TipoDeConta;
import util.PersistenceUtil;

public class TipoDeContaDAO extends BasicDAO<Object>{

	public TipoDeContaDAO(Object objeto) {
		super(objeto);
	}
	
	private static TipoDeContaDAO tipoDeContaDAO;
	
	public static TipoDeContaDAO getInstance() {
		if (tipoDeContaDAO == null) tipoDeContaDAO = new TipoDeContaDAO(TipoDeConta.class);
		return tipoDeContaDAO;
	}

	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(t.id) from TipoDeConta as t");
		
		return (Long) query.getSingleResult();
	}
}
