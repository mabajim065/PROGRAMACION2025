package TEMA2.TEORIA;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejemplocondicionales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// vamos a comprobar si un alumno ha sacado el carnet de conducir
		// para ello leera de teclado los siguientes datos
		// edad, numfallosexamen, tasapagada, fechaexamenpractico, numgolpes, soborno,
		// jamon
		// el programa debera de compobar si tiene derecho a carnet,para ello debera
		// tener mas de 18 años y menos de 4 fallos en el examen y la tasa pagada en
		// caso de cumplirlo se le pedira la fecha del examen practico y los golpes , si
		// la fecha es anterior a la actual o tiene menos de dos golpes tambien aprueba,
		// en todo caso tmbn tiene el carnet si ha regalado un jamon

		int edad = 0;
		int numfallosexamen = 0;
		boolean tasapagada = false;
		LocalDate fechaexamen;
		int numgolpes = 0;
		boolean jamon = false;
		String stasapagada = "";
		String sfechaexamen;

		Scanner teclado = new Scanner(System.in);

		// pedimos la edad
		System.out.println("que edad tienes?");
		edad = teclado.nextInt();

		// pedimos numero de fallos
		System.out.println("cuantos cuantos fallos tuvistes en el teorico?");
		numfallosexamen = teclado.nextInt();

		// pedimos tasa pagada
		System.out.println("caunto pagaste de tasa S/N?");
		stasapagada = teclado.next();

		tasapagada = stasapagada.equalsIgnoreCase("S") ? true : false;

		// preguntar si hubo soborno
		System.out.println("has regalado un jamon true/false?");
		jamon = teclado.nextBoolean();

		if (jamon)
			System.out.println("tienes tu carnet de conducir");
		else {

			// para leer la fecha de teclado hay que leerla como un string pero puede tener
			// muchisimos formatos
			// pedimos fechaexamenpractico
			System.out.println("cuando hiciste el examen (dd/mm/yyyy)?");
			sfechaexamen = teclado.next();
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("(dd/mm/yyyy)");
			fechaexamen = LocalDate.parse(sfechaexamen, formateador);

			// pedir numgolpes
			System.out.println("cuantos golpes pegastes en el practico?");
			numgolpes = teclado.nextInt();

			if (edad >= 18 && numfallosexamen < 4 && tasapagada) {

				ChronoLocalDate hoy = null;
				// ultima comprobacion menos de dos golpes y fecha anterior a la actual
				if (numgolpes < 2 || fechaexamen.isBefore(hoy)) {

					System.out.println("tienes tu carnet del coche ");
				}
			}
		}

		teclado.close();
	}

}
