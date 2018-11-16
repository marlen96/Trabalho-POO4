package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Cliente;
import util.PersistenceUtil;

public class ClienteDAO extends BasicDAO<Object> {

	public ClienteDAO(Object objeto) {
		super(objeto);
	}

	private static ClienteDAO clienteDAO;
	
	public static ClienteDAO getInstance() {
		if (clienteDAO == null) clienteDAO = new ClienteDAO(Cliente.class);
		return clienteDAO;
	}
	
	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(c.id) from Cliente as c");
		
		return (Long) query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> consultar(String pesquisa) {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select a from Cliente as a " 
									+ "where (upper(a.nome) like :pesquisa) "
									+ "or (upper(a.cpf) like :pesquisa) "
									+ "or (upper(a.telefone) like :pesquisa) "
									+ "or (upper(a.rg) like :pesquisa)");
		query.setParameter("pesquisa", '%' + pesquisa.toUpperCase() + '%');

		return query.getResultList();
	}
}
