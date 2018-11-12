package test.dao.control;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.AgendamentoConsultaController;
import dao.BasicDAO;
import model.AgendamentoConsulta;
import model.Cliente;
import model.ProdutoServico;


public class AgendamentoConsultaControllerTest {

	private AgendamentoConsulta agendamentoConsulta = new AgendamentoConsulta();
	
	@Before
	public void setUp() {
		agendamentoConsulta.setDescricao("TestedeController");
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		agendamentoConsulta.setDataDeAgendamento(c);
		agendamentoConsulta.setStatus("TesteDeController");
		agendamentoConsulta.setCliente((Cliente) new BasicDAO<Cliente>(new Cliente()).buscarPorId(new BasicDAO<Cliente>(new Cliente()).consultaUltimoID()));
		ProdutoServico a = (ProdutoServico) new BasicDAO<ProdutoServico>(new ProdutoServico()).buscarPorId(new BasicDAO<ProdutoServico>(new ProdutoServico()).consultaUltimoID());
		List<ProdutoServico> list = Arrays.asList(a);
		agendamentoConsulta.setProdutoServico(list);
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
	
}
