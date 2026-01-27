package funcionesBi;

import java.util.Random;

public class Exercise05 {
	public static void main(String[] args) {
		
		int tablaSuma[][] = new int[5][6];
		
		rellenarTabla(tablaSuma);
		
		mostrarTabla(tablaSuma);
		
	}
	
	static void rellenarTabla (int array[][]) {
		Random rand = new Random();
		int sumaTotal = 0;
		int sumaFila = 0;
		int sumaColumna = 0;
		
		for (int indice1 = 0; indice1 < array.length-1; indice1++) {
			
			sumaFila = 0;
			sumaColumna = 0;
			
			for (int indice2 = 0; indice2 < array[indice1].length-1; indice2++) {
				
				array[indice1][indice2] = rand.nextInt(100,1000);
				
				sumaTotal += array[indice1][indice2];
				sumaFila += array[indice1][indice2];
				sumaColumna += array[indice2][indice1];
			}
			
			array[indice1][array[indice1].length - 1] = sumaFila;
			array[array.length - 1][indice1] = sumaColumna;
		}
		
		array[4][5] = sumaTotal;
		
	}
	
	static void mostrarTabla(int tabla[][]) {
		
		for (int indice5 = 0; indice5 < tabla.length; indice5++) {
			
			for(int indice6 = 0; indice6 < tabla[indice5].length; indice6++) {
			
				System.out.print(tabla[indice5][indice6] + " | ");
				
			}
			System.out.println();
		}
		
	}
	
}
