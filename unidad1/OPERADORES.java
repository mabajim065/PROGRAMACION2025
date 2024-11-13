package unidad1;

public class OPERADORES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int numalumnosdaw=56;
	int numalumnosasir= 32;
	int numalumnosceti= 19;
	int numalumnosfpb = 19;
	int numalumnossmr = 70;
	
	// para sumar se usa el + 
	
	int sumaalumnos = numalumnosdaw + numalumnosasir; 	
		
	// para incrementar el valor le sumamos a el mismo lo que toque
	sumaalumnos = 	sumaalumnos  + numalumnosfpb + numalumnossmr ;
	
	// EL OPERADOR += INCREMENTA EL VALOR DE LA VARIABLE SITUADA A LA IZQUIERDA 
	// CON EL VALOR QUE ESTA EN LA DERECHA
	sumaalumnos +=  numalumnosceti ; 
	
	System.out.println(" LOS ALUMNOS DE INFORMATICA TOTALES SON :  " + sumaalumnos);
	sumaalumnos=5;
	sumaalumnos = sumaalumnos - 1 ;
	// esta instruccion es igual a la anterior
	sumaalumnos -= 1 ;
	
	//++ SUMA 1 INCREMENTA EN UNA VARIABLE NUMERICA
	//--RESTA 1 
	sumaalumnos--;
	sumaalumnos++;
	++sumaalumnos;
	System.out.println(" LOS ALUMNOS DE INFORMATICA ACTUALES  SON :  " + ++sumaalumnos);
	
	System.out.println(" LOS ALUMNOS DE INFORMATICA ACTUALES  SON :  " + sumaalumnos);
	
	//el operador si se pone a la izquierda, tendra preferencia y sera lo primero que se ejecute 
	//si se pone a la derecha de la variable se ejecutara despues del resto de operadires o funciones

	 int mediaalumnos = sumaalumnos/5;
	 
	System.out.println("el resto de dividir es; "  + 31%2);
	
	}

}
