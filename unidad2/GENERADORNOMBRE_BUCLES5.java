package unidad2;

public class GENERADORNOMBRE_BUCLES5 {

	public static void main(String[] args) {

		// crear un programa que escriba por pantalla un nombre creado aleatoriamente,
		// debe cumplir , un tamaño aleatorio entre 6 y 12 letras , las letras deben de
		// estar en mayusculas para generar cada letra generamos un numero con su codigo
		// ascii y lo pasamos a letra . investigar funciones ord, chr, o algo asi que
		// pasa de asciia char, no puede tener mas de dos vocales juntas ni mas de dos
		// consonantes

		// generamos el tamaño de la palabra, es un numero entre 6 y 12, si le damos
		// base 6, como minimo tendrá ese valor luego generamos un numero aleatorio
		// entre 0 y 6

		int tampalabra = 6 + (int) (Math.random() * 7);
		int i = 0;
		int vocales = 0;
		int consonantes = 0;
		String nombre = " ";
		while (i < tampalabra) {
			// generamos una letra entre 97 y 122
			char letra = (char) (97 + (int) (Math.random() * 26));

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vocales++;
				consonantes = 0;
			} else {
				vocales = 0;
				consonantes++;
			}

			if (vocales < 3 && consonantes < 3) {
				nombre += letra;

				// PASAMOS AL SIGUIENTE ELEMENTO
				i++;
			}
			// pasamos al siguiente elemento

		}
		System.out.println(" el nombre del notas es : " + nombre);

		//

	}

}
