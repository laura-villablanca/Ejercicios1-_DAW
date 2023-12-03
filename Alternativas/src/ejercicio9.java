import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		// Hacer un programa que lea tres datos de entrada; a, b y c. Son los lados de un triángulo.
		//Tipo de dato double. 
		//Triangulo rectangulo aº2 = b2 + c2
		//Si no se cumple, es isosceles => cuando dos lados son iguales
		//Si no es ninguno, es escaleno.
		Scanner teclado = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Introduce el valor del primer lado del triángulo: ");
		a = teclado.nextDouble();
		
		System.out.println("Introduce el valor del segundo lado del triángulo: ");
		b = teclado.nextDouble();
		
		System.out.println("Introduce el valor del tercer lado del: ");
		c = teclado.nextDouble();
		
		double hipotenusa = 0.0, lado_x = 0.0, lado_y = 0.0;
		
		if (a > b && a > c) {
			hipotenusa = a;
			lado_x = c;
			lado_y = b;
		} else if (b > a && b > c) {
			hipotenusa = b;
			lado_x = a;
			lado_y = c;
		} else if (c > a && c > b) {
			hipotenusa = c;
			lado_x = b;
			lado_y = a;
		}
		
		if ((Math.pow(lado_x, 2) + Math.pow(lado_y, 2)) == Math.pow(hipotenusa, 2)) {
			System.out.println("Es un triángulo rectángulo.");
		} else if (!(a == b && b == c)){
			if (a == b || a == c || b == c) {
				System.out.println("Es un triángulo isosceles.");
			}
			else {
				System.out.println("Es un triángulo escaleno.");
			}
		} 
		

	}
	
}
