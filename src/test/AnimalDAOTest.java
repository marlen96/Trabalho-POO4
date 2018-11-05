package test;

import java.util.Calendar;


import org.junit.Before;
import model.Animal;

public class AnimalDAOTest extends BasicDAOTest{

	public Animal animalteste = new Animal();
	
	@Before
	public void setUp() {
			Calendar c = Calendar.getInstance();
			c.set(2012, 12, 1);
			animalteste.setNome("rubens");
			animalteste.setPesoOuPorte("medio");
			animalteste.setDataNascimento(c);
			animalteste.setEspecie("teste");
			animalteste.setRaca("teste2");
			animalteste.setSexo("macho");
	}

	@Override
	public Object getObjectTest() {
		return animalteste;
	}

	
/*	@Test
	public void persisitirInserirTest(){
		animalteste = (Animal) new BasicDAO<Animal>(animalteste).persistir(); 
		assertEquals(true, animalteste.getId() != null);
	}*/


}
