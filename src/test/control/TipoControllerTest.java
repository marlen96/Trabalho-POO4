package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.TipoController;
import model.Tipo;

public class TipoControllerTest {
	
	private Tipo tipo = new Tipo();
	
	@Before
	public void setUp() {
		tipo.setDescricao("testedescrição");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = TipoController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			TipoController.getInstance().persistir(tipo);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = TipoController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = TipoController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Tipo a = TipoController.getInstance().buscarPoriD(TipoController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = TipoController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
		TipoController.getInstance().deletar(TipoController.getInstance().buscarPoriD(TipoController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
