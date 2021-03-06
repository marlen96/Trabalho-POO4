package control;

import java.text.SimpleDateFormat;
import java.util.List;

import dao.AgendamentoConsultaDAO;
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
	    
	    public Long consultarRegs() {
	    	return AgendamentoConsultaDAO.getInstance().consultaTotalRegs();
	    }
	    
	    public List<AgendamentoConsulta> consultar(String consulta){
	    	List<AgendamentoConsulta> teste = AgendamentoConsultaDAO.getInstance().consultar(consulta); 
	    	return teste;
	    }
	    
		public String getdataCadastroFormatado(AgendamentoConsulta a)
		{
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			return formato.format(a.getDataDeAgendamento());
		}
}
