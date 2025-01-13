package unidad3;

public class ejemlplousopersonaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * hemos creado una clase denominada personaje. las variables de una clase se
		 * denominan objetos para crear un objeto utilizamos la palabra reservada new la
		 * clase es el fichero java donde declaramos las variables y funciones que los
		 * objetos pueden utilizar un objeto es como una variable de esa clase que
		 * puiede guardar datos
		 */

		/*
		 * creamos un arma
		 */
		arma arcogelido = new arma();
		// para poder usar un objeto primero hay que crearlo, se utiliza la palabra
		// reseltada new, cuando lo creamos
		/*
		 * realmente se llama a una funcion de la clase arma que se denomina constructor
		 */
		arcogelido.nombre = "frozenlettheartgo";
		String nombre;
		personaje aragorn = new personaje();
		aragorn.fuerza = 13;

		arma lanzapicas = new arma("lanza picas", "multiples a la vez", 0, 20, 0, 3);

		System.out.println("el personaje tiene " + aragorn.inteligencia + "  puntos de inteligencia");
		int golpe = 4;
		aragorn.recibirdanio(golpe);
		System.out.println("los puntos de vidas que tienes son: " + aragorn.puntosvida);
		// System.out.println("tirada de ataque aragon: " + ((Object)
		// aragorn).tiradaataque());
		// System.out.println("descripcion del arma :" + arcogelido.getdescripcion());
		// System.out.println("descripcion del arma :" + arcogelido.getdescripcion());

	}

}
