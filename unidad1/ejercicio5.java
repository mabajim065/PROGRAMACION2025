import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println(" Dime un numero ");

		int numero1;
		numero1 = teclado.nextInt();

		if (numero1 % 2 == 0) {
			System.out.println("este numero es par");
		} else {

			System.out.println("este numero es impar ");

		}
	}
}
