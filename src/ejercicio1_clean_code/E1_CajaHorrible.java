package ejercicio1_clean_code;
import java.util.*;

public class E1_CajaHorrible{
	
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
		
		int totalUnidad=0;
		double totalParcial=0; 
		final int[] TAM_STOCK= new int[200]; 
		String[] nombre; 
		double[] precio; 
	
		// Variables importantes
		int[] unidades;
		final double IVA=0.21;
		final double DESCUENTO_MAS_DE_10=0.1; 
		
		// Esto es el IVA y los descuentos
		final double DESCUENTO_SOCIO=0.05; 
		
		// Mensaje muy importante
		System.out.println("Hola esta es una caja registradora super guay"); 
		
		// Numero random
		int kk=3; 

		for(int i=0;i<TAM_STOCK.length;i++){
			TAM_STOCK[i]=10;
			} // inicializa el stock a 10

		String seguirComprando="S"; 

		while(seguirComprando.equals("S")){

			System.out.println("Número de producto a comprar?");
			totalUnidad=sc.nextInt(); sc.nextLine();
			nombre=new String[totalUnidad]; 
			precio=new double[totalUnidad]; 
			unidades =new int[totalUnidad];
			int i=0;

			while(i<totalUnidad){
				
				//Nombre del producto
				System.out.println("Nombre del producto?");
				nombre[i]=sc.nextLine();
				
				// Precio del producto
				System.out.println("Precio del producto?");
				precio[i]=sc.nextDouble();

				//Unidades a querer
				System.out.println("Cuántas unidades quieres?");
				unidades [i]=sc.nextInt();
				
				sc.nextLine();


				if(precio[i]<0) {
					precio[i]=-precio[i]; // arregla negativo
				}

				if(unidades [i]==0) {
					unidades [i]=1; // si 0 pues 1
				}
								

				if(unidades [i]<0) {
					unidades [i]=unidades [i]*-1;
				}

				totalParcial=totalParcial+(precio[i]*unidades [i]); // total parcial

				int indiceDeStock=(nombre[i].length()*17+i*3)%200; // indice de stock

				TAM_STOCK[indiceDeStock]=TAM_STOCK[indiceDeStock]-unidades [i]; // actualiza stock

				if(TAM_STOCK[indiceDeStock]<0) {
					System.out.println("Stock negativo pero da igual"); // aviso
				}
				i++;
			}

			System.out.println("SOCIO?? (1/0)");
			int SO=sc.nextInt(); sc.nextLine();

			double d1=0; if(totalParcial>100)d1=totalParcial*DESCUENTO_MAS_DE_10; else d1=0; // descuento si supera 100
			double x=totalParcial-d1;
			double d2=0; if(SO==1)d2=x*DESCUENTO_SOCIO; // descuento socio
			double bi=x-d2;
			double iv=bi*IVA;
			double tt=bi+iv;

			// imprimir ticket
			System.out.println("===========TICKET===========");
			for(int j=0;j<totalUnidad;j++){
				System.out.println("LIN "+j+" -> "+nombre[j]+" "+unidades [j]+" "+precio[j]+" "+(unidades [j]*precio[j])); // imprime linea
			}
			System.out.println("SUBTOTAL="+totalParcial);
			System.out.println("D1="+ d1);
			System.out.println("D2="+ d2);
			System.out.println("BI="+ bi);
			System.out.println("IV="+ iv);
			System.out.println("TT="+ tt);
			System.out.println("============================");

			System.out.println("Quieres seguir comprando? S/N");
			seguirComprando=sc.nextLine().toUpperCase();
			
			if(seguirComprando.equals("N")){
				System.out.println("Hasta otra!");
				}
			totalParcial=0; // resetea total
			kk++;
		}
	}	
}

