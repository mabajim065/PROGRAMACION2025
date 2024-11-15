package unidad2;

import java.util.Scanner;

public class ejercicio10tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		// CREO LAS VARIABLES
		int cantidad = 0;
		String origen = "";
		String destino = "";
		// ....................
		String moneda1 = "";
		String moneda2 = "";

		// LE PEDIMOS AL USUARIO QUE TIPO DE MONEDA QUIERE
		System.out.println(" Qué tipo de moneda quieres combertir ? ( euro, dolar, peseta )");
		moneda1 = scanner.next();

		// LE DIGO QUE ME DIGA LA CANTIDAD QUE TIENE
		System.out.println("Cuanta cantidad tienes?");
		cantidad = scanner.nextInt();

		// PREGUNTAMOS A QUE LO QUIERE CONVERTIR
		System.out.println(" A que tipo de moneda lo quieres convertir ? ( euro, dolar, peseta )");
		moneda2 = scanner.next();

		if (moneda1 == "euro" && moneda2 == "dolar") {
			double moneda = cantidad * 1.09;
		}

		scanner.close();
	}

}
