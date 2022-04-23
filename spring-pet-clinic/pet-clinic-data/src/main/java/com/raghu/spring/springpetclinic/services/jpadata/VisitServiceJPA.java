package com.raghu.spring.springpetclinic.services.jpadata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Visit;
import com.raghu.spring.springpetclinic.repo.VisitRepository;
import com.raghu.spring.springpetclinic.services.VisitService;

@Service
@Profile("SpringJPA")

public class VisitServiceJPA implements VisitService {

	VisitRepository repository;

	public VisitServiceJPA(VisitRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit o) {
		// TODO Auto-generated method stub
		return repository.save(o);
	}

	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		Set<Visit> visits = new HashSet<Visit>();
		repository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public void delete(Visit o) {
		// TODO Auto-generated method stub
		repository.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
