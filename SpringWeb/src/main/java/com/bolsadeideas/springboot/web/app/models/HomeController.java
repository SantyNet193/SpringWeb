package com.bolsadeideas.springboot.web.app.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "redirect:/paramPadre/index"; // redirige
		//return "forward:/app/";
	}
	
}
