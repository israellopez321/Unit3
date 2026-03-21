package collections;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
	Random rand = new Random();
		
		TreeSet<Integer> listaAleatoria = new TreeSet<>(); 
		
		for(int ind = 0; ind < 20; ind++) {
			
			listaAleatoria.add(rand.nextInt(0,101));
			
		}
		
		System.out.println(listaAleatoria);
	}
}
