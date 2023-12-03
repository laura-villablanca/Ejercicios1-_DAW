import java.util.Scanner;
public class Alternativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		int edad;
		edad = teclado.nextInt();
		if (edad < 14) {
			System.out.println("¡Eres un niño!");
		} else {
			if (edad < 18) {
				System.out.println("Eres un adolescente.");
			} else {
				if (edad < 35) {
					System.out.println("Eres joven.");
				} else {
						System.out.println("Eres un adulto");
					}
				}
		}
		System.out.println("¡Programa finalizado!");
	}
}