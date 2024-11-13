package unidad2;

import java.util.Scanner;

public class ejemplocondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LEEMOS EL TECLADO LA EDAD DE UNA PERSONA Y LE DECIMOS SI ES MAYOR DE EDAD O
		// NO
		Scanner teclado = new Scanner(System.in);
		System.out.println("que edad tienes?");

		// leemos un entero
		int edad = teclado.nextInt();

		// ponemos condicion if. con la sentencia if se evalua una condiucion.
		// si la condicion es cierta entra en el bloque de codigo y lo ejecuta
		if (edad >= 18) {
			System.out.println("puede entrar en la discoteca");
		} else // si la condicion del if es falsa entra en el codigo del else
		{
			System.out.println(" NO puede entrar en la discoteca");
		}

		teclado.close();
	}

}
