package unidad3;

public class ejemplousoobjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * hemos creado una clase denominada personaje. las variables de una clase se
		 * denominan objetos para crear un objeto utilizamos la palabra reservada new la
		 * clase es el fichero java donde declaramos las variables y funciones que los
		 * objetos pueden utilizar un objeto es como una variable de esa clase que
		 * puiede guardar datos
		 */

		personaje aragorn = new personaje();
		aragorn.fuerza = 13;

		System.out.println("el personaje tiene " + aragorn.inteligencia + "  puntos de inteligencia");
		System.out.println("los puntos de vidas que tienes son: " + aragorn.puntosvida);
	}

}
