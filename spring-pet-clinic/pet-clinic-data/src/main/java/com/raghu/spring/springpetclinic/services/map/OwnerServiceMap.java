package com.raghu.spring.springpetclinic.services.map;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.model.Pet;
import com.raghu.spring.springpetclinic.services.OwnerService;
import com.raghu.spring.springpetclinic.services.PetService;
import com.raghu.spring.springpetclinic.services.PetTypeService;

@Service
@Profile({ "default", "map" })
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService {

	PetTypeService petTypeService;
	PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

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
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		System.out.println("MAP MAP");
		System.out.println(super.findAll().size());
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner obj) {
		if (obj != null) {
			if (!obj.getPets().isEmpty()) {
				obj.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() != null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is mandatory");
					}
					if (pet.getId() == null) {
						Pet SavedPet = petService.save(pet);
						pet.setId(SavedPet.getId());
					}
				});
			}
			return super.save(obj);
		} else {

			return null;
		}
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
	
	@Override
	public List<Owner> findAllByLastNameLike(String lastname) {
		return null;
	}
}
