package com.raghu.spring.springpetclinic.services.jpadata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Vet;
import com.raghu.spring.springpetclinic.repo.VetRepository;
import com.raghu.spring.springpetclinic.services.VetService;

@Service
@Profile("SpringJPA")
public class VetServcieJPA implements VetService {

	VetRepository vetRepository;

	public VetServcieJPA(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet o) {
		return vetRepository.save(o);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public void delete(Vet o) {
		vetRepository.delete(o);

	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}

}
