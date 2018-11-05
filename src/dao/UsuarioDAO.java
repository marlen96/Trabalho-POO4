package dao;

import model.Usuario;

public class UsuarioDAO extends BasicDAO<Object> {

	public UsuarioDAO(Object objeto) {
		super(objeto);
		// TODO Auto-generated constructor stub
	}
	
	private static UsuarioDAO usuarioDAO;
	
	public static UsuarioDAO getInstance() {
		if (usuarioDAO == null) usuarioDAO = new UsuarioDAO(Usuario.class);
		return usuarioDAO;
	}

}
