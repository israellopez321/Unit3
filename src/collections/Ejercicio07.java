package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeMap<String, String> diccionario = new TreeMap<>();

		// Creacion de diccionario
		diccionario.put("hola", "hello");
		diccionario.put("adios", "goodbye");
		diccionario.put("casa", "house");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("banco", "bank");
		diccionario.put("libro", "book");
		diccionario.put("mesa", "table");
		diccionario.put("familia", "family");
		diccionario.put("amigo", "friend");
		diccionario.put("tiempo", "time");
		diccionario.put("ciudad", "city");
		diccionario.put("dia", "day");
		diccionario.put("agua", "water");
		diccionario.put("fuego", "fire");
		diccionario.put("planta", "plant");
		diccionario.put("noche", "night");
		diccionario.put("hotel", "hotel");
		diccionario.put("ordenador", "computer");
		diccionario.put("raton", "mouse");

		int opcion = 0;

		do {

			System.out.println("--Diccionario--");
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("3. Finalizar programa");
			System.out.print("Elige un opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Introduce una palabra en español: ");
				String palabraEsp = sc.next();

				System.out.println("Introduce su traduccion al inglés: ");
				String palabraIng = sc.next();

				diccionario.put(palabraEsp, palabraIng);

				System.out.println("Palabra añadida");

				break;

			case 2:

				System.out.println("Introduce una palabra en español a buscar: 	");
				String buscar = sc.next();

				if (diccionario.containsKey(buscar)) {

					System.out.println(buscar + " = " + diccionario.get(buscar));

				} else {

					System.out.println("La palabra no esta en el diccionario.");
				}

				break;

			case 3:

				System.out.println("Cerrando programa...");

				break;
			default:
				System.out.println("Elija una de las opciones");

			}

		} while (opcion != 3);

		sc.close();

	}
}
