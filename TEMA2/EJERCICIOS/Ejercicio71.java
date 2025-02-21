package TEMA2.EJERCICIOS;

import java.util.Scanner;// esto va fuera que sino me da error
		public class Ejercicio71 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Pedimos al usuario que ponga un número
		        System.out.println("Introduce un número:");
		        String numero = scanner.nextLine();
		        
		        // Variables para ver si es crático o perfecto
		        boolean escratico = true;
		        boolean esperfecto = true;

		        // Comprobamos si es crático (sin dígitos repetidos)
		        for (int i = 0; i < numero.length(); i++) {
		            for (int j = i + 1; j < numero.length(); j++) {
		                if (numero.charAt(i) == numero.charAt(j)) {
		                    escratico = false; // Si hay repetición, no es crático
		                    esperfecto = false; // Si no es crático, tampoco puede ser perfecto
		                    break;
		                }
		            }
		            if (!escratico) break; // Si ya sabemos que no es crático, paramos
		        }

		        // Si es crático, verificamos si es perfecto (números en orden ascendente)
		        if (escratico) {
		            for (int i = 1; i < numero.length(); i++) {
		                if (Character.getNumericValue(numero.charAt(i)) <= Character.getNumericValue(numero.charAt(i - 1))) {
		                    esperfecto = false; // Si no está en orden ascendente, no es perfecto
		                    break;
		                }
		            }
		        }

		        // Comprobamos si el número es crático perfecto o solo crático
		        if (esperfecto) {
		            System.out.println("Crático perfecto");
		        } else if (escratico) {
		            System.out.println("Crático");
		        } else {
		            System.out.println("No crático");
		        }

		        scanner.close(); // Cerramos el scanner
		    }
		}
