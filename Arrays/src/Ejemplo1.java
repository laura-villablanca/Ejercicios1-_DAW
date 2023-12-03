import java.lang.reflect.Array;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] edades = new int[5];//new reserva en un espacio de la memoria
		//entre [] le asigno la posición en la que quiero introducir el valor
		edades[0] = 26;
		edades[1] = 13;
		edades[2] = 9;
		edades[3] = 17;
		edades[4] = 35;
		//segunda forma//int edades2[];
		for (int i = 0; i < edades.length; i++) 
		System.out.println(edades[i]);//9
		
		

	}

}
