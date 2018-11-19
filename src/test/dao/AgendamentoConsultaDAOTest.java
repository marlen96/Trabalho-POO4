package test.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.AgendamentoConsultaDAO;
import dao.BasicDAO;
import model.AgendamentoConsulta;
import model.Cliente;
import model.ProdutoServico;

public class AgendamentoConsultaDAOTest extends BasicDAOTest{

	private AgendamentoConsulta agendamentoConsulta = new AgendamentoConsulta();
	
	@Before
	public void setUp() {
		agendamentoConsulta.setDescricao("testedesc");
		Date date = new Date("09/09/2000");
		agendamentoConsulta.setDataDeAgendamento(date);
		agendamentoConsulta.setStatus("testestatus");
		agendamentoConsulta.setCliente((Cliente) new BasicDAO<Cliente>(new Cliente()).buscarPorId(new BasicDAO<Cliente>(new Cliente()).consultaUltimoID()));
		ProdutoServico a = (ProdutoServico) new BasicDAO<ProdutoServico>(new ProdutoServico()).buscarPorId(new BasicDAO<ProdutoServico>(new ProdutoServico()).consultaUltimoID());
		List<ProdutoServico> list = Arrays.asList(a);
		agendamentoConsulta.setProdutoServico(list);
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = AgendamentoConsultaDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}

	@Test
	public void pesquisarTest() {
		List<AgendamentoConsulta> a= AgendamentoConsultaDAO.getInstance().consultar("testedesc");
		assertEquals(true, a != null);
	}
	
	
	@Override
	public Object getObjectTest() {
		return agendamentoConsulta;
	}

	
	
}
