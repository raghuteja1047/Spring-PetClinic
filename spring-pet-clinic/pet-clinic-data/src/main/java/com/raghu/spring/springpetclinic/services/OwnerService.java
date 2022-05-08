package com.raghu.spring.springpetclinic.services;

import java.util.List;

import com.raghu.spring.springpetclinic.model.Owner;

public interface OwnerService extends CurdService<Owner, Long> {

	Owner findByLastName(String lname);
	
	List<Owner> findAllByLastNameLike(String lastname);
}
