/**************************************************************************************************************************
 * ************************************************************************************************************************
 *  									SOLUCIÓN EXAMEN AÑOS ANTERIORES													  *
 *  ***********************************************************************************************************************
 **************************************************************************************************************************/

package unidad2;

import java.util.Scanner;

public class RESOLUCIONEXAMEN {

	// Definición de constantes para categorías de bicicletas
	public static final int CAT_MTB = 1;
	public static final int CAT_DESC = 2;
	public static final int CAT_CAR = 3;

	public static void main(String[] args) {
		// Crear objeto Scanner para la entrada de datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Variables para almacenar los datos de cada bicicleta
		String modelo = "";
		String marca = "";
		double precio = 0;
		int categoria = 0;
		int stock = 0;
		int puntec = 0;
		int numbicis = 0;

		// Variables para cálculos y estadísticas
		double mediaprecio = 0; // Media de precios
		int maxprecio = Integer.MAX_VALUE; // Precio máximo inicializado al valor más alto posible
		int minprecio = Integer.MIN_VALUE; // Precio mínimo inicializado al valor más bajo posible
		String modelomax = ""; // Modelo de la bicicleta con el precio más alto
		String modelomin = " "; // Modelo de la bicicleta con el precio más bajo
		int sumastock = 0; // Suma de los stocks de las bicicletas de tipo "Descenso"
		String[] listadomodelocond; // Lista para almacenar los modelos que cumplen ciertas condiciones
		String[] listadomodelostock = null; // Lista para almacenar los modelos con stock 0 y puntos > 6

		// Solicitar al usuario cuántas bicicletas va a ingresar
		System.out.println("cuantas bicis vamos a leer? : ");
		numbicis = teclado.nextInt();

		// Inicializar las listas para los modelos
		listadomodelocond = new String[numbicis];

		// Bucle para ingresar los datos de las bicicletas
		for (int i = 0; i < numbicis; i++) {
			// No hay código dentro de este bucle, parece que falta lógica
		}

		/*************************************************************************
		 * INTRODUCCIÓN DE DATOS *
		 *************************************************************************/

		// Bucle para ingresar los datos de cada bicicleta
		for (int i = 0; i < numbicis; i++) {
			// Solicitar el modelo de la bicicleta
			System.out.println("introduce el modelo de la bici " + (i + 1));
			modelo = teclado.next();

			// Solicitar la marca, asegurándose de que sea una de las marcas válidas
			do {
				System.out.println("introduce el marca de la bici " + (i + 1) + "(orbea , decathlon o BH)");
				marca = teclado.next();
			} while (marca.equals("orbea") && marca.equals("decathlon") && marca.equals("BH"));

			// Solicitar el precio de la bicicleta
			System.out.println("introduce el precio de la bici " + (i + 1));
			precio = teclado.nextDouble();

			// Solicitar la categoría, asegurándose de que sea válida
			do {
				System.out
						.println("introduce el categoria de la bici " + (i + 1) + "(1-MTB , 2-Descenso , 3-Carretera");
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 3);

			// Solicitar el stock de la bicicleta
			System.out.println("introduce el stock de la bici " + (i + 1));
			stock = teclado.nextInt();

			// Solicitar el puntaje, asegurándose de que sea un valor entre 1 y 10
			do {
				System.out.println("introduce el puntec de la bici " + (i + 1));
				puntec = teclado.nextInt();
			} while (puntec < 1 || puntec > 10);

			/**************************************************************************
			 * TRATAMIENTO DE DATOS *
			 ************************************************************************/

			// Calcular la media de precios sumando todos los precios
			mediaprecio = mediaprecio + precio;

			// Calcular el precio máximo: si el precio de la bici es mayor que el máximo
			// actual, actualizamos
			if (precio > maxprecio) {
				maxprecio = (int) precio;
				modelomax = modelo;
			}

			// Calcular el precio mínimo: si el precio de la bici es menor que el mínimo
			// actual, actualizamos
			if (precio < minprecio) {
				minprecio = (int) precio;
				modelomin = modelo;
			}

			// Almacenar el modelo de bicicletas de carretera con puntos > 9 o precio < 190
			if (categoria == CAT_CAR && (puntec > 9 || precio < 190)) {
				listadomodelocond[i] = modelo;
			}

			// Sumar el stock de las bicicletas de categoría "Descenso"
			if (categoria == CAT_DESC)
				sumastock += stock;
		}

		// Calcular la media de precios al dividir la suma total de precios por el
		// número de bicicletas
		mediaprecio = mediaprecio / numbicis;

		// Imprimir los modelos que cumplen las condiciones establecidas
		for (int i = 0; i < listadomodelocond.length; i++) {
			if (listadomodelocond[i] != null)
				System.out.println(listadomodelocond[i]);
		}

		// Comentar el siguiente bucle, ya que parece no estar funcionando correctamente
		// (listadomodelostock no se llena correctamente en este punto)
		for (int i = 0; i < listadomodelocond.length; i++) {
			if (listadomodelocond[i] != null)
				System.out.println(listadomodelostock[i]);

			// Almacenar modelos con stock 0 y puntuación > 6
			if (stock == 0 && puntec > 6)
				listadomodelostock[i] = modelo;
		}

		// Imprimir las estadísticas finales
		System.out.println(" el preciomaximo es : " + maxprecio);
		System.out.println(" el preciominimo es : " + minprecio);
		System.out.println(" el el nombre de modelo maximo es : " + modelomax);
		System.out.println(" el el nombre de modelo minimo es : " + modelomin);
		System.out.println(" la mdedia de precio es : " + mediaprecio);
		System.out.println(" la suma de stock en descenso es : " + sumastock);

		// Cerrar el scanner para liberar recursos
		teclado.close();
	}
}
