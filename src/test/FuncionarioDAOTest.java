package test;

import org.junit.Before;

import model.EstadoCivilEnum;
import model.Funcionario;

public class FuncionarioDAOTest extends BasicDAOTest {

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

	@Override
	public Object getObjectTest() {
		return funcionario;
	}

	
}
