package collections;

import java.util.HashMap;
import java.util.Scanner;


public class Ejercicio10 {
	public static void main(String[] args) {
		
		HashMap<String, Double> lista = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			
			System.out.println("--Productos--");
			System.out.println("1. Alta de producto ");
			System.out.println("2. Baja de producto");
			System.out.println("3. Lista de existencia");
			System.out.println("4. Salir del programa");
			System.out.println("Elige una opcion:");
			
			try {
			opcion = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Error: debes introducir un número");
				sc.next();
				opcion = 0;
			}
			
			
			switch (opcion) {
			
				case 1: 
					
					String producto;
					Double precio;
					
					System.out.print("Introduzca el nombre del producto a añadir: ");
					producto = sc.next();
					
					System.out.print("Introduzca el precio de " + producto + ": ");
					precio = sc.nextDouble();
					
					lista.put(producto, precio);
					
					System.out.println("Alta completada");
					
					break;
			
				case 2:
					
					System.out.print("Introduzca el nombre del producto a eliminar: ");
					producto = sc.next();
					
					Double esPosible = lista.remove(producto);
					
					if (esPosible == null) {
						
						System.out.println("Ese producto no existe");
						
					} else {
						
						System.out.println("El producto a sido dado de baja exitosamente");
					}
					
					break;
					
				case 3:
					
					System.out.println(lista.entrySet());
					
					break;
					
				case 4:	
			
					System.out.println("Saliendo del programa...");
					
					break;
					
				default:
					
					System.out.println("Esa opcion no existe");
					
			
			}
			
			
		} while(opcion != 4);
		
		sc.close();
		
	}
}
