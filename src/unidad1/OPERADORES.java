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
	
	sumaalumnos = sumaalumnos - 1 ;
	// esta instruccion es igual a la anterior
	sumaalumnos -= 1 ;
	
	//++ SUMA 1 INCREMENTA EN UNA VARIABLE NUMERICA
	System.out.println(" LOS ALUMNOS DE INFORMATICA ACTUALES  SON :  " + sumaalumnos);
		
	}

}
