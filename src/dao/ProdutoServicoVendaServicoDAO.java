package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ProdutoServicoVendaServico;
import util.PersistenceUtil;

public class ProdutoServicoVendaServicoDAO extends BasicDAO<Object> {

	public ProdutoServicoVendaServicoDAO(Object objeto) {
		super(objeto);
	}

	private static ProdutoServicoVendaServicoDAO produtoServicoVendaServicoDAO;
	
	public static ProdutoServicoVendaServicoDAO getInstance() {
		if (produtoServicoVendaServicoDAO == null) produtoServicoVendaServicoDAO = new ProdutoServicoVendaServicoDAO(ProdutoServicoVendaServico.class);
		return produtoServicoVendaServicoDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(p.id) from ProdutoServicoVendaServico as p");
		
		return (Long) query.getSingleResult();
	}
}
