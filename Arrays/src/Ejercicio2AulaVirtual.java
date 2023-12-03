import java.util.Scanner;
public class Ejercicio2AulaVirtual {
	
	public static void rellenarArray(int array[], String numero) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce número del " + numero);
			array[i] = teclado.nextInt();
		}
	}
	
	

	public static void main(String[] args) {
		/* Leer por teclado 2 arrays de 10 n�meros enteros y mezclarlas en una tercera de la forma: el 1� de la A, el 1� de la B, el 2� de la A,
		   el 2� de la B, etc..*/
		Scanner teclado = new Scanner(System.in);
		
		int array1[] = new int [10];
		int array2[] = new int [10];
		int array3[] = new int [20];
		
		int iArray1 = 0, iArray2 = 0;
		
		rellenarArray(array1, "1º");
		rellenarArray(array2, "2º");
		
		
		
		/*for (int i = 0; i < array3.length; i++) {
			if (i % 2 == 0) {
				array3[i] = array1[iArray1++];
			
			} else {
				array3[i] = array2[iArray2++];
				
			}
		}*/
		
		for (int i = 0; i < array1.length; i++) {
			array3[i*2] = array1[i];
			array3[i*2+1] = array2[i];
		}
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println("[" + array3[i] + "]");
		}
		
		

	}

}
