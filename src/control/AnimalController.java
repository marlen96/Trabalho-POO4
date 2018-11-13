package control;

import java.util.List;

import dao.AnimalDAO;
import dao.BasicDAO;
import model.Animal;

public class AnimalController {

	private static AnimalController animalController;
	
	  public static AnimalController getInstance() {
	        if (animalController == null) {
	        	animalController = new AnimalController();
	        }
	        return animalController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Animal>(new Animal()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Animal animal) {
	    new BasicDAO<Animal>(animal).persistir();
	    }
	    
	    public void deletar(Animal animal) {
	    	new BasicDAO<Animal>(animal).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Animal>(new Animal()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Animal>(new Animal()).consultaUltimoID();
	    }
	    
	    public Animal buscarPoriD(Long id) {
	    	return (Animal) new BasicDAO<Animal>(new Animal()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return AnimalDAO.getInstance().consultaTotalRegs();
	    }
}
