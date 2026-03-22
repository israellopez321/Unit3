package collections02;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		HashMap<Character,Integer> frecuencia = new HashMap<>(); 
		
		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, "
				+ "ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		
		for (int indice = 0; indice < texto.length(); indice++) {
			
			char letra = texto.charAt(indice);
			
			letra = Character.toLowerCase(letra);

			if(letra >= 'a' & letra <= 'z') {
				
				frecuencia.put(letra, frecuencia.getOrDefault(letra, 0) + 1);
					
			}
		}
		
		System.out.println(frecuencia);
		
	}
}
