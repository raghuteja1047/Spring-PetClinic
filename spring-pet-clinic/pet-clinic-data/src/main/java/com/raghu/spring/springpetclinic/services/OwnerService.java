package com.raghu.spring.springpetclinic.services;

import java.util.Set;

import com.raghu.spring.springpetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lname);

	Owner findById(Long id);

	Owner save(Owner o);

	Set<Owner> findAll();

}
