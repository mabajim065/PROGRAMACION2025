/**************************************************************************************************************************
 * ************************************************************************************************************************
 *  									SOLUCIÓN EXAMEN AÑOS ANTERIORES													  *
 *  ***********************************************************************************************************************
 **************************************************************************************************************************/

package unidad2;

import java.util.Scanner;

public class RESOLUCIONEXAMEN {

<<<<<<< HEAD
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

=======
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

>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
		/*************************************************************************
		 * INTRODUCCIÓN DE DATOS *
		 *************************************************************************/

		// Bucle para ingresar los datos de cada bicicleta
		for (int i = 0; i < numbicis; i++) {
<<<<<<< HEAD
			// Solicitar el modelo de la bicicleta
			System.out.println("introduce el modelo de la bici " + (i + 1));
			modelo = teclado.next();

			// Solicitar la marca, asegurándose de que sea una de las marcas válidas
=======
			// Solicitud del modelo de la bicicleta
			System.out.println("Introduce el modelo de la bici " + (i + 1));
			modelo = teclado.next();

			// Solicitud de la marca, asegurando que sea válida
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
			do {
				System.out.println("Introduce la marca de la bici " + (i + 1) + " (orbea, decathlon o BH)");
				marca = teclado.next();
			} while (!marca.equals("orbea") && !marca.equals("decathlon") && !marca.equals("BH"));

<<<<<<< HEAD
			// Solicitar el precio de la bicicleta
			System.out.println("introduce el precio de la bici " + (i + 1));
			precio = teclado.nextDouble();

			// Solicitar la categoría, asegurándose de que sea válida
=======
			// Solicitud del precio
			System.out.println("Introduce el precio de la bici " + (i + 1));
			precio = teclado.nextDouble();

			// Solicitud de la categoría, validando que esté entre 1 y 3
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
			do {
				System.out.println("Introduce la categoría de la bici " + (i + 1) + " (1-MTB, 2-Descenso, 3-Carretera)");
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 3);

<<<<<<< HEAD
			// Solicitar el stock de la bicicleta
			System.out.println("introduce el stock de la bici " + (i + 1));
			stock = teclado.nextInt();

			// Solicitar el puntaje, asegurándose de que sea un valor entre 1 y 10
=======
			// Solicitud del stock
			System.out.println("Introduce el stock de la bici " + (i + 1));
			stock = teclado.nextInt();

			// Solicitud de la puntuación, validando que esté entre 1 y 10
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
			do {
				System.out.println("Introduce la puntuación de la bici " + (i + 1));
				puntec = teclado.nextInt();
			} while (puntec < 1 || puntec > 10);

			/**************************************************************************
			 * TRATAMIENTO DE DATOS *
			 ************************************************************************/
<<<<<<< HEAD

			// Calcular la media de precios sumando todos los precios
			mediaprecio = mediaprecio + precio;

			// Calcular el precio máximo: si el precio de la bici es mayor que el máximo
			// actual, actualizamos
=======
			// Cálculo de la media de precios
			mediaprecio += precio;

			// Cálculo del precio máximo y modelo asociado
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
			if (precio > maxprecio) {
				maxprecio = (int) precio;
				modelomax = modelo;
			}

<<<<<<< HEAD
			// Calcular el precio mínimo: si el precio de la bici es menor que el mínimo
			// actual, actualizamos
=======
			// Cálculo del precio mínimo y modelo asociado
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
			if (precio < minprecio) {
				minprecio = (int) precio;
				modelomin = modelo;
			}

<<<<<<< HEAD
			// Almacenar el modelo de bicicletas de carretera con puntos > 9 o precio < 190
=======
			// Bicicletas de carretera con puntuación > 9 o precio < 190 euros
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
			if (categoria == CAT_CAR && (puntec > 9 || precio < 190)) {
				listadomodelocond[i] = modelo;
			}

<<<<<<< HEAD
			// Sumar el stock de las bicicletas de categoría "Descenso"
			if (categoria == CAT_DESC)
=======
			// Suma del stock total para bicicletas de descenso
			if (categoria == CAT_DESC) {
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
				sumastock += stock;
			}
		}
<<<<<<< HEAD

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
=======

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
>>>>>>> 4866057e4a8c29fb3e227b2089e979f16ad49add
		teclado.close();
	}
}
