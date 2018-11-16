package dao;

import java.util.List;

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

	@SuppressWarnings("unchecked")
	public List<FuncionarioDAO> consultar(String pesquisa) {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("from Funcionario as inner join a.usuarios "
									+ "where (upper(a.nome) like :pesquisa) "
									+ "or (upper(a.email) like :pesquisa)"
									+ "or (upper(a.login) like :pesquisa)"
									+ "or (upper(a.telefone) like :pesquisa)");
		query.setParameter("pesquisa", '%' + pesquisa.toUpperCase() + '%');

		return query.getResultList();
	}
}
