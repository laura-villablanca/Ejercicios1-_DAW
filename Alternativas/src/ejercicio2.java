import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		// Leer si un número es negativo o positivo
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número: ");
		int numero = teclado.nextInt();
		
		if (numero > 0) {
			System.out.println(numero + " es positivo.");
		} else {
			if (numero == 0) {
				System.out.println(numero + " es neutro.");
			} 
				}
		System.out.println("¡Programa finalizado!");
			}
}

