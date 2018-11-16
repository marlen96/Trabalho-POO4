package control;

import java.util.Calendar;
import java.util.List;

import dao.BasicDAO;
import dao.VendaServicoDAO;
import model.VendaServico;

public class VendaServicoController {
	private static VendaServicoController vendaServicoController;
	
	  public static VendaServicoController getInstance() {
	        if (vendaServicoController == null) {
	        	vendaServicoController = new VendaServicoController();
	        }
	        return vendaServicoController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<VendaServico>(new VendaServico()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(VendaServico vendaServico) {
	    new BasicDAO<VendaServico>(vendaServico).persistir();
	    }
	    
	    public void deletar(VendaServico vendaServico) {
	    	new BasicDAO<VendaServico>(vendaServico).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<VendaServico>(new VendaServico()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<VendaServico>(new VendaServico()).consultaUltimoID();
	    }
	    
	    public VendaServico buscarPoriD(Long id) {
	    	return (VendaServico) new BasicDAO<VendaServico>(new VendaServico()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return VendaServicoDAO.getInstance().consultaTotalRegs();
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
