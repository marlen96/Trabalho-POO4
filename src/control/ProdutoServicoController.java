package control;

import java.text.SimpleDateFormat;
import java.util.List;

import dao.BasicDAO;
import dao.ProdutoServicoDAO;
import model.ProdutoServico;

public class ProdutoServicoController {

	private static ProdutoServicoController produtoServicoController;
	
	  public static ProdutoServicoController getInstance() {
	        if (produtoServicoController == null) {
	        	produtoServicoController = new ProdutoServicoController();
	        }
	        return produtoServicoController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<ProdutoServico>(new ProdutoServico()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(ProdutoServico produtoServico) {
	    new BasicDAO<ProdutoServico>(produtoServico).persistir();
	    }
	    
	    public void deletar(ProdutoServico produtoServico) {
	    	new BasicDAO<ProdutoServico>(produtoServico).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<ProdutoServico>(new ProdutoServico()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<ProdutoServico>(new ProdutoServico()).consultaUltimoID();
	    }
	    
	    public ProdutoServico buscarPoriD(Long id) {
	    	return (ProdutoServico) new BasicDAO<ProdutoServico>(new ProdutoServico()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return ProdutoServicoDAO.getInstance().consultaTotalRegs();
	    }
	    
		public String getdataCadastroFormatado(ProdutoServico a)
		{
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			return formato.format(a.getValidade());
		}
	
}
