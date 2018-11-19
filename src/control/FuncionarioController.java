package control;

import java.util.List;

import dao.BasicDAO;
import dao.FuncionarioDAO;
import model.Funcionario;

public class FuncionarioController {
	
	private static FuncionarioController funcionarioController;
	
	  public static FuncionarioController getInstance() {
	        if (funcionarioController == null) {
	        	funcionarioController = new FuncionarioController();
	        }
	        return funcionarioController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Funcionario>(new Funcionario()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Funcionario funcionario) {
	    new BasicDAO<Funcionario>(funcionario).persistir();
	    }
	    
	    public void deletar(Funcionario funcionario) {
	    	new BasicDAO<Funcionario>(funcionario).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Funcionario>(new Funcionario()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Funcionario>(new Funcionario()).consultaUltimoID();
	    }
	    
	    public Funcionario buscarPoriD(Long id) {
	    	return (Funcionario) new BasicDAO<Funcionario>(new Funcionario()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return FuncionarioDAO.getInstance().consultaTotalRegs();
	    }
	    
	    public List<Funcionario> consultar(String consulta){
	    	List<Funcionario> a = FuncionarioDAO.getInstance().consultar(consulta);
	    	return a;
	    }
}
