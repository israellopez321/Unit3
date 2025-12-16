package funcionesBi;

public class Exercise02 {
	
	public static void main(String[] args) {
		
		//Matriz que transponer
		int matriz [][] = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int transpuesta[][] = transponer(matriz);
		
		System.out.println("Original: ");
		
		imprimirMatriz(matriz);
		
		System.out.println("Transpuesta: ");
		
		imprimirMatriz(transpuesta);
		
		
	}
	/**
	 * Función que transpone una matriz rectangular
	 * @param matriz array bidimencional
	 * @return array bidimensional (matriz transpuesta de la original)
	 */
	public static int[][] transponer(int matriz[][] ) {
		
		if (matriz == null) {
			throw new IllegalArgumentException("La matriz no puede ser null"); 
		}
		if (matriz.length == 0 || matriz[0] == null) {
			throw new IllegalArgumentException("La matriz debe tener almenos una fila");
		}
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		for (int i = 0; i < filas ; i++) {
			if (matriz[i] == null || matriz[i].length == columnas ) {
				throw new IllegalArgumentException("todas las filas deben de tener el mismo números de columnas");
			}
		}
		
		int[][] resultado = new int [columnas][filas];
		
		for (int fila = 0; fila < filas; fila++) {
			for(int columna = 0; columna < columnas; columna++) {
				resultado [columna][fila] = matriz [fila][columna];
			}
		}
		
		return resultado;
	}
	
	/**
	 * Imprime una matriz por pantalla
	 * @param matriz bidimensional
	 */
	public static void imprimirMatriz(int matriz [][]) {
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna] + "\t");
				
			}
			System.out.println();
		}
	}
}
