package EXAMENES;

import java.util.Scanner;

public class EXAMENTEMA2MARIA {

	// Esto lo estamos utilizando para que coja la categoria como numero en vez de
	// como palabra
	public static final int CAT_TOD = 1;
	public static final int CAT_DEP = 2;
	public static final int CAT_UTI = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/************************
		 * EMPIEZA EL EXAMEN *
		 ************************/
		Scanner teclado = new Scanner(System.in);

		/**********************************************************************
		 * 1. Leerá un conjunto de coches de teclado, con los siguientes *
		 * datos:Modelo,Marca,Categoría (TodoTerreno, Deportivo, Utilitario), *
		 * Stock,Potencia,Color (rojo, blanco, negro, azul) *
		 **********************************************************************/
		String modelo = " ";
		String marca = " ";
		int categoria = 0;
		int stock = 0;
		int potencia = 0;
		String color = " ";
		int numCoches = 0;// Para saber cuantas veces hay que repetirlo todo
		// -------------------------------------------------------
		String[] listacochesinstock = new String[100]; // Lista para coches sin stock
		int[] listacantidadcategoria = new int[3]; // Contador de coches por categoría
		String[] listacochesaltapotencia = new String[100];// Para el punto6 comprobar la potencia y color
		// ------------------------------------------------------------
		int maxstock = Integer.MIN_VALUE;
		int minpotencia = Integer.MAX_VALUE;
		String modelomasstock = "";
		String modelomenospotente = "";
		int stocktotalcitroen = 0;

		/******************************************************************************
		 * 2.El usuario introducirá primero la cantidad de coches que va a introducir *
		 * por teclado. *
		 ******************************************************************************/

		System.out.println("¿Cuántos coches vamos a introducir?");
		numCoches = teclado.nextInt();

		/********************************************************************************
		 * 3.Y con dichos datos comprobará los siguiente una vez leídos todos los
		 * datos:*
		 ********************************************************************************/

		/*********************************************************************************
		 * 8. Según se leen los datos se comprobará que los valores de categoría y color
		 * * están dentro de los valores posibles entre paréntesis, sino se le seguirá *
		 * pidiendo dicho dato hasta que introduzca un valor correcto. *
		 **********************************************************************************/
		for (int i = 0; i < numCoches; i++) {
			// Leer el modelo
			System.out.println("Introduce el modelo del coche " + (i + 1) + ": ");
			modelo = teclado.next();

			// Leer la marca
			System.out.println("Introduce la marca del coche " + (i + 1) + ": ");
			marca = teclado.next();

			// Leer la categoría
			do {
				System.out.println("Introduce la categoría (1.TodoTerreno, 2.Deportivo, 3.Utilitario) del coche "
						+ (i + 1) + ": ");
				categoria = teclado.nextInt();
			} while (categoria != CAT_TOD && categoria != CAT_DEP && categoria != CAT_UTI);

			// Leer el stock
			System.out.println("Introduce el stock del coche " + (i + 1) + ": ");
			stock = teclado.nextInt();

			// Leer la potencia
			System.out.println("Introduce la potencia (en cv) del coche " + (i + 1) + ": ");
			potencia = teclado.nextInt();

			// Leer el color
			do {
				System.out.println(
						"Introduce el color (rojo, blanco, negro, azul, amarillo) del coche " + (i + 1) + ": ");
				color = teclado.next();
			} while (!color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("blanco")
					&& !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("azul")
					&& !color.equalsIgnoreCase("amarillo"));

			/******************************************************************************************
			 * 4. Cuando un deportivo tenga stock 0 y potencia superior a 200cv, guardará su
			 * * nombre en un array y mostrará al final la lista de deportivos sin stock a *
			 * pedir de nuevo. *
			 ******************************************************************************************/
			if (stock == 0 && potencia > 200) {
				listacochesinstock[i] = modelo + "( " + marca + ")";
				// Lo pongo asi para que me salga en la lista de los coches sin stock el modelo
				// y la marca de cada coche que cumpla la condición
			}

			/****************************************************************************
			 * 5.Mostrará al final una lista de la cantidad de coches de cada categoría *
			 ****************************************************************************/
			// Utilizo un condifional para que se vallan agregando a la lista
			// correspondiente
			if (categoria != CAT_TOD) {
				listacantidadcategoria[0]++;
			} else if (categoria != CAT_DEP) {
				listacantidadcategoria[1]++;
			} else if (categoria != CAT_UTI) {
				listacantidadcategoria[2]++;
			}

			/**********************************************************************************
			 * 6. Mostrará por pantalla el modelo y marca de los coches de potencia entre 60
			 * * y 100cv cuyo color sea amarillo, rojo o negro. *
			 **********************************************************************************/

			if ((potencia < 60 || potencia > 100)
					&& (color.equals("amarillo") || color.equals("rojo") || color.equals("negro"))) {
				listacochesaltapotencia[i] = modelo + " (" + marca + ")";
				// Para que nos salga el modelo y marca de cada coche concreto
			}

			/*******************************************************************************
			 * 7. Mostrará el Stock total de los coches cuya marca sea Citroen, y el nombre*
			 * del citroen mas stock y del menos potente *
			 *******************************************************************************/
			if (marca.equalsIgnoreCase("Citroen")) {
				// Esto es como poner stocktotalcitroen + stock ( el que ya tengpo de ante)

				// Esto lo utilizo para el maximo
				stocktotalcitroen += stock;
				if (stock > maxstock) {
					maxstock = (int) stock;
					modelomasstock = modelo;
				}
				// Es casi casi igual que el maximo,ahora con el minimo
				if (potencia < minpotencia) {
					minpotencia = (int) potencia;
					modelomenospotente = modelo;
				}
			}
		}
		/******************************************************
		 * 9. MOSTRAMOS POR PANTALLA TODOS NUESTROS RESULTADOS*
		 ******************************************************/

		System.out.println("Los coches que no tienen stock son :" + listacochesinstock);

		// Muestro por pantalla la cantidad de coches por categoría
		System.out.println("Cantidad de coches por categoría:");
		System.out.println("TodoTerreno: " + listacantidadcategoria[0]);
		System.out.println("Deportivo: " + listacantidadcategoria[1]);
		System.out.println("Utilitario: " + listacantidadcategoria[2]);

		// Mostrará por pantalla el modelo y marca de los coches de potencia entre 60 y
		// 100cv cuyo color sea amarillo, rojo o negro.
		System.out.println(
				"La marca y modelo de los coches con potencia entre 60cv y 100cv y cuyos colores son amarillo,rojo o negro son: "
						+ listacochesaltapotencia);

		// Mostrará el Stock total de los coches cuya marca sea Citroen, y el nombre del
		// citroen mas stock y del menos potente
		System.out.println("El stock total de coche donde su marca es citroen es : " + stocktotalcitroen);

		System.out.println("El citroen con mas Stock es :  " + modelomasstock);

		System.out.println("El citroen menos potente es : " + modelomenospotente);
	}
}
