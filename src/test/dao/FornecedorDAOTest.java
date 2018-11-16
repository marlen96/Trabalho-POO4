package test.dao;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.FornecedorDAO;
import model.ContasAPagar;
import model.Fornecedor;
import model.ProdutoServico;

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
		ContasAPagar a = (ContasAPagar) new BasicDAO<ContasAPagar>(new ContasAPagar()).buscarPorId(new BasicDAO<ContasAPagar>(new ContasAPagar()).consultaUltimoID());
		List<ContasAPagar> lista = Arrays.asList(a);
		fornecedor.setContasAPagar(lista);
		ProdutoServico b = (ProdutoServico) new BasicDAO<ProdutoServico>(new ProdutoServico()).buscarPorId(new BasicDAO<ProdutoServico>(new ProdutoServico()).consultaUltimoID());
		List<ProdutoServico> listb = Arrays.asList(b);
		fornecedor.setProdutoServico(listb);

	}

	@Override
	public Object getObjectTest() {
		return fornecedor;
	}

	@Test
	public void pesquisarTest() {
		List<Fornecedor> a= FornecedorDAO.getInstance().consultar("nomefantasiateste");
		assertEquals(true, a != null);
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = FornecedorDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
}
