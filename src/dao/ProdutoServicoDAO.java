package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ProdutoServico;
import util.PersistenceUtil;

public class ProdutoServicoDAO extends BasicDAO<Object> {

	public ProdutoServicoDAO(Object objeto) {
		super(objeto);
	}

	private static ProdutoServicoDAO produtoServicoDAO;
	
	public static ProdutoServicoDAO getInstance() {
		if (produtoServicoDAO == null) produtoServicoDAO = new ProdutoServicoDAO(ProdutoServico.class);
		return produtoServicoDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(p.id) from ProdutoServico as p");
		
		return (Long) query.getSingleResult();
	}
}
