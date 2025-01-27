package unidad3ejercicios;

public class Raza {
	// Atributos privados de la clase Raza
	private String nombre; // Nombre de la raza (por ejemplo, "Humano")
	private String descripcion; // Descripción de la raza
	private double altura; // Altura promedio de los miembros de esta raza
	private String pelo; // Color de pelo común en esta raza
	private String piel; // Tipo de piel de los miembros de esta raza
	private String zona; // Continente o región geográfica donde se encuentra esta raza

	// Constructor vacío, asigna valores predeterminados
	public Raza() {
		this.nombre = "Humano"; // Si no se da un nombre, por defecto es "Humano"
		this.descripcion = "Raza humana"; // Descripción por defecto
		this.altura = 1.75; // Altura promedio de un humano en metros
		this.pelo = "Negro"; // Por defecto, color de pelo "Negro"
		this.piel = "Caucásico"; // Tipo de piel por defecto
		this.zona = "América"; // Zona geográfica por defecto
	}

	// Constructor con parámetros, permite crear una Raza con valores específicos
	public Raza(String nombre, String descripcion, double altura, String pelo, String piel, String zona) {
		this.nombre = nombre; // Asigna el nombre de la raza
		this.descripcion = descripcion; // Asigna la descripción de la raza
		this.altura = altura; // Asigna la altura de los miembros de la raza
		this.pelo = pelo; // Asigna el color de pelo de la raza
		this.piel = piel; // Asigna el tipo de piel de los miembros de la raza
		this.zona = zona; // Asigna la zona geográfica de la raza
	}

	// Métodos get y set para acceder y modificar los atributos de la clase

	// Método getter para obtener el nombre de la raza
	public String getNombre() {
		return nombre; // Devuelve el nombre de la raza
	}

	// Método setter para modificar el nombre de la raza
	public void setNombre(String nombre) {
		this.nombre = nombre; // Cambia el nombre de la raza
	}

	// Método getter para obtener la descripción de la raza
	public String getDescripcion() {
		return descripcion; // Devuelve la descripción de la raza
	}

	// Método setter para modificar la descripción de la raza
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion; // Cambia la descripción de la raza
	}

	// Método getter para obtener la altura de los miembros de la raza
	public double getAltura() {
		return altura; // Devuelve la altura promedio de la raza
	}

	// Método setter para modificar la altura de la raza
	public void setAltura(double altura) {
		this.altura = altura; // Cambia la altura promedio de los miembros de la raza
	}

	// Método getter para obtener el color de pelo de los miembros de la raza
	public String getPelo() {
		return pelo; // Devuelve el color de pelo de la raza
	}

	// Método setter para modificar el color de pelo de la raza
	public void setPelo(String pelo) {
		this.pelo = pelo; // Cambia el color de pelo de los miembros de la raza
	}

	// Método getter para obtener el tipo de piel de los miembros de la raza
	public String getPiel() {
		return piel; // Devuelve el tipo de piel de la raza
	}

	// Método setter para modificar el tipo de piel de la raza
	public void setPiel(String piel) {
		this.piel = piel; // Cambia el tipo de piel de los miembros de la raza
	}

	// Método getter para obtener la zona geográfica de la raza
	public String getZona() {
		return zona; // Devuelve la zona geográfica donde se encuentra la raza
	}

	// Método setter para modificar la zona geográfica de la raza
	public void setZona(String zona) {
		this.zona = zona; // Cambia la zona geográfica de la raza
	}
}
