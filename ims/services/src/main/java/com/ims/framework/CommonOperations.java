package com.ims.framework;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

public interface CommonOperations<E> {


	public void persist(E obj);

	public E merge(E obj);
	
	public Collection<E> getAll(Class<E> clazz);
	
	public E getById(Class<E> clazz, Long id);
	
}
