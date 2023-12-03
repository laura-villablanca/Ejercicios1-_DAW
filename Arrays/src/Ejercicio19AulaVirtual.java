import java.util.Scanner;
public class Ejercicio19AulaVirtual {
	
	public static int menuOpciones() {
		 Scanner teclado = new Scanner(System.in);
		 
			System.out.println("1.-Asignar o cancelar turno: ");
		
			System.out.println("2.-Cantidad de equipos disponibles por sala: ");

			System.out.println("3.-Cantidad de turnos asignados en toda la UCPR: ");
			
			System.out.println("4.-Mostrar estado de reservas: ");

			System.out.println("5.-Salir: ");

			
			return teclado.nextInt();
		}
	
	public static int asignarOcancelarTurno() {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
		System.out.println("1-Asignar turno");
		System.out.println("2-Cancelar turno");
		opcion = teclado.nextInt();
		}while(opcion!=1&&opcion!=2);
		
		return opcion;
	}
	
	public static void asignarTurno(boolean[][][]reservas) {
		Scanner teclado = new Scanner(System.in);
		int sala = 0, ordenador = 0, turno = 0;
		do {
			System.out.println("Dame la sala: ");
			sala = teclado.nextInt();
		}while (sala <= 0 || sala > SALAS);
		
		do {
			System.out.println("Dame el ordenador: ");
			ordenador = teclado.nextInt();
		}while((ordenador<=0||ordenador>ORDENADORES));
		
		do {
			System.out.println("Introduce el turno: ");
			turno = teclado.nextInt();
		} while(turno <= 0 || turno > TURNOS);

		if(!reservas[sala-1][ordenador-1][turno-1]) {
			reservas[sala-1][ordenador-1][turno-1]=true;
			System.out.println("Gracias por reservar!");
		} else {
			System.out.println("Upsss...ya esta reservada :(");
		}
	}
		
	
	public static void cancelarTurno(boolean[][][]reservas) {
		Scanner teclado = new Scanner(System.in);
		int sala = 0, ordenador = 0, turno = 0;
		do {
		System.out.println("Dame la sala: ");
		sala = teclado.nextInt();
		}while(sala<=0 || sala > SALAS);
		do {
		System.out.println("Dame el ordenador: ");
		ordenador = teclado.nextInt();
		}while(ordenador<=0 || ordenador > ORDENADORES);
		
		do {
			System.out.println("Introduce el turno: ");
			turno = teclado.nextInt();
		}while(turno <= 0 || turno > TURNOS);
		
		if(reservas[sala-1][ordenador-1][turno-1]) {
			reservas[sala-1][ordenador-1][turno-1]=false;
			System.out.println("Reserva cancelada!");
		} else {
			System.out.println("Este turno no estaba reservado :(");
		}
		
	}
	
	public static int cantidadEquiposDisponibles(boolean reservas[][][]) {
		Scanner teclado = new Scanner(System.in);
		int cantidadEquipos = 0;
		int sala = 0;
		
		do {
			System.out.println("Introduce sala: ");
			sala = teclado.nextInt();
		}while(sala < 1 && sala > 5);
		
		
		for (int i = 0; i < reservas[sala-1].length; i++) {
			boolean libre = false;
			for (int j = 0; j < reservas[sala-1][i].length; j++) {
				if (!reservas[sala-1][i][j]) {
					libre = true;
				}
			}
			if (libre) {
				cantidadEquipos++;
			}
		}
		
		return cantidadEquipos;
	}

	
	public static int turnosAsignados(boolean reservas[][][]) {
		int turnos = 0;
		int turno[] = new int[2];
		
		for (int i = 0; i < reservas.length; i++) {
			for (int j = 0; j < reservas[i].length; j++) {
				for (int k = 0; k < reservas[i][j].length; k++) {
					if(reservas[i][j][k]) {
						turnos++;
					}
				}
				
			}
		}
		
		return turnos;
	}
	
	public static void mostrarEstadoReservas(boolean reservas[][][]) {
		
		for (int i = 0; i < reservas.length; i++) {
			System.out.println("Sala " + (i+1) + ":");
			for (int j = 0; j < reservas[i].length; j++) {
				System.out.println("   Equipo " + (j+1) + ":");
				for (int k = 0; k < reservas[i][j].length; k++) {
					System.out.print("      Turno " + (k+1) + ": ");
					if (reservas[i][j][k] == false) {
						System.out.print("Disponible\n");
					} else {
						System.out.print("Ocupado\n");
					}
				}
			}
			System.out.println();
		}
	}

	static final int SALAS = 5;
	static final int ORDENADORES = 20;
	static final int TURNOS = 2;
	
	public static void main(String[] args) {
		//DATOS = [SALA][ORDENADORES][TURNOS]
		//Si esta disponible primer turno o no.
	boolean reservas[][][] = new boolean[SALAS][ORDENADORES][TURNOS]; 
	int opcion;
	
	mostrarEstadoReservas(reservas);
	
	do {
		opcion = menuOpciones();
		
		switch (opcion) {
		case 1:
			switch(asignarOcancelarTurno()) {
			case 1:
				asignarTurno(reservas);
				break;
			case 2:
				cancelarTurno(reservas);
				break;
			}
			break;
		case 2:
			System.out.println("Hay " + cantidadEquiposDisponibles(reservas) + " equipos disponibles");
			break;
		case 3:
			System.out.println("Hay " + turnosAsignados(reservas) + " turnos asignados");
			break;
		case 4:
			mostrarEstadoReservas(reservas);
			break;
		case 5:
			System.out.println("Programa finalizado!");
			break;
		}
	}while(opcion != 5);
	
	mostrarEstadoReservas(reservas);
		
	}

}
