import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		// Programa que lea 3 numeros y mostrarlos de menor a mayor.
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Dame el primer número: ");
		a = teclado.nextInt();
		
		System.out.println("Dame el segundo número: ");
		b = teclado.nextInt();
		
		System.out.println("Dame el tercer número: ");
		c = teclado.nextInt();
		
		if (a <= b && a <= c) {
			//Aquí a es el menor de todos
			System.out.print(a + " < ");
			if(b < c) {
				System.out.print(b + " < " + c);
			} else {
				System.out.print(c + " < " + b);
			}
		} else {
			if(b <= a && b <= c) {
				//B es el menor de todos
				System.out.print(b + " < ");
				if(a < c) {
					System.out.print(a + " < " + c);
				} 
				else {
					System.out.print(c + " < " + a);
				}
			} else {
				System.out.print(c + " < ");
				if (a < b) {
					System.out.print(a + " < " + b);
				} else {
					System.out.print(b + " < " + a);
				}
			}
		}
		
	}

}


