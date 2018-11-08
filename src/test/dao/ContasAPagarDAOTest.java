package test.dao;


import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Before;

import model.ContasAPagar;

public class ContasAPagarDAOTest extends BasicDAOTest {

	private ContasAPagar contasAPagar = new ContasAPagar();
	
	@Before
	public void setUp() {
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		contasAPagar.setData(c);
		contasAPagar.setValor(BigDecimal.valueOf(10.00));
	
	}

	@Override
	public Object getObjectTest() {
		return contasAPagar;
	}

	
}
