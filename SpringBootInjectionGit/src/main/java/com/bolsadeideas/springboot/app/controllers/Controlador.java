package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.app.models.Padre;

@Controller
@RequestMapping("padre")
public class Controlador {

	@Autowired
	Padre padre;
	
	@GetMapping("hijo")
	public String inicio(Model mod) {	
		
		mod.addAttribute("padre", padre);
		return "padre";
	}
	
}
