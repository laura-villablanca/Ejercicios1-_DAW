
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
		// Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
		int numero[] = new int[100];
		
		System.out.println("La suma es igual a " + suma(numero));
		System.out.println("La media es igual a " + media(numero));
	}

}
