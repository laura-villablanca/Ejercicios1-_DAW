
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a;
		int [] b;
		int [] c = new int[5];//5 elementos o 5 de longitud
		//int [] c = null; -> inicializamos a nada -> null
		
		a = new int[5];
		a[0] = 7;
		b = a;
		//recolector de basura
		
		System.out.println(a[0]);//7
		System.out.println(b[0]);//7
		b[0] = 13;
		System.out.println(a[0]);//13
		System.out.println(b[0]);//13
		
		

	}

}
