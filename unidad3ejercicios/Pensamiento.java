package unidad3ejercicios;

import java.util.Random;

public class Pensamiento {

	/***********************************************************************************
	 * 2. Crear una clase denominada pensamiento, tendrá como variables miembro las
	 * siguientes (nombre, descripción, importancia, categoría, tipo, activo
	 * (boolean)).
	 ************************************************************************************/
	private String nombre;
	private String descripcion;
	private int importancia; // Como valores, por ejemplo: 1 = vital, 2 = básica, 3 = secundaria
	private String categoria;
	private String tipo;
	public boolean activo; // Es pública

	/****************************************************************************************
	 * 3. Tendrá 4 constantes estáticas enteras que identificarán estados posibles
	 * de un órgano, (SANO, DOLOR, PERJUDICADO, CANCERIGENO) otras para la posición
	 * (CABEZA, TRONCO SUPERIOR, TRONCO INFERIOR) otras para importancia (VITAL,
	 * BASICA, SECUNDARIA) y otras dos para si está activo o no.
	 ******************************************************************************************/
	// Constantes estáticas para los estados del órgano
	public static final int SANO = 0;
	public static final int DOLOR = 1;
	public static final int PERJUDICADO = 2;
	public static final int CANCERIGENO = 3;

	// Constantes estáticas para las posiciones del órgano
	public static final int CABEZA = 0;
	public static final int TRONCO_SUPERIOR = 1;
	public static final int TRONCO_INFERIOR = 2;

	// Constantes estáticas para la importancia del órgano
	public static final int VITAL = 0;
	public static final int BASICA = 1;
	public static final int SECUNDARIA = 2;

	/********************************************************************************************
	 * 5.Tendrá un constructor vacío que dará valores iniciales a las variables
	 * miembro (la posición, el estado serán aleatorias, el peso será aleatorio
	 * entre 200 y 1000 g, y activo por defecto será false) y otro con todas las
	 * variables como parámetro. Tendrá las funciones revision() y analisis(tipo)
	 ********************************************************************************************/
	// Variables miembro
	private int posicion;
	private int estado;
	private double peso;

	// Constructor vacío
	public Pensamiento() {
		Random rand = new Random();

		// Inicializar variables con valores aleatorios
		this.nombre = "Desconocido"; // Valor por defecto
		this.descripcion = "Sin descripción"; // Valor por defecto
		this.importancia = VITAL; // Valor por defecto
		this.categoria = "General"; // Valor por defecto
		this.tipo = "Tipo Desconocido"; // Valor por defecto
		this.posicion = rand.nextInt(3); // Aleatorio entre 0, 1, 2
		this.estado = rand.nextInt(4); // Aleatorio entre 0 (SANO) y 3 (CANCERIGENO)
		this.peso = 200 + (rand.nextDouble() * 800); // Aleatorio entre 200 y 1000
		this.activo = false; // Por defecto el órgano no está activo
	}

	// Constructor con parámetros
	public Pensamiento(String nombre, String descripcion, int importancia, String categoria, String tipo, int posicion,
			int estado, double peso, boolean activo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.importancia = importancia;
		this.categoria = categoria;
		this.tipo = tipo;
		this.posicion = posicion;
		this.estado = estado;
		this.peso = peso;
		this.activo = activo;
	}

	// Getter y Setter para nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter y Setter para descripción
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Getter y Setter para importancia
	public int getImportancia() {
		return importancia;
	}

	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}

	// Getter y Setter para categoría
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	// Getter y Setter para tipo
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Getter y Setter para la variable 'activo'
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	// Getter y Setter para la variable 'posicion'
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	// Getter y Setter para la variable 'estado'
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	// Getter y Setter para la variable 'peso'
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Función revisión
	public boolean revision() {
		// Para simplificar, la revisión devuelve true si la posición es válida (0, 1,
		// 2)
		// y el estado es uno de los valores válidos (SANO, DOLOR, PERJUDICADO,
		// CANCERIGENO)
		return this.posicion >= 0 && this.posicion <= 2 && this.estado >= 0 && this.estado <= 3;
	}

	// Función análisis
	public boolean analisis(int tipoAnalisis) {
		// Dependiendo del tipo de análisis, realizamos una comprobación sobre el estado
		// del órgano
		switch (tipoAnalisis) {
		case 1: // Análisis oncológico
			return this.estado == CANCERIGENO; // Si el estado es cancerígeno
		case 2: // Análisis de estado
			return this.estado == PERJUDICADO; // Si el estado es perjudicado
		case 3: // Análisis rutinario
			// Si el peso está entre 200g y 1000g
			return this.peso >= 200 && this.peso <= 1000;
		default:
			return false; // Si el tipo de análisis no es reconocido
		}
	}
}
