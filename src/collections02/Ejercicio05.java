package collections02;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Double> series = new HashMap<>();
		
		int opcion = 0;
		try {

		} catch (Exception e) {
			System.out.println("ERROR: Tienes que introducir un numero");
			sc.nextLine();
			opcion  = 0;
			
		}
		
		
		do {
			
			System.out.println("--Gestion de series--");
			System.out.println("1. Añadir serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("4. Salir del programa");
			
			try {
				opcion = sc.nextInt();
			} catch (Exception e) {
				System.out.println("ERROR: Tienes que introducir un numero");
				sc.nextLine();
				opcion  = 0;
			}
			
			
			switch (opcion) {
			
			case 1:
				
				System.out.print("Nombre de la serie: ");
				String nombre = sc.next();
				
				System.out.print("Valoración de la serie: ");
				double valor = sc.nextDouble();
				
				series.put(nombre, valor);
				
				System.out.println("Serie añadida");
				
				break;
			case 2:
				
				System.out.print("Nombre de la serie a buscar: ");
				nombre = sc.next();
				
				if(series.containsKey(nombre)) {
					
					System.out.println("La valoracion de " + nombre + " es de " + series.get(nombre));
				} else {
					
					System.out.println("La serie no esta en la lista");
				}
				
				break;
			case 3:
				
				System.out.print("Nombre de la serie a eliminar: ");
				String eliminar = sc.next();
				
				if(series.remove(eliminar) != null) {
					
					System.out.println("Serie eliminada");
				} else {
					
					System.out.println("Esa serie no existe");
				}
				
				break;
			case 4:
				
				System.out.println("Saliendo del programa...");
				
				break;
			default:
			
				System.out.println("Esa opcion no existe");
			
			}
			
		}while(opcion != 5);
		
	}
}
