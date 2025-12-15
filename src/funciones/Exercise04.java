package funciones;

import java.util.Scanner;

public class Exercise04 {
	
	public static void main(String[] args) {
		
		//Creamos escaner
		Scanner sc = new Scanner(System.in);
		
		//Variable para contener el numero a buscar
		int clave;
		
		int numeros[] = {1, 4, 6, 9, 12, 15, -1, -13};
		
		//Le preguntamos al usuario por el numero de busqueda
		System.out.print("Introduzca el número a buscar: ");
		clave = sc.nextInt();
		
		int posicionClave = buscar(numeros, clave);
		
	}
	
	public static int buscar(int clave, int numeros[]) {
		
		if(numeros == null) {
			throw new IllegalArgumentException("La tabla no puede ser null");	
		}
		
		int posicionClave;
		
		for (int indice = 0; indice < numeros.length; indice++ ) {
			
		}
		
	}
	
	
}
