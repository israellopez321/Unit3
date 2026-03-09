package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		run();
		
		
	}
	
	// ------------------------------------------------------------------------
	
	/**
	 * Ejecuta la lectura de los textos, analiza si esta el mensaje y imprime el resultado
	 */
	private static void run() {
		
		String texto = readLine("Introduce el texto: ");
		String mensaje = readLine ("Introduce el mensaje a buscar: ");
		
		boolean result = analize(texto, mensaje);
		
		printResult(mensaje, result);
	}
	
	private static String readLine(String texto) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(texto);
			return sc.next();
		}
	}
	
	private static void analize(String textoBruto, String mensajeBruto) {
		String texto = normalizar(textoBruto);
		String mensaje = normalizar(mensajeBruto);
		
		char[] textoArr = texto.toCharArray();
		char[] mensajeArr = mensaje.toCharArray();
		
		int[] posiciones = buscarPosicionesInicio(textoArr, mensajeArr);
		int apariciones = posiciones.length();
		
		//double porcentajeUso = calcularPorcentajeUso(textoArr, mensajeArr);
		
		//imprimirResultados(mensajeBruto, posiciones, porcentajeUso);
		
		
		
	}
	
	private static String normalizar(String input) {
		String lower;
		if(input == null || input.length() == 0) {
			lower = "";
			
		}else {
			lower = input.toLowerCase();
		}
			
		return lower;
	}
	
	private static int[] buscarPosicionesInicio(char[] texto, char[] mensaje) {
		int[] temporal = new int [texto.length];
		int count = 0;
		
		for (int i = 0; i < texto.length; i++) {
			if (texto[i] == mensaje[0] && sePuedeFormarDesde(texto, mensaje, i)) {
				temporal[count] = i;
				count++;
			}
		}
		
		return recortarArray(temporal, count);
		
	}
	
	private static int[] recortarArray(int[] array, int size){	
		int[] out =  new int [size];
		for (int i = 0; i < size ; i++) {
			
			out[i] = array[i];
			
		}
		
		return out;
		
	}
	
	private static boolean sePuedeFormarDesde(char[] texto, char[] mensaje, int start) {
		
		int mensajeIndex = 0;
		
		for(int i = start; i < texto.length && mensajeIndex < mensaje.length; i++ ) {
			
			if (texto[i] == mensaje[mensajeIndex]) {
				mensajeIndex++;
				
			}
			
		}
		
		return mensajeIndex == mensaje.length;
		
		
		
	}
}
