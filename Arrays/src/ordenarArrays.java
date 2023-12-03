
public class ordenarArrays {
	
	public static void imprimir(int[]array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] +"]");
		}
		System.out.println();
	}
	
	public static void ordenarBoolean(int[]array) {
		int aux;
		boolean ordenado = true;
		for (int i = 0; i < array.length-1; i++) {
			ordenado = false;
				for (int j = 0; j < array.length-1-i; j++) {
					//imprimir(array);
					if(array[j] > array[j+1]) {
						//Intercambiar
						aux = array[j+1];
						array[j+1] = array[j];
						array[j] = aux;
				}
			}
		}
	}
	
	/*public static void ordenar(int[]array) {
		int aux;
		for (int i = 0; i < array.length; i++) {
			
				for (int j = 0; j < array.length-1; j++) {
					
					if(array[j] > array[j+1]) {
						//imprimir(array);
						//Intercambiar
						aux = array[j+1];
						array[j+1] = array[j];
						array[j] = aux;
				}
			}
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]desordenado =  {6, 5, 3, 1, 8, 7, 2, 4};
		imprimir(desordenado);
		ordenarBoolean(desordenado);
		imprimir(desordenado);
	}

}
