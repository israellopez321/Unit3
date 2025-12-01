package arrays;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		
		//Creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos el array
		double tablaDec[] = new double[4];
		
		//Declaramos una variable para contener el número introducido por el usuario
		double num;
		
		//Bucle para pedir y guardar los datos en la array
		for(int i = 0; i<tablaDec.length; i++) {
			
			//Preguntamos al usuario el numero
			System.out.print("Introduzca un número decimal: ");
			num = sc.nextDouble();
			
			//Guardamos el número en la array
			tablaDec[i] = num;
		}
		
		
		
		sc.close();
	}
}
