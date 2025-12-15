package funciones;

public class Exercise02 {
	
	/*Diseñar la función: int maximo(int t[]), 
	 * que devuelva el máximo valor contenido en la tabla t.
	 */
	
	public static void main(String[] args) {
		
		int numeros[] = {-3, 5, 3, 9, -4, 9};
		
		int maximo = maximo(numeros);
		
		System.out.println("Valor máximo = " + maximo);
		
	}
	/*
	 * Devuelve el valor maximo contenido en una tabla de enteros
	 * @param tabla de entrada (no puede ser nul ni vacia)
	 * @return valor maximo de la tabla
	 */
	public static int maximo(int tabla[]) {
		
		if (tabla == null) {
			throw new IllegalArgumentException("La tabla no puede ser null");
		}
		if (tabla.length == 0) {
			throw new IllegalArgumentException("La tabla no puede estar vacía");
		}
		
		int maximoActual = tabla[0];
		
		for (int indice = 1; indice < tabla.length; indice++) {
			
			if (tabla[indice] > maximoActual ) {
				maximoActual = tabla[indice];
			}	
		}
		
		return maximoActual;
		
	}
	
}
