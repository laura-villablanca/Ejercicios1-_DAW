import java.util.Scanner;
public class Ejercicio13AulaVirtual {
	
	public static void imprimirArray(String[]array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("[java" + array[i] + "]");
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crear un vector de tipo cadena que almacene 10 elementos e imprimir la palabra java seguido del número de elemento.
		String array[] = new String[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce palabra o frase: ");
			array[i] = teclado.nextLine();
		}
		imprimirArray(array);
	}

}
