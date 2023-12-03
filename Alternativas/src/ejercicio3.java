import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// Indicar un número por pantalla y decir si es par o impar.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		int numero = teclado.nextInt();
		boolean esPar;
		esPar = numero % 2 == 0;
		
		if (esPar) {
			System.out.println(numero + " es par.");
		} else {
			System.out.println(numero + " es impar.");
		}
	}

}
