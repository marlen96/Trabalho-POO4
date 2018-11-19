package test.dao;


import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.VacinaDAO;
import model.FichaAnimal;
import model.TipoDeVacina;
import model.Vacina;

public class VacinaDAOTest extends BasicDAOTest{

	private Vacina vacina = new Vacina();
	
	@Before
	public void setUp() {
		vacina.setCusto(BigDecimal.TEN);
		vacina.setFornecedor("testefornecedor");
		vacina.setLote("testelote456412");
		vacina.setMarca("toppex");
		Date date = new Date("09/09/2000");
		vacina.setValidade(date);
		vacina.setFichaAnimal((FichaAnimal) new BasicDAO<FichaAnimal>(new FichaAnimal()).buscarPorId(new BasicDAO<FichaAnimal>(new FichaAnimal()).consultaUltimoID()));
		vacina.setTipoDeVacina((TipoDeVacina) new BasicDAO<TipoDeVacina>(new TipoDeVacina()).buscarPorId(new BasicDAO<TipoDeVacina>(new TipoDeVacina()).consultaUltimoID()));
	}
	
	@Test
	public void consultaTotalRegsTest() {
		Long a = VacinaDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}

	@Override
	public Object getObjectTest() {
		return vacina;
	}

	
}
