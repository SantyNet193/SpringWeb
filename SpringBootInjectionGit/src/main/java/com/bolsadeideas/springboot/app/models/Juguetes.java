package com.bolsadeideas.springboot.app.models;

public class Juguetes {

	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Juguetes(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Juguetes() {}
	
}
