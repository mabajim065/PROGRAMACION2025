package unidad3;

import java.util.Arrays;

public class calculadora {

	/**
	 * funcion para que me salgan los numeros la funcion es estatica para poder
	 * llamar
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int suma(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	/**
	 * 
	 * @param listanumeros
	 * @return
	 */
	public static double suma(double listanumeros[]) {
		double sumatorio = 0;
		Object listanumero;
		for (int i = 0; i < listanumeros.length; i++) {
			sumatorio = sumatorio + listanumeros[i];
		}
		return sumatorio;
	}

	/**
	 * el factorial de un numero consiste en multiplicar todos los numero entre uno
	 * y dicho numero
	 * 
	 * @param num
	 * @return
	 */
	public static double factorial(int num) {

		double factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return num;
	}

	/**
	 * la funcion recibe eun string de numeros y suma todas sus cifras
	 * 
	 * @param numeros
	 * @return devuleve la suma del string o 0 si hay elementos no numericos
	 */
	public static int suma(String numeros) {
		// variable que va a almacenar la suma de todos los numeros
		int sumatorio = 0;

		// vamos a recorrer todos los numeros de la cadena
		for (int i = 0; i < numeros.length(); i++) {
			char numero = numeros.charAt(i);

			int num = Character.valueOf(numero) - 48;

			if (num < 0 || num > 9)
				sumatorio += num;
			return 0;
			// else
			// sumatorio += numero;

			/// System.out.println(num);

		}
		return sumatorio;

	}

	// ************************************************

	/**
	 * lara resolver el factorial de los 5 primeros numeros se podria decir que es
	 * el 5¡=4¡*5 1¡=1 no necesita hacer un resumen del problema.
	 * 
	 * @param num
	 * @return
	 */
	public static int factorialrecursivo(int num) {
		if (num == 1)
			return 1;

		else
			return num * factorialrecursivo(num - 1);
	}

	// **************************************************
	/**
	 * el caso base es que el arrays solo tenga un humero en cuyo caso devuelvo ese
	 * numero
	 * 
	 * @param listanumeros
	 * @return
	 */
	public static int sumarecursiva(double listanumeros[]) {

		if (listanumeros.length == 1)
			return (int) listanumeros[0];
		else
			listanumeros = Arrays.copyOfRange(listanumeros, 1, listanumeros.length - 1);
		return (int) (listanumeros[0] * sumarecursiva(listanumeros));

// si hya mas de un numero devolvemos la suma del orimer numero mas la suma
// recursiva del array a partir de este número
	}
}
