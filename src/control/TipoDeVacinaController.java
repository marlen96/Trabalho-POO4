package control;

import java.util.List;

import dao.BasicDAO;
import dao.TipoDeVacinaDAO;
import model.TipoDeVacina;

public class TipoDeVacinaController {

	private static TipoDeVacinaController tipoDeVacinaController;
	
	  public static TipoDeVacinaController getInstance() {
	        if (tipoDeVacinaController == null) {
	        	tipoDeVacinaController = new TipoDeVacinaController();
	        }
	        return tipoDeVacinaController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<TipoDeVacina>(new TipoDeVacina()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(TipoDeVacina tipoDeVacina) {
	    new BasicDAO<TipoDeVacina>(tipoDeVacina).persistir();
	    }
	    
	    public void deletar(TipoDeVacina tipoDeVacina) {
	    	new BasicDAO<TipoDeVacina>(tipoDeVacina).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<TipoDeVacina>(new TipoDeVacina()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<TipoDeVacina>(new TipoDeVacina()).consultaUltimoID();
	    }
	    
	    public TipoDeVacina buscarPoriD(Long id) {
	    	return (TipoDeVacina) new BasicDAO<TipoDeVacina>(new TipoDeVacina()).buscarPorId(id);
	    }
	
	    public Long consultarRegs() {
	    	return TipoDeVacinaDAO.getInstance().consultaTotalRegs();
	    }
	
}
