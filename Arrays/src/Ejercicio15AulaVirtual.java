
public class Ejercicio15AulaVirtual {
	
	public static void imprimirArray(double array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean coincideDiagonal(double array[][]) {
		boolean coincide = false;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = 1.0;
					coincide = true;
				} else {
					coincide = false;
				}
			}
		}
		
		return coincide;
	}

	public static void main(String[] args) {
		/*Crear la siguiente matriz unidad, como se muestra la gráfica
			1.0 0.0 0.0 0.0
			0.0 1.0 0.0 0.0
			0.0 0.0 1.0 0.0
			0.0 0.0 0.0 1.0*/
		double array[][] = new double[4][4];
		
		coincideDiagonal(array);
		imprimirArray(array);
		
	}

}
