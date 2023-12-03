import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// Escribir un programa que pida usuario y contraseña. Cuando el usuario introduzca root como usuario y como contraseña toor, le damos la bienvenida, y si no se le da incorrecto.
		Scanner teclado = new Scanner(System.in);
		String usuario, contrasena;
		usuario = "root";
		contrasena = "toor";
		
		 
		System.out.println("Usuario: ");
		String nombreUser = teclado.nextLine();
		
		System.out.println("Contraseña: ");
		String passwordUser = teclado.nextLine();
		
		if (usuario.equals(nombreUser) || contrasena.equals(passwordUser)) {
			System.out.println("Bienvenido/a");
		} else {
			System.out.println("Usuario y Contraseña Incorrectos/as. Vuelve a intentarlo");
			
		} 
		
		System.out.println("Valor actual de usuario: " + usuario);
		System.out.println("Valor actual de contraseña: " + contrasena);
		

	}

}
