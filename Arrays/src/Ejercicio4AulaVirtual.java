import java.util.Scanner;
public class Ejercicio4AulaVirtual {
	
	public static void rellenarArray(int array[], String numero) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce numero del " + numero);
			array[i] = teclado.nextInt();
		}
	}
	
	public static int [] mezclar(int a[],int b[]) {
		int [] union = new int[a.length + b.length];
		int posicion = 0;
		for (int i = 0; i < union.length; i+=6) {
			/*union[i] = a[posicion];
			posicion++;
			union[i+1] = a[posicion];
			posicion++;
			union[i+2] = a[posicion];
			posicion = 0;*/
			for (int j = 0; j < 3;j++) {
				
				union[i+j] = a[(i/2) + j];
				union[i+j+3] = b[j];
				
			}	
		}
		return union;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*Leer los datos correspondientes a dos tablas de 12 elementos num�ricos y mezclarlos en una tercera de la forma:
		  3 de la tabla A, 3 de la B, otros 3 de la A, otros 3 de la B, etc...*/
		int array1[] = new int[12];
		int array2[] = new int[12];
		int array3[] = new int[24];
		
		int contador = 0;
		int arr1 = 0, arr2 = 0;
		
		rellenarArray(array1, "primer array");
		rellenarArray(array2, "segundo array");
		
		for (int i = 0; i < array3.length; i++) {
			if (contador < 3 && arr1 < array1.length) {
				array3[i] = array1[arr1++];
			} else if (contador < 6 && arr2 < array2.length) {
				array3[i] = array2[arr2++];
			}
			contador++;
			
			if (contador >= 6) {
				contador = 0;
			}
		}
		
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println("[" + array3[i] + "]");
			}
		}
		
}
