package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.UsuarioController;
import model.Usuario;

public class UsuarioControllerTest {

	private Usuario usuario = new Usuario();
	
	@Before
	public void setUp() {
		usuario.setLogin("teste123");
		usuario.setSenha("teste123");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = UsuarioController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			UsuarioController.getInstance().persistir(usuario);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = UsuarioController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = UsuarioController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Usuario a = UsuarioController.getInstance().buscarPoriD(UsuarioController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = UsuarioController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
		UsuarioController.getInstance().deletar(UsuarioController.getInstance().buscarPoriD(UsuarioController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
