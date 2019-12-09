package com.bolsadeideas.springboot.app.controllers;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsadeideas.springboot.app.models.Hijos;

@Configuration
public class AppConfig {

	@Bean("hijos")
	public List<Hijos> hijos() {
		Hijos hijo1 = new Hijos();
		hijo1.setNombre("Santiago");		
		hijo1.setFechaNacimiento(LocalDate.of(1998, 03,9));
		int local = LocalDate.now().getYear();
		hijo1.setEdad(local);
		
		Hijos hijo2 = new Hijos();
		hijo2.setNombre("Santiago");		
		hijo2.setFechaNacimiento(LocalDate.of(1998, 03,9));
		int local2 = LocalDate.now().getYear();
		hijo2.setEdad(13);
		
		return Arrays.asList(hijo1,hijo2);
	
	}
	
}
