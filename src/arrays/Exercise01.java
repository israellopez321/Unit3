package arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Creamos Random
		Random rand = new Random();

		//Creamos una tabla con longitud 10 para contener los números	
		int tabla1[] = new int[10];

		//Bucle para ir recorriendo la tabla y ingresando los números
		for(int i = 0; i<tabla1.length ; i++) {
			
		 tabla1[i] = rand.nextInt(1,101);
		}
		
		//Mostramos al usuario el array
		System.out.println(Arrays.toString(tabla1));

	}

}
