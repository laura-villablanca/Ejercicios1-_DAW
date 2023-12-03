import java.util.Scanner;
public class Ejercicio3AulaVirtual {
	
	public static void imprimirValores(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*DISE�AR UNA APLICACI�N QUE DECLARE UNA TABLA DE 10 ELEMENTOS ENTEROS. LEER MEDIANTE EL TECLADO 8 N�MEROS. 
		  DESPU�S SE DEBE PEDIR UN N�MERO Y UNA POSICI�N, INSERTARLO EN LA POSICI�N INDICADA, DESPLAZANDO LOS QUE EST�N
		  DETR�S.*/
		int array[] = new int[10];
		int aux;
		

		for (int i = 0; i < 8; i++) {
			System.out.println("Introduce entero: ");
			array[i] = teclado.nextInt();
		}
		
		System.out.println("Introduce posicion: ");
		int posicion = teclado.nextInt();
		System.out.println("Introduce numero: ");
		int numero = teclado.nextInt();
		
		
		/*if (array[posicion] != 0) {
			
			for (int i = 0; i <= posicion; i++) {
				if (i == 0) {
					aux = array[i];
					array[array.length - 1] = aux;
				} else {
					aux = array[i];
					array[i - 1] = aux;
				}
			}
			
			array[posicion] = numero;
			
		} else {
			array[posicion] = numero;
		}*/
		
		for (int i = array.length - 1; i > posicion; i--) {
			array[i] = array[i-1];
		}
		array[posicion] = numero;
		
		imprimirValores(array);

	}

}
