package clase_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la primera array
		int primeraTabla[] = new int[10];
		
		//Declaramos la segunda array
		int segundaTabla[] = new int [10];
		
		//Bucle para contener los valores introducidos en la array
		for(int i = 0; i <= 19 ; i++) {
			if (i < 10) {
				System.out.print("Introduca los números: ");
				primeraTabla[i] = sc.nextInt();
			} else {
				System.out.print("Introduca los números: ");
				segundaTabla[i-10] = sc.nextInt();
			}	
		}
		
		//Mostramos si las tablas son iguales
		System.out.println(Arrays.equals(primeraTabla, segundaTabla));
		
		//Cerramos escaner
		sc.close();
	}
}
