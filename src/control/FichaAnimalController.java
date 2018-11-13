package control;

import java.util.List;

import dao.BasicDAO;
import dao.FichaAnimalDAO;
import model.FichaAnimal;

public class FichaAnimalController {

	private static FichaAnimalController fichaAnimalController;
	
	  public static FichaAnimalController getInstance() {
	        if (fichaAnimalController == null) {
	        	fichaAnimalController = new FichaAnimalController();
	        }
	        return fichaAnimalController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<FichaAnimal>(new FichaAnimal()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(FichaAnimal fichaAnimal) {
	    new BasicDAO<FichaAnimal>(fichaAnimal).persistir();
	    }
	    
	    public void deletar(FichaAnimal fichaAnimal) {
	    	new BasicDAO<FichaAnimal>(fichaAnimal).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<FichaAnimal>(new FichaAnimal()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<FichaAnimal>(new FichaAnimal()).consultaUltimoID();
	    }
	    
	    public FichaAnimal buscarPoriD(Long id) {
	    	return (FichaAnimal) new BasicDAO<FichaAnimal>(new FichaAnimal()).buscarPorId(id);
	    }
	
	    public Long consultarRegs() {
	    	return FichaAnimalDAO.getInstance().consultaTotalRegs();
	    }
}
