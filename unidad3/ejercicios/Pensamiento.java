package unidad3.ejercicios;

	import java.util.ArrayList;


	public class Pensamiento {
		/********************************************
		 * 			VARIABLES ESTATICAS 			*
		 *******************************************/
		
		//Creamos las constantes para categorias
		public static final String SOCIAL = "Social";
		public static final String RACIONAL = "Racional";
		public static final String AUTOMATICO = "Automatico";
		public static final String PRIMARIO = "Primario";
		
		//Creamos las cosntantes para tipo
		public static final String PURO = "Puro";
		public static final String GENERADO_RECUERDO = "Generado recuerdo";
		public static final String GENERADO_EMOCION = "Generado emocion";
		public static final String MIXTO = "Mixto";
		
		
		/********************************************
		 * 			VARIABLES MIEMBRO 				*
		 *******************************************/
		
		//Creamos las variables miembro
		private String nombre;
		private String descripcion;
		private int importancia; //Tendra un rango del 1-10
		private String categoria;
		private String tipo;
		private boolean activo;
		
		//Creamos los ArrayList para recuerdo y emocion
		ArrayList<Recuerdo> listaRecuerdo= new ArrayList<Recuerdo>();
		ArrayList<Emocion> listaEmocion=new ArrayList<Emocion>();
		
		
		/**************************************************************
		 * CONSTRUCTORES
		 *************************************************************/
		public Pensamiento() {
			super();
			this.nombre = "";
			this.descripcion = "";
			if(importancia >=1 || importancia <=10);
			this.importancia = 0;
			this.categoria = "";
			this.tipo = "";
			this.activo = true;
			this.listaRecuerdo = null; //pongo null para inicializarla
			this.listaEmocion = null;
		}
		
		public Pensamiento(String nombre, String descripcion, int importancia, String categoria, String tipo,
				boolean activo, ArrayList<Recuerdo> listaRecuerdo, ArrayList<Emocion> listaEmocion) {
			super();
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.importancia = importancia;
			this.categoria = categoria;
			this.tipo = tipo;
			this.activo = activo;
			this.listaRecuerdo = listaRecuerdo;
			this.listaEmocion = listaEmocion;
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

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public int getImportancia() {
			return importancia;
		}

		public void setImportancia(int importancia) {
			this.importancia = importancia;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public boolean isAtivo() {
			return activo;
		}

		public void setAtivo(boolean activo) {
			this.activo = activo;
		}

		public ArrayList<Recuerdo> getListaRecuerdo() {
			return listaRecuerdo;
		}

		public void setListaRecuerdo(ArrayList<Recuerdo> listaRecuerdo) {
			this.listaRecuerdo = listaRecuerdo;
		}

		public ArrayList<Emocion> getListaEmocion() {
			return listaEmocion;
		}

		public void setListaEmocion(ArrayList<Emocion> listaEmocion) {
			this.listaEmocion = listaEmocion;
		}

		@Override
		public String toString() {
			return "Pensamiento: \nnombre=" + nombre + ", \ndescripcion=" + descripcion + ", \nimportancia=" + importancia
					+ ", \ncategoria=" + categoria + ", \ntipo=" + tipo + ", \nactivo=" + activo + ", \nlistaRecuerdo="
					+ listaRecuerdo + ", \nlistaEmocion=" + listaEmocion + "]";
		}
		
	
		
		/********************************************
		 * 			METODOS O FUNCIONES 			*
		 *******************************************/
	/*
	 * public int esValido(): 
	 * Se definirán las siguientes constantes para el resultado de la función (VALIDO, RECUERDO_INVALIDO, EMOCION_INVALIDA, 
	 * DEMASIADO_EMOCIONAL, PRIMARIO_EMOCIONAL, AUTOMATICO)
	 * Comprobará en tres fases si es valido o hay que reconstruirlo:
	 * Debe de superar las tres fases para ser VALIDO.
	 */
			public static final int VALIDO=0;
			public static final int RECUERDO_INVALIDO= 1;	
			public static final int EMOCION_INVALIDA= 2;
			public static final int DEMASIADO_EMOCIONAL= 3;
			public static final int PRIMARIO_EMOCIONAL=4;
			public static final int AUTOMATIc=5 ; 
		
			public int esValido() {
		/*
		 * Primera Fase:Comprobará si todos los recuerdos asociados son fieles y las emociones asociadas son fiables. Utilizará 
		 * bucles para recorrer las listas y condiciones para validar. Dependiendo del tipo de pensamiento comprobará sólo recuerdos
		 * (GENERADO_RECUERDO), sólo emociones (GENERADO_EMOCION), las dos listas (MIXTO) o nada (PURO)	
		 */
			if(tipo== GENERADO_RECUERDO || tipo == MIXTO ) {
				for (Recuerdo recuerdo : listaRecuerdo) {
					if (!recuerdo.esFiel()) {
						return 1;//1 no es valido
					}
			if (tipo==GENERADO_EMOCION || tipo==MIXTO) {
				for(Emocion emocion: listaEmocion) {
					if(!emocion.esFiable()) {
						return 2 ;
					}
				}
			}
			
				
		/*
		 * Segunda Fase: El pensamiento no es válido si es primario y generado por una emoción. Tampoco será válido si es automático
		 * y generado por una emoción o mixto ni si es SOCIAL y generado por alguna emoción.
		 */
			
			if (categoria == PRIMARIO && tipo == GENERADO_EMOCION){
					return 4;
			}
			
			if (categoria == AUTOMATICO && (tipo == GENERADO_EMOCION || tipo== MIXTO))
				     {
				    return 5;
					}
			if(categoria == SOCIAL && tipo == GENERADO_EMOCION) {
				return 3;
			}
				}
			}
		/*
		 * Tercera Fase: Si la importancia es mayor o igual a 8, las emociones no pueden intervenir.
		 */
		 if (importancia>=8 && listaEmocion!= null ) {
			return 3;
				 }
			 	
			return 0;
			}
			
		/*
		 * public int[] analizar(int tipo): el tipo puede ser 1 o 2 siendo 1 emociones y 2 recuerdos. Se deberán 
		 * crear constantes para no utilizar números.
		 */
			//constantes tipo
			public static final int TIPO_EMOCIONES = 1;
			public static final int TIPO_RECUERDOS = 2;
			
			
			public int[] analizar(int tipo) {
				/*
				 * Clasificará las emociones en positivas o negativas( dependiendo del tipo, por lógica), y los recuerdos 
				 * en fiables y no fiables. 
				 */
				int positivos=0;
				 int total=0;
				
				 //emociones 
				 if (tipo== TIPO_EMOCIONES) {
					total= listaEmocion.size();
					for(int i=0; i<total;i++) {
						if ( listaEmocion.get(i).esPositiva()) {
							positivos++ ;
						}
					}
				 }
				 
				 //recuerdos
				 else if (tipo== TIPO_RECUERDOS) {
						total= listaRecuerdo.size();
						for(int i=0; i<total;i++) {
							if ( listaRecuerdo.get(i).esFiel()) {
								positivos++ ;
							}
						}
					 }
				//si no es ni positiva ni na va  ser porque es 0 todo.
				 else {
					return new int [] {0,0};

				 }
				/* Devolverá un número con el porcentaje de emociones positivas o el porcentaje de recuerdo fiables, 
				 * dependiendo del tipo recibido.*/
				 int porcentaje=0;
				 porcentaje = positivos*100/total;
				 return new int [] {total , porcentaje};
			 }

			    /*
			     * agregarRecuerdo y agregarEmocion: Permitirán añadir recuerdos y emociones al pensamiento de forma controlada.
			     */
			    
			    public void agregarRecuerdo(Recuerdo recuerdo) {
			        listaRecuerdo.add(recuerdo); // Agrega un recuerdo a la lista
			    }

			    public void agregarEmocion(Emocion emocion) {
			        listaEmocion.add(emocion); // Agrega una emoción a la lista
			    }

			    /*
			     * eliminarRecuerdo y eliminarEmocion: Permitirán eliminar un recuerdo o emoción en particular.
			     */

			    public void eliminarRecuerdo(Recuerdo recuerdo) {
			        listaRecuerdo.remove(recuerdo); // Busca y elimina el objeto si existe
			    }

			    public void eliminarEmocion(Emocion emocion) {
			        listaEmocion.remove(emocion); // Busca y elimina el objeto si existe
			    }

			    /*
			     * sobrecargadas para cada caso, pudiendo recibir el índice a eliminar o el objeto a eliminar.
			     */
			    
			    //elimina recuerdo pero con indice 
			    public void eliminarRecuerdo(int indice) {
			        if (indice >= 0 && indice < listaRecuerdo.size()) {
			            listaRecuerdo.remove(indice); // Elimina el recuerdo en la posición indicada
			        }
			    }
			    
			    //elimina emocion con el indice
			    public void eliminarEmocion(int indice) {
			        if (indice >= 0 && indice < listaEmocion.size()) {
			            listaEmocion.remove(indice); // Elimina la emoción en la posición indicada
			        }
			    }

			    //EliminarEmocion(Emocion emocion, int posActual) deberá de hacerse de forma recursiva.
			    public void eliminarEmocion(Emocion emocion, int posActual) {
			        if (posActual < listaEmocion.size()) {
			            if (listaEmocion.get(posActual).equals(emocion)) {
			                listaEmocion.remove(posActual); // Si la emoción son iguales, la elimina
			            } else {
			                eliminarEmocion(emocion, posActual + 1); 
			            }
			        }
			    }
			   
			   /*
			    * public void mostrarResumen()
			    * Generará un resumen textual del pensamiento, recorriendo sus recuerdos y emociones y mostrando
			    *  sus datos por pantalla, así cómo los datos del pensamiento.
			    *  Mostrará bien formateados los datos del análisis del pensamiento y resultado de su análisis de validación.
			    */
			    
			    public void mostrarResumen() {
			    	System.out.println("*RESUMEN PENSAMIENTOS* ");
			    	System.out.println("Descripcion: " + descripcion );
			    	System.out.println("Importancia; " + importancia );
			    	System.out.println("Categoria: " + categoria );
			    	System.out.println("Tipo: " + tipo );
			    	System.out.println("Activo: " + activo );
			    	
			    	System.out.println(" *RESUMEN RECUERDOS ASOCIADOS*");
			    	if (listaRecuerdo.isEmpty()) {
			    		System.out.println(" LO SIENTO, no hay recuerdos asociados");}
			    		else{
			    			for(int i = 0; i<listaRecuerdo.size(); i++) {
			    				System.out.println(listaRecuerdo.get(i));
			    			}
			    		}
			    	
			    	System.out.println(" *RESUMEN EMOCIONES ASOCIADAS*");
			    	if (listaEmocion.isEmpty()) {
			    		System.out.println(" LO SIENTO, no hay emociones asociadas");}
			    		else{
			    			for(int i = 0; i<listaEmocion.size(); i++) {
			    				System.out.println(listaEmocion.get(i));
			    			}
			    		}
			    	
			    	
			    	System.out.println(" *RESUMEN  ANALISIS PENSAMIENTO*");
			    	
			    	int validez= esValido();
			    	System.out.println(" NUESTRA VALIDEZ ES: " + validez);
			    	
			    	int []  porcentajepos= analizar(1);
			    	int []  porcentajesirve= analizar (2);
			    	
			    	System.out.println(" el porcentaje de los positivos va a ser : " + porcentajepos[1]+"%" );
			    	System.out.println(" el porcentaje de los que sirven va a ser : " + porcentajesirve[1]+"%" );
			    	
			    	}
			    }


