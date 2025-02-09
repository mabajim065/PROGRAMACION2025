package unidad3.ejercicios;

import java.util.ArrayList;

public class PruebaVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Recuerdo r1 = new Recuerdo(null, 1, 95);
		    Recuerdo r2 = new Recuerdo(null, 3, 75);
		    Recuerdo r3 = new Recuerdo(null, 5, 55);
		    Recuerdo r4 = new Recuerdo(null, 5, 45);

		    System.out.println("Recuerdo 1 es fiel: " + r1.esFiel()); // true (95 > 90)
		    System.out.println("Recuerdo 2 es fiel: " + r2.esFiel()); // true (75 > 70)
		    System.out.println("Recuerdo 3 es fiel: " + r3.esFiel()); // true (55 > 50)
		    System.out.println("Recuerdo 4 es fiel: " + r4.esFiel()); // false (45 < 50)
		    
		    
		    
		   /////////////////////////////////////////////////////////////////////////////////////////
		    
		    ArrayList <Recuerdo> listaRecuerdos = new ArrayList<Recuerdo>();
	        ArrayList <Emocion> listaEmociones = new ArrayList<Emocion>();

	        
 

	        Pensamiento ejemplovideo = new Pensamiento("maria abascal ", "maria abascal", 9, "", "", true, listaRecuerdos, listaEmociones);

	        // Creamos algunos recuerdos y emociones
	        Recuerdo recuerdo1 = new Recuerdo("maria", 9, 57); 

	        Emocion emocion1 = new Emocion("Alegría", "maria abascal ", 7,"","", recuerdo1, true);
	    

	        // Agregamos los recuerdos y emociones al pensamiento
	        ejemplovideo.agregarRecuerdo(recuerdo1);
	        ejemplovideo.agregarEmocion(emocion1);
	        
	        // Mostramos el resumen del pensamiento
	        ejemplovideo.mostrarResumen();
	       
	}
}
