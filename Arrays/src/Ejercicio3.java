
public class Ejercicio3 {
	
	public static int suma(int numero[]) {
		int suma = 0;
		
		for (int i = 1; i < numero.length; i++) {
			
			suma += i;
		}
		
		return suma;
	}
	
	public static double media(int numero[]) {
		double mediaTotal;
		
		mediaTotal = suma(numero)/100;
		
		return mediaTotal;
	}

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100. Obt�n la suma de todos ellos y la media.
		int numero[] = new int[100];
		
		System.out.println("La suma es igual a " + suma(numero));
		System.out.println("La media es igual a " + media(numero));
	}

}
