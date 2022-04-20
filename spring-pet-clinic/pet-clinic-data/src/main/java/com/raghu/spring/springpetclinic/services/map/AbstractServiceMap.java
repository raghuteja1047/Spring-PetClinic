package com.raghu.spring.springpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.raghu.spring.springpetclinic.model.BaseEntity;

public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> {

	Map<ID, T> map = new HashMap<ID, T>();

	T findById(ID id) {
		return map.get(id);
	}

	T save(T o) {
		if (o != null) {
			if (o.getId() == null) {
				try {
					o.setId(getNextId());
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					o.setId(1L);
				}
			}
			map.put((ID) o.getId(), o);
		}else {
			throw new RuntimeException("Object not found");	
		}
		return o;
	}

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	void delete(T o) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(o));
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	private Long getNextId() {

		return Collections.max(map.keySet()) + 1;

	}
}
