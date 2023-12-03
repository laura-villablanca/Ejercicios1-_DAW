import java.util.Scanner;
public class Ejercicio6AulaVirtual {
	
	public static void imprimirArray(int array[]) {
		
		for ( int i = 0; i < array.length; i++) {
				System.out.println("[" + array[i] + "]");
			
		}
		
	}

	public static void main(String[] args) {
		/*ORDENAR UN VECTOR DE DIMENSION N. PEDIR POR TECLADO LA DIMENSION Y LOS VALORES DEL VECTOR. */
		Scanner teclado = new Scanner(System.in);
		
		int tamanio, valor;
		
		System.out.println("Introduce tamaño: ");
		tamanio = teclado.nextInt();
		
		int vector[] = new int[tamanio];
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce valor: ");
			vector[i] = teclado.nextInt();
		}
			
		imprimirArray(vector);
	}

}
