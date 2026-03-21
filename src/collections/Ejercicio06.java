package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entrada = null;
		
		//LinkdHashSet para no permitir duplicados y se respete el orden de entrada
		TreeSet<String> numerosIntroducidos = new TreeSet<>();
		
		
		System.out.println("Introduzca nombres, para finalizar escribe fin: ");
		/**
		 * 
		 */
		do {
			
			entrada = sc.nextLine();
			
			if (!entrada.equalsIgnoreCase("fin")) {
				
				numerosIntroducidos.add(entrada);
			}
			
		}while(!entrada.equalsIgnoreCase("fin"));
		
		System.out.println(numerosIntroducidos);
		
		sc.close();
	}
}