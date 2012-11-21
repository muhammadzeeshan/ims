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
	public void save(E obj) {
		daoObj.save(obj);
	}

	@Override
	@Transactional
	public E merge(E obj) {
		return daoObj.merge(obj);
	}

	@Override
	public void delete(E obj) {
		daoObj.delete(obj);
	}

	@Override
	public Collection<E> getAll() {
		return daoObj.getAll();
	}

}
