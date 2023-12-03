import java.util.Scanner;
public class ejercicios11_profe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el precio inicial del kilo de uva: ");
		double precioInicial, kilosUva, precioFinal;
		int tamanioUva;
		String tipoUva;
		precioInicial = teclado.nextDouble();
		System.out.println("Dame los kilos de uva: ");
		kilosUva = teclado.nextDouble();
		System.out.println("Introduce el tipo de uva: ");
		teclado.nextLine();
		tipoUva = teclado.nextLine();
		System.out.println("Introduzca el tamaño de la uva: (1/2)");
		tamanioUva = teclado.nextInt();
		
		if (tipoUva.equalsIgnoreCase("A")) {
			if(tamanioUva == 1) {
				precioFinal = precioInicial + 0.20;
			} else {
				precioFinal = precioInicial + 0.30;
			}
		} else {
			if (tamanioUva == 1) {
				precioFinal = precioInicial - 0.30;
			} else {
				precioFinal = precioInicial - 0.50;
			}
		} 
		double precioTotal = precioFinal * kilosUva;
		System.out.println("El precio de " + kilosUva 
				+ " kgs de uva de tipo " + tipoUva + " y tamaño " + tamanioUva + " es " + precioTotal);
			
	} 
}


