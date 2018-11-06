package test;


import org.junit.Before;

import model.FichaAnimal;

public class FichaAnimalDAOTest extends BasicDAOTest {

	private FichaAnimal fichaAnimal = new FichaAnimal();
	
	@Before
	public void setUp() {
		fichaAnimal.setPesoOuPorteAntesDoProcedimento("testeppap");
	}

	@Override
	public Object getObjectTest() {
		return fichaAnimal;
	}

	
	
}
