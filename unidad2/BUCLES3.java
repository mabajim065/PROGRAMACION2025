package unidad2;

import java.util.Scanner;

public class BUCLES3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREAR UN PROGRAMA QUE GENERE UN NUMERO ALEATORIO Y NOS DE 5 INTENTOS DE
		// ADIVINARLOS, NOS DARA PISTAS , SI ES SUPERIOR I INFERIOR LO DIRA Y SI ESTA A
		// MENOS DE 2 POSICIONES DIRA CALIENTE CALIENTE.

		// generamos un numero entre 1 y 50
		int numgenerado = (int) ((Math.random() * 50) + 1);
		int num = -1;
		int numintentos = 5;
		Scanner teclado = new Scanner(System.in);

		// repetimos el numero de intentos
		for (numintentos = 5; numintentos != 0; numintentos--) {

			// leo el numero que el usuario cree que va a sr el correcto
			System.out.println(" intento numero " + numintentos + ":");
			num = teclado.nextInt();

			if (num == numgenerado) {
				System.out.println("felicidades , has acertado");
				numintentos = 0;
			} else {
				// si no ha acertado es que esta en el else, hacemos el valor absoluto(pasa a
				// positivo si es negativo) y comprobamos que la distancia entre los numeros es
				// menos de 3, es decir 2 o 1
				if (Math.abs(num - numgenerado) <= 2) {
					System.out.println(" caliente caliente");
				}
				// vamos a decirle si el numero buscado es mayor o menor
				if (num < numgenerado) {
					System.out.println("el numero que buscas es menor");

				} else {
					System.out.println("el numero es mayor");
				}

			}
		}
		teclado.close();
	}
}
