import java.util.Scanner;
public class Ejercicio1Examen {
	
	public static void pedirNombres(String nombre[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Introduce nombre y apellidos: ");
			nombre[i] = teclado.nextLine();
		}
	}
	
	public static void imprimirArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("["+array[i]+"]");
		}
	}
	
	public static char sacarIniciales(String nombre[]) {
		char inicial = ' ';
		
		for (int i = 1; i < nombre.length; i++) {
			inicial = nombre[i].charAt(i);
			if (Character.isLetter(inicial) && Character.isUpperCase(inicial)) {
				inicial = nombre[i].charAt(i);
			}
		}
		
		return inicial;
	}

	public static void main(String[] args) {
		// Imprimir las primeras letras de nombre y apellidos de 10 alumnos. 
		String nombre[] = new String[10];
		char iniciales = sacarIniciales(nombre);
		pedirNombres(nombre);
		System.out.println(iniciales);
		imprimirArray(nombre);
	}

}
