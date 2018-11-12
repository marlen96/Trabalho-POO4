package test.dao;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.FuncionarioDAO;
import model.EstadoCivilEnum;
import model.Funcionario;
import model.Usuario;
import model.VendaServico;

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
		funcionario.setUsuarios((Usuario) new BasicDAO<Usuario>(new Usuario()).buscarPorId(new BasicDAO<Usuario>(new Usuario()).consultaUltimoID()));
		VendaServico c = (VendaServico) new BasicDAO<VendaServico>(new VendaServico()).buscarPorId(new BasicDAO<VendaServico>(new VendaServico()).consultaUltimoID());
		List<VendaServico> listc = Arrays.asList(c);
		funcionario.setVendasServicos(listc);
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = FuncionarioDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return funcionario;
	}

	
}
