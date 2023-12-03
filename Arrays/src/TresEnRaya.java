import java.util.Scanner;
public class TresEnRaya {

	public static void iniciarTablero(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}
	}
	
	public static void mostrarTablero(char [][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j]);
				}
				System.out.println();
			}
		}
	
	public static boolean tableroLleno(char[][]tablero) {
		boolean estaLleno = false;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (!posicionLibre(tablero, i, j)) {
					estaLleno = true;
				} else {
					estaLleno = false;
				}
			}
		}
		
		return estaLleno;
	}
	
	public static boolean coincidenciaFila(char[][]tablero, int fila, char jugador) {
		boolean coincide = true;
		
		for (int i = 0; i < tablero[fila].length; i++) {
			if (tablero[fila][i] != jugador) {
				coincide = false;
			}
		}
		return coincide;
	}
	
	public static boolean coincidenciaColumna(char[][]tablero, int columna, char jugador) {
		boolean coincide = true;
		
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][columna] != jugador) {
				coincide = false;
			}
		}
		return coincide;
	}
	
	public static boolean coincidenciaDiagonalPrincipal(char[][]tablero, char jugador) {
		boolean coincide = true;
		
		for (int i = 0; i < tablero.length; i++) {
			if(tablero[i][i]!=jugador) {
				coincide = false;
			}
		}
		return coincide;
	}
	
	public static boolean coincidenciaDiagonalInversa(char[][]tablero, char jugador) {
		boolean coincide = true;
		
		for (int i = 0; i < tablero.length; i++) {
			if(tablero[i][tablero.length-1-i]!=jugador) {
				coincide = false;
			}
		}
		return coincide;
	}
		
	public static char cambiarJugador(char jugador) {
		char resultado = 'X';
		
		if (jugador=='X') {
			resultado = 'O';
		} 
		return resultado;
	}
	
		public static boolean posicionLibre(char [][] tablero, int fila, int columna) {
		return tablero[fila][columna]=='-';
	}
		
		public static boolean posicionValida(char[][] tablero, int fila, int columna) {
			return (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[fila].length);
		}
	
	public static void ponerFicha(char [][] tablero, char jugador) {
		Scanner teclado = new Scanner(System.in);
		int fila = 0; 
		int columna = 0;
		do {
		System.out.println("Introduce posicion de la fila: ");
		fila = teclado.nextInt();
		System.out.println("Introduce poscion de la columna: ");
		columna = teclado.nextInt();
		} while (!posicionValida(tablero, fila, columna) || !posicionLibre(tablero, fila, columna));
		//Informar de tablas o felicitador ganador
		tablero[fila][columna] = jugador;
		
	}
	
	public static boolean hayTresEnRaya(char[][]tablero, char jugador) {
		int numero = 0; 
		return coincidenciaDiagonalPrincipal(tablero, jugador) ||
				coincidenciaDiagonalInversa(tablero, jugador) ||
				coincidenciaColumna(tablero, numero, jugador) ||
				coincidenciaFila(tablero, numero, jugador);
				
				
	}
	
	public static boolean hayFila(char[][] tablero, char jugador) {
		boolean resultado = false;
		for (int i = 0; i < tablero.length; i++) {
			if(coincidenciaFila(tablero, i, jugador)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	
	public static boolean hayColumna(char[][] tablero, char jugador) {
		boolean resultado = false;
		for (int i = 0; i < tablero.length; i++) {
			if(coincidenciaColumna(tablero, i, jugador)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	public static boolean finPartida(char tablero[][], char jugador) {
		return tableroLleno(tablero) || hayTresEnRaya(tablero, jugador);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio");
		char [][] tablero = new char[3][3];
		iniciarTablero(tablero);
		char jugador = 'X';
		do {
			mostrarTablero(tablero);
			jugador = cambiarJugador(jugador);//cambiar de X a O 
			ponerFicha(tablero, jugador);
		} while (!finPartida(tablero, jugador));
		mostrarTablero(tablero);
		if(hayTresEnRaya(tablero, jugador)) {
			System.out.println("Enhorabuena!!! Ha ganado el jugador " + jugador);
		} else {
			System.out.println("Tablas!!");
		}
		System.out.println("Fin del programa");
	}

}
