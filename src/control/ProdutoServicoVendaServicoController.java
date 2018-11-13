package control;

import java.util.List;

import dao.BasicDAO;
import dao.ProdutoServicoVendaServicoDAO;
import model.ProdutoServicoVendaServico;

public class ProdutoServicoVendaServicoController {

	private static ProdutoServicoVendaServicoController produtoServicoVendaServicoController;
	
	  public static ProdutoServicoVendaServicoController getInstance() {
	        if (produtoServicoVendaServicoController == null) {
	        	produtoServicoVendaServicoController = new ProdutoServicoVendaServicoController();
	        }
	        return produtoServicoVendaServicoController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(ProdutoServicoVendaServico produtoServicoVendaServico) {
	    new BasicDAO<ProdutoServicoVendaServico>(produtoServicoVendaServico).persistir();
	    }
	    
	    public void deletar(ProdutoServicoVendaServico produtoServicoVendaServico) {
	    	new BasicDAO<ProdutoServicoVendaServico>(produtoServicoVendaServico).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).consultaUltimoID();
	    }
	    
	    public ProdutoServicoVendaServico buscarPoriD(Long id) {
	    	return (ProdutoServicoVendaServico) new BasicDAO<ProdutoServicoVendaServico>(new ProdutoServicoVendaServico()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return ProdutoServicoVendaServicoDAO.getInstance().consultaTotalRegs();
	    }
	
	
}
