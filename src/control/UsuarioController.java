package control;

import java.util.List;

import dao.BasicDAO;
import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioController {

	private static UsuarioController usuarioController;
	
	  public static UsuarioController getInstance() {
	        if (usuarioController == null) {
	        	usuarioController = new UsuarioController();
	        }
	        return usuarioController;
	    }
	
	  public List<Object> buscarTodos() {
		  List<Object> test = new BasicDAO<Usuario>(new Usuario()).buscarTodas();
		  return test;
	  }
	  
	    public void persistir(Usuario usuario) {
	    new BasicDAO<Usuario>(usuario).persistir();
	    }
	    
	    public void deletar(Usuario usuario) {
	    	new BasicDAO<Usuario>(usuario).remover();
	    }
	    
	    public Long buscarPrimeiroID() {
	    	return new BasicDAO<Usuario>(new Usuario()).consultaPrimeiroID();
	    }
	    
	    public Long buscarUltimoID() {
	    	return new BasicDAO<Usuario>(new Usuario()).consultaUltimoID();
	    }
	    
	    public Usuario buscarPoriD(Long id) {
	    	return (Usuario) new BasicDAO<Usuario>(new Usuario()).buscarPorId(id);
	    }
	
	    public Long consultarRegs() {
	    	return UsuarioDAO.getInstance().consultaTotalRegs();
	    }
	
}
