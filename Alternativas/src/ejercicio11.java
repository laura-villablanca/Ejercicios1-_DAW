import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		/* 
		 Una asociacion de agricultores tiene como politica fijar un precio inicial a kg de uva,
		 la cual se clasifica por tipos A y B. Además en tamaños: 1, 2.
		 
		 Cuando se realiza una venta de este producto, esta es de un solo tipo y tamaño. Se necesita determinar
		 cuanto recibirá un productor por la uva que entregue en un embarque considerando lo siguiente:
		 si es de tipo A, se le cargan 20 centimos al precio inicial cuando es de tamaño 1 y 30 centimos cuando
		 es de tamaño 2.
		 Si es de tipo B, se rebajan 30 centimos cuando es de tamaño 1 y 50 centimos cuando es de tamaño 2.
		 
		 Hacer un programa que determine la ganancia.
		 
		*/
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame los kilos de uva: ");
		double kilosUva = teclado.nextDouble();
		
		System.out.println("Introduce el tipo A o B: ");
		teclado.nextLine();
		String tipo = teclado.nextLine();
		
		System.out.println("Introduce el tamaño: ");
		int tamaño = teclado.nextInt();
		
		System.out.println("Introduce el precio por kg de uva: ");
		double precioInicial = teclado.nextDouble();
		double precioFinal = 0.0;
		
		if (tipo.equalsIgnoreCase("A") && tamaño == 1) {
			System.out.println(precioFinal = precioInicial + 0.20);
		} else if (tipo.equalsIgnoreCase("A") && tamaño == 2) {
			System.out.println(precioFinal = precioInicial + 0.30);
		} else if (tipo.equalsIgnoreCase("B") && tamaño == 1) {
			System.out.println(precioFinal = precioInicial - 0.30);
		} else if (tipo.equalsIgnoreCase("B") && tamaño == 2) {
			System.out.println(precioFinal = precioInicial - 0.50);
		}
		double precioTotalFinal = precioFinal * kilosUva;
		System.out.println(precioTotalFinal);
	}
	
	
}
