import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		// Pedir un año por teclado y decir si es bisiesto. 
		//Un año es bisiesto si es divisible entre 4, pero no lo es entre 100
		//o el año es divisible entre 400
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un año: ");
		int anio = teclado.nextInt();
		
		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0 ) {
			System.out.println("El año es bisiesto");
		} else {
			System.out.println("El año no es bisiesto");
		}
	}

}
