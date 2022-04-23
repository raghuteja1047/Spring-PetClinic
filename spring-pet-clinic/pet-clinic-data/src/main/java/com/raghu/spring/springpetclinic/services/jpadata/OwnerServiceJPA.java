package com.raghu.spring.springpetclinic.services.jpadata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.repo.OwnerRepository;
import com.raghu.spring.springpetclinic.repo.PetRepository;
import com.raghu.spring.springpetclinic.repo.PetTypeRepository;
import com.raghu.spring.springpetclinic.services.OwnerService;
@Service
@Profile("SpringJPA")
public class OwnerServiceJPA implements OwnerService{
	
	OwnerRepository ownerRepository;
	PetTypeRepository petTypeRepository;
	PetRepository petRepository;
	
	
	
	public OwnerServiceJPA(OwnerRepository ownerRepository, PetTypeRepository petTypeRepository,
			PetRepository petRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petTypeRepository = petTypeRepository;
		this.petRepository = petRepository;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner o) {
		return ownerRepository.save(o);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<Owner>();
		ownerRepository.findAll().iterator().forEachRemaining(owners::add);;
		return owners;
	}

	@Override
	public void delete(Owner o) {
		ownerRepository.delete(o);
	}

	@Override
	public void deleteById(Long id) {
			ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lname) {
		
		return null;
	}

}
