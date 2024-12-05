/**************************************************************************************************************************
 * ************************************************************************************************************************
 *  									SOLUCIÓN EXAMEN AÑOS ANTERIORES													  *
 *  ***********************************************************************************************************************
 **************************************************************************************************************************/

package unidad2;

import java.util.Scanner;

public class RESOLUCIONEXAMEN {

	public static final int CAT_MTB = 1;
	public static final int CAT_DESC = 2;
	public static final int CAT_CAR = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
//-------------------------------------------------------------------------
		String modelo = "";
		String marca = "";
		double precio = 0;
		int categoria = 0;
		int stock = 0;
		int puntec = 0;
		int numbicis = 0;
/////////////////////////////////////////////
		double mediaprecio = 0;
		int maxprecio = Integer.MAX_VALUE;
		int minprecio = Integer.MIN_VALUE;
		String modelomax = "";
		String modelomin = " ";
		int sumastock = 0;
		String[] listadomodelocond;
		String[] listadomodelostock = null;
//-------------------------------------------------------------------------

		System.out.println("cuantas bicis vamos a leer? : ");
		numbicis = teclado.nextInt();

		listadomodelocond = new String[numbicis];

		for (int i = 0; i < numbicis; i++) {

		}

		/*************************************************************************
		 * INTRODUCCIÓN DE DATOS *
		 *************************************************************************/

		for (int i = 0; i < numbicis; i++) {
			System.out.println("introduce el modelo de la bici " + (i + 1));
			modelo = teclado.next();

			do {
				System.out.println("introduce el marca de la bici " + (i + 1) + "(orbea , decathlon o BH)");
				marca = teclado.next();
			} while (marca.equals("orbea") && marca.equals("decathlon") && marca.equals("BH"));

			System.out.println("introduce el precio de la bici " + (i + 1));
			precio = teclado.nextDouble();

			do {
				System.out
						.println("introduce el categoria de la bici " + (i + 1) + "(1-MTB , 2-Descenso , 3-Carretera");
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 3);

			System.out.println("introduce el stock de la bici " + (i + 1));
			stock = teclado.nextInt();

			do {
				System.out.println("introduce el puntec de la bici " + (i + 1));
				puntec = teclado.nextInt();
			} while (puntec < 1 || puntec > 10);

			/**************************************************************************
			 * TRATAMIENTO DE DATOS *
			 ************************************************************************/
			// PA CALCULAR LA MEDIA VAMOS SUMANDO TODO Y LO DIVIDIMOS POR LAS BICIS QUE
			// TENGAMOS
			mediaprecio = mediaprecio + precio;
//---------------------------------------------------------------------------------------------------------------
			// para calcular el precio maximo de nuestras bicicletas comprobamos todos los
			// precios de las bicis y si es mayor que nuestro maximo pasara a ser el nuesvo
			// maximo

			if (precio > maxprecio) {
				maxprecio = (int) precio;
				modelomax = modelo;
			}
			// min
			if (precio < minprecio) {
				minprecio = (int) precio;
				modelomin = modelo;
			}
//----------------------------------------------------------------------------------------------------------------
			// modelo de bicis de carreras con puntos superior a 9 o cuesten menos de 190
			// euros
			if (categoria == CAT_CAR && (puntec > 9 || precio < 190)) {

				listadomodelocond[i] = modelo;
			}

//----------------------------------------------------------------------------------------------------------------
			// total stock de bicis tipo descenso
			if (categoria == CAT_DESC)
				sumastock += stock;
		}
//----------------------------------------------------------------------------------------------------------------
		// una vez hems acabado el bucle tenemos todos los precios sumados , los
		// dividimos entre la cantidad de bicis para sacar la media
		mediaprecio = mediaprecio / numbicis;
		for (int i = 0; i < listadomodelocond.length; i++) {
			if (listadomodelocond[i] != null)
				System.out.println(listadomodelocond[i]);
		}
		for (int i = 0; i < listadomodelocond.length; i++) {
			if (listadomodelocond[i] != null)
				System.out.println(listadomodelostock[i]);

//--------------------------------------------------------------------------
			if (stock == 0 && puntec > 6)
				listadomodelostock[i] = modelo;
		}
//--------------------------------------------------------------------------
		System.out.println(" el preciomaximo es : " + maxprecio);
		System.out.println(" el preciominimo es : " + minprecio);
		System.out.println(" el el nombre de modelo maximo es : " + modelomax);
		System.out.println(" el el nombre de modelo minimo es : " + modelomin);
		System.out.println(" la mdedia de precio es : " + mediaprecio);
		System.out.println(" la suma de stock en descenso es : " + sumastock);
		teclado.close();
	}

}
