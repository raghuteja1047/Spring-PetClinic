package com.raghu.spring.springpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.PetType;
import com.raghu.spring.springpetclinic.services.PetTypeService;
@Service
@Profile({"default", "map"})

public class PetTypeServiceMap extends AbstractServiceMap<PetType, Long> implements PetTypeService {
	@Override

	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(PetType o) {
		// TODO Auto-generated method stub
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public PetType save(PetType o) {
		// TODO Auto-generated method stub
		return super.save(o);
	}

}
