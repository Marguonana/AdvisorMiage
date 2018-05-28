package dao;

import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class GenericDAO<T> {

	protected Class<T> entityClass;

	@PersistenceContext
	protected EntityManager em;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdd_advisor");
		em = emf.createEntityManager();
	}

	public T create(T t) {
		this.em.persist(t);
		return t;
	}

	public T update(T t) {
		return this.em.merge(t);
	}

	public void delete(T t) {
		t = this.em.merge(t);
		this.em.remove(t);
	}
	
	///////////////////////////////////////////////////////////////////////////
	///////////////                    Query                    ///////////////
	///////////////////////////////////////////////////////////////////////////
	
	
	public T singleByQuery(String query) {
		return this.singleByQuery(query, null);
	}

	@SuppressWarnings("unchecked")
	public T singleByQuery(String query, Map<String, Object> parameters) {
		Query q = em.createQuery(query);

		T result = (T) q.getSingleResult();
		return result;
	}

	public List<T> listByQuery(String suery) {
		return this.listByQuery(suery, null);
	}

	@SuppressWarnings("unchecked")
	public List<T> listByQuery(String query, Map<String, Object> parameters) {
		Query q = em.createNamedQuery(query);

		List<T> results = q.getResultList();
		return results;
	}
	
	///////////////////////////////////////////////////////////////////////////
	///////////////                 Named Query                 ///////////////
	///////////////////////////////////////////////////////////////////////////

	
	public T singleByNamedQuery(String namedQuery) {
		return this.singleByNamedQuery(namedQuery, null);
	}

	@SuppressWarnings("unchecked")
	public T singleByNamedQuery(String namedQuery, Map<String, Object> parameters) {
		Query query = em.createNamedQuery(namedQuery);

		if (parameters != null) {
			Iterator<String> i = parameters.keySet().iterator();

			while (i.hasNext()) {
				String clef = i.next();
				query.setParameter(clef, parameters.get(clef));
			}
		}

		T result = (T) query.getSingleResult();
		return result;
	}

	public List<T> listByNamedQuery(String namedQuery) {
		return this.listByNamedQuery(namedQuery, null);
	}

	@SuppressWarnings("unchecked")
	public List<T> listByNamedQuery(String namedQuery, Map<String, Object> parameters) {
		Query query = em.createNamedQuery(namedQuery);

		if (parameters != null) {
			Iterator<String> i = parameters.keySet().iterator();

			while (i.hasNext()) {
				String clef = i.next();
				query.setParameter(clef, parameters.get(clef));
			}
		}

		List<T> results = query.getResultList();
		return results;
	}
}