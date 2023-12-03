import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// Pedir 2 numeros por teclado, y mostrar por pantalla los dos numeros que ha pedido:
		//Mostrar esta cadena: "El <n1> es mayor a <n2>
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número: ");
		System.out.println("Dime otro número: ");
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		if (numero1 > numero2) {
			System.out.println("El " + numero1 + " es mayor al " + numero2 + ".");
		} else {
			if (numero1 < numero2) {
				System.out.println("El " + numero1 + " es menor al " + numero2 + ".");
			} else {
				System.out.println(numero1 + " es igual al " + numero2 + ".");
			}
		}
		
		
		System.out.println("¡Programa finalizado!");
	}

}
