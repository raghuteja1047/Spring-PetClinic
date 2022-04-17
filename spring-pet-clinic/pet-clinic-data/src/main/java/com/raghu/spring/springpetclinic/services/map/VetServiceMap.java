package com.raghu.spring.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Vet;
import com.raghu.spring.springpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	@Override
	public void delete(Vet o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet o) {
		// TODO Auto-generated method stub
		return super.save(o);
	}
}
