package dao;

import model.AgendamentoConsulta;


public class AgendamentoConsultaDAO extends BasicDAO<Object>{

	public AgendamentoConsultaDAO(Object objeto) {
		super(objeto);
	}

	private static AgendamentoConsultaDAO agendamentoConsultaDAO;
	
	public static AgendamentoConsultaDAO getInstance() {
		if (agendamentoConsultaDAO == null) agendamentoConsultaDAO = new AgendamentoConsultaDAO(AgendamentoConsulta.class);
		return agendamentoConsultaDAO;
	}
	
	
}
