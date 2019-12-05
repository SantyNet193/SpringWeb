package com.bolsadeideas.springboot.di.app.models;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paramPadre3")
public class PathParams {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo","Recibir parametros de la  ruta @PathVariable");
		return "pathparams/index";
	}
	
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable(name="texto") String texto ,Model model) {
		model.addAttribute("titulo","Recibir parametros de la  ruta @PathVariable");
		model.addAttribute("resultado","El texto enviado en la ruta es ".concat(texto));
		return "pathparams/ver";
		
	}
}
