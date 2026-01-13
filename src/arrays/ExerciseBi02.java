package arrays;

import java.util.Arrays;
import java.util.Scanner;

/* Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 
* 5 asignaturas. El usuario introducirá las notas por teclado y luego el programa mostrará la tabla con las notas.
* A continuación, mostrará la nota mínima, máxima y media de cada alumno.
*/


public class ExerciseBi02 {
	
	public static final int NUM_ALUMNOS = 4;
	public static final int NUM_ASIGNATURAS = 5;
	
	public static void main(String[] args) {
	
		//Declaramos dos constantes sobre los alummnos y asignaturas para recoger el numero de alumnos
		
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una array de x alumnos y x asignturas
		double notas [][] = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];
		
		rellenarNotas(sc,notas);
		
		System.out.println(Arrays.toString(notas[0]));
		
		//mostrarResumenPorAlumno(notas);
		
		
	}
	
	//Rellena la tabla de notas con los alumnos en fila y asignatura en columnas
	
	private static void rellenarNotas(Scanner sc, double notas[][]) {
		
		int indiceAlumno;
		for(indiceAlumno = 0; indiceAlumno < NUM_ALUMNOS; indiceAlumno++) {
			System.out.println("Introduce las notas del alumno" + (indiceAlumno + 1) + ":");
			
			int indiceAsignatura;
			for (indiceAsignatura = 0; indiceAsignatura < NUM_ASIGNATURAS; indiceAsignatura++) {
				System.out.println("Asignatura" + (indiceAsignatura + 1) + ":");
				
				notas[indiceAlumno][indiceAsignatura] = sc.nextDouble();
			}
		}
	}
		
	
}