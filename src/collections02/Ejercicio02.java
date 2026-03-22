package collections02;

import java.util.HashSet;
import java.util.Random;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		HashSet<Integer> enterosAleatorios = new HashSet<>();
	
		//Bucle para añadir n8umeros aleatorios a una lista
		for(int indice = 0; indice < 10; indice++){
			
			enterosAleatorios.add(rand.nextInt(1,21));
			
		}
		
		System.out.println(enterosAleatorios);
		
		
	}
}
