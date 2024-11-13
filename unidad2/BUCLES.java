package unidad2;

import java.util.Scanner;

public class BUCLES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// la variable nos sirve para saber cuantas veces se va a repetir
		// la condición hace que exista la posibilidad de que se corte el bucle
		// sirve para que pare en algun momento y no sea infinito
		// si yo pongo en el syso i este me va a ir dando los numeros en lista

		int numtabla = 0;

		System.out.println("Introduce un numero para hacer la tabla de multiplicar:");
		numtabla = teclado.nextInt();

		System.out.println("tabla de mmultiplicar del numero " + numtabla + " es la siguiente: ");

		// el bucle for se repite el codigo entre llaves un numero finito de veces
		// notmalmente se utiliza una variable contadora ( i en este caso) y se repite
		// mientras la condicion sea cierta. Es importante que dentro del codigo o en la
		// tercera parte......pedir a vicente
		for (int i = 0; i < 30; i++) {
			// al println si le quito el ln va a salir todo seguido
			System.out.print("-");
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.println(numtabla + " X " + (i + 1) + " = " + numtabla * (i + 1));
		}

		teclado.close();
	}

}
