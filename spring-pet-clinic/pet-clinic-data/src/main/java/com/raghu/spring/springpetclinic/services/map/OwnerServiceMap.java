package com.raghu.spring.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
	
	@Override
	public Owner findByLastName(String lname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Owner o) {
		// TODO Auto-generated method stub
		super.delete(o);
	}

	@Override
	public
	Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}
	
	@Override
	public Owner save( Owner o) {
		// TODO Auto-generated method stub
		return super.save( o);
	}
	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
}
