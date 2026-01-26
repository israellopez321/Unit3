package funcionesBi;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número de filas: ");
		int filas = sc.nextInt();
		
		System.out.print("Introduzca el número de columnas: ");
		int columnas = sc.nextInt();
		
		//Creamos el arrays con el tamaño preguntado anteriormente
		int tabla[][] = new int[filas][columnas];
		
		//Rellenar array
		for (int indice1 = 0; indice1 < tabla.length; indice1++) {
			
			for (int indice2 = 0; indice2 < tabla[indice1].length; indice2++) {
				
				tabla[indice1][indice2] = 10 * indice1 + indice2;
			}
		}
		
		//Represantar arrayusando bucles
		for (int indice3 = 0; indice3 < tabla.length; indice3++) {
			
			for(int indice4 = 0; indice4 < tabla[indice3].length ; indice4++) {
				
				System.out.print(tabla[indice3][indice4] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}
}
