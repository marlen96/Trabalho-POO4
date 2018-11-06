package test;



import org.junit.Before;


import model.Fornecedor;

public class FornecedorDAOTest extends BasicDAOTest {

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

	@Override
	public Object getObjectTest() {
		return fornecedor;
	}

	
}
