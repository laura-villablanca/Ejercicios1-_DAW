import java.util.Scanner;
public class EjercicioClase3 {
	
	public static void imprimirArray(int[][]matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	public static int[][] copiar(int[][]a) {
		int [][]copia = new int[a.length][a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				copia[i][j] = a[i][j];
			}
		}
		return copia;
	}
	
	
	
	public static int[][]invertirDiagonalPrincipal(int matriz[][]) {
		int [][] invertido = new int[matriz.length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					if (i <= (matriz.length - 1)/2) {
						invertido[i][j] = matriz[matriz.length-1-i][matriz.length-1-i];
						invertido[invertido.length-1-i][invertido.length-1-i] = matriz[i][j];
					}
				} else {
					invertido[i][j] = matriz[i][j];
				}
			}
		}
		return invertido;
	}
	
	public static int[][] invertirDiagonalSecundaria(int matriz[][]) {
		int[][]invertido = new int[matriz.length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i + j == matriz.length - 1)) {
					if (i <= (matriz.length - 1)/2) {
						invertido[i][j] = matriz[j][i];
						invertido[j][i] = matriz[i][j];
					}
				} else {
					invertido[i][j] = matriz[i][j];
				}
			}
		}
		return invertido;
	}
	
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Funcion invertir matriz; invertir diagonal principal

		int[][] matriz = { {1,2,3,4},
					  	{5,6,7,8},
					  	{9,10,11,12},
					  	{13,14,15,16} };
		
		int[][] matrizConDiagonalCambiada = copiar(matriz);
		/*int numerosFilas, numerosColumnas;
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Introduce número de fila: ");
			numerosFilas = teclado.nextInt();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce número de columna: ");
				numerosColumnas = teclado.nextInt();
			}
		}
		*/
		imprimirArray(matriz);
		System.out.println();
		System.out.println("Con diagonal princial cambiada: ");
		matrizConDiagonalCambiada = invertirDiagonalPrincipal(matriz);
		imprimirArray(matrizConDiagonalCambiada);
		System.out.println();
		System.out.println("Con diagonal secundaria cambiada: ");
		matrizConDiagonalCambiada = invertirDiagonalSecundaria(matriz);
		imprimirArray(matrizConDiagonalCambiada);
		
		
	}

}
