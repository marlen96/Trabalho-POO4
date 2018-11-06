package test;


import org.junit.Before;


import model.Tipo;

public class TipoDAOTest extends BasicDAOTest{

	private Tipo tipo = new Tipo();
	
	@Before
	public void setUp() {
		tipo.setDescricao("testedescrição");
		
	}

	@Override
	public Object getObjectTest() {
		return tipo;
	}

	
	
}
