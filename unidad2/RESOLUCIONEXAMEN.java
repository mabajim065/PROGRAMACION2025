/**************************************************************************************************************************
 * ************************************************************************************************************************
 *   SOLUCIÓN EXAMEN AÑOS ANTERIORES                                                                                  *
 * ************************************************************************************************************************
 **************************************************************************************************************************/

package TEMA2TAREAS;

import java.util.Scanner;

public class ejercicioexamen {

    // Constantes que representan las categorías de las bicicletas
    public static final int CAT_MTB = 1;
    public static final int CAT_DESC = 2;
    public static final int CAT_CAR = 3;

    public static void main(String[] args) {
        // Creación del objeto Scanner para la entrada de datos
        Scanner teclado = new Scanner(System.in);

        // Variables para almacenar información sobre las bicicletas
        String modelo = "";  // Modelo de la bicicleta
        String marca = "";   // Marca de la bicicleta
        double precio = 0;   // Precio de la bicicleta
        int categoria = 0;   // Categoría de la bicicleta
        int stock = 0;       // Stock de la bicicleta
        int puntec = 0;      // Puntuación de la bicicleta
        int numbicis = 0;    // Número total de bicicletas a procesar

        // Variables auxiliares para cálculos y resultados
        double mediaprecio = 0;           // Media de precios
        int maxprecio = Integer.MIN_VALUE; // Precio máximo encontrado
        int minprecio = Integer.MAX_VALUE; // Precio mínimo encontrado
        String modelomax = "";            // Modelo con precio máximo
        String modelomin = "";            // Modelo con precio mínimo
        int sumastock = 0;                // Suma del stock de bicicletas de descenso
        String[] listadomodelocond;       // Listado de modelos que cumplen ciertas condiciones
        String[] listadomodelostock = null; // Listado de modelos sin stock pero con puntuación > 6

        // Solicitud del número de bicicletas que se van a procesar
        // "El usuario introducirá primero la cantidad de bicicletas que va a introducir por teclado."
        System.out.println("Cuántas bicis vamos a leer?: ");
        numbicis = teclado.nextInt();

        // Inicialización del arreglo para almacenar modelos que cumplen condiciones
        listadomodelocond = new String[numbicis];

        /*************************************************************************
         * INTRODUCCIÓN DE DATOS: Leer un conjunto de n bicicletas con los siguientes datos: *
         * Modelo, Marca (solo orbea, decathlon, BH), Precio, Categoría (MTB, Descenso, Carretera), *
         * Stock y Puntuación Técnica (entre 1 y 10). *
         *************************************************************************/

        for (int i = 0; i < numbicis; i++) {
            System.out.println("Introduce el modelo de la bici " + (i + 1));
            modelo = teclado.next();

            // Solicitud de la marca, validando que sea una de las permitidas
            do {
                System.out.println("Introduce la marca de la bici " + (i + 1) + " (orbea, decathlon o BH)");
                marca = teclado.next();
            } while (!marca.equals("orbea") && !marca.equals("decathlon") && !marca.equals("BH"));

            // Solicitud del precio
            System.out.println("Introduce el precio de la bici " + (i + 1));
            precio = teclado.nextDouble();

            // Solicitud de la categoría, asegurándose de que sea válida
            do {
                System.out.println("Introduce la categoría de la bici " + (i + 1) + " (1-MTB, 2-Descenso, 3-Carretera)");
                categoria = teclado.nextInt();
            } while (categoria < 1 || categoria > 3);

            // Solicitud del stock
            System.out.println("Introduce el stock de la bici " + (i + 1));
            stock = teclado.nextInt();

            // Solicitud de la puntuación, asegurándose de que esté en el rango 1-10
            do {
                System.out.println("Introduce la puntuación de la bici " + (i + 1));
                puntec = teclado.nextInt();
            } while (puntec < 1 || puntec > 10);

            /**************************************************************************
             * TRATAMIENTO DE DATOS: Comprobación de los siguientes puntos tras leer los datos:   *
             ************************************************************************/

            // "La media de precio de todas las bicicletas"
            mediaprecio += precio;

            // "El nombre de la bicicleta más cara y más barata"
            if (precio > maxprecio) {
                maxprecio = (int) precio;
                modelomax = modelo;
            }

            if (precio < minprecio) {
                minprecio = (int) precio;
                modelomin = modelo;
            }

            // "Mostrar el modelo de las bicicletas de carretera cuya puntuación sea superior a 9 o cuesten menos de 190 euros."
            if (categoria == CAT_CAR && (puntec > 9 || precio < 190)) {
                listadomodelocond[i] = modelo;
            }

            // "Mostrar el Stock total de bicicletas de tipo Descenso."
            if (categoria == CAT_DESC) {
                sumastock += stock;
            }
        }

        // "La media de precios se calcula al final dividiendo la suma total entre la cantidad de bicicletas."
        mediaprecio /= numbicis;

        /**************************************************************************
         * RESULTADOS: Mostrar los resultados calculados                             *
         ************************************************************************/

        // Modelos que cumplen condiciones especificadas
        System.out.println("Modelos que cumplen condiciones:");
        for (String modeloCond : listadomodelocond) {
            if (modeloCond != null) {
                System.out.println(modeloCond);
            }
        }

        // "Cuando una bicicleta tenga stock 0 y puntuación superior a 6, se guardará su nombre en un array."
        System.out.println("Modelos sin stock pero con puntuación > 6:");
        for (String modeloStock : listadomodelostock) {
            if (modeloStock != null) {
                System.out.println(modeloStock);
            }
        }

        // Mostrar resultados finales
        System.out.println("El precio máximo es: " + maxprecio);
        System.out.println("El precio mínimo es: " + minprecio);
        System.out.println("El modelo más caro es: " + modelomax);
        System.out.println("El modelo más barato es: " + modelomin);
        System.out.println("La media de precios es: " + mediaprecio);
        System.out.println("El stock total de bicicletas de descenso es: " + sumastock);

        // Cierre del objeto Scanner
        teclado.close();
    }
}
