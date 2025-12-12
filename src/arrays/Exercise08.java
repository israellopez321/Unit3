package arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos el Random
		Random rand = new Random();
		
		//Valor a buscar
		int n;
		
		//Indice en el que se almacenara el indice en el que se encuentra el elemento de búsqueda
		int busqueda = 0;
		
		//Declaramos una array de 100 numeros
		int numRandom[] = new int[100];
		
		//Bucle para rellenar array con numeros aleatorios de 1-10
		for (int i = 0; i < numRandom.length; i++) {
			
			numRandom[i] = rand.nextInt(1,11);
			
		}
		
		//Pedimos al usuario que numero quiere revisar
		System.out.print("Introduce un número del 1-10 para buscarlo en la tabla: ");
		n = sc.nextInt();
		
		//Incrementaremos el valor para atravesar la tabla hasta dar con el valor pedido
		while(busqueda<numRandom.length && n!= numRandom[busqueda]) {
			busqueda++;	
			
		}
		
		//If para comprobar si n esta en el rango y mostrar el resultado
		if (busqueda < numRandom.length) {
			System.out.println("El valor " + n + " esta en la posición " + busqueda);
		} else {
			System.out.println("No se ha encontrado el valor");
		}
		
		sc.close();
		
	}
}
