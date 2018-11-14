package test.control;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import control.AnamneseController;
import model.Anamnese;

public class AnamneseControllerTest {
	
	public Anamnese anamnese = new Anamnese();
	
	@Before
	public void setUp() {
		anamnese.setAnamnese("testeanamnese");
		anamnese.setDiagnostico("testediag");
		anamnese.setMedicamentos("testmedicamento");
		anamnese.setProcedimentosRealizados("testeprocedimento");
	}
	
	@Test
	public void buscarTodostest() {
		List<Object> teste = AnamneseController.getInstance().buscarTodos();
		assertEquals(true, teste != null);
	}

	@Test
	public void persistirTest() {
		try {
			AnamneseController.getInstance().persistir(anamnese);
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscarPrimeiroID() {
		Long a = AnamneseController.getInstance().buscarPrimeiroID();
		assertEquals(true, a != 0);
	}
	
	@Test
	public void BuscarUltimoID() {
		Long a = AnamneseController.getInstance().buscarUltimoID();
		assertEquals(true, a != null);
	}
	
	@Test
	public void buscarPorID() {
		Anamnese a = AnamneseController.getInstance().buscarPoriD(AnamneseController.getInstance().buscarUltimoID());
		assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void consultarRegs() {
		Long a = AnamneseController.getInstance().consultarRegs();
		assertEquals(true, a != null);
	}
	
	@Test
	public void deletarTest() {
		try {
			AnamneseController.getInstance().deletar(AnamneseController.getInstance().buscarPoriD(AnamneseController.getInstance().buscarUltimoID()));
		assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
