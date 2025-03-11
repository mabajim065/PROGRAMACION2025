package EXAMENES.RecuperacionTema3;

import java.util.ArrayList;

public class Computadora {

	public static final String PORTATIL = "Portatil";
	public static final String SERVIDOR = "Servidor";
	public static final String GAMING = "Gaming";

	private String identificador;
	public String nombre;
	private int numeroComponentes;
	private String tipo;

	// Creamos los ArrayList
	ArrayList<Componente> listacomponentes = new ArrayList<Componente>();
	private float potenciaWatts;
	private Componente[] Componente;

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	/**
	 * @param identificador
	 * @param nombre
	 * @param numeroComponentes
	 * @param tipo
	 * @param listacomponentes
	 */
	public Computadora(String identificador, String nombre, int numeroComponentes, String tipo,
			ArrayList<Componente> listacomponentes) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.numeroComponentes = numeroComponentes;
		this.tipo = tipo;
		this.listacomponentes = listacomponentes;
	}

	/**
	 * 
	 */
	public Computadora() {
		super();
		this.identificador = "";
		this.nombre = "";
		this.numeroComponentes = (int) (Math.random() * 10);
		this.tipo = "";
		this.listacomponentes = null;// pongo null para inicializarla
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/
	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the numeroComponentes
	 */
	public int getNumeroComponentes() {
		return numeroComponentes;
	}

	/**
	 * @param numeroComponentes the numeroComponentes to set
	 */
	public void setNumeroComponentes(int numeroComponentes) {
		this.numeroComponentes = numeroComponentes;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the listacomponentes
	 */
	public ArrayList<Componente> getListacomponentes() {
		return listacomponentes;
	}

	/**
	 * @param listacomponentes the listacomponentes to set
	 */
	public void setListacomponentes(ArrayList<Componente> listacomponentes) {
		this.listacomponentes = listacomponentes;
	}

	/**
	 * @return the portatil
	 */
	public static String getPortatil() {
		return PORTATIL;
	}

	/**
	 * @return the servidor
	 */
	public static String getServidor() {
		return SERVIDOR;
	}

	/**
	 * @return the gaming
	 */
	public static String getGaming() {
		return GAMING;
	}

	/********************************************
	 * METODOS O FUNCIONES *
	 *******************************************/
	/*
	 * float calcularPotenciaTotal() (0.75 puntos)Calcula la suma de potenciaWatts
	 * de todos los componentes. Devuelve 0 si no hay componentes
	 */
	public float calcularPotenciaTotal() {
		double suma = 0;
		for (Object e : Componente) {
			if (getNumeroComponentes() == 0) {
				return 0;
			}
			if (((EXAMENES.RecuperacionTema3.Componente) e).getPotenciaWatts() < potenciaWatts) {
				suma += ((EXAMENES.RecuperacionTema3.Componente) e).getPotenciaWatts();
				// Uso de instanceof: verificamos si 'e' es un objeto de la clase Jefe.
				if (e instanceof Componente) {
					// Casting a Jefe para acceder a métodos específicos.
					suma += ((Componente) e).getPotenciaWatts();
				}
			}
		}
		return numeroComponentes;
	}

	/*
	 * int componentesMarcaPorDebajoPotencia(String marca, float potenciaMax) (0.75
	 * puntos) Cuenta componentes de la marca especificada con potenciaWatts ≤
	 * potenciaMax.
	 */
	public int componentesMarcaPorDebajoPotencia(String marca, float maxPotencia) {
		int numComponentes = 0;
		if (marca == "" && potenciaWatts <= maxPotencia) {
			numComponentes++;
		}
		return numeroComponentes;
	}

	/*
	 * ArrayList<Componente> filtrarComponentesPorTipoYRango(String tipo, float
	 * minPotencia, float maxPotencia) (1 punto) Devuelve componentes del tipo
	 * especificado con potencia entre minPotencia y maxPotencia. Debe comprobar que
	 * el tipo sea de los posibles. Validar: minPotencia ≥ 0, maxPotencia ≤ 1000, y
	 * maxPotencia > minPotencia.
	 */
	public ArrayList<Componente> filtrarComponentesPorTipoYRango(int tipo, float minPotencia, float maxPotencia) {
		if ((minPotencia >= 0 || maxPotencia <= 1000) && (minPotencia < maxPotencia)) {
			if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 4) {
				return listacomponentes;
			}
		}
		return null;
	}

	/*
	 * int eliminarComponente(int id) (1.5 puntos) Elimina el componente con id del
	 * array. Actualiza numeroComponentes y el array. Devuelve 0 si se eliminó, -1
	 * si no existe
	 */
	public int eliminarComponente(int id) {

		Object[] Componente = null;
		// Comprobamos si el número de componentes es mayor o igual que el tamaño del
		// array
		if (numeroComponentes >= Componente.length) {
			// Si es así, necesitamos poner menos el tamaño del array
			Componente[] nuevoArray = new Componente[numeroComponentes - 1]; // Creamos un nuevo array con una posición
																				// menos
//Copiamos los componentes del array antiguo al nuevo
			for (int i = 0; i < Componente.length; i++) {
				nuevoArray[i] = (EXAMENES.RecuperacionTema3.Componente) Componente[i]; // Copiamos cada componente
			}
			// Ahora asignamos el nuevo array al array componente
			Componente = nuevoArray;
		}
		// restamos el contador de componentes
		numeroComponentes--;
		// Devolvemos 0 si todo ha ido bien
		return 0;
	}

	/**
	 * tambien se podria hacer asi if (Componente==null) { return -1; }
	 * listacomponentes.remove(Componente); return 0; }
	 */

	/*
	 * String modeloMasComunPorTipo(String tipo) (2 puntos) Determina el modelo más
	 * frecuente entre componentes del tipo especificado. En empate, devuelve el
	 * primero encontrado. Si no hay componentes, devuelve null
	 */
	public String modeloMasComunPorTipo(String tipo, Object modelo) {
		// Recorremos todos los Componentes
		for (int i = 0; i < Componente.length; i++) {
			// Comprobamos si el nombre del componente es igual al que buscamos
			// Usamos .equals porque compara el contenido de las cadenas
			if (((Componente) Componente[i]).getNombre().equals(modelo)) {
				return (String) modelo;// Si lo encontramos, devolvemos el modelo
			}
		}
		// Si no encontramos el componente ponemos null
		return null;
	}
}
