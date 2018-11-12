package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.AgendamentoConsulta;
import util.PersistenceUtil;


public class AgendamentoConsultaDAO extends BasicDAO<Object>{

	public AgendamentoConsultaDAO(Object objeto) {
		super(objeto);
	}

	private static AgendamentoConsultaDAO agendamentoConsultaDAO;
	
	public static AgendamentoConsultaDAO getInstance() {
		if (agendamentoConsultaDAO == null) agendamentoConsultaDAO = new AgendamentoConsultaDAO(AgendamentoConsulta.class);
		return agendamentoConsultaDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(ac.id) from AgendamentoConsulta as ac");
		
		return (Long) query.getSingleResult();
	}
}
