package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.PersistenceUtil;

public class BasicDAO <T>  {
	T objeto;
	
	
	public BasicDAO(T objeto) {
		this.objeto = objeto;
	}
	
	/**
	 * Remove um Autor 
	 * @param Autor
	 */
	public boolean remover() {
		EntityManager em = PersistenceUtil.getEntityManager();
		em.getTransaction().begin();
		try{
		em.remove(this.objeto);
		em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * Persite um Autor 
	 * @param Autor
	 * @return
	 */
	public Object persistir() {
		EntityManager em = PersistenceUtil.getEntityManager();
		em.getTransaction().begin();
		try {
			this.objeto = em.merge(this.objeto);
			em.getTransaction().commit();
			System.out.println("Registro gravado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.objeto;
	}
	
	
	/** 
	 * Busca todas as Cidades 
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Object> buscarTodas() {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("from " + objeto.getClass().getName() +  " as c ");
		return query.getResultList();
	}

	
	public Object buscarPorId(Long id) {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("from " + objeto.getClass().getName() +  " as c where c.id=" + id);
		return query.getSingleResult();
	}
	
	
	
	public Long consultaUltimoID() {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select max(a.id) from " + objeto.getClass().getName() +  " as a");
		return (Long) query.getSingleResult();
	}
	
	public Long consultaPrimeiroID() {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select min(a.id) from " + objeto.getClass().getName() +  " as a");
		return (Long) query.getSingleResult();
	}

	
}
