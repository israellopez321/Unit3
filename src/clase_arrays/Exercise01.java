package clase_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Variable donde se almacena  el tamaño de la array
		int tamaño;
		
		//Variable que almacena el valor contenido en la array
		int valor;
		
		//Pedimos al usuario el tamaño de la array
		System.out.print("Introduzca el tamaño de la array: ");
		tamaño = sc.nextInt();
		
		//Pedimos al usuario el valor almacenado en la array
		System.out.print("Introduzca el valor de la array: ");
		valor = sc.nextInt();
		
		//Declaramos la array con el tamaño introducido por el usuario
		int tabla[] = new int[tamaño];
		
		//Inicializamos toda la array a el valor dado por el usuario
		Arrays.fill(tabla, valor);
		
		//Mostramos la array en pantalla
		System.out.println(Arrays.toString(tabla));
		
		//Cerramos escaner
		sc.close();
		
	}
}
