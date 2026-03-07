package funciones;

import java.util.Random;

public class Exercise01Bi {
	public static void main(String[] args) {
		
		int tabla[][] = new int[6][10];
		
		int minMax[] = new int[2];
		
		rellenarTabla(tabla);
		
		minYMax(tabla, minMax);
		
		mostrarTabla(minMax);
	}
	
	static int[] minYMax(int[][] tabla, int[] minMax) {
		
		int min = 1000;
		int max = 0;
		
		for (int indice3 = 0; indice3 < tabla.length; indice3++ ) {
			
			for (int indice4 = 0; indice4 < tabla[indice3].length; indice4++) {
				
				if (tabla[indice3][indice4] > max) {
					max = tabla[indice3][indice4];
				}
				
				if (tabla[indice3][indice4] < min) {
					min = tabla[indice3][indice4];
				}
				
			}
			
		}
		
		minMax[0] = min;
		minMax[1] = max;
		
		return minMax;
		
	}
	
	static int[][] rellenarTabla(int[][] tabla) {
		Random rand = new Random();
		
		for (int indice1 = 0; indice1 < tabla.length; indice1++) {
			
			for  (int indice2 = 0; indice2 < tabla[indice1].length; indice2++) {
				
				tabla[indice1][indice2] = rand.nextInt(0,1001);
				
			}
		}
		
		return tabla;
		
	}
	
	static void mostrarTabla(int minMax[]) {
		
		System.out.println("Min = " + minMax[0]);
		System.out.println("Max = " + minMax[1]);
	}
}
