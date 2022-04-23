package com.raghu.spring.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Speciality;
import com.raghu.spring.springpetclinic.model.Vet;
import com.raghu.spring.springpetclinic.services.SpecialitiesService;
import com.raghu.spring.springpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService {

	SpecialitiesService specialitiesService;

	public VetServiceMap(SpecialitiesService specialitiesService) {
		super();
		this.specialitiesService = specialitiesService;
	}

	@Override
	public void delete(Vet o) {
		super.delete(o);
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
	public Vet save(Vet obj) {
		if (obj != null) {
			if (obj.getSpecialities() != null) {
				obj.getSpecialities().forEach(spl -> {
					if (spl.getId() == null) {
						Speciality savedSpl = specialitiesService.save(spl);
						spl.setId(savedSpl.getId());
					}
				});

			}
			return super.save(obj);
		} else {
			return null;
		}
	}
}
