package unidad3.examenrepaso;

public class Empleado {
	/**************************************************************
	 * VARIABLES
	 *************************************************************/
	//VARIABLES ESTATICAS
	
	public static final int PUESTO_JEFE = 0;
	public static final int PUESTO_RRHH = 1;
	public static final int PUESTO_ADMIN = 2;
	public static final int PUESTO_VENTAS = 3;
	
	//Variable miembro
	protected int id;
	private String nombre;
	private int edad;
	private double ingresos;
	public int puesto;

	
	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
		this.id = (int)(Math.random()*200);
		this.nombre = "";
		this.edad =(int)(Math.random()*50)+18 ;
		this.ingresos = Math.random()*2000;
		this.puesto = (int)(Math.random()*4);
	}


	public Empleado(int id, String nombre, int edad, double ingresos, int puesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.ingresos = ingresos;
		this.puesto = puesto;
	}


	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public double getIngresos() {
		return ingresos;
	}


	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}
	
	/**************************************************************
	 * TO STRING
	 *************************************************************/

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", ingresos=" + ingresos + ", puesto="
				+ puesto + "]";
	}
	

}
