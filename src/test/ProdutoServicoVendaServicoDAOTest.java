package test;


import java.math.BigDecimal;

import org.junit.Before;


import model.ProdutoServicoVendaServico;

public class ProdutoServicoVendaServicoDAOTest extends BasicDAOTest{

	private ProdutoServicoVendaServico produtoServicoVendaServico = new ProdutoServicoVendaServico();	
	
	@Before
	public void setUp() {
		produtoServicoVendaServico.setQuantidadeProduto(12);
		produtoServicoVendaServico.setValorProduto(BigDecimal.valueOf(10.00));
	}

	@Override
	public Object getObjectTest() {
		return produtoServicoVendaServico;
	}

	
	
}
