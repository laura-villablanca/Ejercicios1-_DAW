import java.util.Scanner;
public class Ejercicio1AulaVirtual {
	
	public static boolean esCreciente(int numero[]) {
		boolean esCreciente = true;
		
		for (int i = 1; i < numero.length; i++) {
			if (!(numero[i] > numero[i - 1])) {
				esCreciente = false;
			}
			
		}
		return esCreciente;
	}
	
	public static boolean esDecreciente(int numero[]) {
		boolean esDecreciente = true;
		
		for (int i = 1; i < numero.length; i++) {
			if (!(numero[i] < numero[i - 1])) {
				esDecreciente = false;
			}
		}
		
		
		return esDecreciente;
	}

	public static void main(String[] args) {
		/*
		Ejercicio 1

		LEER POR TECLADO 10 NÚMEROS ENTEROS. LA APLICACIÓN DEBE INDICARNOS SI LOS NÚMEROS ESTÁN ORDENADOS  DE FORMA CRECIENTE, DECRECIENTE O 
		DESORDENADOS.
		*/
		Scanner teclado = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce número: ");
			array[i] = teclado.nextInt();
			
			
		}
		if (esCreciente(array)) {
			System.out.println("La secuencia de números es CRECIENTE");
		} else if (esDecreciente(array)) {
			System.out.println("La secuencia de números es DECRECIENTE");
		} else {
			System.out.println("La secuencia de números es DESORDENADA");
		}
	}

}
