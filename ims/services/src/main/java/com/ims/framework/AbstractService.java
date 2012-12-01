package com.ims.framework;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public abstract class AbstractService<E, D extends AbstractDAO<E> > implements CommonOperations<E> {
	

	@Autowired
	protected D daoObj;

	@Override
	public void persist(E obj) {
		daoObj.persist(obj);
	}

	@Override
	
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
