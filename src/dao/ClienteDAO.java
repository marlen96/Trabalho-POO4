package dao;

import model.Cliente;

public class ClienteDAO extends BasicDAO<Object> {

	public ClienteDAO(Object objeto) {
		super(objeto);
	}

	private static ClienteDAO clienteDAO;
	
	public static ClienteDAO getInstance() {
		if (clienteDAO == null) clienteDAO = new ClienteDAO(Cliente.class);
		return clienteDAO;
	}
	
}
