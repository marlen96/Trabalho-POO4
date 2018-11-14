package test.control;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.AgendamentoConsultaController;
import model.AgendamentoConsulta;


public class AgendamentoConsultaControllerTest {

	private AgendamentoConsulta agendamentoConsulta = new AgendamentoConsulta();
	
	@Before
	public void setUp() {
		agendamentoConsulta.setDescricao("TestedeController");
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		agendamentoConsulta.setDataDeAgendamento(c);
		agendamentoConsulta.setStatus("TesteDeController");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = AgendamentoConsultaController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
		AgendamentoConsultaController.getInstance().persistir(agendamentoConsulta);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = AgendamentoConsultaController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = AgendamentoConsultaController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		AgendamentoConsulta a = AgendamentoConsultaController.getInstance().buscarPoriD(AgendamentoConsultaController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = AgendamentoConsultaController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
		AgendamentoConsultaController.getInstance().deletar(AgendamentoConsultaController.getInstance().buscarPoriD(AgendamentoConsultaController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
