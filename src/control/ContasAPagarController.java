package control;

import java.text.SimpleDateFormat;
import java.util.List;

import dao.BasicDAO;
import dao.ContasAPagarDAO;
import model.ContasAPagar;

public class ContasAPagarController {

	private static ContasAPagarController contasAPagarController;
	
	  public static ContasAPagarController getInstance() {
	        if (contasAPagarController == null) {
	        	contasAPagarController = new ContasAPagarController();
	        }
	        return contasAPagarController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<ContasAPagar>(new ContasAPagar()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(ContasAPagar contasAPagar) {
	    new BasicDAO<ContasAPagar>(contasAPagar).persistir();
	    }
	    
	    public void deletar(ContasAPagar contasAPagar) {
	    	new BasicDAO<ContasAPagar>(contasAPagar).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<ContasAPagar>(new ContasAPagar()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<ContasAPagar>(new ContasAPagar()).consultaUltimoID();
	    }
	    
	    public ContasAPagar buscarPoriD(Long id) {
	    	return (ContasAPagar) new BasicDAO<ContasAPagar>(new ContasAPagar()).buscarPorId(id);
	    }
	
	    public Long consultarRegs() {
	    	return ContasAPagarDAO.getInstance().consultaTotalRegs();
	    }
	    
		public String getdataCadastroFormatado(ContasAPagar a)
		{
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			return formato.format(a.getData());
		}
}
