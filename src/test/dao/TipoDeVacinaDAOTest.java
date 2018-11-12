package test.dao;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.TipoDeVacinaDAO;
import model.TipoDeVacina;
import model.Vacina;

public class TipoDeVacinaDAOTest extends BasicDAOTest{

	private TipoDeVacina tipoDeVacina = new TipoDeVacina();
	
	@Before
	public void test() {
		tipoDeVacina.setDescricao("testedescrição");
		Vacina b = (Vacina) new BasicDAO<Vacina>(new Vacina()).buscarPorId(new BasicDAO<Vacina>(new Vacina()).consultaUltimoID());
		List<Vacina> listb = Arrays.asList(b);
		tipoDeVacina.setVacinas(listb);
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = TipoDeVacinaDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return tipoDeVacina;
	}

	
	
}
