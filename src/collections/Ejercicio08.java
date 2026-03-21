package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeMap<String, String> controlAcceso = new TreeMap<>();
		
		int opcion = 0;
		
		do {
			
			System.out.println("--Acceso de area--");
			System.out.println("1. Registro ");
			System.out.println("2. Login");
			System.out.println("3. Salir del programa");
			System.out.println("Elige una opcion:");

			opcion = sc.nextInt();
			
			switch(opcion) {
			
				case 1: 
					 
					System.out.print("Ingrese su usuario: ");
					String nombreUsuario = sc.next(); 
					
					System.out.print("Ingrese su contraseña: ");
					String password = sc.next();
					
					controlAcceso.put(nombreUsuario, password);
					
					System.out.println("Registro completado");
					
					break;
					
				case 2:
					
					int intentos = 3;
					boolean acceso = false;
					
					while (intentos > 0 && !acceso) {
						
					
						System.out.print("Introduce su usuario: ");
						nombreUsuario = sc.next();
					
						System.out.println("Introduce su contraseña: ");
						password = sc.next();
					
						if (controlAcceso.containsKey(nombreUsuario) && controlAcceso.get(nombreUsuario).equals(password)) {
							
							System.out.println("Ha accedido al área restringida");
							acceso = true;
							
						} else {
							
							intentos--;
							System.out.println("Datos incorrectos");
						}
						
						if (!acceso) {
							
							System.out.println("Lo siento, no tiene acceso al área restringida");
						}
						
					}
					
					break;
					
				case 3:	
					
					System.out.println("Cerrando programa...");
					
					break;
					
				default:	
					
					System.out.println("Esa opcion no es valida");
			}
			
			
		}while(opcion != 3);
		
		sc.close();
		
		
		
	}
	
}
