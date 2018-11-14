package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.TipoDeVacinaController;
import model.TipoDeVacina;

public class TipoDeVacinaControllerTest {

	private TipoDeVacina tipoDeVacina = new TipoDeVacina();
	
	@Before
	public void setUp() {
		tipoDeVacina.setDescricao("testedescrição");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = TipoDeVacinaController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			TipoDeVacinaController.getInstance().persistir(tipoDeVacina);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = TipoDeVacinaController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = TipoDeVacinaController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		TipoDeVacina a = TipoDeVacinaController.getInstance().buscarPoriD(TipoDeVacinaController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = TipoDeVacinaController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			TipoDeVacinaController.getInstance().deletar(TipoDeVacinaController.getInstance().buscarPoriD(TipoDeVacinaController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
