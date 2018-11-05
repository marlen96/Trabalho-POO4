package dao;

import model.Funcionario;

public class FuncionarioDAO extends BasicDAO<Object> {

	public FuncionarioDAO(Object objeto) {
		super(objeto);
		// TODO Auto-generated constructor stub
	}
	
	private static FuncionarioDAO funcionarioDAO;
	
	public static FuncionarioDAO getInstance() {
		if (funcionarioDAO == null) funcionarioDAO = new FuncionarioDAO(Funcionario.class);
		return funcionarioDAO;
	}

}
