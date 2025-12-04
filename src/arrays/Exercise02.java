package arrays;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		
		//Creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos el array para contener los numeros introducidos
		double tablaDec[] = new double[5];
		
		//Bucle para pedir y guardar los datos en la array
		for(int i = 0; i<tablaDec.length; i++) {
			
			//Preguntamos al usuario el numero
			System.out.print("Introduzca un número decimal: ");
			tablaDec[i] = sc.nextDouble();
			
		}
		//Añadimos el primer corchete
		System.out.print("[");
		
		//Bucle para mostrar los datos de la array
		for(int j = 0; j<=tablaDec.length-1;j++) {
			if (j==tablaDec.length-1) {
				System.out.print(tablaDec[j]);
			} else {
				System.out.print(tablaDec[j] + ", ");
			}
			
		}
		//Añadimos el corchete del final
		System.out.print("]");
		
		//Cerramos escaner
		sc.close();
	}
}
