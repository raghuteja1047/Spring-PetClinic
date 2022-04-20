package com.raghu.spring.springpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.spring.springpetclinic.services.VetService;

@Controller
public class VetController {
	VetService vetService;

	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping("/vets")
	public String getPets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
	
}
