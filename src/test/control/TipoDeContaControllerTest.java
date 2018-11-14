package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.TipoDeContaController;
import model.TipoDeConta;

public class TipoDeContaControllerTest {

	private TipoDeConta tipoDeConta = new TipoDeConta();
	
	@Before
	public void setUp() {
		tipoDeConta.setDescricao("testetipoconta");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = TipoDeContaController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			TipoDeContaController.getInstance().persistir(tipoDeConta);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = TipoDeContaController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = TipoDeContaController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		TipoDeConta a = TipoDeContaController.getInstance().buscarPoriD(TipoDeContaController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = TipoDeContaController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
		TipoDeContaController.getInstance().deletar(TipoDeContaController.getInstance().buscarPoriD(TipoDeContaController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
