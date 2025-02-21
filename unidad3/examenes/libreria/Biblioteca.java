package unidad3.examenes.libreria;

	import java.util.ArrayList;

	public class Biblioteca {
	    private String id;
	    private String nombre;
	    private String direccion;
	    private double presupuesto;
	    private ArrayList<Libro> libros;

	    // Constructor vacío
	    public Biblioteca() {
	        this.id = "";
	        this.nombre = "";
	        this.direccion = "";
	        this.presupuesto = 0.0;
	        this.libros = new ArrayList<>();
	    }

	    // Constructor con parámetros
	    public Biblioteca(String id, String nombre, String direccion, double presupuesto) {
	        this.id = id;
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.presupuesto = presupuesto;
	        this.libros = new ArrayList<>();
	    }

	    // Método para agregar un libro a la biblioteca
	    public void agregarLibro(Libro libro) {
	        libros.add(libro);
	    }

	    // Método para obtener el número de libros
	    public int numLibros() {
	        return libros.size();
	    }

	    // Método para obtener el libro más antiguo
	    public Libro libroMasAntiguo() {
	        Libro libroAntiguo = null;
	        for (Libro libro : libros) {
	            if (libroAntiguo == null || libro.getAnioPublicacion() < libroAntiguo.getAnioPublicacion()) {
	                libroAntiguo = libro;
	            }
	        }
	        return libroAntiguo;
	    }

	    // Método para prestar un libro
	    public boolean prestarLibro(String titulo) {
	        for (Libro libro : libros) {
	            if (libro.getTitulo().equals(titulo) && !libro.getPrestado()) {
	                libro.setPrestado(true);
	                return true;
	            }
	        }
	        return false;
	    }
	
}
