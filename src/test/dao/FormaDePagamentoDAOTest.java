package test.dao;


import org.junit.Before;


import model.FormaDePagamento;

public class FormaDePagamentoDAOTest extends BasicDAOTest{

	private FormaDePagamento formaDePagamento = new FormaDePagamento();
	
	@Before
	public void setUp() {
		formaDePagamento.setDescricao("descriçãoteste");
	}

	@Override
	public Object getObjectTest() {
		return formaDePagamento;
	}

	
	
}
