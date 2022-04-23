package com.raghu.spring.springpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Visit;
import com.raghu.spring.springpetclinic.services.VisitService;

@Service
@Profile({"default", "map"})

public class VisitServiceMap extends AbstractServiceMap<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit) {
		if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
				|| visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException(" No PET / OWNER Mapped to Visit .");
		} else {
			return super.save(visit);
		}
	}

	@Override
	public void delete(Visit o) {
		// TODO Auto-generated method stub
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
