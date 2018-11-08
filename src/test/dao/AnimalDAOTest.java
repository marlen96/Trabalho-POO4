package test.dao;

import java.util.Calendar;

import org.junit.Before;

import model.Animal;

public class AnimalDAOTest extends BasicDAOTest{
	
	private Animal animal = new Animal();
	
	@Before
	public void setUp() {
		animal = new Animal();
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		animal.setNome("rubens");
		animal.setPesoOuPorte("medio");
		animal.setDataNascimento(c);
		animal.setEspecie("teste");
		animal.setRaca("teste2");
		animal.setSexo("macho");
	}

	@Override
	public Object getObjectTest() {
	   return animal;
	}

}
