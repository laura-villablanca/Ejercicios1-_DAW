import java.util.Scanner;
public class Ejercicio22AulaVirtual {
	
	public static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
	}
	
	public static boolean esPrimo(int numero) {
		
		int divisores = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores++;
			}
		}
		
		return (divisores==2);
	}
	
	/*public static int[] generaPrimosDesde(int minimo, int maximo) {
		int primerosPrimos[] = new int[10];
		int contador = 0;
		
		for (int i = minimo; i <= maximo && contador < primerosPrimos.length; i++) {
			if (esPrimo(i)) {
				primerosPrimos[contador++] = i;
			}
		}
		
		return primerosPrimos;
	
	}*/
	
	public static int[] generaPrimosDesde(int minimo, int numero) {
		int resultado[] = new int[numero];
		int i = 0;
		int posiblePrimo = minimo;
		while (i < numero) {
			if(esPrimo(posiblePrimo)) {
				resultado[i] = posiblePrimo;
				i++;
			}
			posiblePrimo++;
		};
		
		return resultado;
	
	}

	public static void main(String[] args) {
		// Almacenar en un vector de 10 posiciones los 10 numeros primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
		Scanner teclado = new Scanner(System.in);
		int minimo = 100, numero = 10;
		int vector[] = generaPrimosDesde(minimo, numero);
		
		imprimirArray(vector);
		
	}

}
