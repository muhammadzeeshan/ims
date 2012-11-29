package com.ims.framework;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;


public abstract class AbstractService<E, D extends AbstractDAO<E> > implements CommonOperations<E> {
	

	protected D daoObj;
	
	@SuppressWarnings("unused")
	private void setDAOObj(D dao){
		this.daoObj = dao;
	}
	
	@Override
	@Transactional
	public void persist(E obj) {
		daoObj.persist(obj);
	}

	@Override
	@Transactional
	public E merge(E obj) {
		return daoObj.merge(obj);
	}

	public Collection<E> getAll(Class<E> clazz){
		return daoObj.getAll(clazz);
	}
	
	public E getById(Class<E> clazz, Long id){
		return daoObj.getById(clazz, id);
	}
	
}
