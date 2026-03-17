package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		List<Integer> listaAleatoria = new ArrayList<>(); 
		
		for(int ind = 0; ind < 30; ind++) {
			
			listaAleatoria.add(rand.nextInt(1,11));
			
		}
		
		System.out.println(listaAleatoria);
			
	}
}
