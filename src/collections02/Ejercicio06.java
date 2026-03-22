package collections02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, ArrayList<String>> listaTelefonos = new HashMap<>();
		
		int opcion = 0;
		
		do {
			
			System.out.println("--Libreta de direcciones--");
			System.out.println("1. Añadir persona.");
			System.out.println("2. Añadir telefono a una persona dada.");
			System.out.println("3. Mostrar los telefonos de una persona.");
			System.out.println("4. Eliminar telefono de una persona.");
			System.out.println("5. Eliminar una persona.");
			System.out.println("0. Cerrar programa.");
			System.out.println("Elige una opcion: ");
			
			try {
				opcion = sc.nextInt();
			}catch(Exception e) {	
				System.out.println("ERROR: Introduzca un número.");
				sc.next();
				opcion = 0;
			}
			
			switch(opcion) {
			
			case 1:
				System.out.print("Introduce el nombre de la persona:");
				String nombre = sc.next();
				
				if (listaTelefonos.containsKey(nombre)) {
					System.out.println("Esa persona ya existe.");

				} else {
					listaTelefonos.put(nombre, new ArrayList<String>());
					System.out.println("Persona añadida.");
				}
				
				break;
			case 2:
				System.out.print("Introduce el nombre de la persona: ");
				nombre = sc.next();
				
				if (listaTelefonos.containsKey(nombre)) {
					System.out.println("Introduce el telefono:");
					String telefono = sc.next();
					
					listaTelefonos.get(nombre).add(telefono);
					System.out.println("Telefono añadido.");
					
				} else {
					
					System.out.println("No exite esa persona en la lista.");
				}
				
				break;
			case 3:
				System.out.print("Introduce el nombre de la persona: ");
				nombre = sc.next();
				
				if (listaTelefonos.containsKey(nombre)) {
					
					ArrayList<String> telefonos = listaTelefonos.get(nombre);
					
					if (telefonos.isEmpty()) {
						System.out.println("No hay telefonos registrados");
					} else {
						
						System.out.print("Telefonos de " + nombre + ": ");
						for(String telefono: telefonos) {
							
							System.out.println(" - " + telefono);
						}
					}
					
				}else {
					
					System.out.println("Esa persona no existe.");
				}
				
				break;
			case 4:
				
				System.out.print("Introduce el nombre de la persona: ");
				nombre = sc.next();
				
				if (listaTelefonos.containsKey(nombre)) {
					System.out.print("Introduce el telefono a eliminar: ");
					String telefono = sc.next();
					
					if(listaTelefonos.get(nombre).remove(telefono)) {
						System.out.println("Telefono eliminado.");
					} else {
						
						System.out.println("Ese telefono no existe.");
					}
				}
				
				break;
			case 5:
				
				System.out.print("Introduce el nombre de la persona: ");
				nombre = sc.next();
				
				if(listaTelefonos.remove(nombre) != null) {
					
					System.out.println("Persona eliminada.");
				}else {
					System.out.println("Esa persona no existe.");
				}
				
				break;
			case 0:
				System.out.println("Cerrando el programa");
				
				break;
			default:
				System.out.println("Esa opcion no existe");
					
			}
			
		}while(opcion != 0);
		
		
	}
}
