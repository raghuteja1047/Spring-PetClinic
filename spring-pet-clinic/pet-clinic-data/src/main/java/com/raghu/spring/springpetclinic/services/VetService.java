package com.raghu.spring.springpetclinic.services;

import java.util.Set;

import com.raghu.spring.springpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet o);

	Set<Vet> findAll();

	
}
