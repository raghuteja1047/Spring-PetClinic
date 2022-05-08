package com.raghu.spring.springpetclinic.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.model.Pet;
import com.raghu.spring.springpetclinic.model.Visit;
import com.raghu.spring.springpetclinic.services.OwnerService;
import com.raghu.spring.springpetclinic.services.PetService;
import com.raghu.spring.springpetclinic.services.VisitService;
import com.raghu.spring.springpetclinic.utils.PetClinicConstants;


@RequestMapping("owners/{ownerId}/pets/{petId}")
@Controller
public class VisitController {

	PetService petService;
	VisitService visitService;
	OwnerService ownerService;

	public VisitController(PetService petService, VisitService visitService, OwnerService ownerService) {
		super();
		this.petService = petService;
		this.visitService = visitService;
		this.ownerService = ownerService;
	}

	@InitBinder("pet")
	public void initPetBinder(WebDataBinder binder) {
		System.out.println("***** initPetBinder ******");

		// TODO Auto-generated method stub
		binder.setDisallowedFields("id");
	}

	@ModelAttribute("pet")
	public Pet findPet(@PathVariable("petId") Long id) {
		System.out.println("***** findPet ******");

		System.out.println("Pet Id " + id);
		return petService.findById(id);
	}
	
	

	@ModelAttribute("owner")
	public Owner findOwner(@PathVariable("ownerId") Long id) {
		System.out.println("***** findOwner ******");
		System.out.println("Owner Id " + id);
		return ownerService.findById(id);
	}

	@GetMapping("visits/new")
	public String initVisitCreationForm(Pet pet, Model model) {
		System.out.println("***** initVisitCreationForm ******");
		Visit visit = Visit.builder().build();
		visit.setPet(pet);
		pet.getVisits().add(visit);
		model.addAttribute("visit", visit);
		return PetClinicConstants.VIEWS_VISIT_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping("visits/new")
	public String processVisitCreationForm(Pet pet, @Validated Visit visit, BindingResult result, Model model) {
		System.out.println("***** processVisitCreationForm ******");
		if (result.hasErrors()) {
			model.addAttribute("visit", visit);
			return PetClinicConstants.VIEWS_VISIT_CREATE_OR_UPDATE_FORM;
		}
		if (visit.isNew()) {
			visit.setPet(pet);
			pet.getVisits().add(visit);
			visitService.save(visit);
			return "redirect:/" + PetClinicConstants.VIEWS_OWNER_HOME_LOCATION + "/" + "pets" + pet.getId();
		}
		return "redirect:/owners/";
	}

}
