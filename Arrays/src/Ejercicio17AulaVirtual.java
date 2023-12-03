import java.util.Scanner;
public class Ejercicio17AulaVirtual {
	
	public static void imprimirArray(int array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("[" + array[i] + "]");
			}
			System.out.println();
		}
	}

	public static int maximo(int[][]array) {
		//int mayor[][] = new int[array.length][array.length];
		int mayor = array[0][0];
		//mayor = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > mayor) {
					mayor = array[i][j];
				}
			}
		}
		
		return mayor;
	}
	
	public static int[] posicionDeMaximo(int[][]matriz) {
		int[]resultado = new int[2];
		int max = maximo(matriz);
		boolean encontrado = false;
		
		for (int i = 0; i < matriz.length&&!encontrado; i++) {
			for (int j = 0; j < matriz[i].length&&!encontrado; j++) {
				if (matriz[i][j] == max) {
					resultado[0] = i;
					resultado[1] = j;
					encontrado = true;
				}
			}
		}
		
		return resultado;
	}
	
	public static int numeroOcurrencias(int[][]matriz, int numero) {
		int contador = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numero) {
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	public static int[][] posicionesMaximo(int[][]matriz) {
		int max = maximo(matriz);
		int numeroFilas = numeroOcurrencias(matriz, max);
		int[][] resultado = new int[numeroFilas][2];
		int posFila = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == max) {
					resultado[posFila][0] = i;
					resultado[posFila][1] = j;
					posFila++;
				}
			}
		}
		
		return resultado;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crear una aplicación que busque el número más grande del array y la posición que ocupa.
		int array[][] = new int[3][3];
		int numero = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Introduce numero: ");
				array[i][j] = teclado.nextInt();
			}
		}
		System.out.println("El número mayor es " + maximo(array));
		System.out.println("La posicion del numero más grande es " + posicionesMaximo(array));
		System.out.println("El numero de veces que aparece el numero es " + numeroOcurrencias(array, numero) + " veces");
		
	}

}
