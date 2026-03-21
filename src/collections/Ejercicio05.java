package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entrada = null;
		
		//LinkdHashSet para no permitir duplicados y se respete el orden de entrada
		Set<String> numerosIntroducidos = new LinkedHashSet<>();
		
		
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
