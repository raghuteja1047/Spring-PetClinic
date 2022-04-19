package com.raghu.spring.springpetclinic.web.bootstrap;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.model.Vet;
import com.raghu.spring.springpetclinic.services.OwnerService;
import com.raghu.spring.springpetclinic.services.PetService;
import com.raghu.spring.springpetclinic.services.VetService;

@Component
public class DataInitializer implements CommandLineRunner {

	
	private final OwnerService ownerService;
	
	private final VetService vetService;
	
	public DataInitializer(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner o1 = new Owner();
		o1.setFirstName("Raghu");
		o1.setLastName("Teja");

		Owner o2 = new Owner();
		o2.setFirstName("Rajender");
		o2.setLastName("cheganti");

		Owner o3 = new Owner();
		o3.setFirstName("Santhi");
		o3.setLastName("Priya");
	
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
