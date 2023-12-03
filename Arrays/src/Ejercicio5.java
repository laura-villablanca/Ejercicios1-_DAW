import java.util.Scanner;
public class Ejercicio5 {
	
	public static boolean notaCorrecta(double nota) {
		if (nota >= 0 && nota <= 10) {
			return true;
		}
		return false;
	}
	
	
	public static int pedirNumeroAlumnos() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static String pedirNombreAlumnos() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static double pedirNotasAlumnos() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextDouble();
		
	}
	
	public static void notaMasAlta(double[]nota, String[]alumnos) {
		double alta = 0.0;
		String alumnoAlta = "";
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] > alta) {
				alta = nota[i];
				alumnoAlta = alumnos[i];
			}
		}
		System.out.println(alumnoAlta + " la nota más alta es " + alta);
	}
	
	public static void notaMasBaja(double[]nota, String[]alumnos) {
		double baja = 0.0;
		String alumnoBaja = "";
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] < baja) {
				baja = nota[i];
				alumnoBaja = alumnos[i];
			}
		}
		System.out.println("La nota más baja es " + baja);
	}
	
	public static void notaMedia(int[]numeroAlumnos, double [] notas) {
		double notaMedia = 0.0;
		
		for (int i = 0; i < numeroAlumnos.length; i++) {
			notaMedia += notas[i];
		}
		notaMedia = notaMedia / numeroAlumnos.length;
		
	}
	
	public static void leerNotas(String [] alumnos, double [] nota1, double [] nota2, double [] nota3) {
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Dime nombre del alumno " + (i + 1));
			alumnos[i] = pedirNombreAlumnos();
			System.out.println("Dime la nota de la primera evaluación: ");
			nota1[i] = pedirNotasAlumnos();
			System.out.println("Dime la nota de la segunda evaluación: ");
			nota2[i] = pedirNotasAlumnos();
			System.out.println("Dime la nota de la tercera evaluación: ");
			nota3[i] = pedirNotasAlumnos();
		}
		
	}
	
	public static double [] notaFinalcadaAlumno(String [] alumno, double[]nota1, double[]nota2, double[]nota3) {
		double[]notaFinal = new double[nota1.length];
		
		for (int i = 0; i < notaFinal.length; i++) {
			notaFinal[i] = (nota1[i] + nota2[i] + nota3[i]) / 3;
		}
		
		return notaFinal;
	}
	
	public static void listadoAlumnosNotaFinal(String [] alumnos, double [] nota1, double [] nota2, double [] nota3) {
		double [] notaFinal = new double[alumnos.length];
		
		for (int i = 0; i < notaFinal.length; i++) {
			System.out.println((i+1) + alumnos[i] + " tiene una nota final de " + notaFinal);
		}
	}
	
	public static void mostrarMenu(double [] nota1, double [] nota2, double [] nota3) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		int evaluacion = 0;
		
		String []alumnos = new String[0];
		int []numeroAlumnos = new int[0];
		
		System.out.println("1.Alumno con la nota mas alta: ");
		System.out.println("2.Alumno con la nota mas baja: ");
		System.out.println("3.Nota media de todos los alumnos: ");
		System.out.println("4.Alumnos que están un punto por encima o por debajo de la nota media: ");
		System.out.println("5.Nota que más se repite: ");
		System.out.println("6.Listado de alumnos con nota final: ");
		
		System.out.println("Introduce opcion: ");
		opcion = teclado.nextInt();
		
		
		switch(opcion) {
		
		case 1:
			System.out.println("¿Qué evaluación quieres que te valore?");
			System.out.println("Primera evaluación");
			System.out.println("Segunda evaluación");
			System.out.println("Tercera evaluación");
			evaluacion = teclado.nextInt();
			
			switch(evaluacion) {
			case 1:
				notaMasAlta(nota1, alumnos);
				break;
			case 2:
				notaMasAlta(nota2, alumnos);
				break;
			case 3:
				notaMasAlta(nota3, alumnos);
				break;
			}
			switch(evaluacion) {
			case 1:
				notaMasBaja(nota1, alumnos);
				break;
			case 2:
				notaMasBaja(nota2, alumnos);
				break;
			case 3:
				notaMasBaja(nota3, alumnos);
			}
			
			switch (evaluacion) {
			case 1:
				notaMedia(numeroAlumnos, nota1);
				break;
			case 2:
				notaMedia(numeroAlumnos, nota2);
				break;
			case 3:
				notaMedia(numeroAlumnos, nota3);
				break;
			}
			/*notaMasAlta(nota1, alumnos);
			break;
		case 2:
			notaMasBaja(nota2, alumnos);
			break;
		case 3:
			notaMedia(numeroAlumnos, nota3);
			break;
		case 4:
			
			break;
		case 5:
			
			
			break;
		case 6:
			
			
			break;*/
		}
	
	}

	public static void main(String[] args) {
		/*Realizar un programa que solicite el numero de alumnos y a continuacion habra que leer el nombre
		 * y las notas de la primera, segunda y tercera evaluación.
		 * Mostrar un menu donde se imprimira:
		 * 1- Mostrar el alumno con la nota mas baja
		 * 2-Mostrar el alumno con la nota mas alta
		 * 3-Mostrar nota media
		 * 4-Mostrar los alumnos que están un punto por encima o por debajo de la nota media
		 * 5-Mostrar la moda de las notas (la nota que más se repite)
		 * 6-Listado de alumnos con nota final */
		Scanner teclado = new Scanner(System.in);
		
		int numeroAlumnos = 0;
		
	
			System.out.println("Introduce el número de alumnos: ");
			numeroAlumnos = teclado.nextInt();
			
		double notas1[] = new double[numeroAlumnos];
		double notas2[] = new double[numeroAlumnos];
		double notas3[] = new double[numeroAlumnos];
		String alumnos[] = new String[numeroAlumnos];
		int numero[] = new int[numeroAlumnos];
		
		leerNotas(alumnos, notas1, notas2, notas3);
		mostrarMenu(notas1, notas2, notas3);
		
		
		/*for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce nombre: ");
			alumnos[i] = pedirNombreAlumnos();
		}
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce nota: ");
			notas1[i] = pedirNotasAlumnos();
		}*/
		/*
		double nota1[] = new double[0];
		double nota2[] = new double[0];
		double nota3[] = new double[0];
		
		mostrarMenu(nota1, nota2, nota3);*/
	}

}
