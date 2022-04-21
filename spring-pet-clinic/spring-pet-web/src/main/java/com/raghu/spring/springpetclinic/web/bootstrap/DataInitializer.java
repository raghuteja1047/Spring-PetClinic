package com.raghu.spring.springpetclinic.web.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.model.Pet;
import com.raghu.spring.springpetclinic.model.PetType;
import com.raghu.spring.springpetclinic.model.Vet;
import com.raghu.spring.springpetclinic.services.OwnerService;
import com.raghu.spring.springpetclinic.services.PetTypeService;
import com.raghu.spring.springpetclinic.services.VetService;

@Component
public class DataInitializer implements CommandLineRunner {

	private final OwnerService ownerService;

	private final VetService vetService;

	private final PetTypeService petTypeService;

	public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");

		PetType cat = new PetType();
		cat.setName("Cat");

		petTypeService.save(dog);
		petTypeService.save(cat);

		Pet raghuPet = new Pet();
		raghuPet.setName("Puppy Bow");
		raghuPet.setBirthDate(LocalDate.now());
		raghuPet.setPetType(dog);

		Owner o1 = new Owner();
		o1.setFirstName("Raghu");
		o1.setLastName("Teja");
		o1.setCity("Nellore");
		o1.setAddress("Gupta Park Center");
		o1.setTelephone("8123044483");
		raghuPet.setOwner(o1);
		o1.getPets().add(raghuPet);

		Pet rajenderPet = new Pet();
		rajenderPet.setName("Miyam Miyam Pilli");
		rajenderPet.setBirthDate(LocalDate.now());
		rajenderPet.setPetType(cat);

		Owner o2 = new Owner();
		o2.setFirstName("Rajender");
		o2.setLastName("cheganti");
		o2.setCity("Nizamabad");
		o2.setAddress("Lawyers Colony Center");
		o2.setTelephone("9868487565");
		rajenderPet.setOwner(o2);
		o2.getPets().add(rajenderPet);

		Owner o3 = new Owner();
		o3.setFirstName("Santhi");
		o3.setLastName("Priya");
		o3.setCity("Nellore");
		o3.setAddress("Rebala Vari Street");
		o3.setTelephone("9686754515");

		Pet santhiPet = new Pet();
		santhiPet.setName("Lucky Bow");
		santhiPet.setBirthDate(LocalDate.now());
		santhiPet.setPetType(dog);
		
		ownerService.save(o1);
		ownerService.save(o2);
		ownerService.save(o3);

		Vet v1 = new Vet();
		Vet v2 = new Vet();
		Vet v3 = new Vet();

		v1.setFirstName("Subba");
		v2.setFirstName("Sujith");
		v3.setFirstName("Srikanth");

		v1.setLastName("Rao");
		v2.setLastName("Kumar");
		v3.setLastName("Koma");

		vetService.save(v1);
		vetService.save(v2);
		vetService.save(v3);
	}

}
