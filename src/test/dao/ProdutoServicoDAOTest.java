package test.dao;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.ProdutoServicoDAO;
import model.AgendamentoConsulta;
import model.Fornecedor;
import model.ProdutoServico;
import model.ProdutoServicoVendaServico;
import model.Tipo;

public class ProdutoServicoDAOTest extends BasicDAOTest {

	private ProdutoServico produtoServico = new ProdutoServico();
	
	@Before
	public void setUp() {
		produtoServico.setLote("231231038sdsd");
		produtoServico.setMarca("topterp");
		produtoServico.setNome("topterm philipsbalita");
		produtoServico.setPrecoDeCompra(BigDecimal.TEN);
		produtoServico.setPrecoDeVenda(BigDecimal.TEN);
		Date date = new Date("09/09/2000");
		produtoServico.setValidade(date);
		Fornecedor a = (Fornecedor) new BasicDAO<Fornecedor>(new Fornecedor()).buscarPorId(new BasicDAO<Fornecedor>(new Fornecedor()).consultaUltimoID());
		List<Fornecedor> lista = Arrays.asList(a);
		produtoServico.setFornecedor(lista);
		AgendamentoConsulta b = (AgendamentoConsulta) new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).buscarPorId(new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).consultaUltimoID());
		List<AgendamentoConsulta> listb = Arrays.asList(b);
		produtoServico.setAgendamentoConsulta(listb);
		ProdutoServicoVendaServico p = (ProdutoServicoVendaServico) new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).buscarPorId(new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).consultaUltimoID());
		List<ProdutoServicoVendaServico> listc = Arrays.asList(p);
		produtoServico.setProdutosServicosVendasServicos(listc);
		produtoServico.setTipo((Tipo) new BasicDAO<Tipo>(new Tipo()).buscarPorId(new BasicDAO<Tipo>(new Tipo()).consultaUltimoID()));
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = ProdutoServicoDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}

	@Override
	public Object getObjectTest() {
		return produtoServico;
	}

	
}
