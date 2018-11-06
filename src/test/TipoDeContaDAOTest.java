package test;



import org.junit.Before;


import model.TipoDeConta;

public class TipoDeContaDAOTest extends BasicDAOTest{

	private TipoDeConta tipoDeConta = new TipoDeConta();
	
	@Before
	public void setUp() {
		tipoDeConta.setDescricao("testetipoconta");
	}

	@Override
	public Object getObjectTest() {
		return tipoDeConta;
	}

	
	
}
