package org.villablanca.deportistas;

public class Ciclista extends Deportista {
	private String nombre_prueba;
	private int numero_etapas;
	private int puestoClasificacion_general;
	private int numero_etapas_ganadas;
	
	public Ciclista(String nombre_prueba, int numero_etapas, int puestoClasificacion_general,
			int numero_etapas_ganadas) {
		super();
		this.nombre_prueba = nombre_prueba;
		this.numero_etapas = numero_etapas;
		this.puestoClasificacion_general = puestoClasificacion_general;
		this.numero_etapas_ganadas = numero_etapas_ganadas;
	}

	public Ciclista(String dni, String nombre) {
		super(dni, nombre);
	}

}
