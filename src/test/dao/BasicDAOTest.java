package test.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.BasicDAO;
import model.BasicModel;

public abstract class BasicDAOTest {

	public abstract Object getObjectTest();

	@Test
	public void persistirInserirTest() {	
		BasicModel objectTeste = (BasicModel) new BasicDAO<Object>(getObjectTest()).persistir();
		assertEquals(true, objectTeste.getId() != null);
	}
	

	@Test
	public void buscarTodasTest() {
		List<Object> objetos = new BasicDAO<Object>(getObjectTest()).buscarTodas();
		assertEquals(true, objetos.size() > 0);	
	}
	
	@Test
	public void buscarPorUltimoIdTest() {
		Object c = new BasicDAO<Object>(getObjectTest()).buscarPorId(new BasicDAO<Object>(getObjectTest()).consultaUltimoID());
		assertNotNull(c);
	}
	
	@Test
	public void buscarPorPrimeiroIdTest() {
		Object c = new BasicDAO<Object>(getObjectTest()).buscarPorId(new BasicDAO<Object>(getObjectTest()).consultaPrimeiroID());
		assertNotNull(c);
	}
	
	@Test
	public void removerIdTest(){
		BasicModel objectTeste = (BasicModel) new BasicDAO<Object>(getObjectTest()).
				buscarPorId((Long)new BasicDAO<Object>(getObjectTest()).
						consultaPrimeiroID());
		
		assertEquals(true, new BasicDAO<Object>(objectTeste).remover());
	}
	
}
