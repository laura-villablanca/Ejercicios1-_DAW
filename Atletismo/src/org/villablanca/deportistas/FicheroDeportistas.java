package org.villablanca.deportistas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

public class FicheroDeportistas {
	
	private File archivo;
	
	public FicheroDeportistas(File archivo) {
		this.archivo = archivo;
	}
	
	public HashMap<String, Deportista> leerFichero() throws IOException{
		ObjectInputStream input = null;
		HashMap<String, Deportista> deportistas = new HashMap<String, Deportista>();
		input = new ObjectInputStream(new FileInputStream(archivo));
		int numero = input.readInt();
		for(int i = 1; i <= numero; i++ ) {
			char caracter = input.readChar();
			if(caracter=='A') {
				Atleta atleta;
				String dni = input.readUTF();
				String nombre = input.readUTF();
				atleta = new Atleta(dni, nombre);
				int hora = input.readInt();
				int minutos = input.readInt();
				int segundos = input.readInt();
				atleta.setMarca(null);
			}
		}
		
		return null;
	}
	
	public void escribirFichero(Collection<Deportista>deportistas) throws IOException {
		ObjectOutputStream out = null;
		out = new ObjectOutputStream(new FileOutputStream(archivo));
		out.writeInt(deportistas.size());
		for (Deportista deportista: deportistas) {
			if(deportista instanceof Atleta) {
				Atleta atleta = (Atleta)deportista;
				out.writeChar('A');
				out.writeUTF(atleta.getNombre());
				out.writeUTF(atleta.getDni());
				out.writeUTF(atleta.getLugarPrueba());
				//out.writeInt(atleta.getMarca().getHour());
				//out.writeInt(atleta.getMarca().getMinutes());
				//out.writeInt(atleta.getMarca().getSeconds());
				out.writeInt('A');
				out.writeInt('A');
			}
			if (deportista instanceof Ciclista) {
				out.writeChar('C');
			}
		}
	}

}
