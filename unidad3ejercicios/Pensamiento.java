package unidad3ejercicios;

import java.util.Random;

public class Pensamiento {

	/***********************************************************************************
	 * 2. Crear una clase denominada pensamiento, tendrá como variables miembro las
	 * siguientes (nombre, descripción, importancia, categoría, tipo, activo
	 * (boolean)).
	 ************************************************************************************/
	// Variables miembro que definen las características del objeto Pensamiento
	private String nombre; // Nombre del pensamiento
	private String descripcion; // Descripción del pensamiento
	private int importancia; // Importancia del pensamiento, puede ser: 1 = vital, 2 = básica, 3 = secundaria
	private String categoria; // Categoría del pensamiento, tipo de tema
	private String tipo; // Tipo de pensamiento (puede ser algo como "positivo", "negativo", etc.)
	public boolean activo; // Si está activo o no, esta variable es pública y se puede modificar
							// directamente

	/****************************************************************************************
	 * 3. Tendrá 4 constantes estáticas enteras que identificarán estados posibles
	 * de un órgano, (SANO, DOLOR, PERJUDICADO, CANCERIGENO) otras para la posición
	 * (CABEZA, TRONCO SUPERIOR, TRONCO INFERIOR) otras para importancia (VITAL,
	 * BASICA, SECUNDARIA) y otras dos para si está activo o no.
	 ******************************************************************************************/
	// Constantes estáticas para los estados del pensamiento (lo mismo que los
	// órganos)
	public static final int SANO = 0; // El pensamiento está bien
	public static final int DOLOR = 1; // El pensamiento está causando dolor
	public static final int PERJUDICADO = 2; // El pensamiento está en mal estado
	public static final int CANCERIGENO = 3; // El pensamiento tiene efectos muy negativos (como cáncer)

	// Constantes para las posiciones donde puede estar el pensamiento, por ejemplo
	// en el cerebro
	public static final int CABEZA = 0; // El pensamiento está en la cabeza
	public static final int TRONCO_SUPERIOR = 1; // El pensamiento está en el tronco superior
	public static final int TRONCO_INFERIOR = 2; // El pensamiento está en el tronco inferior

	// Constantes para la importancia del pensamiento
	public static final int VITAL = 0; // El pensamiento es vital para el cuerpo
	public static final int BASICA = 1; // Es un pensamiento básico
	public static final int SECUNDARIA = 2; // Es un pensamiento secundario

	/********************************************************************************************
	 * 5.Tendrá un constructor vacío que dará valores iniciales a las variables
	 * miembro (la posición, el estado serán aleatorias, el peso será aleatorio
	 * entre 200 y 1000 g, y activo por defecto será false) y otro con todas las
	 * variables como parámetro. Tendrá las funciones revision() y analisis(tipo)
	 ********************************************************************************************/
	// Variables miembro adicionales: posicion, estado, peso
	private int posicion; // Donde está ubicado el pensamiento en el cuerpo
	private int estado; // El estado del pensamiento (sano, con dolor, perjudicado, etc.)
	private double peso; // El peso del pensamiento (puede ser un valor simbólico)

	// Constructor vacío, con valores aleatorios
	public Pensamiento() {
		Random rand = new Random(); // Creamos un generador de números aleatorios

		// Inicializamos las variables con valores predeterminados o aleatorios
		this.nombre = "Desconocido"; // Si no se pasa nombre, se pone "Desconocido"
		this.descripcion = "Sin descripción"; // Si no se pasa descripción, se pone "Sin descripción"
		this.importancia = VITAL; // Por defecto, se asigna importancia vital
		this.categoria = "General"; // Categoría por defecto
		this.tipo = "Tipo Desconocido"; // Tipo por defecto
		this.posicion = rand.nextInt(3); // Aleatorio entre 0, 1, 2 (CABEZA, TRONCO_SUPERIOR, TRONCO_INFERIOR)
		this.estado = rand.nextInt(4); // Aleatorio entre 0 (SANO) y 3 (CANCERIGENO)
		this.peso = 200 + (rand.nextDouble() * 800); // Peso aleatorio entre 200 y 1000 gramos
		this.activo = false; // Por defecto, el pensamiento no está activo
	}

	// Constructor con parámetros, se puede usar cuando ya se tienen los valores
	// específicos
	public Pensamiento(String nombre, String descripcion, int importancia, String categoria, String tipo, int posicion,
			int estado, double peso, boolean activo) {
		// Asignamos los valores que vienen del constructor
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
		return nombre; // Devuelve el nombre del pensamiento
	}

	public void setNombre(String nombre) {
		this.nombre = nombre; // Cambia el nombre del pensamiento
	}

	// Getter y Setter para descripción
	public String getDescripcion() {
		return descripcion; // Devuelve la descripción del pensamiento
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion; // Cambia la descripción del pensamiento
	}

	// Getter y Setter para importancia
	public int getImportancia() {
		return importancia; // Devuelve la importancia del pensamiento
	}

	public void setImportancia(int importancia) {
		this.importancia = importancia; // Cambia la importancia del pensamiento
	}

	// Getter y Setter para categoría
	public String getCategoria() {
		return categoria; // Devuelve la categoría del pensamiento
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria; // Cambia la categoría del pensamiento
	}

	// Getter y Setter para tipo
	public String getTipo() {
		return tipo; // Devuelve el tipo del pensamiento
	}

	public void setTipo(String tipo) {
		this.tipo = tipo; // Cambia el tipo del pensamiento
	}

	// Getter y Setter para la variable 'activo'
	public boolean isActivo() {
		return activo; // Devuelve si el pensamiento está activo o no
	}

	public void setActivo(boolean activo) {
		this.activo = activo; // Cambia si el pensamiento está activo o no
	}

	// Getter y Setter para la variable 'posicion'
	public int getPosicion() {
		return posicion; // Devuelve la posición del pensamiento (CABEZA, TRONCO_SUPERIOR,
							// TRONCO_INFERIOR)
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion; // Cambia la posición del pensamiento
	}

	// Getter y Setter para la variable 'estado'
	public int getEstado() {
		return estado; // Devuelve el estado del pensamiento (SANO, DOLOR, PERJUDICADO, CANCERIGENO)
	}

	public void setEstado(int estado) {
		this.estado = estado; // Cambia el estado del pensamiento
	}

	// Getter y Setter para la variable 'peso'
	public double getPeso() {
		return peso; // Devuelve el peso del pensamiento
	}

	public void setPeso(double peso) {
		this.peso = peso; // Cambia el peso del pensamiento
	}

	// Función revisión: Chequea si la posición y el estado son válidos
	public boolean revision() {
		// Si la posición está entre 0 y 2, y el estado está entre 0 y 3, entonces está
		// bien
		return this.posicion >= 0 && this.posicion <= 2 && this.estado >= 0 && this.estado <= 3;
	}

	// Función análisis: Revisa el estado del pensamiento según el tipo de análisis
	public boolean analisis(int tipoAnalisis) {
		// Dependiendo del tipo de análisis, se revisa el estado del pensamiento
		switch (tipoAnalisis) {
		case 1: // Análisis oncológico
			// Si el estado es cáncer (CANCERIGENO), devuelve true
			return this.estado == CANCERIGENO;
		case 2: // Análisis de estado
			// Si el estado es perjudicado, devuelve true
			return this.estado == PERJUDICADO;
		case 3: // Análisis rutinario
			// Si el peso está entre 200g y 1000g, devuelve true
			return this.peso >= 200 && this.peso <= 1000;
		default:
			// Si el tipo de análisis no es reconocido, devuelve false
			return false;
		}
	}
}
