package com.raghu.spring.springpetclinic.repo;

import org.springframework.data.repository.CrudRepository;

import com.raghu.spring.springpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
