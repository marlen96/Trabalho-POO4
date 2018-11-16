package dao;

import java.util.List;

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
	
	@SuppressWarnings("unchecked")
	public List<Fornecedor> consultar(String pesquisa) {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select a from Fornecedor as a " 
									+ "where (upper(a.nomeFantasia) like :pesquisa) "
									+ "or (upper(a.cnpj) like :pesquisa) " 
									+ "or (upper(a.razaoSocial) like :pesquisa)");
		query.setParameter("pesquisa", '%' + pesquisa.toUpperCase() + '%');

		return query.getResultList();
	}
	
}
