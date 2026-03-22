package collections02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio01 {
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		for(int indice1= 1 ; indice1 <= 10; indice1++) {
			
			lista.add(indice1);
		}
		
		//Mostrar lista ordenada
		System.out.println("Lista ordenada:");
		System.out.println(lista);
		
		//Desordenar lista
		Collections.shuffle(lista);		
		
		//Mostrar lista desordenada
		System.out.println("Lista desordenada:");
		System.out.println(lista);
		
	}
}
