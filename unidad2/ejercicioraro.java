package unidad2;

import java.util.Scanner;

public class ejercicioraro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// leer de teclado 10 numeros y sacar la media, el maximo y el minimo

		int i = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int num = 0;
		double media = 0, suma = 0;
		while (i < 5) {
			System.out.println("introduce el numero " + (i + 1) + ":");
			num = teclado.nextInt();
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
		System.out.println("la media es " + media);
		System.out.println("el maximo es " + max);
		System.out.println("el minimo es " + min);

		// leer un numero y mostrar su factorial y los divisores hasta 100
		// el factorial de un numero es la multipilacion de todos los numeros desde uno
		// hasta el numero que sea

		System.out.println("introduce un numero para calcular su factorial");
		num = teclado.nextInt();
		int factorial = 1;

		// para hacer factorial vamos desde 1 hasta el numero leido
		for (i = 1; i < num; i++) {
			factorial = i * factorial;
		}
		System.out.println("el factorial de " + num + " es " + factorial);
		teclado.close();
	}
}