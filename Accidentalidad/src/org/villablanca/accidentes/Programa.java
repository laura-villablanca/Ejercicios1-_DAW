package org.villablanca.accidentes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import daw.com.Teclado;

public class Programa {
	
	public ArrayList<AccidenteTrafico> accidentes;
	
	public Programa() {
		this.accidentes = new ArrayList<AccidenteTrafico>();
	}
	
	public AccidenteTrafico leerAccidentes(String linea) {
		AccidenteTrafico accidente = new AccidenteTrafico();
		StringTokenizer st = new StringTokenizer(linea, ";");
		
		//System.out.println("Leer accidentes");
		accidente.setNumExpediente(st.nextToken());
		accidente.setFecha(st.nextToken());
		accidente.setHora(st.nextToken());
		accidente.setLocalizacion(st.nextToken());
		accidente.setNumero(st.nextToken());
		accidente.setCodigoDistrito(st.nextToken());
		accidente.setDistrito(st.nextToken());
		accidente.setTipo_accidente(st.nextToken());
		accidente.setEstadoMeteorologico(st.nextToken());
		accidente.setTipoVehiculo(st.nextToken());
		accidente.setTipoPersona(st.nextToken());
		accidente.setTramoEdad(st.nextToken());
		accidente.setSexo(st.nextToken());
		accidente.setLesividad(st.nextToken());
		st.nextToken();
		st.nextToken();
		st.nextToken();
		accidente.setPositivoAlcohol("S".equalsIgnoreCase(st.nextToken()));
		accidente.setPositivoDrogas("1".equalsIgnoreCase(st.nextToken()));
		return accidente;
	}
	
	public void leerCSV() {
		File carpeta;
		String linea = "";
		ArrayList<AccidenteTrafico> accidentes = null;
		int i = 0, opcion;
		BufferedReader input = null;
		String rutaCarpeta = "";
		carpeta = pedirRutaCarpeta();
		ArrayList<File> archivos = muestraFicherosCSV(carpeta);
	
			do {
				System.out.println("Dime el fichero CSV a leer: ");
				opcion = Teclado.leerInt();
			} while (opcion <= 0 || opcion > archivos.size());
			opcion--;
			try {
				input = new BufferedReader(new FileReader(archivos.get(opcion)));
				linea = input.readLine();
				
				while((linea = input.readLine()) != null) {
					linea = input.readLine();
					leerAccidentes(linea);
				}
				
			} catch(IOException ex) {
				System.out.println("Error E/S: " + ex.getMessage());
			} finally {
				if(input != null) {
					try {
						input.close();
					} catch (IOException ex) {
						System.out.println("Error E/S " + ex.getMessage());
					}
				}
			}
		}

	private ArrayList<File> muestraFicherosCSV(File carpeta) {
		ArrayList<File> archivos = new ArrayList<File>();
		System.out.println("Ficheros.csv dentro de " + carpeta.getAbsolutePath());
		if(carpeta.isDirectory()) {
			for(File fichero: carpeta.listFiles()) {
				if(fichero.isFile() && fichero.getAbsolutePath().endsWith(".csv")) {
					archivos.add(fichero);
					System.out.println(archivos.size() + "]" + fichero.getAbsolutePath());
				}
			}
			
		}
		return archivos;
		
	}

	private File pedirRutaCarpeta() {
		File carpeta;
		String rutaCarpeta;
		do {
		System.out.println("Introduce ruta fichero: ");
		rutaCarpeta = Teclado.leerString();
		carpeta = new File(rutaCarpeta);
		} while(!carpeta.isDirectory());
		return carpeta;
	}
	
	public void ejecutar() {
		leerCSV();
		accidentesConAlcohol(new ArrayList<AccidenteTrafico>(accidentes));
	}

	private void accidentesConAlcohol(List<AccidenteTrafico> accidentes) {
		Iterator<AccidenteTrafico> it = accidentes.iterator();
		while(it.hasNext()) {
			AccidenteTrafico accidente = it.next();
			if(!accidente.isPositivoAlcohol()) {
				it.remove();
			}
			
		}
		Collections.sort(accidentes, new ComparadorAccidentesPorBarrios());
		mostrar(accidentes);
		/*accidentes.add(new AccidenteTrafico());
		accidentes.remove(new AccidenteTrafico());
		accidentes.contains(new AccidenteTrafico());
		 */
	}
	
	
	private void mostrar(List<AccidenteTrafico> accidentes2) {
		for(AccidenteTrafico accidente: accidentes2) {
			System.out.println(accidente.getDistrito() + "\t"
					+ accidente.getNumExpediente() + "\t"
					+ accidente.getTipo_accidente() + "\t"
					+ (accidente.isPositivoAlcohol()?"Positivo Alcohol":"0.0")
					);
		}
	}

	public static void main(String[] args) {
		Programa programa = new Programa();
		programa.ejecutar();
	}

}
