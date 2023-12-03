import java.util.Scanner;
public class Ejercicio5AulaVirtual {
	
	public static void rellenarArray(int array[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce numero: ");
			array[i] = teclado.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*Crear un programa que lea por teclado una tabla de 10 n�meros enteros y las desplace una posici�n hacia abajo:
		  el primero pasa a ser el segundo, el segundo pasa a ser el tercero y as� sucesivamente. El �ltimo pasa a ser
		  el primero.*/
		int array[] = new int[10];
		
		rellenarArray(array);
		
		int ultimo = array[array.length - 1];
		
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		
		array[0] = ultimo;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
	}

}
