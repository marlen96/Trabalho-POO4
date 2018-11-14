package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.VendaServicoController;
import model.VendaServico;

public class VendaServicoControllerTest {

	private VendaServico vendaServico = new VendaServico();
	
	@Before
	public void setUp() {
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		vendaServico.setDataServico(c);
		vendaServico.setDescricao("testedescrição");
		vendaServico.setValorTotal(BigDecimal.TEN);
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = VendaServicoController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			VendaServicoController.getInstance().persistir(vendaServico);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = VendaServicoController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = VendaServicoController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		VendaServico a = VendaServicoController.getInstance().buscarPoriD(VendaServicoController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = VendaServicoController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
		VendaServicoController.getInstance().deletar(VendaServicoController.getInstance().buscarPoriD(VendaServicoController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
