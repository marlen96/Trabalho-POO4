package control;

import java.util.List;

import dao.BasicDAO;
import dao.FormaDePagamentoDAO;
import model.FormaDePagamento;

public class FormaDePagamentoController {


	private static FormaDePagamentoController formaDePagamentoController;
	
	  public static FormaDePagamentoController getInstance() {
	        if (formaDePagamentoController == null) {
	        	formaDePagamentoController = new FormaDePagamentoController();
	        }
	        return formaDePagamentoController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<FormaDePagamento>(new FormaDePagamento()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(FormaDePagamento formaDePagamento) {
	    new BasicDAO<FormaDePagamento>(formaDePagamento).persistir();
	    }
	    
	    public void deletar(FormaDePagamento formaDePagamento) {
	    	new BasicDAO<FormaDePagamento>(formaDePagamento).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<FormaDePagamento>(new FormaDePagamento()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<FormaDePagamento>(new FormaDePagamento()).consultaUltimoID();
	    }
	    
	    public FormaDePagamento buscarPoriD(Long id) {
	    	return (FormaDePagamento) new BasicDAO<FormaDePagamento>(new FormaDePagamento()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return FormaDePagamentoDAO.getInstance().consultaTotalRegs();
	    }
	
}
