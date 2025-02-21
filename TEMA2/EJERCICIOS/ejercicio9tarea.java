package TEMA2.EJERCICIOS;

import java.util.Scanner;

public class ejercicio9tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// abrimos el scanner y que no se te olvide cerrarlo
		Scanner scanner = new Scanner(System.in);

		// creamos las variables de los dados aleatorios
		int dado1 = (int) (Math.random() * 6 + 1);
		int dado2 = (int) (Math.random() * 6 + 1);
		int dado3 = (int) (Math.random() * 6 + 1);
		int dado4 = (int) (Math.random() * 6 + 1);
		String nombre1 = "jugador1";
		String nombre2 = "jugador2";

		// pedimos que nos den sus nombres
		System.out.println(" como se llama el jugadior 1 ?");
		nombre1 = scanner.next();
		System.out.println(" como se llama el jugador 2 ?");
		nombre2 = scanner.next();

		// cremos como tirar los dados
		System.out.println("primer dado de " + nombre1 + " = " + dado1);
		System.out.println("segundo dado de " + nombre1 + " = " + dado2);
		System.out.println("primer dado de " + nombre2 + " = " + dado3);
		System.out.println("segundo dado de " + nombre2 + " = " + dado4);

		// empezamos a cerar los posibles casos
		if ((dado1 == dado2) && (dado3 == dado4) && (dado1 == dado3)) {
			System.out.println("Por tanto tenemos un empate ");
// ------------------------------------------------------------------------------------			
		} else if (dado1 == 6 && dado2 == 6) {
			System.out.println("Por tanto  gana " + nombre1);
		} else if (dado3 == 6 && dado4 == 6) {
			System.out.println("Por tanto " + nombre2 + " gana");
//---------------------------------------------------------------------------------------
		} else if (dado1 == dado2) {
			System.out.println("Por tanto " + nombre1 + " gana");
		} else if (dado3 == dado4) {
			System.out.println("Por tanto " + nombre2 + " gana");
//---------------------------------------------------------------------------------------
		} else if ((dado1 + dado2) > (dado3 + dado4)) {
			System.out.println("Por tanto " + nombre1 + " gana");
		} else if ((dado1 + dado2) < (dado3 + dado4)) {
			System.out.println("Por tanto " + nombre2 + " gana");
// ----------------------------------------------------------------------------------------
		} else if ((dado1 + dado2) == (dado3 + dado4)) {
			System.out.println("Por tanto es empate ");
		}
//------------------------------------------------------------------------------------------

		scanner.close();
	}

}
