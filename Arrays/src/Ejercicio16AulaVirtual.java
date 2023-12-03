import java.util.Scanner;
public class Ejercicio16AulaVirtual {
	
	public static void ubicacionDelNueve(int array[]) {
		//int ubicacion[] = new int[array.length];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 9) {
				System.out.println(array[i]);
			}
		}
	
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crear una aplicación para buscar un número en una matriz, e imprimir la ubicación de dicho número.
		int matriz[] = new int[10];
		int numero;
		//Elegimos el numero 9 para buscar
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Introduce número: ");
			numero = teclado.nextInt();
		}
		
		ubicacionDelNueve(matriz);
	}

}
