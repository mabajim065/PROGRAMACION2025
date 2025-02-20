package unidad3.examentema3;

public class Empresa {

	/********************************************
	 * VARIABLES ESTATICAS *
	 *******************************************/

	/********************************************
	 * VARIABLES MIEMBRO *
	 *******************************************/
	/*
	 * Está compuesto por los siguientes atributos miembro, los cuales el alumno
	 * deberá seleccionar un tipo adecuado al dato: - Identificador, puede tener
	 * números y letras - Nombre - Dirección - tipo - web - ingresosAnuales -
	 * gastosEmpleados
	 */
	private String identificador = "";
	private String nombre = "";
	private String direccion = "";
	private String tipo = "";
	public String web = "";
	private int ingresosanuales = 0;
	private int gastosempleados = 0;

	private Empleado Empleado[];

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
	public Empresa() {
		super();
		this.identificador = "";
		this.nombre = "";
		this.direccion = "";
		this.tipo = "";
		this.web = "";
		this.ingresosanuales = (int) (Math.random() * 20);
		this.gastosempleados = (int) (Math.random() * 30);
		this.Empleado = null;
	}

	/**
	 * 
	 * @param identificador
	 * @param nombre
	 * @param direccion
	 * @param tipo
	 * @param web
	 * @param ingresosanuales
	 * @param gastosempleados
	 */
	public Empresa(String identificador, String nombre, String direccion, String tipo, String web, int ingresosanuales,
			int gastosempleados) {

		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipo = tipo;
		this.web = web;
		this.ingresosanuales = ingresosanuales;
		this.gastosempleados = gastosempleados;

		this.Empleado = new Empleado[4];
		for (int i = 0; i < Empleado.length; i++) {
			Empleado[i] = new Empleado();
		}
	}

	@Override
	public String toString() {
		return "Empresa:" + "\n************************** " + "\nidentificador=" + identificador + "\nnombre=" + nombre
				+ "\ndireccion=" + direccion + "\ntipo=" + tipo + "\nweb=" + web + "\ningresosanuales="
				+ ingresosanuales + "\ngastosempleados=" + gastosempleados
				+ "\n*******************************************";
	}

	/*
	 * Las clases tendrán un metodo toString que mostrará devolverá una cadena
	 * formateada con los contenidos de los atributos de la clase de la siguiente
	 * manera, por ejemplo para empleado:
	 */

	/********************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 ********************************************/
//todas deberán de tener sus métodos de acceso get y set.
	/**
	 * 
	 * @return
	 */
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getIngresosanuales() {
		return ingresosanuales;
	}

	public void setIngresosanuales(int ingresosanuales) {
		this.ingresosanuales = ingresosanuales;
	}

	public int getGastosempleados() {
		return gastosempleados;
	}

	public void setGastosempleados(int gastosempleados) {
		this.gastosempleados = gastosempleados;
	}

	public Empleado[] getEmpleado() {
		return Empleado;
	}

	public void setEmpleado(Empleado[] empleado) {
		Empleado = empleado;
	}

	/********************************************
	 * METODOS O FUNCIONES *
	 *******************************************/
	/*
	 * int numEmpleados(): Devolverá la cantidad de personas de la familia, es decir
	 * la longitud del array de Personas.(1 punto)
	 */
	/**
	 * 
	 * @return
	 */
	// devolvemos el numero de empleados que halla en nuestro array
	public int numEmpleado() {
		return this.Empleado.length;
	}

	// Empleado empleadoMasCaro(int tipo) devolverá el empleado que más cobra dentro
	// del tipo introducido. Si se introduce -1 en tipo, devolverá el que más cobra
	// de
	// todos (2 puntos).
	/**
	 * 
	 * @param tipo
	 * @return
	 */
	public int empleadoMasCaro(int tipo) {
		int mascobra = Integer.MIN_VALUE;
		for (int i = 0; i < Empleado.length; i++) {
			if (Empleado[i].getIngresos() > mascobra) {
				mascobra = Empleado[i].getIngresos();
				return mascobra;
			}
		}
		return mascobra;
	}

	/*
	 * boolean asignarJefeEquipo(String nombre) Buscará en el array de empleados el
	 * que tenga el nombre introducido cómo parámetro. Si no existe se devolverá
	 * falso. Si existe y su puesto ya es “jefe de equipo” también devolverá falso.
	 * En caso de que no sea jefe de equipo le asignara ese puesto y devolverá
	 * true.(2 puntos)
	 */
	/**
	 * 
	 * @param nombre
	 * @return
	 */
	public boolean asignarJefeEquipo(String nombre) {
		// Recorremos todos los ciclistas
		for (int i = 0; i < Empleado.length; i++) {
			// Comprobamos si el nombre del emplado es igual al que buscamos
			// Usamos .equals porque compara el contenido de las cadenas, no la dirección de
			// memoria
			if (Empleado[i].getNombre().equals(nombre)) {

				return nombre != null;// Si lo encontramos, devolvemos el empleado
			} else if (Empleado.equals(getEmpleado())) {
				return false;
			}
		}

		// Si no encontramos el Empleado, devolvemos false
		return false;
	}

	/*
	 * void] sumaIngresos(int edad): Sumará los sueldos de todos los empleados con
	 * una edad inferior a la introducida y asigna suma a la variable
	 * gastosEmpleados, también sumará el gasto de la tarjeta de los jefes. (2
	 * puntos)
	 */

	public void sumaIngresos() {
		// Recorro todas las personas de la empresa
		// Y voy sumando sus ingresos
		for (int i = 0; i < Empleado.length; i++) {
			if (Empleado[i].getEdad() > Empleado[i].getEdad()) {
				ingresosanuales = ingresosanuales + Empleado[i].getIngresos();
			}

		}
	}
}
