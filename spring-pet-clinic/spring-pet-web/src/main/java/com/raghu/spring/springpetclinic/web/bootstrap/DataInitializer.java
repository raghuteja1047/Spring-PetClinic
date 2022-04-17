package com.raghu.spring.springpetclinic.web.bootstrap;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.services.OwnerService;
import com.raghu.spring.springpetclinic.services.PetService;

@Component
public class DataInitializer implements CommandLineRunner {

	
	private final OwnerService ownerService;
	
	private final PetService petService;
	
	public DataInitializer(OwnerService ownerService, PetService petService) {
		super();
		this.ownerService = ownerService;
		this.petService = petService;
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
	
		
		
	}

}
