package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.FormaDePagamento;
import util.PersistenceUtil;

public class FormaDePagamentoDAO extends BasicDAO<Object> {

	public FormaDePagamentoDAO(Object objeto) {
		super(objeto);
	}
	
	private static FormaDePagamentoDAO formaDePagamentoDAO;
	
	public static FormaDePagamentoDAO getInstance() {
		if (formaDePagamentoDAO == null) formaDePagamentoDAO = new FormaDePagamentoDAO(FormaDePagamento.class);
		return formaDePagamentoDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(f.id) from FormaDePagamento as f");
		
		return (Long) query.getSingleResult();
	}
	
}
