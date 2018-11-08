package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.dao.AgendamentoConsultaDAOTest;
import test.dao.AnamneseDAOTest;
import test.dao.AnimalDAOTest;
import test.dao.ClienteDAOTest;
import test.dao.ContasAPagarDAOTest;
import test.dao.FichaAnimalDAOTest;
import test.dao.FormaDePagamentoDAOTest;
import test.dao.FornecedorDAOTest;
import test.dao.FuncionarioDAOTest;
import test.dao.ProdutoServicoDAOTest;
import test.dao.ProdutoServicoVendaServicoDAOTest;
import test.dao.TipoDAOTest;
import test.dao.TipoDeContaDAOTest;
import test.dao.TipoDeVacinaDAOTest;
import test.dao.UsuarioDAOTest;
import test.dao.VacinaDAOTest;
import test.dao.VendaServicoDAOTest;

@RunWith(Suite.class)
@SuiteClasses({ 		
	
		AgendamentoConsultaDAOTest.class, 
		AnamneseDAOTest.class, 
		AnimalDAOTest.class, 
		ClienteDAOTest.class,
		ContasAPagarDAOTest.class, 
		FichaAnimalDAOTest.class, 
		FormaDePagamentoDAOTest.class, 
		FornecedorDAOTest.class,
		FuncionarioDAOTest.class, 
		ProdutoServicoDAOTest.class, 
		ProdutoServicoVendaServicoDAOTest.class,
		TipoDAOTest.class, 
		TipoDeContaDAOTest.class, 
		TipoDeVacinaDAOTest.class, 
		UsuarioDAOTest.class,
		VacinaDAOTest.class, 
		VendaServicoDAOTest.class })
public class TestSuite {

}
