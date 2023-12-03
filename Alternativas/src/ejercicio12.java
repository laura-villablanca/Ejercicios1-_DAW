import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		// Programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras.
		//Muestra por pantalla el numero en letras de la cara opuesta al dato obtenido.
		//1 - 6 'seis'
		//5 - 2 'dos'
		//3 - 4 'cuatro'
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el resultado del dado: ");
		int resultadoDado = teclado.nextInt();
		
		switch (resultadoDado) {
		
		case 1:
			System.out.println("Seis");
			
		break;
			
		case 2: 
			System.out.println("Cinco");
			
		break;
		
		case 3: 
			System.out.println("Cuatro");
			
		break;
			
		case 4:
			System.out.println("Tres");
			
		break;
			
		case 5:
			System.out.println("Dos");
			
		break;
			
		case 6:
			System.out.println("Uno");
			
		break;
		
		default:
			System.out.println("Lado imposible en un cubo de seis lados.");
			
		}
	}

}
