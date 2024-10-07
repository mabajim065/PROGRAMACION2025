package unidad1;
import java.util.Scanner;

public class Media {  // Nombramos la clase
    public static void main(String[] args) {
        // Declaramos las variables
        int numero1;
        int numero2;
        int numero3;

        // Creamos un objeto Scanner para leer desde el teclado
        Scanner teclado = new Scanner(System.in);

        // Solicitamos los números al usuario
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        numero3 = teclado.nextInt();

        // Calculamos la media
        int media = (numero1 + numero2 + numero3) / 3;

        // Mostramos el resultado
        System.out.println("La media es: " + media);

        // Cerramos el objeto Scanner
        teclado.close();
    }
}