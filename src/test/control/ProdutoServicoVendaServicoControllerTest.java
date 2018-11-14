package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.ProdutoServicoVendaServicoController;
import model.ProdutoServicoVendaServico;

public class ProdutoServicoVendaServicoControllerTest {
	
	private ProdutoServicoVendaServico produtoServicoVendaServico = new ProdutoServicoVendaServico();	
	
	@Before
	public void setUp() {
		produtoServicoVendaServico.setQuantidadeProduto(12);
		produtoServicoVendaServico.setValorProduto(BigDecimal.TEN);
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = ProdutoServicoVendaServicoController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			ProdutoServicoVendaServicoController.getInstance().persistir(produtoServicoVendaServico);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = ProdutoServicoVendaServicoController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = ProdutoServicoVendaServicoController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		ProdutoServicoVendaServico a = ProdutoServicoVendaServicoController.getInstance().buscarPoriD(ProdutoServicoVendaServicoController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = ProdutoServicoVendaServicoController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			ProdutoServicoVendaServicoController.getInstance().deletar(ProdutoServicoVendaServicoController.getInstance().buscarPoriD(ProdutoServicoVendaServicoController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
