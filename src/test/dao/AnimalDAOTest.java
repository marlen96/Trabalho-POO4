package test.dao;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.AnimalDAO;
import dao.BasicDAO;
import model.Animal;
import model.Cliente;
import model.FichaAnimal;

public class AnimalDAOTest extends BasicDAOTest{
	
	private Animal animal = new Animal();
	
	@Before
	public void setUp() {
		animal.setNome("rubens");
		animal.setPesoOuPorte("medio");
		Date date = new Date("09/09/2000");
		animal.setDataNascimento(date);
		animal.setEspecie("teste");
		animal.setRaca("teste2");
		animal.setSexo("macho");
		animal.setCliente((Cliente) new BasicDAO<Cliente>(new Cliente()).buscarPorId(new BasicDAO<Cliente>(new Cliente()).consultaUltimoID()));
		FichaAnimal a = (FichaAnimal) new BasicDAO<FichaAnimal>(new FichaAnimal()).buscarPorId(new BasicDAO<FichaAnimal>(new FichaAnimal()).consultaUltimoID());
		List<FichaAnimal> ficha = Arrays.asList(a);
		animal.setFichasAnimais(ficha);
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = AnimalDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Test
	public void pesquisarTest() {
		List<Animal> a= AnimalDAO.getInstance().consultar("rubens");
		assertEquals(true, a != null);
	}
	
	@Override
	public Object getObjectTest() {
	   return animal;
	}

}
