package TEMA1;

public class ejemplocomparadores {

// escribo main control barra y me lo escribe solo

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 18;
		String nombre = "elisabetta";
		float nota = 4.4f;
		int nummodsup = 7;
		boolean traebebida = true;
		int numacomp = 2;
		boolean llevazapatillas = false;
		boolean gradoaprob = false;

		/*
		 * el alumno puede entrar en el apto de graduacion final si y solo si es mayor
		 * de edad ha aprobado 8 modulos o mas viene con bebida no trae zapatillas
		 * deportivas trae menos de tres acompañantes
		 */
		// el valor para entrar es falso por defecto

		boolean puedeentrargrad = false;

		// el operador > es cierto si el numero a la izquierda es mayor que el de la
		// derceha
		// estrictamente, sin son iguales el falso

		System.out.println("es mayor de 18? " + (edad > 18));

		System.out.println("el mayor o igual que 18? " + (edad >= 18));

		System.out.println("el alumno esta suspenso? " + (nota < 5));

		// combinamos todas las condiciones con el operador logico y &&

		puedeentrargrad = edad >= 18 && nummodsup >= 8 && traebebida == true && llevazapatillas != true && numacomp < 3;

		// aprueba el modulo si s mayor de 17 años y cumple una de las siguientes
		// condiciones,
		// la nota media es mayor de 4.5 o tiene mas de seis modulos aprobados.

		gradoaprob = edad > 17 && (nota >= 4.5 || nummodsup > 6);

		// el alumno onsigue la beca de transporte si cumple que su renta fmiliar es
		// inferior a 20000 euros
		// la familia tiene entre 3 y 6 personas y no esta empadronado en otra provincia
		// o cumple que es victima de terrorismo o de maltrato
		float rentafamiliar = 19000.4f;
		int personas = 4;
		boolean empadronadofuera = false;
		String victimaterrorismo = "si";
		String victimamaltrato = "no";
		boolean becatrans = false;

		// el operador ! (no) niega (resultado contrario) la condicion que le sigue
		// para comparar cadenas string utilizamos la funcion equals (cadena)

		becatrans = rentafamiliar < 20000 && (personas >= 3 && personas < 6) && !empadronadofuera
				|| (victimaterrorismo.equalsIgnoreCase("si") || victimamaltrato.equals("si"));

		System.out.println("el alumnos puede entrar a la graduacion?" + puedeentrargrad);
		System.out.println("ha aprobado el grado? " + gradoaprob);
		System.out.println("el alumno consigue la beca de transporte? " + becatrans);

		// SI HAY UNA CADENA DE TEXTO CON EL OPERADRRO + COMBIERTE TODO A CADENAS

	}

}
