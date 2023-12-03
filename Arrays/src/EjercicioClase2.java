import java.lang.reflect.Array;

public class EjercicioClase2 {
	
	public static void imprimir(int[]array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
	}
	
	public static int maximo(int []array) {
		int maximo = Integer.MIN_VALUE;//Si es negativo
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			} 
		}
		return maximo;
	}
	
	public static int minimo(int[]array) {
		int minimo = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}
	
	public static void intercambiar(int[] a, int [] b) {
		int mayor = maximo(a), menor = minimo(b);
		
		reemplazar(a, menor, mayor);
		reemplazar(b, mayor, menor);
		
	}
	
	public static void reemplazar(int[]vector, int este, int porOtro) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == este) {
				vector[i] = porOtro;
			}
		}
	}

	public static void main(String[] args) {
		// Dadas dos matrices a y b intercambiar los mínimos de A con los máximos de B
		int [] a = {0, 8, 3, 5, 7};
		int [] b = {9, 1, 4, 2, 6}; 
		
		imprimir(a);
		System.out.println();
		imprimir(b);
		System.out.println();
		intercambiar(a, b);
		imprimir(a);
		System.out.println();
		imprimir(b);
	}

}
