package funcionesBi;

public class Exercise04 {

	public static void main(String[] args) {
		
		String tablaMultiplicar[][] = new String [10][10];
		
		rellenarTabla(tablaMultiplicar);
		
		mostrarTabla(tablaMultiplicar);
	}
	
	/**
	 * Funcion para rellenar tabla de multiplicar
	 * @param tabla
	 */
	static void rellenarTabla(String tabla[][]) {
		
		int multiplicando;
		int multiplicador;
		
		for (int indice1 = 0; indice1 < tabla.length; indice1++) {
			
			for(int indice2 = 0; indice2 < tabla[indice1].length; indice2++) {
				
				multiplicando = indice1 + 1;
				multiplicador = indice2 + 1;
				
				tabla[indice1][indice2] = "| " + multiplicando + " x " + multiplicador + " = " + (multiplicando)*(multiplicador) + " |";
				
			}	
		}
	}
	
	/**
	 * Funcion para mostrar la tabla
	 * @param tabla
	 */
	static void mostrarTabla(String tabla[][]) {
		
		for (int indice3 = 0; indice3 < tabla.length; indice3++) {
			
			for(int indice4 = 0; indice4 < tabla[indice3].length; indice4++) {
			
				System.out.print(tabla[indice3][indice4]);
				
			}
			System.out.println();
		}
		
	}
}
