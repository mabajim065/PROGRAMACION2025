package unidad2;

public class BUCLES2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SACAR LOS NUMEROS PARES ENTRE EL 1 Y 20
		// RECORREMOS LOS NUMEROS ENTRE 1 Y 20 Y SACAMOS SOLO LOS QUE
		// CUMPLAN SER PARES(modulo entre 2 igual a 0)
		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 0)
				System.out.println(i);
		}

		// otra forma de hacerlo seria
		System.out.println(" version 2 ;");
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}
		// MOSTRAR TODAS LAS TABLAS DE MULTIPLICAR DE 1 A 10
		for (int j = 0; j < 10; j++) {

			System.out.println();
			System.out.println(" TABLA DE MULTIPLICAR DEL " + (j + 1));
			System.out.println("--------------------------------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println((j + 1) + " x " + (i + 1) + " = " + (j + 1) * (i + 1));
			}

		}
	}

}
