/**************************************************************************************************************************
 * ************************************************************************************************************************
 *  									SOLUCIÓN EXAMEN AÑOS ANTERIORES													  *
 *  ***********************************************************************************************************************
 **************************************************************************************************************************/

package unidad2;

import java.util.Scanner;

public class RESOLUCIONEXAMEN {

	// Constantes para las categorías de bicicletas
	public static final int CAT_MTB = 1; // Categoría: Mountain Bike
	public static final int CAT_DESC = 2; // Categoría: Descenso
	public static final int CAT_CAR = 3; // Categoría: Carretera

	public static void main(String[] args) {
		// Creación del objeto Scanner para leer datos del usuario
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		String modelo = ""; // Modelo de la bicicleta
		String marca = ""; // Marca de la bicicleta
		double precio = 0; // Precio de la bicicleta
		int categoria = 0; // Categoría de la bicicleta
		int stock = 0; // Stock disponible de la bicicleta
		int puntec = 0; // Puntuación de la bicicleta
		int numbicis = 0; // Número total de bicicletas a leer

		// Variables adicionales para cálculos
		double mediaprecio = 0; // Media de precios de las bicicletas
		int maxprecio = Integer.MIN_VALUE; // Precio máximo encontrado
		int minprecio = Integer.MAX_VALUE; // Precio mínimo encontrado
		String modelomax = ""; // Modelo con precio máximo
		String modelomin = ""; // Modelo con precio mínimo
		int sumastock = 0; // Suma total del stock de bicicletas de descenso

		// Arrays para almacenar modelos específicos
		String[] listadomodelocond; // Lista de modelos que cumplen ciertas condiciones
		String[] listadomodelostock = null; // Lista de modelos con stock 0 y puntuación > 6

		// Solicitud del número de bicicletas a procesar
		System.out.println("¿Cuántas bicicletas vamos a leer? : ");
		numbicis = teclado.nextInt();

		// Inicialización del array para condiciones específicas
		listadomodelocond = new String[numbicis];

		/*************************************************************************
		 * INTRODUCCIÓN DE DATOS *
		 *************************************************************************/

		for (int i = 0; i < numbicis; i++) {
			// Solicitud del modelo de la bicicleta
			System.out.println("Introduce el modelo de la bici " + (i + 1));
			modelo = teclado.next();

			// Solicitud de la marca, asegurando que sea válida
			do {
				System.out.println("Introduce la marca de la bici " + (i + 1) + " (orbea, decathlon o BH)");
				marca = teclado.next();
			} while (!marca.equals("orbea") && !marca.equals("decathlon") && !marca.equals("BH"));

			// Solicitud del precio
			System.out.println("Introduce el precio de la bici " + (i + 1));
			precio = teclado.nextDouble();

			// Solicitud de la categoría, validando que esté entre 1 y 3
			do {
				System.out.println("Introduce la categoría de la bici " + (i + 1) + " (1-MTB, 2-Descenso, 3-Carretera)");
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 3);

			// Solicitud del stock
			System.out.println("Introduce el stock de la bici " + (i + 1));
			stock = teclado.nextInt();

			// Solicitud de la puntuación, validando que esté entre 1 y 10
			do {
				System.out.println("Introduce la puntuación de la bici " + (i + 1));
				puntec = teclado.nextInt();
			} while (puntec < 1 || puntec > 10);

			/**************************************************************************
			 * TRATAMIENTO DE DATOS *
			 ************************************************************************/
			// Cálculo de la media de precios
			mediaprecio += precio;

			// Cálculo del precio máximo y modelo asociado
			if (precio > maxprecio) {
				maxprecio = (int) precio;
				modelomax = modelo;
			}

			// Cálculo del precio mínimo y modelo asociado
			if (precio < minprecio) {
				minprecio = (int) precio;
				modelomin = modelo;
			}

			// Bicicletas de carretera con puntuación > 9 o precio < 190 euros
			if (categoria == CAT_CAR && (puntec > 9 || precio < 190)) {
				listadomodelocond[i] = modelo;
			}

			// Suma del stock total para bicicletas de descenso
			if (categoria == CAT_DESC) {
				sumastock += stock;
			}
		}

		// Cálculo final de la media de precios
		mediaprecio /= numbicis;

		/**************************************************************************
		 * MOSTRAR RESULTADOS *
		 ************************************************************************/

		// Mostrar modelos que cumplen las condiciones
		System.out.println("Modelos que cumplen las condiciones:");
		for (int i = 0; i < listadomodelocond.length; i++) {
			if (listadomodelocond[i] != null) {
				System.out.println(listadomodelocond[i]);
			}
		}

		// Modelos con stock 0 y puntuación > 6
		for (int i = 0; i < listadomodelocond.length; i++) {
			if (stock == 0 && puntec > 6) {
				listadomodelostock[i] = modelo;
			}
		}

		// Mostrar estadísticas finales
		System.out.println("El precio máximo es: " + maxprecio);
		System.out.println("El precio mínimo es: " + minprecio);
		System.out.println("El modelo con precio máximo es: " + modelomax);
		System.out.println("El modelo con precio mínimo es: " + modelomin);
		System.out.println("La media de precios es: " + mediaprecio);
		System.out.println("La suma de stock en descenso es: " + sumastock);

		// Cerrar el Scanner
		teclado.close();
	}
}
