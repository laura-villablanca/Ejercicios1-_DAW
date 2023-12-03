import java.util.Scanner;
public class Ejercicio4 {
	
	public static int suspenso(double nota[]) {
		int suspenso = 0;
		
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] > 0 && nota[i] <= 4.99) {
				suspenso++;
			}
		}
		
		return suspenso;
	}
	
	public static int bien(double nota[]) {
		int bien = 0;
		
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] >= 5 && nota[i] <= 6.99) {
				bien++;
			}
		}
		
		return bien;
	}
	
	public static int notable(double nota[]) {
		int notable = 0;
		
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] >= 7 && nota[i] <= 8.99) {
				notable++;
			}
		}
		
		
		return notable;
	}
	
	public static int sobresaliente(double nota[]) {
		int sobresaliente = 0;
		
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] >= 9 && nota[i] <= 10) {
				sobresaliente++;
			}
		}
		
		return sobresaliente;
	}

	public static void main(String[] args) {
		/* Crea un array de números de 10 posiciones donde insertaremos notas entre 0 y 10 (debemos controlar que inserte una 
		 * nota valida), pudiendo ser decimal la nota en el array de números.

		   Si la nota esta entre 0 y 4,99 , sera un suspenso
	       Si esta entre 5 y 6,99 , sera un bien.
	       Si esta entre 7 y 8,99 sera un notable.
           Si esta entre 9 y 10 sera un sobresaliente.
           
		   Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que creas conveniente.
		  */
		Scanner teclado = new Scanner(System.in);
		//Declaración de array
		double nota[] = new double[10];
		//Pedir notas
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Introduce nota: ");
			nota[i] = teclado.nextDouble();
		}
		
		int suspenso = suspenso(nota);
		int bien = bien(nota);
		int notable = notable(nota);
		int sobresaliente = sobresaliente(nota);
		
		System.out.println("Hay " + suspenso + " alumnos suspensos.");
		System.out.println("Hay " + bien + " alumnos con bienes.");
		System.out.println("Hay " + notable + " alumnos con notable.");
		System.out.println("Hay " + sobresaliente + " alumnos con sobresaliente.");
	}

}
