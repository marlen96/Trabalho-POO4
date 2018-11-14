package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.FichaAnimalController;
import model.FichaAnimal;

public class FichaAnimalControllerTest {

	private FichaAnimal fichaAnimal = new FichaAnimal();
	
	@Before
	public void setUp() {
		fichaAnimal.setPesoOuPorteAntesDoProcedimento("testeppap");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = FichaAnimalController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			FichaAnimalController.getInstance().persistir(fichaAnimal);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = FichaAnimalController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = FichaAnimalController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		FichaAnimal a = FichaAnimalController.getInstance().buscarPoriD(FichaAnimalController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = FichaAnimalController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			FichaAnimalController.getInstance().deletar(FichaAnimalController.getInstance().buscarPoriD(FichaAnimalController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
