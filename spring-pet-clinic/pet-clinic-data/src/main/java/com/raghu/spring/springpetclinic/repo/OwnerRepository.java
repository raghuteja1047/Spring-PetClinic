package com.raghu.spring.springpetclinic.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.raghu.spring.springpetclinic.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

	Optional<Owner> findByFirstName(String firstName);

	List<Owner> findAllByLastNameLike(@Param("lastName") String lastname);
}
