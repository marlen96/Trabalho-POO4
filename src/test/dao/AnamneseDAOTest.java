package test.dao;


import org.junit.Before;

import model.Anamnese;

public class AnamneseDAOTest extends BasicDAOTest {

	public Anamnese anamnese = new Anamnese();
	
	@Before
	public void setUp() {
		anamnese.setAnamnese("testeanamnese");
		anamnese.setDiagnostico("testediag");
		anamnese.setMedicamentos("testmedicamento");
		anamnese.setProcedimentosRealizados("testeprocedimento");
	}

	@Override
	public Object getObjectTest() {
	   return anamnese;
	}

	
}
