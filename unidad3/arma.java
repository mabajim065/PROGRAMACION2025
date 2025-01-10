package unidad3;

/*
	 * la clase arma sirve para guardar las caracteristicas de un  arma 
	 * los podran llevar los personajes personajes del juego
	 * 
	 */
public class arma {
	/**
	 * VARIABLES MIENBRO DE LA CLASE
	 */

	// es importante elegir algo que de miedo al enemigo
	public String nombre = " ";
	// descripcion del arma
	public String descripcion = " arma por defecto , no hace pupa";
	// efecto que lo infringe
	int efecto = 0;

	private int ataquefisico = 0;
	private int ataquemagico = 0;
	private int peso = 0;
	private int clasepermitida[];

	/**
	 * CONSTRUCTORES DE LA CLASE
	 * 
	 * @return
	 */
	public arma() {
		System.out.println("se ha creado un arma");
		this.peso = (int) (Math.random() * 5);
		this.ataquefisico = (int) (Math.random() * 18) + 2;
		this.efecto = (int) (Math.random() * 5);

	}

	/**
	 * 
	 * @param nombre
	 * @param descripcion
	 * @param efecto(0-nada,1-veneno, 2-quemadura , 3-estreñimiento, 4-congelacion)
	 * @param ataquefisico
	 * @param ataquemagico
	 * @param peso
	 */
	public arma(String nombre, String descripcion, int efecto, int ataquefisico, int ataquemagico, int peso) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.efecto = efecto;
		this.ataquefisico = ataquefisico;
		this.ataquemagico = ataquemagico;
		this.peso = peso;
	}

	/**
	 * GETTERS Y SETTERS DE LA CLASE
	 * 
	 * @return
	 */

	public String getNombre() {
		return this.nombre;

	}

	public String setdescripcion() {
		return this.setdescripcion();
	}

	public void setdescripcion(String valordescripcion) {
		this.descripcion = valordescripcion;

	}

}
