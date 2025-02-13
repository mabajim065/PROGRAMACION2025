/********************************************************************************************
 * SOLUCIÓN EXAMEN AÑOS ANTERIORES                                                          *
 ********************************************************************************************/

package TEMA2;

import java.util.Scanner;

public class RESOLUCIONEXAMEN {

	// Constantes que representan las categorías de las bicicletas
	public static final int CAT_MTB = 1;
	public static final int CAT_DESC = 2;
	public static final int CAT_CAR = 3;

	public static void main(String[] args) {
		// Creación del objeto Scanner para la entrada de datos
		Scanner teclado = new Scanner(System.in);

		// Variables para almacenar información sobre las bicicletas
		String modelo, marca;
		double precio;
		int categoria, stock, puntec, numbicis;

		// Variables auxiliares para cálculos y resultados
		double sumaPrecios = 0;
		int maxPrecio = Integer.MIN_VALUE;
		int minPrecio = Integer.MAX_VALUE;
		String modeloMax = "";
		String modeloMin = "";
		int sumaStockDescenso = 0;

		// Listas para almacenar los modelos que cumplen las condiciones
		String[] listadoModelosCondiciones;
		String[] listadoModelosSinStock;

		// Solicitud del número de bicicletas que se van a procesar
		System.out.println("¿Cuántas bicicletas vamos a leer?");
		numbicis = teclado.nextInt();

		// Inicialización de listas según el número de bicicletas
		listadoModelosCondiciones = new String[numbicis];
		listadoModelosSinStock = new String[numbicis];

		// Bucle para leer los datos de cada bicicleta
		for (int i = 0; i < numbicis; i++) {
			teclado.nextLine(); // Consumir salto de línea
			System.out.println("Introduce el modelo de la bici " + (i + 1) + ":");
			modelo = teclado.nextLine();

			// Solicitud de la marca, validando que sea una de las permitidas
			do {
				System.out.println("Introduce la marca de la bici " + (i + 1) + " (orbea, decathlon o BH):");
				marca = teclado.nextLine();
			} while (!marca.equalsIgnoreCase("orbea") && !marca.equalsIgnoreCase("decathlon")
					&& !marca.equalsIgnoreCase("BH"));

			// Solicitud del precio
			System.out.println("Introduce el precio de la bici " + (i + 1) + ":");
			precio = teclado.nextDouble();

			// Solicitud de la categoría, asegurándose de que sea válida
			do {
				System.out
						.println("Introduce la categoría de la bici " + (i + 1) + " (1-MTB, 2-Descenso, 3-Carretera):");
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 3);

			// Solicitud del stock
			System.out.println("Introduce el stock de la bici " + (i + 1) + ":");
			stock = teclado.nextInt();

			// Solicitud de la puntuación, asegurándose de que esté en el rango 1-10
			do {
				System.out.println("Introduce la puntuación de la bici " + (i + 1) + " (entre 1 y 10):");
				puntec = teclado.nextInt();
			} while (puntec < 1 || puntec > 10);

			// Cálculo de la suma de precios
			sumaPrecios += precio;

			// Determinación de precios máximo y mínimo
			if (precio > maxPrecio) {
				maxPrecio = (int) precio;
				modeloMax = modelo;
			}
			if (precio < minPrecio) {
				minPrecio = (int) precio;
				modeloMin = modelo;
			}

			// Bicicletas de carretera con puntuación > 9 o precio < 190
			if (categoria == CAT_CAR && (puntec > 9 || precio < 190)) {
				listadoModelosCondiciones[i] = modelo;
			}

			// Suma del stock total de bicicletas de tipo Descenso
			if (categoria == CAT_DESC) {
				sumaStockDescenso += stock;
			}

			// Modelos sin stock pero con puntuación > 6
			if (stock == 0 && puntec > 6) {
				listadoModelosSinStock[i] = modelo;
			}
		}

		// Calcular la media de precios
		double mediaPrecio = sumaPrecios / numbicis;

		// Mostrar resultados
		System.out.println("\nRESULTADOS:");
		System.out.println("El precio máximo es: " + maxPrecio + " (Modelo: " + modeloMax + ")");
		System.out.println("El precio mínimo es: " + minPrecio + " (Modelo: " + modeloMin + ")");
		System.out.println("La media de precios es: " + mediaPrecio);
		System.out.println("El stock total de bicicletas de Descenso es: " + sumaStockDescenso);

		System.out.println("\nModelos de carretera con puntuación > 9 o precio < 190:");
		for (String modeloCond : listadoModelosCondiciones) {
			if (modeloCond != null) {
				System.out.println("- " + modeloCond);
			}
		}

		System.out.println("\nModelos sin stock pero con puntuación > 6:");
		for (String modeloSinStock : listadoModelosSinStock) {
			if (modeloSinStock != null) {
				System.out.println("- " + modeloSinStock);
			}
		}

		// Cierre del objeto Scanner
		teclado.close();
	}
}
