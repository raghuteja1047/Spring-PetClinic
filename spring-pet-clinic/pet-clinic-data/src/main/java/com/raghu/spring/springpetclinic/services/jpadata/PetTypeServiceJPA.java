package com.raghu.spring.springpetclinic.services.jpadata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.PetType;
import com.raghu.spring.springpetclinic.repo.PetTypeRepository;
import com.raghu.spring.springpetclinic.services.PetTypeService;

@Service
@Profile("SpringJPA")
public class PetTypeServiceJPA implements PetTypeService {

	PetTypeRepository petTypeRepository;

	public PetTypeServiceJPA(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType o) {
		return petTypeRepository.save(o);
	}

	@Override
	public Set<PetType> findAll() {
		HashSet<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public void delete(PetType o) {
		petTypeRepository.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}

}
