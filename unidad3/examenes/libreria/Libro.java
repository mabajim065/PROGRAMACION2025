package unidad3.examenes.libreria;

public class Libro {
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private int numeroPaginas;
	private String genero;
	private boolean prestado;

	// Constructor vacío
	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.anioPublicacion = 2000;
		this.numeroPaginas = 100;
		this.genero = "";
		this.prestado = false;
	}

	// Constructor con parámetros
	public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
		this.prestado = false;
	}

	// Métodos getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
}
