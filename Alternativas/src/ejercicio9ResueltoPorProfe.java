import java.util.Scanner;
public class ejercicio9ResueltoPorProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Dame primer lado: ");
		a = teclado.nextDouble();
		
		System.out.println("Dame segundo lado: ");
		b = teclado.nextDouble();
		
		System.out.println("Dame tercer lado");
		c = teclado.nextDouble();
		boolean esRectangulo = false;
		
		
		if(a > b && a > c) {
			if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2));
			esRectangulo = true;
		} else {
			if (b > a && b > c) {
				if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2));
				esRectangulo = true;
			} else {
				if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2));
				esRectangulo = true;
			} 
		}
		
		if (esRectangulo) {
			System.out.println("Es rectángulo.");
		}
		if (!(a == b && b == c)) {
			//Estamos negando que a sea igual a b y b sea igual a c
		} else {
			if (a == b || b == c || a == c) {
				System.out.println("Es isósceles.");
			} else {
				System.out.println("Es escaleno.");
			}
		}
	}

}
