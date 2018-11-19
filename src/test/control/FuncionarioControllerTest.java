package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.FuncionarioController;
import model.EstadoCivilEnum;
import model.Funcionario;

public class FuncionarioControllerTest {

	private Funcionario funcionario = new Funcionario();
	
	@Before
	public void setUp() {
		funcionario.setNome("TesteNome");
		funcionario.setBairro("testebairro");
		funcionario.setCep("35365970");
		funcionario.setCidade("testecidade");
		funcionario.setCpf("72765507023");
		funcionario.setEmail("testeemail@email.com");
		funcionario.setEstadoCivil(EstadoCivilEnum.Solteiro);
		funcionario.setFuncao("testefuncao");
		funcionario.setNumero("1356");
		funcionario.setPis("06353256730");
		funcionario.setRg("146161713");
		funcionario.setRua("ruateste");
		funcionario.setTelefone("3212312321");
		funcionario.setTituloDeEleitor("422873420108");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = FuncionarioController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			FuncionarioController.getInstance().persistir(funcionario);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void consultarTest() {
		List<Funcionario> a = FuncionarioController.getInstance().consultar("TesteNome");
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = FuncionarioController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = FuncionarioController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Funcionario a = FuncionarioController.getInstance().buscarPoriD(FuncionarioController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = FuncionarioController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			FuncionarioController.getInstance().deletar(FuncionarioController.getInstance().buscarPoriD(FuncionarioController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
