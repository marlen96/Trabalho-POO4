package test;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Before;
import model.ProdutoServico;

public class ProdutoServicoDAOTest extends BasicDAOTest {

	private ProdutoServico produtoServico = new ProdutoServico();
	
	@Before
	public void setUp() {
		produtoServico.setLote("231231038sdsd");
		produtoServico.setMarca("topterp");
		produtoServico.setNome("topterm philipsbalita");
		produtoServico.setPrecoDeCompra(BigDecimal.valueOf(10.00));
		produtoServico.setPrecoDeVenda(BigDecimal.valueOf(12.00));
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		produtoServico.setValidade(c);
		
	}

	@Override
	public Object getObjectTest() {
		return produtoServico;
	}

	
	
}
