package com.ims.framework;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Transactional;

import com.ims.utility.Constants;


public abstract class AbstractDAO <E> implements CommonOperations<E> {

	private EntityManager entityManager;
	
	@PersistenceContext
	private void setEntityManager(EntityManager em){
		this.entityManager = em;
	}
	
	protected EntityManager getEntityManager(){
		return entityManager;
	}
	
	@Transactional
	public void persist(E obj) {
		entityManager.persist(obj);
	}

	@Transactional
	public E merge(E obj) {
		return entityManager.merge(obj);
	}

	@Override
	public Collection<E> getAll(Class<E> clazz) {
		
		CriteriaQuery<E> query = this.getEntityManager().getCriteriaBuilder().
				createQuery(clazz);
		
		query.select(query.from(clazz));
		
		return this.getEntityManager().createQuery(query).getResultList();
	}

	@Override
	public E getById(Class<E> clazz, Long id) {
		
		CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<E> query = builder.createQuery(clazz);
		
		Root<E> selectClause = query.from(clazz);
		query.select(selectClause);
		
		ParameterExpression<Long> longParam = builder.parameter(Long.class);
		query.where(builder.equal(selectClause.get("id"), longParam));

		ParameterExpression<String> StringParam = builder.parameter(String.class);
		query.where(builder.equal(selectClause.get("status"), StringParam));
		
		TypedQuery<E> q = this.getEntityManager().createQuery(query);
		q.setParameter(longParam,id);
		q.setParameter(StringParam,Constants.STATUS_ACTIVE.getValue());
		return q.getResultList().get(0);

	}
	
}
