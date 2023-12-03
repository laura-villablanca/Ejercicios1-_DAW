import java.util.Scanner;
public class Ejercicio14AulaVirtual {
	
	public static void imprimirArray(int[][]array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*Crear una aplicación que imprima la siguiente matriz.
			11 12 13 14 15
			21 22 23 24 25
			31 32 33 34 35*/
		int array[][] = new int[3][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Introduce número: ");
				array[i][j] = teclado.nextInt();
			}
		}
		imprimirArray(array);
	}

}
