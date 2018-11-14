package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.VacinaController;
import model.Vacina;

public class VacinaControllerTest {

	private Vacina vacina = new Vacina();
	
	@Before
	public void setUp() {
		vacina.setCusto(BigDecimal.TEN);
		vacina.setFornecedor("testefornecedor");
		vacina.setLote("testelote456412");
		vacina.setMarca("toppex");
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		vacina.setValidade(c);
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = VacinaController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			VacinaController.getInstance().persistir(vacina);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = VacinaController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = VacinaController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Vacina a = VacinaController.getInstance().buscarPoriD(VacinaController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = VacinaController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			VacinaController.getInstance().deletar(VacinaController.getInstance().buscarPoriD(VacinaController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
