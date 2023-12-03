import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// Programa que pida 2 numeros (numerador, denominador) y luego mostar cociente por pantalla o que la division x 0 no existe.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numerador: ");
		System.out.println("Dame otro denominador: ");
		int numerador, denominador, cociente, resto;
		numerador = teclado.nextInt();
		denominador = teclado.nextInt();
	
		if (denominador == 0) {
			System.out.println("El numerador no se puede dividir entre el denominador. ");
		} else {
			cociente = numerador / denominador;
			System.out.println("El resultado de la división es igual a: " + cociente);
		}
	}

}

/* 
 int numerador;
 double denominador;
 Scanner teclado = new Scanner(System.in);
 System.out.println("Dame numerador: ");
 numerador = teclado.nextInt();
 System.out.println("Dame denominador: ");
 denominador = teclado.nextDouble();
 double cociente;
 if(denominador == 0) {
 	System.out.println("No se puede dividir entre cero");
 } else {
 	cociente = numerador/denominador;
 	System.out.println("El cociente es: " + cociente);
 }
 
 
 */