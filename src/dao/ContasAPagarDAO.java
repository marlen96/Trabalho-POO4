package dao;

import java.util.List;

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
	
/*	@SuppressWarnings("unchecked")
	public List<ContasAPagar> consultar(String pesquisa) {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select a from ContasAPagar as a " 
									+ "where (upper(a.fornecedor) like :pesquisa) "
									+ "or (upper(a.data) like :pesquisa)");
		query.setParameter("pesquisa", '%' + pesquisa.toUpperCase() + '%');

		return query.getResultList();
	}*/
}
