import java.util.Scanner;
public class LiquidacionTarjeta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Pedimos un préstamo de 1500 en 12 meses. Calcular cuanto pagaremos al mes.
		// Tipo de interes Nominal aplicable es 17,48% (anuales)
		
		//El primer mes:
		//14,06/12 = 1,17-> interés mensual
		//15 * 1,17 = 17,56 -> intereses generados el primer mes
		//cuota mensual = 134,72
		
		//segundo mes:
		//El segundo mes, sumar los intereses generados + 1500 - la cuota mensual
		//(1500 + 17,56) - 134,72
		
		//....etc etc
		//1500
		//1387,13
		//Aplicamos el 1,46%
		//20,25 de comision
		//cuota mensual = 134,72
		double saldoDeudor = 0.0;
		double interes = 0.0;
		double cuotaMensual = 0.0;
		
		double interesMensual = 0.0;
		double interesAPagar = 0.0;
		int incremento = 0;
		
		double liquidacionTarjeta[][] = new double[360][5];
		
		System.out.println("Introduce el saldo deudor: ");
		saldoDeudor = teclado.nextDouble();
		
		System.out.println("Introduce el interés: ");
		interes = teclado.nextDouble();
		
		System.out.println("Introduce cuota mensual: ");
		cuotaMensual = teclado.nextDouble();
		
		
		interesMensual = interes/12;//12 son los meses, porque es un tipo de interes anual   El interes mensual nunca cambia
		interesAPagar = (saldoDeudor * interesMensual)/100;
		double saldoDeudorMensual = (saldoDeudor + interesAPagar) - cuotaMensual;
		
		/*for (int i = 0; i < liquidacionTarjeta.length; i++) {
			for (int j = 0; j < liquidacionTarjeta[i].length; j++) {
				switch (j) {
				
				case 0:
					liquidacionTarjeta[i][j] = incremento++;
					break;
				case 1:
					if (i == 0) {
						liquidacionTarjeta[i][j] = saldoDeudorMensual;
					}
					break;
				case 2:
					liquidacionTarjeta[i][j] = interes;
					break;
				case 3:
					liquidacionTarjeta[i][j] = interesAPagar;
					break;
				case 4:
					liquidacionTarjeta[i][j] = cuotaMensual;
					break;
				
					
				}
				if (saldoDeudorMensual < cuotaMensual) {
					System.out.println("Ha liquidado la deuda");
				}
			}
		}*/
		
		for (int i = 0; i < liquidacionTarjeta.length; i++) {
			liquidacionTarjeta[i][0] = i+1;
			liquidacionTarjeta[i][2] = interes/12;
			liquidacionTarjeta[i][4] = cuotaMensual;
			if (i==0) {
				liquidacionTarjeta[i][1] = saldoDeudor;
			} else {
				liquidacionTarjeta[i][1] = liquidacionTarjeta[i -1][1] + liquidacionTarjeta[i - 1][3] - cuotaMensual;
			} 
			liquidacionTarjeta[i][3] = liquidacionTarjeta[i][1] * liquidacionTarjeta[i][2]/100;
		}
		
		
		
		
	}

}
