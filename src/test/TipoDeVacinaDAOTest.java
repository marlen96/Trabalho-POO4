package test;

import org.junit.Before;

import model.TipoDeVacina;

public class TipoDeVacinaDAOTest extends BasicDAOTest{

	private TipoDeVacina tipoDeVacina = new TipoDeVacina();
	
	@Before
	public void test() {
		tipoDeVacina.setDescricao("testedescri��o");
		
	}

	@Override
	public Object getObjectTest() {
		return tipoDeVacina;
	}

	
	
}
