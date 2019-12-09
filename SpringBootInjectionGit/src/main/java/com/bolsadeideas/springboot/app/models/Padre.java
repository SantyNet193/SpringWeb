package com.bolsadeideas.springboot.app.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope
public class Padre {

	@Value("${padre.nombre}")
	private String nombre;
	@Value("${padre.apellido}")
	private String apellido;
	private LocalDate fechaNacimiento;
	private Integer edad;
	@Autowired
	@Qualifier("hijos")
	private List<Hijos> listaHijos;

	@PostConstruct
	public void init() {
		this.setFechaNacimiento(fechaNacimiento.of(1960, 03, 21));
		LocalDate fechaActual = LocalDate.now() ;
		int edad = fechaActual.getYear() - getFechaNacimiento().getYear();	
		this.setEdad(edad);
		int cont = 0;
		for(Hijos listaH : listaHijos) {
			cont +=1;
			listaH.contador =cont;
		}
	}
	
	public Padre() {
	}

	public Padre(String nombre, String apellido, LocalDate fechaNacimiento, Integer edad, List<Hijos> listaHijos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.listaHijos = listaHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public List<Hijos> getListaHijos() {
		return listaHijos;
	}

	public void setListaHijos(List<Hijos> listaHijos) {
		this.listaHijos = listaHijos;
	}

}
