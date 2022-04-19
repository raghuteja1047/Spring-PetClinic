package com.raghu.spring.springpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.spring.springpetclinic.services.OwnerService;
@Controller
public class OwnersController {
	
	OwnerService ownerService;
	
	public OwnersController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping("/owners")
	public String getPets(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

}
