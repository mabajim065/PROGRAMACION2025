package unidad2;

public class FIGURASBUCLES4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HACER CON # UN CUADRADO UN RECTANGULO UN TRIANGULO UN ROMBO UNA ESCALERA
		 * ##### ##### ##### #####
		 */

		int size = 6;

		for (int i = 0; i < size; i++) {
			// dibujamos una linea repitiendo size veces el caracter
			for (int j = 0; j < size; j++) {
				System.out.print("#"); // quilla acuierdate del ln
			}
			// pasamos a la siguiente linea
			System.out.println();
		}

//		teclado.close();
	}

}
