import java.util.Scanner;
public class Ejercicio18AulaVirtualCorregido {
	
	public static int leerDatos(int[]cedula, char[]genero, char[]trabaja, int[]sueldo) {
		Scanner teclado = new Scanner(System.in);
		char respuesta = 'N';
		int posicion = 0;
		do {
			System.out.println("Dame cedula: ");
			cedula[posicion] = teclado.nextInt();
			System.out.println("Introduce genero del alumno: ");
			genero[posicion] = teclado.nextLine().charAt(0);
			
			do {
				System.out.println("¿Trabaja? (S/N)");
				trabaja[posicion] = teclado.nextLine().charAt(0);
			}while(trabaja[posicion] == 'S');
			
			
			if (trabaja[posicion] == 'S') {
				System.out.println("Introduce el salario: ");
				sueldo[posicion] = teclado.nextInt();
			}
			posicion++;
			if(posicion>=NUMERO_MAXIMO_ALUMNOS) {
				respuesta = 'N';
			} else {
				System.out.println("Â¿Quieres introducir mas alumnos? (S/N)");
				respuesta = teclado.nextLine().charAt(0);
			}
			
		} while (respuesta == 'S');
		return posicion;
	}
	
	static final int NUMERO_MAXIMO_ALUMNOS = 50;
	
	public static float busco(char[]genero, int numero, char busco) {
		float resultado;
		int contador = buscar(genero, numero, busco);
		resultado = 100f*contador/numero;
		return resultado;
	}
	
	public static float porcentajeHombres(char[]genero, int numero) {
		
		return busco(genero, numero, 'H');
	}
	
	public static float porcentajeMujeres(char[]genero, int numero) {
		
		return busco(genero, numero, 'M');
	}
	
	public static int buscar(char[]genero, int numero, char busco) {
		int contador = 0;
		
		for (int i = 1; i < numero; i++) {
			if (genero[i] == busco) {
				contador++;
			}
		}
		return contador;
	}
	
	public static float[] porcentajeHombresTrabajan(char[]genero, char[]trabaja, int[]sueldo, int numero) {
		float[]resultado = new float[2];
		int hombresTrabajadores = 0;
		int numeroHombres = buscar(genero, numero, 'H');
		int salarios = 0;
		for (int i = 0; i < numero; i++) {
			if (trabaja[i] == 'S' && genero[i] == 'H') {
				hombresTrabajadores++;
				salarios += sueldo[i];
			}
		}
		resultado[0] = hombresTrabajadores*100f/numeroHombres;
		resultado[1] = (float) salarios/hombresTrabajadores; 
		return resultado;
	}
	
	public static float[] porcentajeMujeresTrabajan(char[]genero, char[]trabaja, int[]sueldo, int numero) {
		float[]resultado = new float[2];
		int mujeresTrabajadoras = 0;
		int numeroMujeres = buscar(genero, numero, 'M');
		int salarios = 0;
		for (int i = 0; i < numero; i++) {
			if (trabaja[i] == 'S' && genero[i] == 'M') {
				mujeresTrabajadoras++;
				salarios += sueldo[i];
			}
		}
		resultado[0] = mujeresTrabajadoras*100f/numeroMujeres;
		resultado[1] = (float) salarios/mujeresTrabajadoras; 
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//final int NUMERO_MAXIMO_ALUMNOS = 50;//es el numero maximo de alumnos
		int[]cedula = new int[NUMERO_MAXIMO_ALUMNOS];
		char[]genero = new char[NUMERO_MAXIMO_ALUMNOS];
		char[]trabaja = new char[NUMERO_MAXIMO_ALUMNOS];
		int[]sueldo = new int[NUMERO_MAXIMO_ALUMNOS];
		
		int numeroEstudiantes = leerDatos(cedula, genero, trabaja, sueldo);
		
		float hombres = porcentajeHombres(genero, numeroEstudiantes);
		float mujeres = porcentajeMujeres(genero, numeroEstudiantes);
		float hombresTrabajadores[] = porcentajeHombresTrabajan(genero, trabaja, sueldo, numeroEstudiantes);
		float mujeresTrabajadoras[] = porcentajeMujeresTrabajan(genero, trabaja, sueldo, numeroEstudiantes);
		
		System.out.println("El porcentaje total de hombres es de " + hombres + "%");
		System.out.println("El porcentaje total de mujeres es de " + mujeres + "%");
		System.out.println("El porcentaje de hombres que trabajan es de " + hombresTrabajadores + "%");
		System.out.println("El porcentaje de mujeres que trabajan es de " + mujeresTrabajadoras + "%");
	}

}
