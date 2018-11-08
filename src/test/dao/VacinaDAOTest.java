package test.dao;


import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Before;

import model.Vacina;

public class VacinaDAOTest extends BasicDAOTest{

	private Vacina vacina = new Vacina();
	
	@Before
	public void setUp() {
		vacina.setCusto(BigDecimal.valueOf(120.00));
		vacina.setFornecedor("testefornecedor");
		vacina.setLote("testelote456412");
		vacina.setMarca("toppex");
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		vacina.setValidade(c);
	}

	@Override
	public Object getObjectTest() {
		return vacina;
	}

	
}
