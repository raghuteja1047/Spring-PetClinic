package com.raghu.spring.springpetclinic.web.controllers;

import java.util.Set;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
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
import com.raghu.spring.springpetclinic.model.PetType;
import com.raghu.spring.springpetclinic.services.OwnerService;
import com.raghu.spring.springpetclinic.services.PetService;
import com.raghu.spring.springpetclinic.services.PetTypeService;
import static com.raghu.spring.springpetclinic.utils.PetClinicConstants.*;

@Controller
@RequestMapping("owners/{ownerId}/pets")
public class PetController {

	OwnerService ownerService;
	PetTypeService petTypeService;
	PetService petService;

	public PetController(OwnerService ownerService, PetTypeService petTypeService, PetService petService) {
		super();
		this.ownerService = ownerService;
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@RequestMapping("/")
	public String getPets() {
		return "pets/index";
	}

	@InitBinder("owner")
	public void initOwnerBinder(WebDataBinder binder) {
		// TODO Auto-generated method stub
		binder.setDisallowedFields("id");
	}

	@ModelAttribute("owner")
	public Owner findOwner(@PathVariable("ownerId") Long id) {
		System.out.println("Owner Id " + id);
		return ownerService.findById(id);
	}

	@ModelAttribute("types")
	public Set<PetType> populatePetType() {
		return petTypeService.findAll();
	}

	@GetMapping("/new")
	public String initCreationForm(Owner owner, Model model) {
		Pet pet = Pet.builder().build();
		pet.setOwner(owner);
		owner.getPets().add(pet);
		model.addAttribute("pet", pet);
		return VIEWS_PET_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping("/new")
	public String processCreationForm(Owner owner, @Validated Pet pet, BindingResult dataBinder, Model model) {
		System.out.println("Entered Processing Form");
		if (StringUtils.isEmpty(pet.getName()) && pet.isNew() && owner.getPet(pet.getName(), true) != null) {
			dataBinder.rejectValue("name", "duplicate", "already Exists");
		}
		owner.getPets().add(pet);
		if (dataBinder.hasErrors()) {
			model.addAttribute("pet", pet);
			return VIEWS_PET_CREATE_OR_UPDATE_FORM;
		} else {
			petService.save(pet);
			return "redirect:/owner/"+owner.getId();
		}
	}

	@GetMapping("/{petId}/edit")
	public String initUpdationForm(@PathVariable("petId") Long id, Model model) {
		model.addAttribute("pet", petService.findById(id));
		return VIEWS_PET_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping("/{petId}/edit")
	public String processUpdationForm(Owner owner, @Validated Pet pet, BindingResult dataBinder, Model model) {

		System.out.println("Entered Processing Update Form");
		if (dataBinder.hasErrors()) {
			pet.setOwner(owner);
			model.addAttribute("pet", pet);
			return VIEWS_PET_CREATE_OR_UPDATE_FORM;
		} else {
			owner.getPets().add(pet);
			petService.save(pet);
			return "redirect:/"+VIEWS_OWNER_HOME_LOCATION+"/"+owner.getId();
		}
	}


	
}
	