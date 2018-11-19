package test.dao;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.VendaServicoDAO;
import model.Cliente;
import model.FormaDePagamento;
import model.Funcionario;
import model.ProdutoServicoVendaServico;
import model.VendaServico;

public class VendaServicoDAOTest extends BasicDAOTest{

	private VendaServico vendaServico = new VendaServico();
	
	@Before
	public void test() {
		Date date = new Date("09/09/2000");
		vendaServico.setDataServico(date);
		vendaServico.setDescricao("testedescrição");
		vendaServico.setValorTotal(BigDecimal.TEN);
		vendaServico.setCliente((Cliente) new BasicDAO<Cliente>(new Cliente()).buscarPorId(new BasicDAO<Cliente>(new Cliente()).consultaUltimoID()));
		vendaServico.setFuncionario((Funcionario) new BasicDAO<Funcionario>(new Funcionario()).buscarPorId(new BasicDAO<Funcionario>(new Funcionario()).consultaUltimoID()));
		FormaDePagamento a = (FormaDePagamento) new BasicDAO<FormaDePagamento>(new FormaDePagamento()).buscarPorId(new BasicDAO<FormaDePagamento>(new FormaDePagamento()).consultaUltimoID());
		List<FormaDePagamento> lista = Arrays.asList(a);
		vendaServico.setFormasdepagamentos(lista);
		ProdutoServicoVendaServico b = (ProdutoServicoVendaServico) new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).buscarPorId(new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).consultaUltimoID());
		List<ProdutoServicoVendaServico> listab = Arrays.asList(b);
		vendaServico.setProdutosServicosVendasServicos(listab);
		
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = VendaServicoDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return vendaServico;
	}

}
