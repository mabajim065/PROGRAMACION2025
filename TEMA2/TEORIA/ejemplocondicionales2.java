package TEMA2.TEORIA;

public class ejemplocondicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// escribe un programa que lea una nota y nos diga si es un insuficiente,
		// suficiente,bien,notable,sobresaliente o matricula

		double nota = (Math.random() * 10); // esto se puede hacer con float pero el math random habria que
											// transformarlo

		System.out.println("tu nota es " + nota);

		// si saca menos de un 5 ha suspendido
		if (nota < 5) {
			System.out.println("ha suspendido");
			System.out.println("lo siento mucho ");
		} else {
			// si estamos dentro la nota implica que la nota es mayor o igual a 5.
			// si ademas es menor de 6 implica que es un suficiente
			if (nota < 6) {
				System.out.println("tienes un sufuciente ");
			}

			if (nota < 7) {
				System.out.println("tienes un bien ");
			}

			if (nota < 9) {
				System.out.println("tienes un notable ");
			}

			if (nota < 10) {
				System.out.println("tienes un sobresaliente ");
			}
		}
	}
}
