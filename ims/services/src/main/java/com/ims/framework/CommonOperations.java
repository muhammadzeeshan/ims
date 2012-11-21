package com.ims.framework;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

public interface CommonOperations<E> {


	public void save(E obj);

	public E merge(E obj);

	public void delete(E obj);
	
	public Collection<E> getAll();
	
}
