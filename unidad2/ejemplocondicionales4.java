package unidad2;

import java.util.Scanner;

public class ejemplocondicionales4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * escribir un programa en java que lea dos numeros y la operacion la operación
		 * podra ser suma,resta,multiplicacion, division y potencia se corresponderá a
		 * los caracteres
		 */
		Scanner teclado = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		double resultado = 0;
		char operacion = ' ';

		System.out.println("dime el primer número ");
		numero1 = teclado.nextInt();

		System.out.println(" dime el segundo número ");
		numero2 = teclado.nextInt();

		System.out.println(" dime el operador que quieras utilizar (+,-,*,/,^ )");
		operacion = teclado.next().charAt(0);
		teclado.close();

		switch (operacion) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;

		case '*':
			resultado = numero1 * numero2;
			break;

		case '/':
			resultado = numero1 / numero2;
			break;

		case '^':
			resultado = Math.pow(numero1, numero2);
			break;
		// el break lo uso para cerrar y que pare de ejecutar justo cuando haga la
		// funcion que pida asique asi no ejecutara el siguiente case.
		default:
			System.out.println("el operador no es valido ");

			return;
		// El return es finaliza la funcion principal
		// en este caso main, por lo cual es el programa principal.

		}

		// sacamos por pantalla el resultado
		System.out.println("El resultado es " + resultado);

		// vamos a generar una nota aleatoria y que saque por pantalla si es un
		// suficiente, bien , sobresaliente....
		int nota = (int) (Math.random() * 11 + 1);
		System.out.println("mi nota es: " + nota);

		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("SUSPENSO");
			break;
		case 5:
			System.out.println("tienes un suficiente");
			break;
		case 6:
			System.out.println("tienes un bien");
			break;
		case 7:
			System.out.println("tienes un notable bajo");
			break;
		case 8:
			System.out.println("tienes un notable alto");
			break;
		case 9:
		case 10:
			System.out.println("tienes un sobresaliente ");
			break;
		case 11:
			System.out.println("ALIEN");
			break;
		}

	}

}
