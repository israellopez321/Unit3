package arrays;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una array
		int num[] = new int[8];
		
		//Bucle para guardar los números introducidos por el usuario
		for(int i= 0 ; i < num.length; i++) {
			System.out.print("Introduzca un número: ");
			num[i] = sc.nextInt();
		}
		
		for (int j = 0; j < num.length; j++) {
			if (num[j] % 2 == 0) {
				System.out.println(num[j] + " es par");
			} else {
				System.out.println(num[j] + " es impar");
			}
		}
		
		//Cerramos escaner
		sc.close();
		
	}
}
