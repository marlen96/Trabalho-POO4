package control;

import java.util.List;

import dao.BasicDAO;
import dao.TipoDAO;
import model.Tipo;

public class TipoController {

	private static TipoController tipoController;
	
	  public static TipoController getInstance() {
	        if (tipoController == null) {
	        	tipoController = new TipoController();
	        }
	        return tipoController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Tipo>(new Tipo()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Tipo tipo) {
	    new BasicDAO<Tipo>(tipo).persistir();
	    }
	    
	    public void deletar(Tipo tipo) {
	    	new BasicDAO<Tipo>(tipo).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Tipo>(new Tipo()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Tipo>(new Tipo()).consultaUltimoID();
	    }
	    
	    public Tipo buscarPoriD(Long id) {
	    	return (Tipo) new BasicDAO<Tipo>(new Tipo()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return TipoDAO.getInstance().consultaTotalRegs();
	    }
	
}
