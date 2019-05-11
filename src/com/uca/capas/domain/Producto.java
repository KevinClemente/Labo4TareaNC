package com.uca.capas.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



public class Producto {
	@NotEmpty(message="Este campo no puede estar vacio")
	@Size(message="La longitud maxima es de 30 caracteres",max=30)
	private String nombre;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Size(message="La longitud maxima es de 30 caracteres",max=30)
	private String marca;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Size(message="La longitud maxima es de 30 caracteres",max=30)
	private String descripcion;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Size(message="La longitud maxima es de 30 caracteres",max=30)
	private String categoria;

	@NotNull(message="Este campo no puede estar vacio")
	@DecimalMin( message = "El valor no debe ser begativo", value = "0.0")
	private BigDecimal precio;
	
	@NotNull(message="Este campo no puede estar vacio")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaDeVencimiento;	
	
	public Producto() {
		super();
	}

	public Producto(String nombre, String marca, String descripcion, String categoria, BigDecimal precio, Date fechaDeVencimiento) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Date getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(Date fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

}
