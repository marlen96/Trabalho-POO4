package test.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import model.Animal;
import test.AbstractTestCase;

public class AnimalDAOTest extends AbstractTestCase{

	private Animal animalteste = new Animal();
	
	@Before
	public void setUp() {
			animalteste = getAnimalFake();
	}

	@Test
	public void persisitirInserirTest(){
		animalteste = (Animal) new BasicDAO<Animal>(animalteste).persistir(); 
		assertEquals(true, animalteste.getId() != null);
		
	}


}
