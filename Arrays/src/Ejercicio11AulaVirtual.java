import java.util.Scanner;
public class Ejercicio11AulaVirtual {
	
	public static void imprimirArray(int array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("[" + array[i][j] + "]");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Dada la matriz de m*n y el vector de tamaño n, determinar que columna de la matriz es igual al vector.
		Scanner teclado = new Scanner(System.in);
		
		int tamanioFila, tamanioColumna, tamanioFilaVector;
		
		System.out.println("Introduce tamaño de fila: ");
		tamanioFila = teclado.nextInt();
		
		System.out.println("Introduce tamaño de columna: ");
		tamanioColumna = teclado.nextInt();
		
		int matriz[][] = new int[tamanioFila][tamanioColumna];
		
		System.out.println("Introduce tamaño del vector: ");
		tamanioFilaVector = teclado.nextInt();
		
		int vector[] = new int[tamanioFilaVector];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][tamanioColumna] == vector[tamanioFilaVector]) {
					//System.out.println("La columna de " + matriz[i][j] + " es igual a " + vector[tamanioFilaVectorS]);
				}
			}
		}

	}

}
