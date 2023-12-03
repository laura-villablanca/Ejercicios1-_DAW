import java.util.Scanner;
public class Ejercicio18AulaVirtual {
	
	public static void imprimirMenu() {
		Scanner teclado = new Scanner(System.in);
		int cedula, sueldo;
		int sexo, trabaja;
		System.out.println("1.- CEDULA: ");
		cedula = teclado.nextInt();
		System.out.println("2.- GENERO (1- Masculino, 2- Femenino: ");
		sexo = teclado.nextInt();
		System.out.println("3.- SUELDO: ");
		sueldo = teclado.nextInt();
		System.out.println("4.- TRABAJA (1- Si trabaja, 2- No trabaja): ");
		trabaja = teclado.nextInt();
	}
	
	public static int contarGenero(int estudiantes[][], int genero) {
		int contador = 0;
		
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i][1] == genero) {
				contador++;
			}
		}
		
		return contador;
	}

	
	/*public static double porcentaje(int [][] estudiantes, int numeroEstudiantes) {
		double resultado = 0.0;
		
		for (int i = 0; i < estudiantes.length; i++) {
			if (contarGenero(estudiantes, numeroEstudiantes) > 0 && contarGenero(estudiantes, numeroEstudiantes) <= 50) {
				resultado = ;
			}
		}
		return resultado;
	}*/
	
	/*public static double porcentajeMujeres(int[][]estudiantes, int numeroEstudiantes) {
		double resultado = 0.0;
		
		for (int i = 0; i < estudiantes.length; i++) {
			if (!hombres(estudiantes)) {
				resultado = (numeroEstudiantes/50)*100;
			}
		}
		
		return resultado;
	}*/
	
	public static boolean trabaja(int [][]estudiantes) {
		boolean siTrabaja = false;
		int opcion = 0;
		
		for (int i = 0; i < estudiantes.length; i++) {
			switch (opcion) {
			case 1:
				siTrabaja = true;
				break;
			case 2:
				siTrabaja = false;
				break;
			default:
				siTrabaja = false;
				break;
			}
		}
		
		return siTrabaja;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*Con base en una encuesta realizada a N estudiantes (N<=50) en una Universidad donde se solicitó la siguiente información: CÉDULA, SEXO, SUELDO, TRABAJA. 
		  Donde:

			CEDULA (Es un número entero)
			SEXO (1 - Masculino 2 – Femenino)
			TRABAJA (1 - Si trabaja 2 - No trabaja)
			SUELDO (Es un valor entero)
			Escriba el programa que permita leer y almacenar en vectores los datos solicitados, luego, calcular e imprimir:

			Porcentaje de hombres en la Universidad
			Porcentaje de mujeres en la Universidad
			Porcentaje de hombres que trabajan y sueldo promedio
			Porcentaje de mujeres que trabajan y sueldo promedio*/
		int numeroEstudiantes = 0;
		double porcentajeHombresTrabajan = 0.0;
		double porcentajeMujeresTrabajan = 0.0;
		System.out.println("Introduce el numero de estudiantes: ");
		numeroEstudiantes = teclado.nextInt();
		int [][] estudiantes = new int[numeroEstudiantes][4];
		
		if (numeroEstudiantes <= 50) {
			for (int i = 0; i < estudiantes.length; i++) {
				imprimirMenu();
			}
		}
		
		/*for (int i = 0; i < estudiantes.length; i++) {
			if (hombres(estudiantes)&&trabaja(estudiantes)) {
				estudiantes[numeroEstudiantes][i] = (numeroEstudiantes/50)*100;
				porcentajeHombresTrabajan = estudiantes[numeroEstudiantes][i];
			} else if (!hombres(estudiantes)&&trabaja(estudiantes)) {
				estudiantes[numeroEstudiantes][i] = (numeroEstudiantes/50)*100;
				porcentajeMujeresTrabajan = estudiantes[numeroEstudiantes][i];
			}
		}
			
			
		System.out.println("El porcentaje de hombres en la Universidad es de " + porcentajeHombres(estudiantes, numeroEstudiantes));
		System.out.println("El porcentaje de mujeres en la universidad es de " + porcentajeMujeres(estudiantes, numeroEstudiantes));
		System.out.println("El porcentaje de hombres que trabajan es del " + porcentajeHombresTrabajan + "%");
		System.out.println("El porcentaje de mujeres que trabajan es del " + porcentajeMujeresTrabajan + "%");
		*/
		
		
		
	}

}
