package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.VendaServico;
import util.PersistenceUtil;

public class VendaServicoDAO extends BasicDAO<Object>{

	public VendaServicoDAO(Object objeto) {
		super(objeto);
	}

	private static VendaServicoDAO vendaServicoDAO;
	
	public static VendaServicoDAO getInstance() {
		if (vendaServicoDAO == null) vendaServicoDAO = new VendaServicoDAO(VendaServico.class);
		return vendaServicoDAO;
	}
	

	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(v.id) from VendaServico as v");
		
		return (Long) query.getSingleResult();
	}
}
