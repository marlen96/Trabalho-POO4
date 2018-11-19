package control;

import java.text.SimpleDateFormat;
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
	    
		public String getdataCadastroFormatado(VendaServico a)
		{
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			return formato.format(a.getDataServico());
		}
}
