package TEMA2.TEORIA;

import java.util.Scanner;

public class BUCLES2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SACAR LOS NUMEROS PARES ENTRE EL 1 Y 20
		// RECORREMOS LOS NUMEROS ENTRE 1 Y 20 Y SACAMOS SOLO LOS QUE
		// CUMPLAN SER PARES(modulo entre 2 igual a 0)
		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 0)
				System.out.println(i);
		}

//		bucle que diga los numero de 1 a 40
		for (int i = 0; i <= 40; i++) {
			if ((i + 1) % 2 != 0)
				continue;

			System.out.println(i);
		}
		// otra forma de hacerlo seria
		System.out.println(" version 2 ;");
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}
		// MOSTRAR TODAS LAS TABLAS DE MULTIPLICAR DE 1 A 10
		for (int j = 0; j < 10; j++) {

			System.out.println();
			System.out.println(" TABLA DE MULTIPLICAR DEL " + (j + 1));
			System.out.println("--------------------------------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println((j + 1) + " x " + (i + 1) + " = " + (j + 1) * (i + 1));
			}

			for (int i = 0; i <= 40; i++) {
				if ((i + 1) % 2 != 0)
					continue;

				System.out.println(i);
			}

			Scanner teclado = new Scanner(System.in);
			// leer de teclado 10 numeros y sacar la media, el maximo y el minimo

			int i = 0;
			int max = Integer.MIN_VALUE, min = Integer.MIN_VALUE;

			double media = 0, suma = 0;
			while (i < 5) {
				System.out.println("introduce el numero " + (i + 1) + ":");
				int num = teclado.nextInt();
				suma = suma + num;

				// si el numero que leo es el maximo hastta este momento , ese numero es el
				// numevo maximo, por llo cual se lo asigno como valor maximo

				if (num > max)
					max = num;

				if (num < min)
					min = num;
				i++;
			}
			media = suma / 5;

			System.out.println(" la media es " + media);

			teclado.close();
		}
	}

}
