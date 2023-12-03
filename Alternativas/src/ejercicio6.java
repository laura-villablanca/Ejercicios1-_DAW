import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		// Programa que calcule la potencia. Pedir Base y exponente por teclado.
		//Pueden ocurrir tres cosas:
		//1. - Exponente positivo -> imprime la potencia
		//2. - Exponente 0 -> imprime 1
		//3. - Exponente negativo -> imprime la base elevada a (1/exponente)
		Scanner teclado = new Scanner(System.in);
		
		double base, exponente;
		System.out.println("Dame la base: ");
		base = teclado.nextInt();
		System.out.println("Dame el exponente: ");
		exponente = teclado.nextInt();
		
		if (exponente > 0) {
			System.out.println(Math.pow(base, exponente));
		} else {
			if (exponente == 0) {
				System.out.println(1);
			} else {
				exponente = Math.abs(exponente);
				System.out.println(1/Math.pow(base, exponente));
				}
			}
		}

	}


