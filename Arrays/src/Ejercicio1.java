import java.util.Scanner;
public class Ejercicio1 {
	//FUNCION QUE DEVUELVA NOTA MINIMA Y OTRA QUE DEVUELVA NOTA MAXIMA
	
	public static int notaMaxima(int n[]) {
		int masAlta = 0;
		
		for (int i = 0; i < n.length; i++) {
			if (n[i] > masAlta) {
				masAlta = n[i];
			}
		}
		
		return masAlta;
	}
	
	public static int notaMinima(int n[]) {
		int masBaja = 0;
		
		for (int i = 0; i < n.length; i++) {
			if (n[i] < masBaja) {
				masBaja = n[i];
			}
		}
		return masBaja;
	}
	
	public static int numeroAprobados(int[] n) {
		int resultado = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 5) {
				resultado++;
			}
		}
		
		return resultado;
	}
	
	public static int pedirNotas(int nota[]) {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		// Pedir 10 notas de alumnos y asignarlas al array
		int nota[] = new int[10];
		
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Introduce nota: ");
			nota[i] = pedirNotas(nota);
			
		}
			System.out.println("El número de aprobados es de " + numeroAprobados(nota));
			
			System.out.println("La nota más alta es " + notaMaxima(nota));
			System.out.println("La nota mínima es " + notaMinima(nota));
	}

}
