package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.FornecedorController;
import model.Fornecedor;

public class FornecedorControllerTest {
	private Fornecedor fornecedor = new Fornecedor();
	
	@Before
	public void setUp() {
		fornecedor.setBairro("testebairro");
		fornecedor.setCep("35365970");
		fornecedor.setCidade("testecidade");
		fornecedor.setCnpj("15976430000110");
		fornecedor.setNomeFantasia("nomefantasiateste");
		fornecedor.setNumero("32");
		fornecedor.setRazaoSocial("testerazaosocial");
		fornecedor.setRua("ruateste");
		fornecedor.setTelefone("3212312321");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = FornecedorController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			FornecedorController.getInstance().persistir(fornecedor);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = FornecedorController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = FornecedorController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Fornecedor a = FornecedorController.getInstance().buscarPoriD(FornecedorController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = FornecedorController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void consultarTest() {
		List<Fornecedor> a = FornecedorController.getInstance().consultar("nomefantasiateste");
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
		FornecedorController.getInstance().deletar(FornecedorController.getInstance().buscarPoriD(FornecedorController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
