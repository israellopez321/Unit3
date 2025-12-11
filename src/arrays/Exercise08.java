package arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos el Random
		Random rand = new Random();
		
		//Declaramos una array de 100 numeros
		int numRandom[] = new int[100];
		
		//Bucle para rellenar array con numeros aleatorios de 1-10
		for (int i = 0; i < numRandom.length; i++) {
			
			numRandom[i] = rand.nextInt(1,11);
			
		}
		
		
		
	}
}
