package control;

import java.util.Calendar;
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
