package funciones;

public class Exercise01 {

	/*
	 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
	 * la suma de todos los valores almacenados en la tabla. Prueba el
	 * comportamiento de la función en un método main.
	 */

	public static void main(String[] args) {

		// Creamos una array para almacenar numeros
		int numeros[] = { 10, 1, 5 };
		
		int sumaTotal = sumarTabla(numeros);

		System.out.println("Suma total = " + sumaTotal);

	}
	
	
	// Funcion para sumar los valores de la array
	public static int sumarTabla(int numeros[]) {
		
		if(numeros == null) {
			throw new IllegalArgumentException("La tabla no puede ser null");	
		}
		
		//Definimos DOnde vamos a guardar la suma en la funcion
		int sumaTotal = 0; 
		
		//Bucle para sumar los valores de la tabla
		for (int indiceActual = 0; indiceActual<numeros.length; indiceActual++) {
			
			sumaTotal = numeros[indiceActual];
		}
		
		//Devolvemos el resultado
		return sumaTotal;
		
	}
}
