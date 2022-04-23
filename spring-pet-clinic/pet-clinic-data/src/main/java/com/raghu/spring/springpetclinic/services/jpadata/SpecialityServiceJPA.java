package com.raghu.spring.springpetclinic.services.jpadata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Speciality;
import com.raghu.spring.springpetclinic.repo.SpecialityRepository;
import com.raghu.spring.springpetclinic.services.SpecialitiesService;
@Service
@Profile("SpringJPA")
public class SpecialityServiceJPA implements SpecialitiesService {

	SpecialityRepository repository;

	
	public SpecialityServiceJPA(SpecialityRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Speciality findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality o) {
		return repository.save(o);
	}

	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		Set<Speciality> specialities = new HashSet<Speciality>();
		repository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public void delete(Speciality o) {
		// TODO Auto-generated method stub
		repository.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
