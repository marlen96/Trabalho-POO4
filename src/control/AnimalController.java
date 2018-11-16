package control;

import java.util.Calendar;
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
	    
	    public List<Animal> consultar(String consulta){
	    	List<Animal> teste = AnimalDAO.getInstance().consultar(consulta); 
	    	return teste;
	    }
	    
	    public Calendar convDataBanco(String dataSistema) {
	    	Calendar c = Calendar.getInstance();
	    	String[] saida = dataSistema.split("/");
	        int dia = Integer.parseInt(saida[0]);
	        int mes = Integer.parseInt(saida[1]);
	        int ano = Integer.parseInt(saida[2]);
	        try {
	        	c.set(dia, mes, ano);
	        }catch (Exception e) {
				System.out.println("Exception" + e);
			}
	        return c;
	    }
}
