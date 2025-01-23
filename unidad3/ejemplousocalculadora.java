package unidad3;

public class ejemplousocalculadora {

	public static void main(String[] args) {

		calculadora calc = new calculadora();

		System.out.println(calc.suma(3, 4));

		System.out.println(calculadora.suma("123"));
//		double[] numeros= {  2.0 , 3.0 , 5.0 , 12.0 }

		System.out.println(calc.factorial(0));

		// System.out.println(factorialrecursivo(num-1));
	}
}
