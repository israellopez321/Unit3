package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la array para contener los números
		int numASumar[] = new int[10]; 
		
		//Variable para contener la suma de la array
		int suma = 0;
		
		//Bucle para rellenar la array
		for (int i = 0; i < numASumar.length; i++) {
			System.out.print("Introduzca un número: ");
			numASumar[i] = sc.nextInt();
		}
		
		//Bucle para sumar los números de la array
		for (int i = 0; i < numASumar.length; i++) {
			suma += numASumar[i]; 
		}
		
		//Ordenamos el arary de menor a mayor
		Arrays.sort(numASumar);
		
		//Mostramos el numero mayor y menor
		System.out.println("Número máximo: " + numASumar[9]);
		System.out.println("Número mínimo: " + numASumar[0]);
		
		//Mostramos la suma de los numeros de la array
		System.out.println("Suma de todos los números: " + suma);
		
		//Cerramos escaner
		sc.close();
	}
}
