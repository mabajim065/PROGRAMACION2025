package unidad1;

public class EjemploMensajeInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// definicion de variables
		// primero el tipo de dato y despues el nombre (identificador)
		// solo se pueden definir una vez dentro del mismo bloque de cofigo
		int numhijos = 12;
		String nombre = "adulis";
		String apellidos= " garcia ";
		char escalera = 'b';
		float pi;
	    String mensaje;
	  
	    
	    int numero1= 100;
	    double numero2= 64847.3;
	    
	    System.out.println("el numero 1 es " + numero1);
	    System.out.println ("el numero 2 es " +   numero2);
	    System.out.println ("el maximo valor entero es " + interger.MAX_VALUE);
	    
	    
	    
	    
	    
	    // esto es un comentario de linea
	    /* 
	     * esto es un comentario de muchas lineas
	     */
		
		System.out.println("mi nombre es "+nombre );
		
		nombre= "maria";
		System.out.println("mi nombre es "+nombre );
		
		nombre= nombre+ " abascal jimenez";
		System.out.println("mi nombre es "+nombre );
		
		//para concatenar (unir o juntar) varias variables o valores se utiliza
		//el operador "+" dependiendo del tipo de valor hara una cosa u otra

		mensaje= nombre + " tiene " + numhijos + " hijos";
		System.out.println(mensaje );
		
	    //para asignar un valor a una variable utilizamos el operador= 
	    //a la izquierda va la variable y a la derecha el valor que se le da
	   
		apellidos= "garcia perez";
		pi= 3.14159f;
	    double calculoInfinito;
		System.out.print("primer mensaje");		
		

	}

}
