package unidad3ejercicios;

public class Emocion {

	/******************************************************************************************************
	 * VARIABLES ESTATICAS
	 ******************************************************************************************************/
	// Estas son las emociones que podemos manejar, cada una con su numerito para identificarlas
	public static final int ENVIDIA = 1;
	public static final int PENA = 2;
	public static final int ALEGRIA = 3;
	public static final int ASCO = 4;
	public static final int PLACER = 5;
	public static final int AMOR = 6;
	public static final int ODIO = 7;
	public static final int VERGUENZA = 8;

	// Aquí definimos de dónde pueden venir esas emociones
	public static final int VISUAL = 1;
	public static final int MEMORIA = 2;
	public static final int OLFATO = 3;
	public static final int TACTIL = 4;
	public static final int GENERADA = 5;

	/******************************************************************************************************
	 * VARIABLES MIEMBROS
	 ******************************************************************************************************/
	private String nombre; // Cómo se llama la emoción
	private String descripcion; // Un poco de contexto sobre la emoción
	private int intensidad; // Qué tan fuerte es (valor de 1 a 10)
	private int tipo; // Qué tipo de emoción es (de las que definimos arriba)
	private int origen; // De dónde viene la emoción (también de los de arriba)
	private Recuerdo recuerdo; // Puede estar relacionada con un recuerdo
	private boolean activa; // Está encendida o apagada (existe o no en el momento)

	/******************************************************************************************************
	 * CONSTRUCTORES
	 ******************************************************************************************************/
	// Constructor vacío, si no nos dicen nada, ponemos valores por defecto
	public Emocion() {
		this.nombre = "";
		this.descripcion = "";
		this.intensidad = 1; // Nivel más bajo de emoción
		this.tipo = ALEGRIA; // Por defecto, la vida es bella :)
		this.origen = VISUAL; // Suponemos que viene de algo que vimos
		this.recuerdo = null; // No está ligada a ningún recuerdo
		this.activa = true; // La emoción está encendida
	}

	// Constructor con parámetros, por si queremos definir la emoción desde el inicio con datos específicos
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

	/***********************************************************************************************************
	 * METODOS Y FUNCIONES
	 ***********************************************************************************************************/
	// Este método revisa si la emoción es positiva
	// Se considera positiva si es Alegría, Amor o Placer, pero OJO, no puede ser generada artificialmente
	public boolean esPositiva() {
		return (tipo == ALEGRIA || tipo == AMOR || tipo == PLACER) && origen != GENERADA;
	}

	// Este método nos dice si podemos confiar en la emoción (si es "fiable")
	// Si es generada, ya valió, no es fiable
	// Si viene de un recuerdo y el recuerdo no es fiel, tampoco es fiable
	public boolean esFiable() {
		if (origen == GENERADA)
			return false; // Si fue inventada, no es confiable
		if (origen == MEMORIA && (recuerdo == null || !recuerdo.esFiel()))
			return false; // Si viene de un recuerdo falso o sin recuerdo, no es confiable
		return true; // Si pasa estas pruebas, es fiable
	}

	// Método toString, esto nos ayuda a mostrar la emoción en texto de forma ordenada y bonita
	public String toString() {
		return "Emoción: " + nombre + "\nDescripción: " + descripcion + "\nIntensidad: " + intensidad + "\nTipo: "
				+ tipo + "\nOrigen: " + origen + "\nActiva: " + activa;
	}
}
