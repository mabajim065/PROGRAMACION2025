package unidad3.examentema3;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado Empleado[];

		Empleado maria = new Empleado(1, "maria", 18, 1800, 1);
		Empleado mario = new Empleado(2, "Mario", 45, 3500, 2);
		Empleado loli = new Empleado(9, "loli", 25, 600, 4);

		System.out.println(" los datos de maria son:" + maria.getIngresos() + "," + maria.getEdad() + ","
				+ maria.getNumero() + "," + maria.getNombre());
		System.out.println(" los datos de mario son:" + mario.getIngresos() + "," + mario.getEdad() + ","
				+ mario.getNumero() + "," + mario.getNombre());
		System.out.println(" los datos de mario son:" + loli.getIngresos() + "," + loli.getEdad() + ","
				+ loli.getNumero() + "," + loli.getNombre());

	}
}
