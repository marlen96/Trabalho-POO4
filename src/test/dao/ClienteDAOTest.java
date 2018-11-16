package test.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.ClienteDAO;
import model.AgendamentoConsulta;
import model.Animal;
import model.Cliente;
import model.VendaServico;


public class ClienteDAOTest extends BasicDAOTest{

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
		Animal a = (Animal) new BasicDAO<Animal>(new Animal()).buscarPorId(new BasicDAO<Animal>(new Animal()).consultaUltimoID());
		List<Animal> lista = Arrays.asList(a);
		cliente.setAnimais(lista);
		AgendamentoConsulta b = (AgendamentoConsulta) new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).buscarPorId(new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).consultaUltimoID());
		List<AgendamentoConsulta> listb = Arrays.asList(b);
		cliente.setConsultas(listb);
		VendaServico c = (VendaServico) new BasicDAO<VendaServico>(new VendaServico()).buscarPorId(new BasicDAO<VendaServico>(new VendaServico()).consultaUltimoID());
		List<VendaServico> listc = Arrays.asList(c);
		cliente.setVendasServico(listc);
	} 
	

	@Test
	public void consultaTotalRegsTest() {
		Long a = ClienteDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Test
	public void pesquisarTest() {
		List<Cliente> a= ClienteDAO.getInstance().consultar("TesteNome");
		assertEquals(true, a != null);
	}
	
	@Override
	public Object getObjectTest() {
		return cliente;
	}

	
	
}
