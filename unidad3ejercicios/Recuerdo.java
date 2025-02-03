package unidad3ejercicios;

public class Recuerdo {

	/***********************
	 * VARIABLES MIEMBRO
	 ************************/
	private String nombre; // Aquí guardamos el nombre del recuerdo
	private int duracion; // La duración del recuerdo, de 1 a 5 minutos
	private int fidelidad; // La fidelidad, que es un porcentaje de 1 a 100

	/************************
	 * VARIABLES ESTATICAS
	 ************************/
	// Estas son las constantes que definen los rangos válidos para duración y
	// fidelidad
	public static final int MIN_DURACION = 1;
	public static final int MAX_DURACION = 5;
	public static final int MIN_FIDELIDAD = 1;
	public static final int MAX_FIDELIDAD = 100;

	// Constructor vacío. Esto lo usamos si no queremos inicializar nada específico,
	// se llena con valores por defecto
	public Recuerdo() {
		this.nombre = ""; // Nombre vacío por defecto
		this.duracion = 1; // Duración mínima
		this.fidelidad = 50; // Fidelidad por defecto
	}

	// Constructor con parámetros. Aquí le pasamos los valores que queremos asignar
	// al objeto
	public Recuerdo(String nombre, int duracion, int fidelidad) {
		this.nombre = nombre;
		setDuracion(duracion); // Usamos setDuracion para asegurarnos que el valor esté dentro del rango
		setFidelidad(fidelidad); // Igual con la fidelidad
	}

	// Métodos get y set para acceder y modificar las variables privadas

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
		if (duracion >= MIN_DURACION && duracion <= MAX_DURACION) { // Validamos que esté entre 1 y 5
			this.duracion = duracion;
		} else {
			this.duracion = 1; // Si no es válido, ponemos 1 por defecto
		}
	}

	public int getFidelidad() {
		return fidelidad;
	}

	public void setFidelidad(int fidelidad) {
		if (fidelidad >= MIN_FIDELIDAD && fidelidad <= MAX_FIDELIDAD) { // Validamos que sea entre 1 y 100
			this.fidelidad = fidelidad;
		} else {
			this.fidelidad = 50; // Si no es válido, ponemos 50 por defecto
		}
	}

	// Este método comprueba si el recuerdo es "fiel". Si la fidelidad es baja, no
	// es fiel.
	// Dependiendo de la duración, tiene que tener una fidelidad mayor para ser
	// considerado fiable
	public boolean esFiel() {
		if (fidelidad < 50)
			return false; // Si la fidelidad es menor al 50%, no es fiel

		switch (duracion) {
		case 1:
			return fidelidad > 90; // Si dura 1 minuto, la fidelidad debe ser mayor al 90%
		case 2:
			return fidelidad > 80; // Si dura 2 minutos, la fidelidad debe ser mayor al 80%
		case 3:
			return fidelidad > 70; // Si dura 3 minutos, la fidelidad debe ser mayor al 70%
		case 4:
			return fidelidad > 60; // Si dura 4 minutos, la fidelidad debe ser mayor al 60%
		case 5:
			return fidelidad > 50; // Si dura 5 minutos, la fidelidad debe ser mayor al 50%
		default:
			return false; // Si no se cumple ningún caso, no es fiel
		}
	}

	// El método toString muestra todos los datos del recuerdo de forma organizada
	@Override
	public String toString() {
		return "Recuerdo: " + nombre + "\nDuración: " + duracion + " minutos\nFidelidad: " + fidelidad + "%";
	}
}
