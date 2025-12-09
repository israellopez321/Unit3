package arrays;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {

		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la array de longitud de para contener los numeros introducidos
		int numIntrod[] = new int[10];
		
		//Bucle para preguntar al usuario los numeros para almacenar en el array
		for (int i = 0; i < numIntrod.length; i++) {
			System.out.print("Introduzca un número: ");
			numIntrod[i] = sc.nextInt();			
		}
		
		//Bucle para sacar los datos de manera inversa
		for(int i = numIntrod.length-1; i>=0;i--) {
			if (i == 0) {
				System.out.print(numIntrod[i] + ". ");
			} else {
				System.out.print(numIntrod[i] + ", ");
			}
		}
		
		//Cerramos escaner
		sc.close();
	}
}
