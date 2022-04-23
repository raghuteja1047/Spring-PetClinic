package com.raghu.spring.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Speciality;
import com.raghu.spring.springpetclinic.services.SpecialitiesService;
@Service
public class SpecialityServiceMap extends AbstractServiceMap<Speciality, Long> implements SpecialitiesService {

	@Override
	public Speciality save(Speciality o) {
		// TODO Auto-generated method stub
		return super.save(o);
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Speciality o) {
		// TODO Auto-generated method stub
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

}
