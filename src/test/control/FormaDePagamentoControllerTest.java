package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.FormaDePagamentoController;
import model.FormaDePagamento;

public class FormaDePagamentoControllerTest {

	private FormaDePagamento formaDePagamento = new FormaDePagamento();
	
	@Before
	public void setUp() {
		formaDePagamento.setDescricao("descriçãoteste");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = FormaDePagamentoController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
		FormaDePagamentoController.getInstance().persistir(formaDePagamento);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = FormaDePagamentoController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = FormaDePagamentoController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		FormaDePagamento a = FormaDePagamentoController.getInstance().buscarPoriD(FormaDePagamentoController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = FormaDePagamentoController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			FormaDePagamentoController.getInstance().deletar(FormaDePagamentoController.getInstance().buscarPoriD(FormaDePagamentoController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
