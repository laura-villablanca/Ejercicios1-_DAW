import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {
		// Programa que pida dos números: nota y edad y una cadena de caracteres, genero.
		//Muestra el mensaje: "Aceptada" si la nota es mayor o igual a 5, la edad es mayor o igual a 18, y el genero es "Mujer".
		//En caso de que se cumpla lo mismo, pero el genero sea "Hombre" debe imprimir "posible".
		//Si no se cumplen dichas condiciones, debe imprimir "No aceptada".
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Genero: ");
		String genero = teclado.nextLine();
		
		System.out.println("Nota: ");
		double nota = teclado.nextDouble();
		
		System.out.println("Edad: ");
		int edad = teclado.nextInt();
		
		
		String generoBinario1 = "Mujer";
		String generoBinario2 = "Hombre";
		
		if (nota >= 5 && edad >= 18 && generoBinario1.equalsIgnoreCase(genero)) {
			System.out.println("Aceptada");
		} else if (nota >= 5 && edad >= 18 && generoBinario2.equalsIgnoreCase(genero)) {
			System.out.println("Posible");
		} else if (nota < 5 || edad < 18){
			System.out.println("No aceptada");
		}
		
		
	}

}
