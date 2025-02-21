package unidad3.examenes.libreria;

public class Miembro {
	private String id;
	private String nombre;
	private int edad;
	private int librosPrestados;

	// Constructor vacío
	public Miembro() {
		this.id = "";
		this.nombre = "";
		this.edad = 0;
		this.librosPrestados = 0;
	}

	// Constructor con parámetros
	public Miembro(String id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.librosPrestados = 0;
	}

	// Métodos getters y setters

	public int getLibrosPrestados() {
		return librosPrestados;
	}

	public void setLibrosPrestados(int librosPrestados) {
		this.librosPrestados = librosPrestados;
	}

	// Método para prestar libro
	public boolean prestarLibro(Libro libro) {
		if (librosPrestados < 5 && !libro.getPrestado()) {
			libro.setPrestado(true);
			librosPrestados++;
			return true;
		}
		return false;
	}

	// Método para devolver libro
	public boolean devolverLibro(Libro libro) {
		if (libro.getPrestado()) {
			libro.setPrestado(false);
			librosPrestados--;
			return true;
		}
		return false;
	}
}
