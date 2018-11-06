package test;

import java.util.Calendar;

import org.junit.Before;

import model.AgendamentoConsulta;

public class AgendamentoConsultaDAOTest extends BasicDAOTest{

	private AgendamentoConsulta agendamentoConsulta = new AgendamentoConsulta();
	
	@Before
	public void setUp() {
		agendamentoConsulta.setDescricao("testedesc");
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		agendamentoConsulta.setDataDeAgendamento(c);
		agendamentoConsulta.setStatus("testestatus");
	}

	@Override
	public Object getObjectTest() {
		return agendamentoConsulta;
	}

	
}
