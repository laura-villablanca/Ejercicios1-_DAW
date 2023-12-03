package org.villablanca.deportistas;

import java.time.LocalTime;

public class Atleta extends Deportista {
	private String lugar_prueba;
	private float distancia_recorrida;
	private LocalTime marca;
	
	public Atleta(String dni, String nombre) {
		super(dni, nombre);
	}

	public Atleta(String lugar_prueba, float distancia_recorrida, LocalTime marca) {
		super();
		this.lugar_prueba = lugar_prueba;
		this.distancia_recorrida = distancia_recorrida;
		this.marca = marca;
	}
	
	public String getLugarPrueba() {
		return lugar_prueba;
	}

	public String getLugar_prueba() {
		return lugar_prueba;
	}

	public void setLugar_prueba(String lugar_prueba) {
		this.lugar_prueba = lugar_prueba;
	}

	public float getDistancia_recorrida() {
		return distancia_recorrida;
	}

	public void setDistancia_recorrida(float distancia_recorrida) {
		this.distancia_recorrida = distancia_recorrida;
	}

	public LocalTime getMarca() {
		return marca;
	}

	public void setMarca(LocalTime marca) {
		this.marca = marca;
	}
	
	

}
