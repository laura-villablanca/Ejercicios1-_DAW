import java.util.Scanner;
public class EjercicioClase {
	
	public static void imprimir(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("[" + vector[i] + "]");
		
		}
		
	}
	
	public static void invertir(int [] vector) {
		int [] aux = new int[vector.length];//Declaramos un array auxiliar para no borrar los valores anteriores
		
		for (int i = 0; i < aux.length; i++) {
			aux[i] = vector[aux.length-1-i];
			
		}
		for (int i = 0; i < vector.length; i++) {
			vector[i] = aux[i];
		}
	}
	
	public static void invertir2(int [] vector) {
		
		for (int i = 0; i < vector.length/2; i++) {
			int aux = vector[i];
			vector[i] = vector[vector.length - 1 - i];
			vector[vector.length-1-i] = aux;
		}
		
	}

	public static void main(String[] args) {
		/*Array que pida el tamaño de un array. Si el tamaño es par, que invierta los valores, si es impar lo deja como está.*/
		Scanner teclado = new Scanner(System.in);
		
		int enteros[] = {7, 12, 9, 1, 5, 4};
		
		imprimir(enteros);
		invertir(enteros);
		System.out.println();
		imprimir(enteros);
		System.out.println();
		invertir2(enteros);
		System.out.println();
		imprimir(enteros);
		
	}

}
