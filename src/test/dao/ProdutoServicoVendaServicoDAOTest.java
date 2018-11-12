package test.dao;


import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.ProdutoServicoVendaServicoDAO;
import model.ProdutoServico;
import model.ProdutoServicoVendaServico;
import model.VendaServico;

public class ProdutoServicoVendaServicoDAOTest extends BasicDAOTest{

	private ProdutoServicoVendaServico produtoServicoVendaServico = new ProdutoServicoVendaServico();	
	
	@Before
	public void setUp() {
		produtoServicoVendaServico.setQuantidadeProduto(12);
		produtoServicoVendaServico.setValorProduto(BigDecimal.TEN);
		produtoServicoVendaServico.setProdutoServico((ProdutoServico) new BasicDAO<ProdutoServico>(new ProdutoServico()).buscarPorId(new BasicDAO<ProdutoServico>(new ProdutoServico()).consultaUltimoID()));
		produtoServicoVendaServico.setVendaServico((VendaServico) new BasicDAO<VendaServico>(new VendaServico()).buscarPorId(new BasicDAO<VendaServico>(new VendaServico()).consultaUltimoID()));
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = ProdutoServicoVendaServicoDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return produtoServicoVendaServico;
	}

	
	
}
