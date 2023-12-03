import java.util.Scanner;
public class Alternativas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una opción:");
		System.out.println("1. - Cuadrado");
		System.out.println("2. - Rectángulo");
		System.out.println("3. - Triangulo");
		System.out.println("4. - Circulo");
		int opcion;
		opcion = teclado.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Dame el lado del cuadrado: ");
			double lado, area;
			lado = teclado.nextDouble();
			area = lado * lado;
			area = Math.pow(lado, 2);
			System.out.println("El área del cuadrado es: " + area);
			break;
			
		case 2: 
			System.out.println("Dame la base del rectángulo: ");
			double base, altura;
			base = teclado.nextDouble();
			System.out.println("Dame la altura del rectángulo: ");
			altura = teclado.nextDouble();
			area = base * altura;
			System.out.println("El area del rectángulo es: " + area);
			
			break;
			
		case 3:
			System.out.println("Dame la base del triángulo: ");
			base = teclado.nextDouble();
			System.out.println("Dame la altura del triángulo: ");
			altura = teclado.nextDouble();
			area = (base * altura)/2;
			System.out.println("El area del triángulo es: " + area);
		
		
		case 4:
			System.out.println("Dame el radio: ");
			double radio = teclado.nextDouble();
			area = Math.pow(radio, 2) * Math.PI;
			System.out.println("El área es " + area);
			
			break;
				
		default:
			System.out.println("¡Opción incorrecta!");
			
		}
		
		
	}

}
