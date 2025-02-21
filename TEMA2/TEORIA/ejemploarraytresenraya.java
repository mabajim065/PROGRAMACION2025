package TEMA2.TEORIA;

import java.util.Scanner;

public class ejemploarraytresenraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tablero[][] = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };
//----------------------------------------------------------------------------------
		String ganador = "";
		String jugada = "";
		int jugadaOposx = 0;
		int jugadaXposx = 0;
		int jugadaXposy = 0;
		int jugadaOposy = 0;

		int cantidadx = 0;
		int cantidado = 0;
//------------------------------------------------------------------------------------		
		Scanner teclado = new Scanner(System.in);

		// Mientras no haya un ganador les vamos pieidno que pongan fichas
		while (ganador.equals("")) {
			// Mostramos por pantalla el tablero
			for (int i = 0; i < tablero.length; i++) {
				// Dibujo cada fila del tablero
				for (int j = 0; j < tablero[i].length; j++)
					System.out.print(tablero[i][j] + " ");

				// Despues de cada fila doy un enter
				System.out.println();
			}
//-----------------------------------------------------------------------------------
			// Turno jugador 1

			// while (jugadaXposy < 0 || jugadaXposy > 2 || jugadaXposy < 0 || jugadaXposy >
			// 2) {
			do {

				System.out.println("Jugador 1: Posicion a poner tu ficha (xy):");
				jugada = teclado.next();
				//
				//
				// asignamos las posiciones a sus variables
				// se usa la funcion interger.parseint
				// asignamos las posiciones a susu variables
				jugadaXposx = Character.getNumericValue(jugada.charAt(0));
				jugadaXposy = Character.getNumericValue(jugada.charAt(1));
			} while (jugadaXposx < 0 || jugadaXposx > 2 || jugadaXposy < 0 || jugadaXposy > 2);
			// posicionamos la ficha en su lugar
			tablero[jugadaOposy][jugadaXposx] = 'X';
//-----------------------------------------------------------------------------------
			// Turno jugador 2

			// while (jugadaXposy < 0 || jugadaXposy > 2 || jugadaXposy < 0 || jugadaXposy >
			// 2) {
			do {

				System.out.println("Jugador 2: Posicion a poner tu ficha (xy):");
				jugada = teclado.next();

				// asignamos las posiciones a sus variables
				// se usa la funcion interger.parseint
				// asignamos las posiciones a susu variables
				jugadaOposx = Character.getNumericValue(jugada.charAt(0));
				jugadaOposy = Character.getNumericValue(jugada.charAt(1));
			} while (jugadaOposx < 0 || jugadaOposx > 2 || jugadaOposy < 0 || jugadaOposy > 2);
			// posicionamos la ficha en su lugar
			tablero[jugadaOposy][jugadaXposx] = 'O';

			int x = 0;
			// -----------------------------------------------------------------------------------
			// PRIMERO COMPROBAMOS LAS FILAS
			for (int y = 0; y <= 2; y++) {
				cantidadx = 0;
				for (int x1 = 0; x1 <= 2; x1++) {

				}
				if (tablero[x][y] == 'x')
					cantidadx++;
			}
			if (cantidadx == 3)
				ganador = "jugador x";

			// comprobamos las diagonales
			if (tablero[0][0] == 'x' && tablero[1][1] == 'x' && tablero[2][2] == 'x')
				ganador = "jugador x";
			if (tablero[0][2] == 'x' && tablero[1][1] == 'x' && tablero[2][0] == 'x')
				ganador = "jugador x";
//---------------------------------------------------------------------------
			if (ganador == "") {
				// PRIMERO COMPROBAMOS LAS FILAS
				for (int y = 0; y <= 2; y++) {
					cantidado = 0;
					for (int x1 = 0; x1 <= 2; x1++) {

					}
					if (tablero[x][y] == 'O')
						cantidado++;
				}
				if (cantidadx == 3)
					ganador = "jugador O";

				// comprobamos las diagonales
				if (tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O')
					ganador = "jugador O";
				if (tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O')
					ganador = "jugador O";
			}
		}
		System.out.println("has ganado, " + ganador);

		teclado.close();
	}
}
