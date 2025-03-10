package unidad3.examenes.solucionexamen;

import java.util.Arrays;

public class Empresa {

	// Creamos las variables todas privadas exepto web
	private String id;
	private String nombre;
	private String direccion;
	private String tipo;
	public String web;
	private double ingresosAnuales;
	private double gastosEmpleados;
	private Empleado[] listaEmpleado;

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	// Creamos el constuctor vacio
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
		this.id = "";
		this.nombre = "";
		this.direccion = "";
		this.tipo = "";
		this.web = "";
		this.ingresosAnuales = Math.random() * 1000;
		this.gastosEmpleados = Math.random() * 1000;
		this.listaEmpleado = new Empleado[20];
	}

	// Creamos el constructor con parametros
	public Empresa(String id, String nombre, String direccion, String tipo, String web, double ingresosAnuales,
			double gastosEmpleados, Empleado[] listaEmpleado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipo = tipo;
		this.web = web;
		this.ingresosAnuales = ingresosAnuales;
		this.gastosEmpleados = gastosEmpleados;
		this.listaEmpleado = listaEmpleado;
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the ingresosAnuales
	 */
	public double getIngresosAnuales() {
		return ingresosAnuales;
	}

	/**
	 * @param ingresosAnuales the ingresosAnuales to set
	 */
	public void setIngresosAnuales(double ingresosAnuales) {
		this.ingresosAnuales = ingresosAnuales;
	}

	/**
	 * @return the gastosEmpleados
	 */
	public double getGastosEmpleados() {
		return gastosEmpleados;
	}

	/**
	 * @param gastosEmpleados the gastosEmpleados to set
	 */
	public void setGastosEmpleados(double gastosEmpleados) {
		this.gastosEmpleados = gastosEmpleados;
	}

	/**
	 * @return the listaEmpleado
	 */
	public Empleado[] getListaEmpleado() {
		return listaEmpleado;
	}

	/**
	 * @param listaEmpleado the listaEmpleado to set
	 */
	public void setListaEmpleado(Empleado[] listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}

	/**************************************************************
	 * TO STRING
	 *************************************************************/

	@Override
	public String toString() {
		return "Empresa:" + "\n**********************************************" + "\nid:" + "<" + id + ">" + ", nombre="
				+ nombre + ", direccion=" + direccion + ", tipo=" + tipo + ", web=" + web + ", ingresosAnuales="
				+ ingresosAnuales + ", gastosEmpleados=" + gastosEmpleados + ", listaEmpleado="
				+ Arrays.toString(listaEmpleado) + "]";
	}

	/**************************************************************
	 * FUNCIONES
	 *************************************************************/

	/*
	 * int numEmpleados(): Devolverá la cantidad de empleados de la empresa, es
	 * decir la longitud del array de Personas.(1 punto)
	 */

	public int numEmpleados() {
		return this.listaEmpleado.length;
	}

	/*
	 * Empleado empleadoMasCaro(int puesto) devolverá el empleado que más cobra
	 * dentro del puesto introducido. Si se introduce -1 en puesto, devolverá el que
	 * más cobra de todos (2 puntos).
	 */

	Empleado empleadoMasCaro(int puesto) {

		// Aquí guardaremos el empleado con el salario más alto
		Empleado empleadoMaxSueldo = new Empleado();

		// Si el puesto es -1, buscamos el mejor pagado de TODOS
		if (puesto == -1) {
			// Empezamos con el salario más bajo posible
			double sueldoMax = Double.MIN_VALUE;
			// Recorremos la lista de empleados uno por uno
			for (Empleado empleado : this.listaEmpleado) {
				// Si encontramos un salario mayor, lo guardamos
				if (empleado.getIngresos() > sueldoMax) {
					sueldoMax = empleado.getIngresos();// Actualizamos el sueldo máximo
					empleadoMaxSueldo = empleado;// Guardamos al empleado que más gana en ese puesto
				}
			}
		} else {
			// En caso de que haya tipo, hay que buscar solo entre los
			// Empleados de ese tipo
			double sueldoMax = Double.MIN_VALUE;
			// Recorremos toda la lista de empleados
			for (Empleado empleado : this.listaEmpleado) {
				// Si el empleado tiene el puesto buscado Y su sueldo es mayor al máximo
				// encontrado
				if (empleado.puesto == puesto && empleado.getIngresos() > sueldoMax) {
					sueldoMax = empleado.getIngresos();// Actualizamos el sueldo máximo
					empleadoMaxSueldo = empleado;// Guardamos al empleado que más gana en ese puesto
				}
			}
		}

		// Devolvemos el empleado que gana más
		return empleadoMaxSueldo;

	}

	/*
	 * boolean asignarJefeEquipo(String nombre) Buscará en el array de empleados el
	 * que tenga el nombre introducido cómo parámetro. Si no existe se devolverá
	 * falso. Si existe y su puesto ya es “jefe de equipo” también devolverá falso.
	 * En caso de que no sea jefe de equipo le asignara ese puesto y devolverá
	 * true.(2 puntos)
	 */

	boolean asiganarJefeEquipo(String nombre) {

		// Recorremos buscando el empleado con el nombre que recibimos
		for (int i = 0; i < this.listaEmpleado.length; i++) {
			// Si encontramos un empleado con el mismo nombre
			if (this.listaEmpleado[i].getNombre().equals(nombre)) {
				// Si este empleado YA ES jefe de equipo, devolvemos false (no hacemos nada)
				if (this.listaEmpleado[i].puesto == Empleado.PUESTO_JEFE) {
					return false; // No podemos volverlo jefe si ya lo es
				} else {
					// Si no era jefe, lo hacemos jefe
					this.listaEmpleado[i].puesto = Empleado.PUESTO_JEFE;
					return true;// Operación exitosa
				}
			}
		}
		// Si terminamos el recorrido y no encontramos al empleado, devolvemos false
		return false;
	}

	/*
	 * void] sumaIngresos(int edad): Sumará los sueldos de todos los empleados con
	 * una edad inferior a la introducida y asigna suma a la variable
	 * gastosEmpleados.(2 puntos)
	 */

	void sumaIngresos(int edad) {

		double suma = 0; // Variable para guardar la suma de los sueldos

		// Recorremos la lista de empleados
		for (int i = 0; i < listaEmpleado.length; i++) {
			// Si la edad del empleado es menor que la edad introducida
			if (listaEmpleado[i].getEdad() < edad) {
				// Sumamos su sueldo a la variable suma
				suma += listaEmpleado[i].getIngresos();
			}
		}

		// Guardamos la suma total en la variable gastosEmpleados
		this.gastosEmpleados = suma;
	}

}