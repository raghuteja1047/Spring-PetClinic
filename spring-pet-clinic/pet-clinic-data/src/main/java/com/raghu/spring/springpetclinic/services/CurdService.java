package com.raghu.spring.springpetclinic.services;

import java.util.Set;

public interface CurdService<T, ID> {

	T findById(ID id);

	T save( T o);

	Set<T> findAll();

	void delete(T o);
	
	void deleteById(ID id);
}
