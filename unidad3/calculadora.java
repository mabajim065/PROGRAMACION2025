package unidad3;

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

			if(num<0 || num >9)
				sumatorio += num;
				return 0;
			else  
				sumatorio += numero;
			
			System.out.println(num);
		}

		return sumatorio;
	}
}
