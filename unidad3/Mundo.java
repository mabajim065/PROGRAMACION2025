package unidad3;

public class Mundo {

	public static final char TIERRA = 'T';
	public static final char BOSQUE = 'B';
	public static final char MONTANA = 'M';

	public static final char TIPO_ENEMIGO = 'E';
	public static final char TIPO_JUGADOR = 'J';

	public Enemigo enemigop;
	public Personaje jugador;

	private char[][] mapa = { { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
			{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }, { 'M', 'M', 'M', 'M', 'T', 'M', 'M', 'M', 'M', 'M' },
			{ 'M', 'M', 'B', 'B', 'M', 'M', 'T', 'T', 'T', 'T' }, { 'M', 'M', 'M', 'B', 'M', 'M', 'T', 'T', 'M', 'M' },
			{ 'M', 'M', 'B', 'B', 'M', 'T', 'T', 'T', 'M', 'M' }, { 'M', 'M', 'B', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
			{ 'M', 'M', 'B', 'B', 'B', 'B', 'M', 'M', 'M', 'M' }, { 'M', 'M', 'B', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
			{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }, };

	public void mostrarMapa() {

		for (int i = 0; i < mapa.length; i++) {

			for (int j = 0; j < mapa[i].length; j++) {

				System.out.print(mapa[i][j] + " ");

			}

			System.out.println();
		}
	}

	/**
	 * 
	 * @param tipo
	 */

	public void posicionarPersonaje(int tipo) {

		int posY = (int) (Math.random() * mapa.length);
		int posX = (int) (Math.random() * mapa.length);
		boolean enemigoCerca = false;

		if (tipo == Mundo.TIPO_ENEMIGO) {
			mapa[posY][posX] = Mundo.TIPO_ENEMIGO;
			return;
		}

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (mapa[posY + i][posX + j] == Mundo.TIPO_ENEMIGO)
					enemigoCerca = true;
			}
		}

		{
			mapa[posY][posX] = Mundo.TIPO_JUGADOR;
			return;
		}
		// mientras el enemigo este cerca hay que seguir cambiando de posicion
		while (enemigoCerca) {
			posY = (int) (Math.random() * mapa.length);
			posX = (int) (Math.random() * mapa.length);
			enemigoCerca = false;

		}
	}

	public Mundo() {

		Personaje raistlin = new Personaje();
		raistlin.setClase(Personaje.CLASE_MAGO);
		Enemigo orcoOscuro = new Enemigo();
	}
}
