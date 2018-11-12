package test.dao;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.UsuarioDAO;
import model.Funcionario;
import model.Usuario;

public class UsuarioDAOTest extends BasicDAOTest {

	private Usuario usuario = new Usuario();
	
	@Before
	public void setUp() {
		usuario.setLogin("teste123");
		usuario.setSenha("teste123");
		Funcionario f = (Funcionario) new BasicDAO<Funcionario>(new Funcionario()).buscarPorId(new BasicDAO<Funcionario>(new Funcionario()).consultaUltimoID());
		List<Funcionario> lista = Arrays.asList(f);
		usuario.setFuncionarios(lista);
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = UsuarioDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return usuario;
	}
	
	
}
