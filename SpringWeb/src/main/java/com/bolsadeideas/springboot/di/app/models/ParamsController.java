package com.bolsadeideas.springboot.di.app.models;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("paramPadre2")
public class ParamsController {

	@GetMapping(value = {"/" , "" , "index"})
	public String index() {
		return "params/index";
	}
	
	@GetMapping("/suma")
	public String suma(@RequestParam int parametro1,@RequestParam int parametro2 , Model mod) {
		int resultado = parametro1 + parametro2;
		mod.addAttribute("resultado","el resultado de la suma  es "  +(resultado));
		return "params/suma";
	}
	
	@GetMapping("/resta")
	public String resta(@RequestParam int parametro1,@RequestParam int parametro2 , Model mod , HttpServletRequest http) {
		int resultado;
		try {
			int param1 =  Integer.parseInt( http.getParameter("parametro1"));
			int param2 =  Integer.parseInt( http.getParameter("parametro2"));
			resultado = param1 - param2;
		}catch(NumberFormatException e) {
			resultado = 999;
		}
		
		mod.addAttribute("resultado","el resultado de la suma  es "  +(resultado));
		return "params/suma";
	}
}
