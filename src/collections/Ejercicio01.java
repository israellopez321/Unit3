package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		
		
		//Creamos un lista Array
		List<Integer> numPositivos = new ArrayList<>();
		
		int numero = 0;
		
		//Bucle para añadir numeros a la lista y preguntar por el número
		do {
			
			System.out.print("Introduzca un número: ");
			numero = sc.nextInt();
			
			if (numero >= 0) {
				numPositivos.add(numero);
				
			}
			
			
		} while(numero >= 0);
		
		
		sc.close();
	}
}
