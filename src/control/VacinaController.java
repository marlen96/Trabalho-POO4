package control;

import java.util.List;

import dao.BasicDAO;
import dao.VacinaDAO;
import model.Vacina;

public class VacinaController {

	private static VacinaController vacinaController;
	
	  public static VacinaController getInstance() {
	        if (vacinaController == null) {
	        	vacinaController = new VacinaController();
	        }
	        return vacinaController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Vacina>(new Vacina()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Vacina vacina) {
	    new BasicDAO<Vacina>(vacina).persistir();
	    }
	    
	    public void deletar(Vacina vacina) {
	    	new BasicDAO<Vacina>(vacina).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Vacina>(new Vacina()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Vacina>(new Vacina()).consultaUltimoID();
	    }
	    
	    public Vacina buscarPoriD(Long id) {
	    	return (Vacina) new BasicDAO<Vacina>(new Vacina()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return VacinaDAO.getInstance().consultaTotalRegs();
	    }
	
	
}
