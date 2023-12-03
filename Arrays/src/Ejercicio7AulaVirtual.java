import java.util.Scanner;
public class Ejercicio7AulaVirtual {
	
	public static void imprimirArray(int array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("[" + array[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	public static int[][] intercambioColumnas(int array[][]) {
		int columnasInvertidas[][] = new int[array.length][array.length];
		
		for (int i = 0; i < array.length; i++) {
				columnasInvertidas[i][0] = array[i][array.length-1];
				columnasInvertidas[i][array.length-1] = array[i][0];
				
			}
		return columnasInvertidas;
		}
		
	
	
	public static int[][] intercambiarElementosColumnas(int array[][]) {
		int columnasInvertidas[][] = new int [array.length][array.length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == array.length-1) {
					columnasInvertidas[i][0] = array[i][array.length-1];	
				} else if (j == 0) {
					columnasInvertidas[i][array.length-1] = array[i][0];
				} else {
					columnasInvertidas[i][j] = array[i][j];
				}
				
		}
	}
		return columnasInvertidas;
	}

	public static void main(String[] args) {
		// Dada una matriz intercambiar los elementos de la primera columna con la ultima columna
		Scanner teclado = new Scanner(System.in);
		
		int array[][] = new int[3][3];
		int arrayColumnasIntercambiadas[][] = new int [array.length][array.length];
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				
				System.out.println("Introduce elemento: ");
				array[i][j] = teclado.nextInt();
				
			}
		}
		
		imprimirArray(array);
		System.out.println("Con las columnas cambiadas: ");
		//arrayColumnasIntercambiadas = intercambiarElementosColumnas(array);
		arrayColumnasIntercambiadas = intercambioColumnas(array);
		imprimirArray(arrayColumnasIntercambiadas);
	}

}
