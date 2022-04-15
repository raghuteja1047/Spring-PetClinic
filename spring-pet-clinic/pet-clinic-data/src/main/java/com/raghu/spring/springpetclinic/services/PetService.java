package com.raghu.spring.springpetclinic.services;

import java.util.Set;

import com.raghu.spring.springpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet o);

	Set<Pet> findAll();

	
}
