package org.villablanca.deportistas;

import java.util.HashMap;
import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Deportista> deportistas = new HashMap<>();
		Atleta pepe = new Atleta("12345678", "Pepe");
		Ciclista maria = new Ciclista("123456789", "Maria");
		System.out.println(deportistas.values());//devuelve tipo Deportista
		System.out.println(deportistas.keySet());//devuelve llave: String
	}

}
