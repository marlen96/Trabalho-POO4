package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Funcionario;
import util.PersistenceUtil;

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
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(f.id) from Funcionario as f");
		
		return (Long) query.getSingleResult();
	}

}
