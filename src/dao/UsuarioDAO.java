package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Usuario;
import util.PersistenceUtil;

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

	

	public Long consultaTotalRegs() {
		EntityManager em = PersistenceUtil.getEntityManager();

		Query query = em.createQuery("select count(u.id) from Usuario as u");
		
		return (Long) query.getSingleResult();
	}
}
