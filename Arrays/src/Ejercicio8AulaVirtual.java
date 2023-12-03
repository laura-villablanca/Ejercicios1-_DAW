import java.util.Scanner;
public class Ejercicio8AulaVirtual {
	
	public static void imprimirArray(int array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("[" + array[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	public static int contarDigitos(int numero) {
		
		int contador = 0;
		
		do {
			numero = numero/10;
			contador++;
		} while (numero != 0);
		
		return contador;
	}
	
	public static int[][] contadorDigitos(int[][]array) {
		int [][] digitos = new int [array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				digitos[i][j] = contarDigitos(array[i][j]);
			}
		}
		return digitos;
	}
	
	public static void main(String[] args) {
		// Contar el numero de dígitos de cada elemento de una matriz.
		Scanner teclado = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int digitos[][] = new int[matriz.length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce numero: ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		digitos = contadorDigitos(matriz);
		imprimirArray(digitos);
	}

}
