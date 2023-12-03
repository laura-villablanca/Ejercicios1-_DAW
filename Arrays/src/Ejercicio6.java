import java.util.Scanner;
public class Ejercicio6 {
	
	public static float mediaPositivos(int [] enteros) {
		float media = 0;
		int numero = 0;
		int contadorPositivos = 0;
		
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] > 0) {
				contadorPositivos++;
				media += enteros[i];
			}
		}
		media = media/contadorPositivos;
		
		
		return media;
	}
	
	
	public static float mediaNegativos(int [] enteros) {
		float media = 0;
		int numero = 0;
		int contadorNegativos = 0;
		
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] < 0) {
				contadorNegativos++;
				media += enteros[i];
			}
		}
		media = media/contadorNegativos;
		return media;
	}
	
	public static int contarApariciones(int [] enteros, int numero) {
		int resultado = 0;
		
		for (int i= 0; i < enteros.length; i++) {
			if (enteros[i] == numero) {
				resultado++;
			}
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// LEER 5 NUMEROS POR TECLADO. REALIZAR LA MEDIA DE LOS NUMEROS POSITIVOS, LA MEDIA DE LOS NUMEROS NEGATIVOS Y CONTAR EL NUMERO DE CEROS
		Scanner teclado = new Scanner(System.in);
		
		int numero[] = new int[5];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Dame un número: ");
			numero[i] = teclado.nextInt();
		}
		
	System.out.println(mediaPositivos(numero));
	System.out.println(mediaNegativos(numero));
	System.out.println(contarApariciones(numero, 0));

	}

}
