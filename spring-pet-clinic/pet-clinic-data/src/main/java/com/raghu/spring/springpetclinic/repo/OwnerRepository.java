package com.raghu.spring.springpetclinic.repo;

import org.springframework.data.repository.CrudRepository;

import com.raghu.spring.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
