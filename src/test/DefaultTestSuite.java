package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.control.AgendamentoConsultaControllerTest;
import test.control.AnamneseControllerTest;
import test.control.AnimalControllerTest;
import test.control.ClienteControllerTest;
import test.control.ContasAPagarControllerTest;
import test.control.FichaAnimalControllerTest;
import test.control.FormaDePagamentoControllerTest;
import test.control.FornecedorControllerTest;
import test.control.FuncionarioControllerTest;
import test.control.ProdutoServicoControllerTest;
import test.control.ProdutoServicoVendaServicoControllerTest;
import test.control.TipoControllerTest;
import test.control.TipoDeContaControllerTest;
import test.control.TipoDeVacinaControllerTest;
import test.control.UsuarioControllerTest;
import test.control.VacinaControllerTest;
import test.control.VendaServicoControllerTest;
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
import test.model.EstadoCivilEnumTest;
import test.util.CalculoCPFTest;

@RunWith(Suite.class)
@SuiteClasses({ 		
		// DAO TESTES!
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
		VendaServicoDAOTest.class,
		//Control TESTES!
		AgendamentoConsultaControllerTest.class,
		AnamneseControllerTest.class, 
		AnimalControllerTest.class,
		ClienteControllerTest.class, 
		ContasAPagarControllerTest.class, 
		FichaAnimalControllerTest.class,
		FormaDePagamentoControllerTest.class, 
		FornecedorControllerTest.class, 
		FuncionarioControllerTest.class,
		ProdutoServicoControllerTest.class, 
		ProdutoServicoVendaServicoControllerTest.class, 
		TipoControllerTest.class,
		TipoDeContaControllerTest.class, 
		TipoDeVacinaControllerTest.class,
		UsuarioControllerTest.class,
		VacinaControllerTest.class,
		VendaServicoControllerTest.class,
		//Model Testes!
		EstadoCivilEnumTest.class,
		//Util Testes!
		CalculoCPFTest.class
})
public class DefaultTestSuite {

}
