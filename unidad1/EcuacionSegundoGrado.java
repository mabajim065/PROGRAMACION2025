package unidad11;
import java.util.Scanner;

public class EcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pedimos a la persona los datos necesarios
        System.out.print("Introduce el coeficiente a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Introduce el coeficiente b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Introduce el coeficiente c: ");
        double c = scanner.nextDouble();
     
        
        // Comprobar que a no sea cero
        if (a == 0) {
        	
            System.out.println("Error: El coeficiente 'a' no puede ser cero.");
        } else {
        	
            // Calcular el discriminante
            double discriminante = b * b - 4 * a * c;
            
            
            // Calcular las soluciones
            double sol1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double sol2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            
            // Mostrar las soluciones
            System.out.println("Las soluciones son: " + sol1 + " y " + sol2);
        }
        
        scanner.close();
    }
}