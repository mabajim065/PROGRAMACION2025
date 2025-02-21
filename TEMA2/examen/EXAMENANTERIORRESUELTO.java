package TEMA2.examen;

import java.util.Scanner;

public class EXAMENANTERIORRESUELTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Definir las categorías y colores posibles
		String[] categoriasPosibles = { "TodoTerreno", "Deportivo", "Utilitario" };
		String[] coloresPosibles = { "rojo", "blanco", "negro", "azul" };

		// Variables para almacenar los coches
		String modelo;
		String marca;
		String categoria;
		int stock;
		int potencia;
		String color;
		int numCoches;

		// Listas para almacenar información
		String[] cochesSinStock = new String[100]; // Lista para coches sin stock
		int[] cantidadPorCategoria = new int[3]; // Contador de coches por categoría
		String[] cochesConAltaPotencia = new String[100]; // Coches con más de 100cv, no utilitarios y color no
															// blanco/negro
		int stockTotalCitroen = 0; // Suma de stock de los coches marca Citroen

		/***********************************************************************
		 * 1. Solicitar la cantidad de coches que se van a introducir por teclado El
		 * usuario introducirá primero la cantidad de coches que va a introducir por
		 * teclado.
		 **********************************************************************/
		System.out.println("¿Cuántos coches vamos a introducir?");
		numCoches = teclado.nextInt();

		/***********************************************************************
		 * 2. Leer los datos de cada coche (Modelo, Marca, Categoría, Stock, Potencia,
		 * Color) El usuario introduce los datos del coche: modelo, marca, categoría,
		 * stock, potencia, y color.
		 **********************************************************************/
		for (int i = 0; i < numCoches; i++) {
			// Leer el modelo
			System.out.println("Introduce el modelo del coche " + (i + 1) + ": ");
			modelo = teclado.next();

			// Leer la marca
			System.out.println("Introduce la marca del coche " + (i + 1) + ": ");
			marca = teclado.next();

			// Leer la categoría
			do {
				System.out.println(
						"Introduce la categoría (TodoTerreno, Deportivo, Utilitario) del coche " + (i + 1) + ": ");
				categoria = teclado.next();
			} while (!categoria.equals("TodoTerreno") && !categoria.equals("Deportivo")
					&& !categoria.equals("Utilitario"));

			// Leer el stock
			System.out.println("Introduce el stock del coche " + (i + 1) + ": ");
			stock = teclado.nextInt();

			// Leer la potencia
			System.out.println("Introduce la potencia (en cv) del coche " + (i + 1) + ": ");
			potencia = teclado.nextInt();

			// Leer el color
			do {
				System.out.println("Introduce el color (rojo, blanco, negro, azul) del coche " + (i + 1) + ": ");
				color = teclado.next();
			} while (!color.equals("rojo") && !color.equals("blanco") && !color.equals("negro")
					&& !color.equals("azul"));

			/***********************************************************************
			 * 3. Comprobar condiciones y almacenar datos según corresponda Se realizarán
			 * varias comprobaciones de acuerdo al stock, la categoría y la potencia de los
			 * coches.
			 **********************************************************************/
			// Si el coche tiene stock 0, agregarlo a la lista de coches sin stock
			if (stock == 0) {
				cochesSinStock[i] = modelo + " (" + marca + ")";
			}

			// Contar la cantidad de coches por categoría
			if (categoria.equals("TodoTerreno")) {
				cantidadPorCategoria[0]++;
			} else if (categoria.equals("Deportivo")) {
				cantidadPorCategoria[1]++;
			} else if (categoria.equals("Utilitario")) {
				cantidadPorCategoria[2]++;
			}

			// Si la potencia es mayor a 100cv, el coche no es utilitario y su color no es
			// blanco ni negro
			if (potencia > 100 && !categoria.equals("Utilitario") && !color.equals("blanco")
					&& !color.equals("negro")) {
				cochesConAltaPotencia[i] = modelo + " (" + marca + ")";
			}

			// Sumar el stock total de los coches de la marca Citroen
			if (marca.equalsIgnoreCase("Citroen")) {
				stockTotalCitroen += stock;
			}
		}

		/***********************************************************************
		 * 4. Mostrar los resultados solicitados Se mostrarán los resultados según las
		 * condiciones establecidas.
		 **********************************************************************/

		// Mostrar los coches sin stock
		System.out.println("\nCoches sin stock:");
		for (int i = 0; i < numCoches; i++) {
			if (cochesSinStock[i] != null) {
				System.out.println(cochesSinStock[i]);
			}
		}

		// Mostrar la cantidad de coches por categoría
		System.out.println("\nCantidad de coches por categoría:");
		System.out.println("TodoTerreno: " + cantidadPorCategoria[0]);
		System.out.println("Deportivo: " + cantidadPorCategoria[1]);
		System.out.println("Utilitario: " + cantidadPorCategoria[2]);

		// Mostrar los coches de más de 100cv que no sean Utilitarios y cuyo color no
		// sea blanco ni negro
		System.out.println("\nCoches con más de 100cv (excluyendo Utilitarios y colores blanco/negro):");
		for (int i = 0; i < numCoches; i++) {
			if (cochesConAltaPotencia[i] != null) {
				System.out.println(cochesConAltaPotencia[i]);
			}
		}

		// Mostrar el stock total de los coches de marca Citroen
		System.out.println("\nStock total de los coches de marca Citroen: " + stockTotalCitroen);

		// Cerrar el scanner
		teclado.close();
	}
}
