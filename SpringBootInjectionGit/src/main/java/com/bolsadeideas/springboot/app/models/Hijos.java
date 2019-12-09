package com.bolsadeideas.springboot.app.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.RequestScope;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;


public class Hijos {

	private String nombre;
	private LocalDate fechaNacimiento;
	private Integer edad;	
	public int contador = 0;
	
	
	public Hijos() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	
	

}
