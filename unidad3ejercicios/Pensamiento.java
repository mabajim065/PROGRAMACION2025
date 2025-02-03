package unidad3ejercicios;

import java.util.ArrayList;

public class Pensamiento {

	/***********************
	 * VARIABLES MIEMBRO
	 ************************/
	private String nombre; // Nombre del pensamiento
	private String descripcion; // Descripción del pensamiento
	public int importancia; // Importancia del pensamiento (1 a 10)
	private int categoria; // La categoría del pensamiento (social, racional, etc.)
	private int tipo; // El tipo de pensamiento (puros, generados por recuerdos, etc.)
	private boolean activo; // Si el pensamiento está activo o no
	private ArrayList<Recuerdo> listaRecuerdos; // Lista de recuerdos asociados a este pensamiento
	private ArrayList<Emocion> listaEmociones; // Lista de emociones asociadas a este pensamiento

	/************************
	 * VARIABLES ESTATICAS
	 ************************/
	// Definimos las constantes para las categorías y tipos de pensamiento
	public static final int SOCIAL = 1;
	public static final int RACIONAL = 2;
	public static final int AUTOMATICO = 3;
	public static final int PRIMARIO = 4;

	public static final int PURO = 1;
	public static final int GENERADO_RECUERDO = 2;
	public static final int GENERADO_EMOCION = 3;
	public static final int MIXTO = 4;

	// Constructor vacío, con valores predeterminados
	public Pensamiento() {
		this.nombre = "";
		this.descripcion = "";
		this.importancia = 5;
		this.categoria = RACIONAL;
		this.tipo = PURO;
		this.activo = true;
		this.listaRecuerdos = new ArrayList<>();
		this.listaEmociones = new ArrayList<>();
	}

	/************************************************************
	 * CONSTRUCTORES
	 * 
	 * @param nombre
	 * @param descripcion
	 * @param importancia
	 * @param categoria
	 * @param tipo
	 * @param activo
	 */
	// Constructor con parámetros para definir todos los valores
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

	// Este método valida si el pensamiento es válido o no
	public int esValido() {
		// Fase 1: Validamos si los recuerdos y emociones son fiables según el tipo de
		// pensamiento
		if (tipo == GENERADO_RECUERDO || tipo == MIXTO) {
			for (Recuerdo recuerdo : listaRecuerdos) {
				if (!recuerdo.esFiel()) {
					return 2; // Si el recuerdo no es fiel, el pensamiento es inválido
				}
			}
		}

		if (tipo == GENERADO_EMOCION || tipo == MIXTO) {
			for (Emocion emocion : listaEmociones) {
				if (!emocion.esFiable()) {
					return 3; // Si la emoción no es fiable, el pensamiento es inválido
				}
			}
		}

		// Fase 2: Comprobamos condiciones especiales donde el pensamiento no puede ser
		// válido
		if ((categoria == PRIMARIO && tipo == GENERADO_EMOCION) || (categoria == AUTOMATICO && tipo == GENERADO_EMOCION)
				|| (categoria == SOCIAL && tipo == GENERADO_EMOCION)) {
			return 4; // Si el pensamiento es de una categoría que no puede generar emociones, no es
						// válido
		}

		// Fase 3: Si la importancia es mayor a 8, las emociones no pueden estar
		// involucradas
		if (importancia >= 8) {
			for (Emocion emocion : listaEmociones) {
				if (emocion.esFiable()) {
					return 5; // Si la emoción es fiable, no es válido
				}
			}
		}

		return 1; // Si pasa todas las fases, el pensamiento es válido
	}

	// Aquí agregamos un recuerdo a la lista
	public void agregarRecuerdo(Recuerdo recuerdo) {
		listaRecuerdos.add(recuerdo);
	}

	// Aquí agregamos una emoción a la lista
	public void agregarEmocion(Emocion emocion) {
		listaEmociones.add(emocion);
	}

	// Este método elimina un recuerdo en base al índice
	public void eliminarRecuerdo(int index) {
		if (index >= 0 && index < listaRecuerdos.size()) {
			listaRecuerdos.remove(index);
		}
	}

	// Este método elimina una emoción en base al índice
	public void eliminarEmocion(int index) {
		if (index >= 0 && index < listaEmociones.size()) {
			listaEmociones.remove(index);
		}
	}

	// Este método muestra un resumen del pensamiento, emociones y recuerdos
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
			System.out.println(recuerdo); // Se asume que la clase Recuerdo tiene un método toString()
		}

		// Mostramos las emociones
		System.out.println("\nEmociones: ");
		for (Emocion emocion : listaEmociones) {
			System.out.println(emocion); // Se asume que la clase Emocion tiene un método toString()
		}
	}
}
