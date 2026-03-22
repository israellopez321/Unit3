package collections02;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> listaNombres =  new ArrayList<>();
		
		int opcion = 0;
		
		do {
			
			System.out.println("--Menu--");
			System.out.println("1. Añadir nuevo nombre");
			System.out.println("2. Eliminar un nombre");
			System.out.println("3. Ordenar nombres");
			System.out.println("4. Buscar nombre");
			System.out.println("5. Salir del programa");
			System.out.println("--Elegir opcion--");
			
			try {
				
			
			opcion = sc.nextInt();
			} catch (Exception e) {
				System.out.println("ERROR: Introduce un número.");
				opcion = 0;
				sc.nextLine();
			}
			
			switch (opcion) {
			
			case 1:
				
				System.out.print("Introduce un nombre: ");
				String nombre = sc.next();
				
				listaNombres.add(nombre);
				
				System.out.println("Nombre añadido");
				
				break;
			case 2:
				
				System.out.print("Nombre a eliminar: ");
				String eliminar = sc.next();
				
				if (listaNombres.remove(eliminar)) {
					
					System.out.println("Usuario eliminado");
				} else {
					System.out.println("Ese nombre no esta en la lista");
				}
					
				break;
			case 3:
				
				listaNombres.sort(null);
				
				System.out.println("Nombres ordenados");
					
				break;
			case 4:
				
				System.out.println("Nombre a buscar:");
				String buscar = sc.next();
				
				if(listaNombres.contains(buscar)) {
					
					System.out.println("El nombre esta en la lista");
				} else {
					
					System.out.println("El nombre no esta en la lista");
				}
				
				break;
			case 5:
				
				System.out.println("Saliendo del programa...");
				
				break;
			default:	
			
				System.out.println("Esa opcion no existe");
			}
			
			
			
		}while(opcion != 5);
		
	}
}
