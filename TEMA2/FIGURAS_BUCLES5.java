package TEMA2;

import java.util.Scanner;

public class FIGURAS_BUCLES5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HACER CON # UN CUADRADO UN RECTANGULO UN TRIANGULO UN ROMBO UNA ESCALERA
		 * ##### ##### ##### #####
		 */

		int size = 6;

		for (int p = 0; p < size; p++) {
			// dibujamos una linea repitiendo size veces el caracter
			for (int h = 0; h < size; h++) {
				System.out.print("#"); // quilla acuierdate del ln
			}
			// pasamos a la siguiente linea
			System.out.println();
		}

		// despues del cuadrado dibujaremos un triangulo se lee la base
		// #
		// ###
		// #####
		// #######
		// #########

		int base = 6;
		Scanner teclado = new Scanner(System.in);
		System.out.println("cual es la base?");
		base = teclado.nextInt();

		// base 3 altura 2
		// base 5 altura 3
		// base 7 altura 4
		// base 9 altura 5
		// base 11 alturra 6
		// hay que escribir base entre 2 mas 1 veces

		// bucle principal que va escribiendo cada linea

		for (int i = 1; i <= (base / 2 + 1); i++) {

			// antes de escribir los # hay que escribir espacios para que queden alineados

			for (int z = 1; z < ((base) / 2 - i + 2); z++) {
				System.out.print(" ");
			}
			// para escribir cada linea utilizamos un bucle
			for (int j = 1; j <= (i * 2 - 1); j++) {
			}
			System.out.print("#");
			// pasamos a la siguiente linea
			System.out.println();
		}

		teclado.close();
	}

}
