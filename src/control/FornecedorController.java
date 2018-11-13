package control;

import java.util.List;

import dao.BasicDAO;
import dao.FornecedorDAO;
import model.Fornecedor;

public class FornecedorController {

	private static FornecedorController fornecedorController;
	
	  public static FornecedorController getInstance() {
	        if (fornecedorController == null) {
	        	fornecedorController = new FornecedorController();
	        }
	        return fornecedorController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Fornecedor>(new Fornecedor()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Fornecedor fornecedor) {
	    new BasicDAO<Fornecedor>(fornecedor).persistir();
	    }
	    
	    public void deletar(Fornecedor fornecedor) {
	    	new BasicDAO<Fornecedor>(fornecedor).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Fornecedor>(new Fornecedor()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Fornecedor>(new Fornecedor()).consultaUltimoID();
	    }
	    
	    public Fornecedor buscarPoriD(Long id) {
	    	return (Fornecedor) new BasicDAO<Fornecedor>(new Fornecedor()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return FornecedorDAO.getInstance().consultaTotalRegs();
	    }
	
}
