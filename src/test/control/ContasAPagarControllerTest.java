package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.ContasAPagarController;
import model.ContasAPagar;

public class ContasAPagarControllerTest {

	private ContasAPagar contasAPagar = new ContasAPagar();
	
	@Before
	public void setUp() {
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		contasAPagar.setData(c);
		contasAPagar.setValor(BigDecimal.valueOf(10.00));
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = ContasAPagarController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			ContasAPagarController.getInstance().persistir(contasAPagar);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = ContasAPagarController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = ContasAPagarController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		ContasAPagar a = ContasAPagarController.getInstance().buscarPoriD(ContasAPagarController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = ContasAPagarController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			ContasAPagarController.getInstance().deletar(ContasAPagarController.getInstance().buscarPoriD(ContasAPagarController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
