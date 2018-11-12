package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Fornecedor;
import util.PersistenceUtil;

public class FornecedorDAO extends BasicDAO<Object>{

	public FornecedorDAO(Object objeto) {
		super(objeto);
	}
	
	private static FornecedorDAO fornecedorDAO;
	
	public static FornecedorDAO getInstance() {
		if (fornecedorDAO == null) fornecedorDAO = new FornecedorDAO(Fornecedor.class);
		return fornecedorDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(f.id) from Fornecedor as f");
		
		return (Long) query.getSingleResult();
	}
	
}
