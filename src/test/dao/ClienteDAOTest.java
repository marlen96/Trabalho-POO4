package test.dao;

import org.junit.Before;

import model.Cliente;


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
	}

	@Override
	public Object getObjectTest() {
		return cliente;
	}

	
}
