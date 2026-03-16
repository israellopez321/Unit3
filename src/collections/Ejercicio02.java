package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Creamos el generador de Random
		Random rand =  new Random();
		
		//Creamos la lista 
		List<Integer> numerosRandom = new ArrayList<>();	
		
		//Rellenamos la lisa aleatoriamente
		for(int indice = 0; indice <= rand.nextInt(5,11); indice++ ) {
			
			numerosRandom.add(rand.nextInt(0,101));
			
		}
		
		
		int suma = 0;
		int media;
		
		  for (int num : numerosRandom) {
	            suma += num;
	        }
		  
		  media = suma + numerosRandom.size();
		
		  int max = numerosRandom.get(0);
		  int min = numerosRandom.get(0);

		  for (int num : numerosRandom) {
		      if (num > max) {
		          max = num;
		      }
		      if (num < min) {
		          min = num;
		      }
		  }
		  
		System.out.println(suma);
		System.out.println(media);
		System.out.println(max);
		System.out.println(min);
		
		
		
	}

}
