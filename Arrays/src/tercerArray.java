import java.util.Scanner;
public class tercerArray {
	
	public static void imprimirArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int array1[] = new int[10];
		int array2[] = new int[10];
		int mezcla[] = new int[20];
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce numero de primer array: ");
			array1[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Introduce numero de segundo array: ");
			array2[i] = teclado.nextInt();
		}
	}

}
