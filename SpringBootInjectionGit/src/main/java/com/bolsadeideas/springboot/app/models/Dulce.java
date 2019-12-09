package com.bolsadeideas.springboot.app.models;

public class Dulce {

	public String nombre;
	public Double precio;

	public Dulce() {

	}

	public Dulce(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
