package com.raghu.spring.springpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raghu.spring.springpetclinic.model.Owner;
import com.raghu.spring.springpetclinic.services.OwnerService;
@Controller
@RequestMapping("/owners")
public class OwnersController {
	
	OwnerService ownerService;
	
	public OwnersController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping("")
	public String getOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
	
    @RequestMapping("/find")
    public String findOwners(Model model){
    	Owner o  = new Owner();
        model.addAttribute("owner", o);
        return "owners/findOwners";
    }

	
	@GetMapping("/{ownerId}")
	public ModelAndView showOwner(@PathVariable Long ownerId) {
		System.out.println("Inside Show Owner");
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		mav.addObject("owner",ownerService.findById(ownerId));
	//	mav.addObject(null, mav)
		return mav;
	}

}
