package control;

import java.util.List;

import dao.AnamneseDAO;
import dao.BasicDAO;
import model.Anamnese;

public class AnamneseController {

	private static AnamneseController anamneseController;
	
	  public static AnamneseController getInstance() {
	        if (anamneseController == null) {
	        	anamneseController = new AnamneseController();
	        }
	        return anamneseController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Anamnese>(new Anamnese()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Anamnese anamnese) {
	    new BasicDAO<Anamnese>(anamnese).persistir();
	    }
	    
	    public void deletar(Anamnese anamnese) {
	    	new BasicDAO<Anamnese>(anamnese).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Anamnese>(new Anamnese()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Anamnese>(new Anamnese()).consultaUltimoID();
	    }
	    
	    public Anamnese buscarPoriD(Long id) {
	    	return (Anamnese) new BasicDAO<Anamnese>(new Anamnese()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return AnamneseDAO.getInstance().consultaTotalRegs();
	    }
	    
	    public List<Anamnese> consultar(String consulta){
	    	List<Anamnese> teste = AnamneseDAO.getInstance().consultar(consulta); 
	    	return teste;
	    }
	    
	    
}
