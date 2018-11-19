package control;

import java.util.List;

import dao.BasicDAO;
import dao.ClienteDAO;

import model.Cliente;

public class ClienteController {

	private static ClienteController clienteController;
	
	  public static ClienteController getInstance() {
	        if (clienteController == null) {
	        	clienteController = new ClienteController();
	        }
	        return clienteController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Cliente>(new Cliente()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Cliente cliente) {
	    new BasicDAO<Cliente>(cliente).persistir();
	    }
	    
	    public void deletar(Cliente cliente) {
	    	new BasicDAO<Cliente>(cliente).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Cliente>(new Cliente()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Cliente>(new Cliente()).consultaUltimoID();
	    }
	    
	    public Cliente buscarPoriD(Long id) {
	    	return (Cliente) new BasicDAO<Cliente>(new Cliente()).buscarPorId(id);
	    }
	    
	    public Long consultarRegs() {
	    	return ClienteDAO.getInstance().consultaTotalRegs();
	    }
	
	    public List<Cliente> consultar(String consulta){
	    	List<Cliente> teste = ClienteDAO.getInstance().consultar(consulta); 
	    	return teste;
	    }
}
