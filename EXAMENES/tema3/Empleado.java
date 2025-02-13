package EXAMENES.tema3;

public class Empleado {

	/********************************************
	 * VARIABLES ESTATICAS *
	 *******************************************/
	public static final int PUESTO_JEFE = 1;
	public static final int PUESTO_RRHH = 2;
	public static final int PUESTO_ADMIN = 3;
	public static final int PUESTO_VENTAS = 4;
	/********************************************
	 * VARIABLES MIEMBRO *
	 *******************************************/
	/*
	 * Está compuesto por los siguientes atributos miembro, los cuales el alumno
	 * deberá seleccionar un tipo adecuado al dato: - Identificador, número - nombre
	 * - edad - ingresos - puesto
	 */
	private int numero = 0;
	private String nombre = "";
	private int edad = 0;
	private int ingresos = 0;
	public int puesto = 0;

	/********************************************
	 * CONSTRUCTORES
	 ********************************************/
	/*
	 * Todas las clases tendrán un constructor vacío que generará los valores
	 * numéricos aleatoriamente y pondrá a “” las cadenas de texto y otro
	 * constructor que recibirá todos los parámetros y se los asignará a los
	 * atributos de la clase.
	 */
	/**
	 * 
	 */
	public Empleado() {
		super();
		this.numero = (int) (Math.random() * 5);
		this.nombre = "";
		this.edad = (int) (Math.random() * 89);
		this.ingresos = (int) (Math.random() * 100);
		this.puesto = (int) (Math.random() * 4);
	}

	/**
	 * 
	 * @param numero
	 * @param nombre
	 * @param edad
	 * @param ingresos
	 * @param puesto
	 */
	public Empleado(int numero, String nombre, int edad, int ingresos, int puesto) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.edad = edad;
		this.ingresos = ingresos;
		this.puesto = puesto;
	}

	/*
	 * Las clases tendrán un metodo toString que mostrará devolverá una cadena
	 * formateada con los contenidos de los atributos de la clase de la siguiente
	 * manera, por ejemplo para empleado:
	 */
	@Override
	public String toString() {
		return "\nEmpleado: \n************************************* " + "\nnumero=" + numero + " \nnombre=" + nombre
				+ "\nedad=" + edad + " \ningresos=" + ingresos + "\npuesto=" + puesto
				+ "\n*************************************";
	}

	/********************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 ********************************************/
// Todas las no públicas deben de tener sus métodos de acceso get y set.

	/**
	 * 
	 * @return
	 */
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIngresos() {
		return ingresos;
	}

	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}

	/********************************************
	 * METODOS O FUNCIONES *
	 *******************************************/
}
