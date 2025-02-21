package TEMA2.EJERCICIOS;

import java.time.LocalDate;
import java.util.Scanner;

public class EJERCICIO7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int mes = 12;
		int mesactual = LocalDate.now().getMonthValue(); // ESTO PARA OBTENER EL MES ACTUAL
		String nombremes = "";
		int mesfinal = 0;

		// PEDIMOS AL USUARIO QUE NOS DIGA EL NUMERO DEL MES QUE QUIERE
		System.out.println(" Di el numero de mes (1 enero, 2 febrero, 3 marzo...)");
		mes = scanner.nextInt();

		switch (mes) {
		case 1:
			System.out.println("El mes es Enero");
			nombremes = "Enero";// uso equal porque con el string no me va a dejar utilizar ==
			break;
		case 2:
			System.out.println("El mes es Febrero");
			nombremes = "Febrero";
			break;
		case 3:
			System.out.println("El mes es Marzo");
			nombremes = "Marzo";
			break;
		case 4:
			System.out.println("El mes es Abril");
			nombremes = "Abril";
			break;
		case 5:
			System.out.println("El mes es Mayo");
			nombremes = "Mayo";
			break;
		case 6:
			System.out.println("El mes es Junio");
			nombremes = "Junio";
			break;
		case 7:
			System.out.println("El mes es Julio");
			nombremes = "Julio";
			break;
		case 8:
			System.out.println("El mes es Agosto");
			nombremes = "Agosto";
			break;
		case 9:
			System.out.println("El mes es Septiembre");
			nombremes = "Septiembre";
			break;
		case 10:
			System.out.println("El mes es Octubre");
			nombremes = "Octubre";
			break;
		case 11:
			System.out.println("El mes es Noviembre");
			nombremes = "Noviembre";
			break;
		case 12:
			System.out.println("El mes es Diciembre");
			nombremes = "Diciembre";
			break;
		default:
			System.out.println("el numero no sirve, ponlo de nuevo");
			return;
		}

		// CALCULAR CUANTO QUEDA O CUANTO HA PASADO DESDE EL MES ACTUAL HASTA EL QUE
		// METE EL USUARIO
		if (mesactual < mes) {
			mesfinal = mes - mesactual;
			System.out.println("Quedan " + mesfinal + " mes/es para " + nombremes);
		} else if (mesactual > mes) {
			mesfinal = mesactual - mes;
			System.out.println("Han pasado " + mesfinal + " mes/es desde " + nombremes);
		} else {
			System.out.println("Es el mismo mes que el actual");
		}

		scanner.close();
	}
}