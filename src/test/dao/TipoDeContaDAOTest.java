package test.dao;



import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.BasicDAO;
import dao.TipoDeContaDAO;
import model.ContasAPagar;
import model.TipoDeConta;

public class TipoDeContaDAOTest extends BasicDAOTest{

	private TipoDeConta tipoDeConta = new TipoDeConta();
	
	@Before
	public void setUp() {
		tipoDeConta.setDescricao("testetipoconta");
		ContasAPagar a = (ContasAPagar) new BasicDAO<ContasAPagar>(new ContasAPagar()).buscarPorId(new BasicDAO<ContasAPagar>(new ContasAPagar()).consultaUltimoID());
		List<ContasAPagar> lista = Arrays.asList(a);
		tipoDeConta.setContasAPagar(lista);
	}

	@Test
	public void consultaTotalRegsTest() {
		Long a = TipoDeContaDAO.getInstance().consultaTotalRegs();
		assertNotNull(a);
	}
	
	@Override
	public Object getObjectTest() {
		return tipoDeConta;
	}

	
	
}
