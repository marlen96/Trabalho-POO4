package control;

import java.util.List;

import dao.BasicDAO;
import model.AgendamentoConsulta;

public class AgendamentoConsultaController {

	private static AgendamentoConsultaController agendamentoConsultaController;
	
	  public static AgendamentoConsultaController getInstance() {
	        if (agendamentoConsultaController == null) {
	        	agendamentoConsultaController = new AgendamentoConsultaController();
	        }
	        return agendamentoConsultaController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(AgendamentoConsulta agendamento) {
	    new BasicDAO<AgendamentoConsulta>(agendamento).persistir();
	    }
	    
	    public void deletar(AgendamentoConsulta agendamento) {
	    	new BasicDAO<AgendamentoConsulta>(agendamento).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).consultaUltimoID();
	    }
	    
	    public AgendamentoConsulta buscarPoriD(Long id) {
	    	return (AgendamentoConsulta) new BasicDAO<AgendamentoConsulta>(new AgendamentoConsulta()).buscarPorId(id);
	    }
}
