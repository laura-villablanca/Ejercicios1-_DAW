import java.util.Scanner;
public class Ajedrez {
	
	public static void imprimirTablero(int tablero[][], int posAlfil[], int posTorre[]) {
		
		for (int i = 0; i < tablero.length; i++) {
			
		}
	}
	
	public static void pedirPosicion(int posAlfil[], int posTorre[]) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < posAlfil.length; i++) {
			if (i == 0) {
				System.out.println("Introduce fila alfil: ");
				posAlfil[i] = teclado.nextInt();
			} else {
				System.out.println("Introduce columna alfil: ");
				posAlfil[i] = teclado.nextInt();
			}
			
		}
		for(int i = 0; i < posTorre.length; i++) {
			if (i == 0) {
				System.out.println("Introduce fila torre: ");
				posTorre[i] = teclado.nextInt();
			} else {
				System.out.println("Introduce columna torre: ");
				posTorre[i] = teclado.nextInt();
			}
			
		}
	}
	
	public static boolean torreGanadora(int posAlfil[], int posTorre[]) {
		boolean gana = false;
		
		while (posTorre[0] >= 0 && posTorre[0] < 8) {
			posTorre[0] = posTorre[0] - 1;
		}
		

		
		return gana;
	}
	

	public static boolean alfilGanador(int posAlfil[], int posTorre[]) {
		boolean gana = false;
		
		
		return gana;
	}

	public static void main(String[] args) {
		/**/
		int posAlfil[] = new int[2];
		int posTorre[] = new int[2];
		
		int tablero[][] = new int[8][8];
		
		pedirPosicion(posAlfil, posTorre);
	}

}
