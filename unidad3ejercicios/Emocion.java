package unidad3ejercicios;

public class Emocion {

	/***********************
	 * VARIABLES MIEMBRO
	 ************************/
	private String nombre; // Nombre de la emoción
	private String descripcion; // Descripción de la emoción
	private int intensidad; // Intensidad de la emoción (1 a 10)
	private int tipo; // El tipo de emoción (alegría, tristeza, etc.)
	private int origen; // El origen de la emoción (visual, memoria, etc.)
	private Recuerdo recuerdo; // Puede estar asociado a un recuerdo
	private boolean activa; // Si la emoción está activa o no

	/************************
	 * VARIABLES ESTATICAS
	 ************************/
	// Definimos algunas constantes para los tipos y orígenes de emociones
	public static final int ENVIDIA = 1;
	public static final int PENA = 2;
	public static final int ALEGRIA = 3;
	public static final int ASCO = 4;
	public static final int PLACER = 5;
	public static final int AMOR = 6;
	public static final int ODIO = 7;
	public static final int VERGUENZA = 8;

	public static final int VISUAL = 1;
	public static final int MEMORIA = 2;
	public static final int OLFATO = 3;
	public static final int TACTIL = 4;
	public static final int GENERADA = 5;

	/***********************
	 * CONSTRUCTORES
	 ***********************/
	// Constructor vacío, se asignan valores por defecto
	public Emocion() {
		this.nombre = "";
		this.descripcion = "";
		this.intensidad = 1;
		this.tipo = ALEGRIA;
		this.origen = VISUAL;
		this.recuerdo = null; // Por defecto no tiene recuerdo
		this.activa = true;
	}

	// Constructor con parámetros para asignar valores específicos
	public Emocion(String nombre, String descripcion, int intensidad, int tipo, int origen, Recuerdo recuerdo,
			boolean activa) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.intensidad = intensidad;
		this.tipo = tipo;
		this.origen = origen;
		this.recuerdo = recuerdo;
		this.activa = activa;
	}

	/********************************
	 * FUNCIONES Y METODOS
	 * 
	 * @return
	 **********************************/
	// Este método dice si la emoción es positiva, solo será positiva si es Alegría,
	// Amor o Placer
	// Y además no puede ser generada
	public boolean esPositiva() {
		return (tipo == ALEGRIA || tipo == AMOR || tipo == PLACER) && origen != GENERADA;
	}

	// Aquí verificamos si la emoción es fiable. Si es generada, no lo es.
	// También verificamos si el origen es memoria y el recuerdo asociado no es fiel
	public boolean esFiable() {
		if (origen == GENERADA)
			return false; // Si es generada, no es fiable
		if (origen == MEMORIA && (recuerdo == null || !recuerdo.esFiel()))
			return false; // Si el origen es memoria y el recuerdo no es fiel, no es fiable
		return true;
	}

	// toString muestra la emoción de forma bonita y ordenada

	/**
	 * @Override
	 */
	public String toString() {
		return "Emoción: " + nombre + "\nDescripción: " + descripcion + "\nIntensidad: " + intensidad + "\nTipo: "
				+ tipo + "\nOrigen: " + origen + "\nActiva: " + activa;
	}
}
