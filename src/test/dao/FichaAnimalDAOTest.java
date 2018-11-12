package test.dao;


import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.FichaAnimalDAO;
import model.Anamnese;
import model.Animal;
import model.FichaAnimal;
import model.Vacina;

public class FichaAnimalDAOTest extends BasicDAOTest {

	private FichaAnimal fichaAnimal = new FichaAnimal();
	
	@Before
	public void setUp() {
		fichaAnimal.setPesoOuPorteAntesDoProcedimento("testeppap");
		fichaAnimal.setAnimal((Animal) new BasicDAO<Animal>(new Animal()).buscarPorId(new BasicDAO<Animal>(new Animal()).consultaUltimoID()));
		Anamnese a = (Anamnese) new BasicDAO<Anamnese>(new Anamnese()).buscarPorId(new BasicDAO<Anamnese>(new Anamnese()).consultaUltimoID());
		List<Anamnese> lista = Arrays.asList(a);
		fichaAnimal.setAnamneses(lista);
		Vacina b = (Vacina) new BasicDAO<Vacina>(new Vacina()).buscarPorId(new BasicDAO<Vacina>(new Vacina()).consultaUltimoID());
		List<Vacina> listb = Arrays.asList(b);
		fichaAnimal.setVacinas(listb);
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = FichaAnimalDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return fichaAnimal;
	}

	
	
}
