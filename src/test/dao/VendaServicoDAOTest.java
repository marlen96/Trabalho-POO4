package test.dao;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Before;

import model.VendaServico;

public class VendaServicoDAOTest extends BasicDAOTest{

	private VendaServico vendaServico = new VendaServico();
	
	@Before
	public void test() {
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		vendaServico.setDataServico(c);
		vendaServico.setDescricao("testedescrição");
		vendaServico.setValorTotal(BigDecimal.valueOf(12.00));
		
	}

	@Override
	public Object getObjectTest() {
		return vendaServico;
	}

}
