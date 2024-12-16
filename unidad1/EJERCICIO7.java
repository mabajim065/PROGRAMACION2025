package unidad11;

import java.util.Scanner;

public class EJERCICIO7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  sueldobruto= 3425;
		int impuestos= 534;
		Scanner teclado = new Scanner (System.in);

	//  mensaje leer  teclado 
			System.out.println("cuanto cobras ?");
			sueldobruto=teclado.nextInt();
	
				System.out.println("mi sueldo es de " + sueldobruto );
			
			System.out.println("que impuestos pagas? ");
				impuestos= teclado.nextInt();
				
		
			 int sueldototal = sueldobruto - impuestos ;
		
			System.out.println("cobras "+ sueldobruto + " pero hacienda se lleva "+ impuestos  + " por lo cual te quedan unos miseros."+ sueldototal);
				
	}

}
