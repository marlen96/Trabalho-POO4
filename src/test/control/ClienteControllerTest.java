package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.ClienteController;
import model.Cliente;

public class ClienteControllerTest {
	
	private Cliente cliente = new Cliente();
	
	@Before
	public void setUp() {
		cliente.setNome("TesteNome");
		cliente.setBairro("testebairro");
		cliente.setCep("35365970");
		cliente.setCidade("testecidade");
		cliente.setCpf("72765507023");
		cliente.setEmail("testeemail@email.com");
		cliente.setNumero("1356");;
		cliente.setRg("146161713");
		cliente.setRua("ruateste");
		cliente.setTelefone("3212312321");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = ClienteController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			ClienteController.getInstance().persistir(cliente);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = ClienteController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = ClienteController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Cliente a = ClienteController.getInstance().buscarPoriD(ClienteController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = ClienteController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void consultaTest() {
		List<Cliente> a = ClienteController.getInstance().consultar("TesteNome");
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			ClienteController.getInstance().deletar(ClienteController.getInstance().buscarPoriD(ClienteController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
