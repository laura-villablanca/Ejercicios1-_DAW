import java.util.Scanner;
public class CrecienteDecreciente {
	
	public static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static boolean esCreciente(int array[]) {
		boolean esCreciente = true;
		for (int i = 1; i < array.length; i++) {
			if (!(array[i] > array[i-1])) {
				esCreciente = false;
			}
		}
		return esCreciente;
	}
	
	public static boolean esDecreciente(int array[]) {
		boolean esDecreciente = true;
		for (int i = 1; i < array.length; i++) {
			if (!(array[i] < array[i-1])) {
				esDecreciente = false;
			}
		}
		return esDecreciente;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce numero: ");
			array[i] = teclado.nextInt();
		}
		if (esCreciente(array)) {
			imprimirArray(array);
			System.out.println("Los numeros estan ordenados en forma CRECIENTE");
		} else if (esDecreciente(array)) {
			imprimirArray(array);
			System.out.println("Los numeros estan ordenador en forma DECRECIENTE");
		} else {
			imprimirArray(array);
			System.out.println("Los numeros estan DESORDENADOS");
		}
	}

}
