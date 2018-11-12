package test.dao;


import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.FormaDePagamentoDAO;
import model.FormaDePagamento;
import model.VendaServico;

public class FormaDePagamentoDAOTest extends BasicDAOTest{

	private FormaDePagamento formaDePagamento = new FormaDePagamento();
	
	@Before
	public void setUp() {
		formaDePagamento.setDescricao("descriçãoteste");
		VendaServico c = (VendaServico) new BasicDAO<VendaServico>(new VendaServico()).buscarPorId(new BasicDAO<VendaServico>(new VendaServico()).consultaUltimoID());
		List<VendaServico> listc = Arrays.asList(c);
		formaDePagamento.setVendasServico(listc);
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = FormaDePagamentoDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return formaDePagamento;
	}

	
	
}
