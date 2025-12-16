package clase_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Numero de jugadores
		int jugadores;
		
		//Preguntamos el numero de jugadores
		System.out.print("Introduzca el número de jugadores: ");
		jugadores = sc.nextInt();
		
		//Array de puntuaciones
		int puntuaciones[] = new int [jugadores];
		
		int ranking[] = pedirPuntuaciones(puntuaciones);
		
		int rankingOrdenado[] = ordenarAscendente(ranking);
		
		System.out.println(Arrays.toString(rankingOrdenado));
		
		sc.close();
	}
	
	/**
	 * Pedir Puntuaciones para rellenar la array
	 * @param Array de puntuaciones vacia
	 * @return Array de puntuaciones (desordenada)
	 */
	public static int[] pedirPuntuaciones(int[] puntuaciones) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int indice = 0; indice < puntuaciones.length ; indice++ ) {
			
			System.out.print("Introduzca una puntuación: ");
			puntuaciones[indice] = sc.nextInt();
		}
		
		//Cerramos escaner
		sc.close();
		
		return puntuaciones;
	}
	
	
	public static int[] ordenarAscendente(int[] ranking) {
		
		Arrays.sort(ranking);
		
		//Indice del ranking
		int indice = 0;
		
		int[] rankingOrdenado = new int [ranking.length];
		
		for (int i = ranking.length; i > 0; i--) {
			
			rankingOrdenado[i] = ranking[indice];
			
			indice++;
		}
		
		return rankingOrdenado;
		
	}
	
}
