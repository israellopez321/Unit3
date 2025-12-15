package funciones;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exercise03 {
/*Escribir la función int[] rellenaPares(int longitud, int fin), que crea 
 * y devuelve una tabla ordenada de la longitud especificada, que se encuentra 
 * rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive.
 */
	public static void main(String[] args) {
		
		//Creamos escaner
		Scanner sc = new Scanner(System.in);
		
		//Variables que define la tabla
		int longitud;
		int fin;
		
		//Le preguntamos al usuario por la longitud y alcance de pared de la tabla
		System.out.print("Introduzca la longitud de la tabla: ");
		longitud = sc.nextInt();
		
		System.out.print("Introduzca el alcance de pares de la tabla: ");
		fin = sc.nextInt();
		
		int tablaPares[] = rellenaPares(longitud ,fin);
		
		System.out.println(Arrays.toString(tablaPares));
		
		sc.close();
		
	}
	/*
	 * Devuelve una tabla aleatoria de pares ordenada
	 * @param longitud de array y fin de alcance de pares 
	 * @return array pares aleatoria ordenada
	 */
	public static int[] rellenaPares(int longitud, int fin) {
		
		//Creamos random
		Random rand = new Random();
		
		int[] tablaPares = new int[longitud];
		
		int numRandom; 
		
		//Bucle para recorrer la tabla
		for (int indice = 0 ;  indice < tablaPares.length ; indice++) {
			
			//Para descartar que se guarden los numeros aleatorios impares
			do {
				numRandom = rand.nextInt(2, fin);
			} while (numRandom % 2 == 1);
			
			tablaPares[indice] = numRandom;
		}
		
		Arrays.sort(tablaPares);
		
		return tablaPares;
	}
}
