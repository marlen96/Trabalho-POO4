package test.dao;


import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.ContasAPagarDAO;
import model.ContasAPagar;
import model.Fornecedor;
import model.TipoDeConta;

public class ContasAPagarDAOTest extends BasicDAOTest {

	private ContasAPagar contasAPagar = new ContasAPagar();
	
	@Before
	public void setUp() {
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		contasAPagar.setData(c);
		contasAPagar.setValor(BigDecimal.valueOf(10.00));
		contasAPagar.setFornecedor((Fornecedor) new BasicDAO<Fornecedor>(new Fornecedor()).buscarPorId(new BasicDAO<Fornecedor>(new Fornecedor()).consultaUltimoID()));
		contasAPagar.setTipoDeConta((TipoDeConta) new BasicDAO<TipoDeConta>(new TipoDeConta()).buscarPorId(new BasicDAO<TipoDeConta>(new TipoDeConta()).consultaUltimoID()));
		
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = ContasAPagarDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}

	@Override
	public Object getObjectTest() {
		return contasAPagar;
	}

	
}
