package test;

import org.junit.Before;

import model.Usuario;

public class UsuarioDAOTest extends BasicDAOTest {

	private Usuario usuario = new Usuario();
	
	@Before
	public void setUp() {
		usuario.setLogin("teste123");
		usuario.setSenha("teste123");
	}

	@Override
	public Object getObjectTest() {
		return usuario;
	}
	
	
}
