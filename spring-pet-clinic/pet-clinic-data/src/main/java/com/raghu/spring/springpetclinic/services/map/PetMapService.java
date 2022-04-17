package com.raghu.spring.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Pet;
import com.raghu.spring.springpetclinic.services.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public void delete(Pet o) {
		// TODO Auto-generated method stub
		super.delete(o);
	}
	
	@Override
	public  void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}@Override
	public Pet save(Pet o) {
		// TODO Auto-generated method stub
		return super.save(o);
	}

}
