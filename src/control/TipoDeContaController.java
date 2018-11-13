package control;

import java.util.List;

import dao.BasicDAO;
import dao.TipoDeContaDAO;
import model.TipoDeConta;

public class TipoDeContaController {

	private static TipoDeContaController tipoDeContaController;
	
	  public static TipoDeContaController getInstance() {
	        if (tipoDeContaController == null) {
	        	tipoDeContaController = new TipoDeContaController();
	        }
	        return tipoDeContaController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<TipoDeConta>(new TipoDeConta()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(TipoDeConta tipoDeConta) {
	    new BasicDAO<TipoDeConta>(tipoDeConta).persistir();
	    }
	    
	    public void deletar(TipoDeConta tipoDeConta) {
	    	new BasicDAO<TipoDeConta>(tipoDeConta).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<TipoDeConta>(new TipoDeConta()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<TipoDeConta>(new TipoDeConta()).consultaUltimoID();
	    }
	    
	    public TipoDeConta buscarPoriD(Long id) {
	    	return (TipoDeConta) new BasicDAO<TipoDeConta>(new TipoDeConta()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return TipoDeContaDAO.getInstance().consultaTotalRegs();
	    }
	
}
