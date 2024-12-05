package unidad2;

import java.util.Scanner;

public class ejercicio10bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Primero pedimos cuántos videojuegos vamos a leer
		System.out.print("¿Cuántos videojuegos quieres guardar? ");
		int numero = scanner.nextInt();

		// hago los arrays para almacenar la información de los videojuegos
		String[] nombres = new String[numero];
		double[] puntuaciones = new double[numero];
		double[] precios = new double[numero];
		String[] companias = new String[numero];

		// Leer los datos de cada videojuego
		for (int i = 0; i < numero; i++) {
			scanner.nextLine();
			// sin ln para que sea todo para abajo
			System.out.print("Introduce el nombre del videojuego " + (i + 1) + ": ");
			nombres[i] = scanner.nextLine();
			System.out.print("Introduce la puntuación de " + nombres[i] + ": ");
			puntuaciones[i] = scanner.nextDouble();
			System.out.print("Introduce el precio de " + nombres[i] + ": ");
			precios[i] = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Introduce la compañía de " + nombres[i] + ": ");
			companias[i] = scanner.nextLine();
		}

		// Calcular la media de los precios
		double sumaprecios = 0;
		for (int i = 0; i < numero; i++) {
			sumaprecios += precios[i];
		}
		double mediaPrecios = sumaprecios / numero;
		System.out.println("La media de los precios es: " + mediaPrecios);

		// Encontrar la puntuación máxima y el nombre del juego con la puntuación máxima
		double puntuacionMax = puntuaciones[0];
		String juegoMax = nombres[0];
		for (int i = 1; i < numero; i++) {
			if (puntuaciones[i] > puntuacionMax) {
				puntuacionMax = puntuaciones[i];
				juegoMax = nombres[i];
			}
		}
		System.out.println(
				"El juego con la puntuación más alta es: " + juegoMax + " con una puntuación de " + puntuacionMax);

		// Encontrar la puntuación mínima y el nombre del juego con menos puntuaciok
		double puntuacionMin = puntuaciones[0];
		String juegoMin = nombres[0];
		for (int i = 1; i < numero; i++) {
			if (puntuaciones[i] < puntuacionMin) {
				puntuacionMin = puntuaciones[i];
				juegoMin = nombres[i];
			}
		}
		System.out.println(
				"El juego con la puntuación más baja es: " + juegoMin + " con una puntuación de " + puntuacionMin);
//
//
//

		// Contar la cantidad de juegos por cada compañía
		int nintendoCount = 0;
		int sonyCount = 0;
		int microsoftCount = 0;
		for (int i = 0; i < numero; i++) {
			if (companias[i].equalsIgnoreCase("Nintendo")) {
				nintendoCount++;
			} else if (companias[i].equalsIgnoreCase("Sony")) {
				sonyCount++;
			} else if (companias[i].equalsIgnoreCase("Microsoft")) {
				microsoftCount++;
			}
		}
		System.out.println("Cantidad de juegos de Nintendo: " + nintendoCount);
		System.out.println("Cantidad de juegos de Sony: " + sonyCount);
		System.out.println("Cantidad de juegos de Microsoft: " + microsoftCount);

		// Mostrar juegos de Nintendo que cuesten menos de 15€ y empiecen por 'M' o
		// tengan puntuación superior a 8
		System.out.println(
				" los juegos de Nintendo que cuestan menos de 15€ y empiezan por 'M' o tienen puntuación mayor a 8:");
		for (int i = 0; i < numero; i++) {
			if (companias[i].equalsIgnoreCase("Nintendo") && precios[i] < 15) {
				if (nombres[i].startsWith("M") || puntuaciones[i] > 8) {
					System.out.println(nombres[i] + " - Precio: " + precios[i] + " - Puntuación: " + puntuaciones[i]);
				}
			}
		}

		scanner.close(); // Cerramos el scanner para liberar recursos
	}
}
