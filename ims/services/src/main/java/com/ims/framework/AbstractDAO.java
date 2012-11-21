package com.ims.framework;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;



public abstract class AbstractDAO <E> implements CommonOperations<E> {


	@PersistenceContext
	private EntityManager entityManager;
	
	private void setEntityManager(EntityManager em){
		this.entityManager = em;
	}
	
	protected EntityManager getEntityManager(){
		return entityManager;
	}
	
	@Transactional
	public void save(E obj){
		entityManager.persist(obj);
	}

	@Transactional
	public E merge(E obj){
		return entityManager.merge(obj);
	}

	@Transactional
	public void delete(E obj){
		entityManager.remove(obj);
	}

	@Override
	public Collection<E> getAll() {
		return null;
	}
}
