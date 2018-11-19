package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.AnimalController;
import model.Animal;

public class AnimalControllerTest {

	private Animal animal = new Animal();
	
	@Before
	public void setUp() {
		animal = new Animal();
		
		animal.setNome("rubens");
		animal.setPesoOuPorte("medio");
		Date date = new Date("09/09/2000");
		animal.setDataNascimento(date);
		animal.setEspecie("teste");
		animal.setRaca("teste2");
		animal.setSexo("macho");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = AnimalController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			AnimalController.getInstance().persistir(animal);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void retornoDataTest() {
		String a = AnimalController.getInstance().getdataCadastroFormatado(animal);
		assertEquals("09/09/2000", a);
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = AnimalController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = AnimalController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Animal a = AnimalController.getInstance().buscarPoriD(AnimalController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = AnimalController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void consultarTest() {
		List<Animal> a = AnimalController.getInstance().consultar("rubens");
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			AnimalController.getInstance().deletar(AnimalController.getInstance().buscarPoriD(AnimalController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
