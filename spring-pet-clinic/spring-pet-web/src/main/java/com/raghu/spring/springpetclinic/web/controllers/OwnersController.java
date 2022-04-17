package com.raghu.spring.springpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class OwnersController {
	@RequestMapping("/owners")
	public String getPets() {
		return "owners/index";
	}

}
