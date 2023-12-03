import java.util.*;
public class Ejercicio2 {
	
	public static int generarAleatorio() {
		Random aleatorio = new Random();
		return aleatorio.nextInt()+1;
	}
	
	public static boolean esPrimo(int numero) {
		int divisores = 0;
		boolean esPrimo = true;
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores++;
			}
		}
		if (divisores == 2) {
			esPrimo = true;
		} else {
			esPrimo = false;
		}
		
		
		return esPrimo;
	}
	
	public static int contenerNumerosAleatorios(int array[]) {
		int mayor = 0;
		int numeroAleatorio;
		
		for (int i = 0; i < array.length; i++) {
			numeroAleatorio = generarAleatorio();
			if(esPrimo(numeroAleatorio)) {
				if (array[i] > mayor) {
					mayor = array[i];
				}
			}
		}
		
		return mayor;
	}

	public static void main(String[] args) {
		// Crea un array de n�meros de un tama�o pasado por teclado, el array contendr� n�meros aleatorios primos entre los n�meros deseados,
		//por �ltimo nos indica cual es el mayor de todos.

		//Haz un m�todo para comprobar que el n�mero aleatorio es primo, puedes hacer todos lo m�todos que necesites.
		Scanner teclado = new Scanner(System.in);
		
		int numeros[] = new int[100];
		
		
		System.out.println("El numero primo aleatorio mayor es " + contenerNumerosAleatorios(numeros));
	}

}
