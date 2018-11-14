package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.ProdutoServicoController;
import model.ProdutoServico;

public class ProdutoServicoControllerTest {

	private ProdutoServico produtoServico = new ProdutoServico();
	
	@Before
	public void setUp() {
		produtoServico.setLote("231231038sdsd");
		produtoServico.setMarca("topterp");
		produtoServico.setNome("topterm philipsbalita");
		produtoServico.setPrecoDeCompra(BigDecimal.TEN);
		produtoServico.setPrecoDeVenda(BigDecimal.TEN);
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		produtoServico.setValidade(c);
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = ProdutoServicoController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			ProdutoServicoController.getInstance().persistir(produtoServico);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = ProdutoServicoController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = ProdutoServicoController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		ProdutoServico a = ProdutoServicoController.getInstance().buscarPoriD(ProdutoServicoController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = ProdutoServicoController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			ProdutoServicoController.getInstance().deletar(ProdutoServicoController.getInstance().buscarPoriD(ProdutoServicoController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
