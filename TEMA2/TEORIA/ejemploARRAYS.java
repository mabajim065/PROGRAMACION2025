package TEMA2.TEORIA;

public class ejemploARRAYS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double listaaltura[] = { 200, 185, 190, 230, 170, 180, 200, 234, 780, 10 };// con los corchetes estos raros ya
																					// sabe que es un arrays
		// tenemos despues la cantidad de jugadores
		int cantidadjugadores = 10;
		String listanombres[] = { "pepito1", "juanjo1", "juanjo2", "juanjo32", "juanjo4", "juanjo5", "juanjo6",
				"juanjo7", "juanjo8", "juanjo9" };

		// generamos las alturas entre150 y 230
		for (int i = 0; i <= 10; i++) {

			// vamos rellenando el arrays con alturas aleatorias
			double altura = 150 + (Math.random() * 80.0);

			// ponemos la altura generada dentro de la posicion i del array
			listaaltura[i] = altura;
		}
		// mostramos con un string todos los elementos de array de altura que hemos
		// creado previamente.
		System.out.println("la lista de altura:\n" + listaaltura.toString());
		// para definir el tamaño de un arrays
		listaaltura = new double[cantidadjugadores];
		listanombres = new String[cantidadjugadores];

		// para asignar valores a una posicion en particular de una arrays utilizamos []
		// con el numero de la posicion en la que queremos guardar el dato

		listaaltura[2] = 205.1;
		listanombres[2] = "juanjo";
		System.out.println("nombre de jugadoir 2: " + listanombres[2] + " - altura jugador 2. " + listaaltura[2]);
		System.out.printf("la altura es %.2f", listaaltura[2]);

		// sacar la meida de las alturas de los jugadores
		double mediaaltura = 0;
		int i = 0;
		// mientras no lleguemos al ultimo elemento seguimos sumando
		// con length podemos saber la cantidad de elementos que hay almacenados en este
		// array
		while (i < listaaltura.length) {
			// vamos sumando cada altura en la variable que definimos
			mediaaltura = mediaaltura + listaaltura[i];
			// pasamos al siguiente elemento
			i++;
		}
		System.out.println("la media de las alturas es " + (mediaaltura / listaaltura.length));
	}

}
