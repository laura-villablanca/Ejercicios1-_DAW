import java.util.Scanner;
public class ejercicio5comoDebeSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String usuario, contrasena;
		usuario = "root";
		contrasena = "toor";
		
		System.out.println("Usuario: ");
		String nombreUser = teclado.nextLine();
		
		
		
		if (usuario.equals(nombreUser)) {
			
			System.out.println("Contraseña: ");
			String passWordUser = teclado.nextLine();
			
			if (contrasena.equals(passWordUser)) {
				System.out.println("Bienvenido/a");
				
			} else {
				System.out.println("La contraseña es incorrecta. Inténtalo de nuevo");
			}
			
		} else {
			System.out.println("Nombre de Usuario incorrecto. Vuelve a intentarlo");
			
		}
		
	}

}
