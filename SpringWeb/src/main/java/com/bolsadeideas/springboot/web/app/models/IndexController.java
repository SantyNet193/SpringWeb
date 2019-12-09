package com.bolsadeideas.springboot.web.app.models;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("paramPadre")
public class IndexController {
	
	@RequestMapping(value = {"index"} , method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("parametro1","Hello World / Hola Mundo -> CON MODEL");
		return "index";
	}
	
	@GetMapping("/index2")
	public String index(Map<String, Object> map) {
		map.put("parametro1","Hello World / Hola Mundo -> con MAP");
		return "index";
	}
	
	@GetMapping("/index3")
	public ModelAndView index(ModelAndView mav) {
		mav.addObject("parametro1","Hello World / Hola Mundo -> con Model and View");
		mav.setViewName("index");
		return mav;
	}
	
	
}
