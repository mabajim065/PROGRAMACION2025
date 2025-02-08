package TEMA3;

	public class Recuerdo {
		/********************************************
		 * 			VARIABLES ESTATICAS 			*
		 *******************************************/
		
		
		/********************************************
		 * 			VARIABLES MIEMBRO 				*
		 *******************************************/
		//Creamos las variables miembro
		private String nombre;
		private int duracion;//Tiempo de 1-5min
		private int fidelidad;//Porcentaje de 1 a 100
		
		/******************************************
		 * CONSTRUCTORES
		 ******************************************/
		public Recuerdo() {
			super();
			this.nombre = "";
			this.duracion = 0;
			this.fidelidad = 0;
		}
		
		public Recuerdo(String nombre, int duracion, int intesidad, int fidelidad) {
			super();
			this.nombre = nombre;
			if(duracion>=1 || duracion <=5 )
			this.duracion = duracion;
			if(fidelidad >=1 || fidelidad <=100);
			this.fidelidad = fidelidad;
		}
		
		/**************************************************************
		 * GETTERS Y SETTERS DE LA CLASE
		 *************************************************************/
		
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getDuracion() {
			return duracion;
		}

		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}


		public int getFidelidad() {
			return fidelidad;
		}

		public void setFidelidad(int fidelidad) {
			this.fidelidad = fidelidad;
		}
		@Override
		public String toString() {
			return "Recuerdo: \nnombre=" + nombre + "\nduracion=" + duracion + ", \nintesidad=" + ", \nfidelidad="
					+ fidelidad + "\n";
		}

		public static void main( String [] arg) {
			Recuerdo b = new Recuerdo ("maripili", 10,6,4);
			System.out.println(b);
			
		}
		
		/********************************************
		 * 			METODOS O FUNCIONES 			*
		 *******************************************/
	//public boolean esFiel() : Si la fidelidad es inferior al 50% no es fiable y devuelve false. En caso contrario dependerá del tiempo del recuerdo, 
	//para ser fiable deberá superar los valores de fidelidad de los siguientes datos:
		//tiempo 1min=fidelidad>90
		//tiempo 2min=fidelidad>80
		//tiempo 3min=fidelidad>70
		//tiempo 4min=fidelidad>60
		//tiempo 5min=fidelidad>50

		/*
		 * otra forma= 
		 * int[] rango = {90,80,70,60,50};
		 * return fidelidad > rango[duracion -1];
		 */
		
		public boolean esFiel() {
			if (fidelidad < 50) {
		        return false; // Si la fidelidad es menor a 50, no es fiable.
		    }

			if (duracion == 1) {
					return fidelidad > 90;
				} else if (duracion == 2) {
					return fidelidad > 80;
				} else if (duracion == 3) {
					return fidelidad > 70;
				} else if (duracion == 4) {
					return fidelidad > 60;
				} else if (duracion == 5) {
					return fidelidad > 50;
				}	
			return false;
			
		}

		
		/**
		 * necesito ambas funciones para que el usuario me borre si quiere algun recuerdo
		 * @param indice
		 */
		public static void remove(int indice) { //esto se me tiene que cerar para que pueda borrarlos si quiero
			// TODO Auto-generated method stub
			
		}

		public static int size() { // igual que lo anterior
			// TODO Auto-generated method stub
			return 0;
		}
	}
