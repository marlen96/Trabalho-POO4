package test.dao;


import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.TipoDAO;
import model.ProdutoServico;
import model.Tipo;

public class TipoDAOTest extends BasicDAOTest{

	private Tipo tipo = new Tipo();
	
	@Before
	public void setUp() {
		tipo.setDescricao("testedescrição");
		ProdutoServico a = (ProdutoServico) new BasicDAO<ProdutoServico>(new ProdutoServico()).buscarPorId(new BasicDAO<ProdutoServico>(new ProdutoServico()).consultaUltimoID());
		List<ProdutoServico> lista = Arrays.asList(a);
		tipo.setProdutosServicos(lista);
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = TipoDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}

	@Override
	public Object getObjectTest() {
		return tipo;
	}

	
	
}
