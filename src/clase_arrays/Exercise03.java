package clase_arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Array de tamaño 30
		int tabla[] = new int [30];
		
		int tablaRellena[] = rellenarTabla(tabla); 
		
		//Ordenamos la tabla
		Arrays.sort(tablaRellena);
		
		System.out.println(Arrays.toString(tablaRellena));
		
	}
	
	/**
	 * Rellenar array vacia
	 * @param array vacia
	 * @return array rellena (numero aletorios (0-9))
	 */
	public static int[] rellenarTabla(int[] tabla) {
		
		//Creamos random
		Random rand = new Random();
		
		//Bucle para rellenar la tabla con numeros aleatorios
		for (int indice = 0; indice < tabla.length; indice++) {			
			tabla [indice] = rand.nextInt(0,10);
		}
		
		return tabla;
	}
}
