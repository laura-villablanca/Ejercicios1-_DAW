import java.util.Scanner;
public class Ejercicio12AulaVirtual {
	
	public static void imprimirArray(int[]array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crear un vector entero en donde almacene 10 número e imprimir dicho números.
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce valor: ");
			array[i] = teclado.nextInt();
		}
		imprimirArray(array);
	}

}
