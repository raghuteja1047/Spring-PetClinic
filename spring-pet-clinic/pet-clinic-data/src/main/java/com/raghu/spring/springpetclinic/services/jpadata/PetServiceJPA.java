package com.raghu.spring.springpetclinic.services.jpadata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Pet;
import com.raghu.spring.springpetclinic.repo.PetRepository;
import com.raghu.spring.springpetclinic.services.PetService;
@Service
@Profile("SpringJPA")
public class PetServiceJPA implements PetService {

	PetRepository petRepository;

	public PetServiceJPA(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
		
	}

	@Override
	public Pet save(Pet o) {
		return petRepository.save(o);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<Pet>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public void delete(Pet o) {
		// TODO Auto-generated method stub
		petRepository.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

}
