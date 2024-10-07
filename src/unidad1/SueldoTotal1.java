package unidad1;

import java.util.Scanner;

public class SueldoTotal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sueldobruto= "2356";
		int impuestos= 534;
		Scanner teclado = new Scanner (System.in);

	//  mensaje leer  teclado 
			System.out.println("cuanto cobras ?");
			sueldobruto=teclado.next();
	
				System.out.println("mi sueldo es de " + sueldobruto );
			
			System.out.println("que impuestos pagas? ");
				impuestos= teclado.nextInt();
				
				String sueldototal;
			 int sueldototal1 = sueldobruto-impuestos ;
		
			System.out.println("TU SUELDO TOTAL ES " + sueldototal1);
				
	}

}
