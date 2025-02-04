package unidad3ejercicios;

import java.util.ArrayList;

public class Pensamiento {

	/******************************************************************************************************
	 * VARIABLES ESTÁTICAS
	 ******************************************************************************************************/
	// Tipos de categorías de pensamientos
	public static final int SOCIAL = 1; // Pensamientos sobre la gente y relaciones
	public static final int RACIONAL = 2; // Pensamientos lógicos, basados en razonamiento
	public static final int AUTOMATICO = 3; // Pensamientos que surgen sin darnos cuenta
	public static final int PRIMARIO = 4; // Pensamientos más básicos e instintivos

	// Tipos de pensamientos según su origen
	public static final int PURO = 1; // Pensamiento que no tiene influencia externa
	public static final int GENERADO_RECUERDO = 2; // Provocado por un recuerdo
	public static final int GENERADO_EMOCION = 3; // Provocado por una emoción
	public static final int MIXTO = 4; // Mezcla de varias cosas

	/******************************************************************************************************
	 * VARIABLES MIEMBRO
	 ******************************************************************************************************/
	private String nombre; // Nombre del pensamiento (cómo lo llamaríamos)
	private String descripcion; // Pequeña explicación del pensamiento
	public int importancia; // Qué tan relevante es este pensamiento (de 1 a 10)
	private int categoria; // Tipo de pensamiento (Social, Racional, etc.)
	private int tipo; // Si es puro, generado por emoción, etc.
	private boolean activo; // Si está en nuestra mente en ese momento o no
	private ArrayList<Recuerdo> listaRecuerdos; // Lista de recuerdos relacionados con este pensamiento
	private ArrayList<Emocion> listaEmociones; // Lista de emociones relacionadas con este pensamiento

	/******************************************************************************************************
	 * CONSTRUCTORES
	 ******************************************************************************************************/
	// Constructor por defecto, crea un pensamiento vacío con valores estándar
	public Pensamiento() {
		this.nombre = "";
		this.descripcion = "";
		this.importancia = 5; // Un nivel medio de importancia
		this.categoria = RACIONAL; // Por defecto, es un pensamiento racional
		this.tipo = PURO; // Un pensamiento sin influencia externa
		this.activo = true; // Se asume que el pensamiento está activo
		this.listaRecuerdos = new ArrayList<>(); // Inicializa la lista vacía
		this.listaEmociones = new ArrayList<>(); // Inicializa la lista vacía
	}

	// Constructor con parámetros para personalizar los valores
	public Pensamiento(String nombre, String descripcion, int importancia, int categoria, int tipo, boolean activo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.importancia = importancia;
		this.categoria = categoria;
		this.tipo = tipo;
		this.activo = activo;
		this.listaRecuerdos = new ArrayList<>();
		this.listaEmociones = new ArrayList<>();
	}

	/******************************************************************************************************
	 * MÉTODOS Y FUNCIONES
	 ******************************************************************************************************/
	// Verifica si el pensamiento es válido según diferentes reglas
	public int esValido() {
		// Primera fase: Revisamos si los recuerdos y emociones son confiables
		if (tipo == GENERADO_RECUERDO || tipo == MIXTO) {
			for (Recuerdo recuerdo : listaRecuerdos) {
				if (!recuerdo.esFiel()) {
					return 2; // Si algún recuerdo no es fiel, el pensamiento no es válido
				}
			}
		}

		if (tipo == GENERADO_EMOCION || tipo == MIXTO) {
			for (Emocion emocion : listaEmociones) {
				if (!emocion.esFiable()) {
					return 3; // Si la emoción no es fiable, el pensamiento tampoco lo es
				}
			}
		}

		// Segunda fase: Algunas combinaciones de categorías y tipos no son válidas
		if ((categoria == PRIMARIO && tipo == GENERADO_EMOCION) || 
			(categoria == AUTOMATICO && tipo == GENERADO_EMOCION) || 
			(categoria == SOCIAL && tipo == GENERADO_EMOCION)) {
			return 4; // Si es una categoría que no debería generar emociones, no es válido
		}

		// Tercera fase: Si es muy importante (mayor o igual a 8), no puede depender de emociones
		if (importancia >= 8) {
			for (Emocion emocion : listaEmociones) {
				if (emocion.esFiable()) {
					return 5; // No puede haber emociones confiables en pensamientos muy importantes
				}
			}
		}

		return 1; // Si pasa todas las pruebas, el pensamiento es válido
	}

	// Agrega un recuerdo a la lista
	public void agregarRecuerdo(Recuerdo recuerdo) {
		listaRecuerdos.add(recuerdo);
	}

	// Agrega una emoción a la lista
	public void agregarEmocion(Emocion emocion) {
		listaEmociones.add(emocion);
	}

	// Elimina un recuerdo por índice (si el índice es válido)
	public void eliminarRecuerdo(int index) {
		if (index >= 0 && index < listaRecuerdos.size()) {
			listaRecuerdos.remove(index);
		}
	}

	// Elimina una emoción por índice (si el índice es válido)
	public void eliminarEmocion(int index) {
		if (index >= 0 && index < listaEmociones.size()) {
			listaEmociones.remove(index);
		}
	}

	// Muestra un resumen del pensamiento junto con sus recuerdos y emociones asociadas
	public void mostrarResumen() {
		System.out.println("Pensamiento: " + nombre);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Importancia: " + importancia);
		System.out.println("Categoría: " + categoria);
		System.out.println("Tipo: " + tipo);
		System.out.println("Activo: " + activo);

		// Mostramos los recuerdos
		System.out.println("\nRecuerdos: ");
		for (Recuerdo recuerdo : listaRecuerdos) {
			System.out.println(recuerdo); // Se asume que Recuerdo tiene toString()
		}

		// Mostramos las emociones
		System.out.println("\nEmociones: ");
		for (Emocion emocion : listaEmociones) {
			System.out.println(emocion); // Se asume que Emocion tiene toString()
		}
	}
}
