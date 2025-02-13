package TEMA1;

import java.util.Scanner;

public class EjemploEntradaSalidaTeclado {

	/**
	 * comentario javadoc
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// comentario de linea

		String nombre = "";
		int edad = 23;
		float sueldo = 1300.4f;
		// el numero de telefono es un string ya que existe la posibilidad de que se
		// introduzca un caracter no numerico

		String telefono = "8354739";
		boolean hombre = true;
		boolean esmayoredad = true;

		/*
		 * 
		 * comentario de muchas lineas
		 */

		// los valores boolean pueden ser true o false
		// se les puede asignar una expresión logica que la evalua como true o false

		char sexo = 'm';
		String dni = "246483925v";
		String codempleado = "889e";
		String ram = "2GB";

		Scanner teclado = new Scanner(System.in);

		// mensaje leer teclado
		System.out.println("tu nombre cual ser ?");
		nombre = teclado.next();

		System.out.println("el nombre es " + nombre);

		System.out.println("cuantos años tienes ? ");
		edad = teclado.nextInt();

		System.out.println("el alumno es mayor de edad? " + esmayoredad);
		esmayoredad = (edad >= 18);

		// leemos el sueldo
		System.out.println("cuanto cobras al mes ? ");
		sueldo = teclado.nextFloat();

		System.out.println("sexo (M/F/O) :  ");
		sexo = teclado.next().charAt(0);

		System.out.println("el nombre del alumno es " + nombre + " y cobra " + sueldo + " y su sexo es " + sexo);

		// leemos nombre teclado

		// leemos un entero que es la edad de teclado
		// para eso utilizamos nextint

		// cerramos teclado cuando no lo vamos a utilizar
		teclado.close();

	}
}
