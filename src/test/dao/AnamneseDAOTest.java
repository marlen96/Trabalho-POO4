package test.dao;


import static org.junit.Assert.assertNotNull;


import org.junit.Before;
import org.junit.Test;

import dao.AnamneseDAO;
import dao.BasicDAO;
import model.Anamnese;
import model.FichaAnimal;

public class AnamneseDAOTest extends BasicDAOTest {

	public Anamnese anamnese = new Anamnese();
	
	@Before
	public void setUp() {
		anamnese.setAnamnese("testeanamnese");
		anamnese.setDiagnostico("testediag");
		anamnese.setMedicamentos("testmedicamento");
		anamnese.setProcedimentosRealizados("testeprocedimento");
		anamnese.setFichaAnimal((FichaAnimal) new BasicDAO<FichaAnimal>(new FichaAnimal()).buscarPorId(new BasicDAO<FichaAnimal>(new FichaAnimal()).consultaUltimoID()));
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = AnamneseDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
	   return anamnese;
	}

	
}
